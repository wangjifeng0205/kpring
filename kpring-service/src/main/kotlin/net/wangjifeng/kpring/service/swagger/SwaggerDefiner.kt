package net.wangjifeng.kpring.service.swagger

import springfox.documentation.spring.web.plugins.Docket

/**
 * @author: wjf
 * @date: 2021/6/10 15:02
 *
 * @see SwaggerDefiner 定义一个Springfox的Docket。
 */
interface SwaggerDefiner {

    /**
     * 定义并返回一个Docket。
     */
    fun definition(): Docket

}