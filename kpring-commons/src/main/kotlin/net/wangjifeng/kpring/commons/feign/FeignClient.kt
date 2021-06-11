package net.wangjifeng.kpring.commons.feign

import feign.RequestInterceptor
import kotlin.reflect.KClass

/**
 * @author: wjf
 * @date: 2021/6/9 14:34
 *
 * @see FeignClient feignClient实体类。
 */
data class FeignClient<T : Any>(
    /**
     * feignClient的api接口class
     */
    var clazz: KClass<T>,
    /**
     * feignClient的url
     */
    var url: String,
    /**
     * 请求拦截器
     */
    var requestInterceptor: MutableList<RequestInterceptor> = mutableListOf(),
    /**
     * feignClient
     */
    var feignClient: Any? = null
)
