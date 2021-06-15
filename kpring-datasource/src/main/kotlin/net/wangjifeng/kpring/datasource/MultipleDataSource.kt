package net.wangjifeng.kpring.datasource

import org.apache.ibatis.mapping.DatabaseIdProvider
import org.apache.ibatis.plugin.Interceptor
import org.apache.ibatis.scripting.LanguageDriver
import org.apache.ibatis.session.SqlSessionFactory
import org.apache.ibatis.type.TypeHandler
import org.mybatis.spring.SqlSessionFactoryBean
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration
import org.mybatis.spring.boot.autoconfigure.MybatisProperties
import org.springframework.beans.factory.ObjectProvider
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass
import org.springframework.context.annotation.Configuration
import org.springframework.core.io.ResourceLoader

/**
 * @author: wjf
 * @date: 2021/6/11 10:38
 *
 * @see MultipleDataSource 多数据源的运作机制。
 */
class MultipleDataSource constructor(
    properties: MybatisProperties?,
    interceptorsProvider: ObjectProvider<Array<Interceptor?>?>,
    typeHandlersProvider: ObjectProvider<Array<TypeHandler<*>?>?>,
    languageDriversProvider: ObjectProvider<Array<LanguageDriver?>?>,
    resourceLoader: ResourceLoader?,
    databaseIdProvider: ObjectProvider<DatabaseIdProvider?>,
    configurationCustomizersProvider: ObjectProvider<List<ConfigurationCustomizer?>?>,
    dataSourceScan: DataSourceScan
) : MybatisAutoConfiguration(
    properties,
    interceptorsProvider,
    typeHandlersProvider,
    languageDriversProvider,
    resourceLoader,
    databaseIdProvider,
    configurationCustomizersProvider
) {



}