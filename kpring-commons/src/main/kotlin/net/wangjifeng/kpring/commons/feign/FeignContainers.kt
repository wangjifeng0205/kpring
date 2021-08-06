package net.wangjifeng.kpring.commons.feign

/**
 * @author: wjf
 * @date: 2021/6/9 14:23
 *
 * @see FeignContainer 服务间调用容器。
 */
interface FeignContainer {

    /**
     * 用来存储feignClient实例。
     */
    val feignClientCenter: MutableList<FeignClient<*>>

    /**
     * 添加新的feignClient客户端。
     */
    fun addFeignClient(feignClient: FeignClient<*>)

}

/**
 * 通过feignClient的api接口class获取对应的feignClient。
 */
inline fun <reified T : Any> FeignContainer.getFeignClient(): T? {
    for (feignClient in this.feignClientCenter) {
        if (feignClient.clazz == T::class) {
            @Suppress("UNCHECKED_CAST")
            return feignClient.feignClient as? T?
        }
    }
    return null
}