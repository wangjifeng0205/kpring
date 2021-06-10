package net.wangjifeng.kpring.service.autoconfiguration.swagger

import net.wangjifeng.kpring.service.swagger.SwaggerDefiner
import org.springframework.beans.factory.annotation.Value
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

    @Value("\${spring.application.name}")
    private lateinit var applicationName: String
    @Value("\${server.address}")
    private lateinit var serverAddress: String
    @Value("\${server.port}")
    private lateinit var serverPort: String

    @Bean
    fun initDocket(): Docket {
        if (swaggerDefiner is DefaultSwaggerDefiner) {
            val defaultSwaggerDefiner = swaggerDefiner as DefaultSwaggerDefiner
            defaultSwaggerDefiner.applicationName = applicationName
            defaultSwaggerDefiner.serverAddress = serverAddress
            defaultSwaggerDefiner.serverPort = serverPort
        }
        return swaggerDefiner.definition()
    }

}