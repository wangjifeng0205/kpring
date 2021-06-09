package net.wangjifeng.kpring.cloud.feign

import feign.codec.Decoder
import feign.codec.Encoder
import org.springframework.beans.factory.ObjectFactory
import org.springframework.boot.autoconfigure.http.HttpMessageConverters
import org.springframework.cloud.openfeign.support.ResponseEntityDecoder
import org.springframework.cloud.openfeign.support.SpringDecoder
import org.springframework.cloud.openfeign.support.SpringEncoder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * @author: wjf
 * @date: 2021/6/9 14:56
 *
 * @see FeignClientConfig FeignClient的配置信息。
 */
@Configuration
class FeignClientConfig(var messageConverters: ObjectFactory<HttpMessageConverters>) {

    @Bean
    fun decoder(): Decoder {
        return ResponseEntityDecoder(SpringDecoder(messageConverters))
    }

    @Bean
    fun encoder(): Encoder {
        return SpringEncoder(messageConverters)
    }

}