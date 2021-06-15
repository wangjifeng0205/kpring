package net.wangjifeng.kpring.datasource

import org.apache.ibatis.mapping.DatabaseIdProvider
import org.apache.ibatis.plugin.Interceptor
import org.apache.ibatis.scripting.LanguageDriver
import org.apache.ibatis.type.TypeHandler
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration
import org.mybatis.spring.boot.autoconfigure.MybatisProperties
import org.springframework.beans.factory.ObjectProvider
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.io.ResourceLoader

/**
 * @author: wjf
 * @date: 2021/6/11 10:38
 *
 * @see MultipleDataSource 多数据源的运作机制。
 */
@Configuration("net.wangjifeng.kpring.datasource.MultipleDataSource\$interval")
class MultipleDataSource constructor(
    var properties: MybatisProperties?,
    var interceptorsProvider: ObjectProvider<Array<Interceptor?>?>,
    var typeHandlersProvider: ObjectProvider<Array<TypeHandler<*>?>?>,
    var languageDriversProvider: ObjectProvider<Array<LanguageDriver?>?>,
    var resourceLoader: ResourceLoader?,
    var databaseIdProvider: ObjectProvider<DatabaseIdProvider?>,
    var configurationCustomizersProvider: ObjectProvider<List<ConfigurationCustomizer?>?>,
    var dataSourceScan: DataSourceScan
) : MybatisAutoConfiguration(
    properties,
    interceptorsProvider,
    typeHandlersProvider,
    languageDriversProvider,
    resourceLoader,
    databaseIdProvider,
    configurationCustomizersProvider
) {

    @Bean
    fun generate(): MultipleDataSource {
        return MultipleDataSource(
            properties,
            interceptorsProvider,
            typeHandlersProvider,
            languageDriversProvider,
            resourceLoader,
            databaseIdProvider,
            configurationCustomizersProvider,
            dataSourceScan
        )
    }

}