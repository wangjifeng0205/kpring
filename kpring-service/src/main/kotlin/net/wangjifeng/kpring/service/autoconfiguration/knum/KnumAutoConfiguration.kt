package net.wangjifeng.kpring.service.autoconfiguration.knum

import net.wangjifeng.kpring.commons.knum.Knum
import net.wangjifeng.kpring.commons.knum.KnumFinder
import org.reflections.Reflections
import org.reflections.scanners.SubTypesScanner
import org.reflections.util.ClasspathHelper
import org.reflections.util.ConfigurationBuilder
import org.reflections.util.FilterBuilder
import org.springframework.beans.factory.InitializingBean
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration

/**
 * @author: wjf
 * @date: 2021/6/9 9:24
 *
 * @see KnumAutoConfiguration knum的自动配置。
 * @see KnumProperties knum的配置属性。
 */
@Configuration
@EnableConfigurationProperties(KnumProperties::class)
class KnumAutoConfiguration(var knumProperties: KnumProperties) : KnumFinder, InitializingBean {

    private val map = mutableMapOf<String, List<Knum>>()

    override fun finding(): Map<String, List<Knum>> {
        return map
    }

    override fun afterPropertiesSet() {
        if (knumProperties.enabled) {

            val reflections = Reflections(
                ConfigurationBuilder()
                    .setUrls(ClasspathHelper.forPackage(knumProperties.packageName))
                    .filterInputsBy(FilterBuilder.Include("${knumProperties.packageName}.*"))
                    .setScanners(SubTypesScanner(false))
            )

            val classes = reflections.getSubTypesOf(Enum::class.java)
            for (cla in classes) {
                try {
                    cla.getMethod("values").apply {
                        @Suppress("UNCHECKED_CAST")
                        val enums = this.invoke(null) as Array<Knum>
                        map[cla.simpleName] = mutableListOf(*enums)
                    }
                } catch (e: Exception) {
                    throw RuntimeException("初始化Knum枚举列表时出错。")
                }
            }
        }
    }

}

