package net.wangjifeng.kpring.cloud.feign

import feign.Client
import feign.Feign
import feign.codec.Decoder
import feign.codec.Encoder
import net.wangjifeng.kpring.commons.feign.FeignClient
import net.wangjifeng.kpring.commons.feign.FeignContainer
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.cloud.openfeign.support.SpringMvcContract
import org.springframework.context.annotation.Configuration
import org.springframework.core.Ordered
import javax.annotation.Resource

/**
 * @author: wjf
 * @date: 2021/6/9 15:04
 *
 * @see FeignClientAutoConfiguration feignClient的自动配置。
 */
@Configuration
class FeignClientAutoConfiguration(override val feignClientCenter: MutableList<FeignClient<*>> = mutableListOf()) : FeignContainer, ApplicationRunner, Ordered {

    @Resource
    private lateinit var encoder: Encoder

    @Resource
    private lateinit var decoder: Decoder

    @Resource
    private lateinit var client: Client

    override fun addFeignClient(feignClient: FeignClient<*>) {
        feignClientCenter.add(feignClient)
    }

    override fun run(args: ApplicationArguments?) {
        for (feignClient in feignClientCenter) {
            feignClient.feignClient = Feign.builder()
                .client(client)
                .encoder(encoder)
                .decoder(decoder)
                .contract(SpringMvcContract())
                .requestInterceptors(feignClient.requestInterceptor)
                .target(feignClient.clazz.java, feignClient.url)
        }
    }

    override fun getOrder(): Int {
        return Int.MAX_VALUE
    }

}