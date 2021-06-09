package net.wangjifeng.kpring.service.bootstrap

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

/**
 * @author: wjf
 * @date: 2021/6/7 17:18
 *
 * @see Bootstrap 应用引导程序。
 */
@ConfigurationProperties("bootstrap")
@ConstructorBinding
@Configuration
@ComponentScan(
    basePackages = [
        "net.wangjifeng.kpring.service"
    ]
)
class Bootstrap