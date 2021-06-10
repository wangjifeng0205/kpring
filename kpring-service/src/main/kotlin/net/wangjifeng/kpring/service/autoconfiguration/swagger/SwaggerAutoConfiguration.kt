package net.wangjifeng.kpring.service.autoconfiguration.swagger

import net.wangjifeng.kpring.service.swagger.SwaggerDefiner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.spring.web.plugins.Docket

/**
 * @author: wjf
 * @date: 2021/6/10 15:11
 *
 * @see SwaggerAutoConfiguration 自动配置Swagger。
 */
@Configuration
class SwaggerAutoConfiguration(var swaggerDefiner: SwaggerDefiner = DefaultSwaggerDefiner()) {

    @Bean
    fun initDocket(): Docket {
        return swaggerDefiner.definition()
    }

}