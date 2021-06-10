package net.wangjifeng.kpring.service.autoconfiguration.swagger

import io.swagger.annotations.ApiOperation
import net.wangjifeng.kpring.service.swagger.SwaggerDefiner
import org.reflections.util.Utils
import org.springframework.beans.factory.annotation.Value
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.service.RequestParameter
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket

/**
 * @author: wjf
 * @date: 2021/6/10 15:16
 */
class DefaultSwaggerDefiner : SwaggerDefiner {

    @Value("\${spring.application.name}")
    private lateinit var applicationName: String
    @Value("\${server.address}")
    private lateinit var serverAddress: String
    @Value("\${server.port}")
    private lateinit var serverPort: String

    override fun definition(): Docket {
        return Docket(DocumentationType.OAS_30)
            .apiInfo(apiInfo())
            .globalRequestParameters(parameters())
            .ignoredParameterTypes(*ignoredParameterTypes())
            .forCodeGeneration(true)
            .consumes(setOf("application/x-www-form-urlencoded"))
            .select()
            .apis(Utils.and(RequestHandlerSelectors.withMethodAnnotation(ApiOperation::class.java)))
            .paths(PathSelectors.any())
            .build()
    }

    private fun apiInfo(): ApiInfo? {
        return ApiInfoBuilder()
            .title(applicationName)
            .description(applicationName)
            .termsOfServiceUrl("https://${serverAddress}:${serverPort}/swagger-ui.html")
            .contact(Contact("wangjifeng", "https://wangjifeng.net", "wangjifeng0205@qq.com"))
            .version("2.0")
            .build()
    }

    private fun parameters(): List<RequestParameter> {
        return listOf()
    }

    private fun ignoredParameterTypes(): Array<Class<*>> {
        return emptyArray()
    }

}