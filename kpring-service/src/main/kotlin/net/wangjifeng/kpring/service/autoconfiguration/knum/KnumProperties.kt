package net.wangjifeng.kpring.service.autoconfiguration.knum

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.stereotype.Component

/**
 * @author: wjf
 * @date: 2021/6/8 17:09
 *
 * @see KnumProperties knum的配置属性。
 */
@Component
@ConstructorBinding
@ConfigurationProperties(prefix = "net.wangjifeng.knum")
data class KnumProperties(
    /**
     * knum所在的包名
     */
    var packageName: String = "",

    /**
     * 是否启用knum收集器
     */
    var enabled: Boolean = false
)