package net.wangjifeng.kpring.datasource

import com.alibaba.druid.pool.DruidDataSource
import org.apache.ibatis.session.SqlSessionFactory
import org.mybatis.spring.SqlSessionFactoryBean
import org.mybatis.spring.SqlSessionTemplate
import org.mybatis.spring.mapper.MapperScannerConfigurer
import org.springframework.beans.MutablePropertyValues
import org.springframework.beans.PropertyValue
import org.springframework.beans.factory.config.ConstructorArgumentValues
import org.springframework.beans.factory.support.RootBeanDefinition
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.core.Ordered
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import org.springframework.jdbc.datasource.DataSourceTransactionManager
import java.util.function.Supplier
import javax.annotation.Resource

/**
 * @author: wjf
 * @date: 2021/6/11 11:30
 *
 * @see MultipleDataSourceAutoConfiguration 多数据源的自动配置。
 */
@Configuration
@EnableConfigurationProperties(MultipleDataSourceProperties::class)
class MultipleDataSourceAutoConfiguration(var multipleDataSourceProperties: MultipleDataSourceProperties) :
    ApplicationRunner, Ordered {

    @Resource
    private lateinit var dataSourceContext: DataSourceContext

    override fun run(args: ApplicationArguments?) {
        val validationQuery = multipleDataSourceProperties.validationQuery
        for (dataSource in multipleDataSourceProperties.dataSources) {
            this.initDataSource(dataSource, validationQuery)
            this.initSqlSessionFactory(dataSource)
            this.initDataSourceTransactionManager(dataSource)
            this.initSqlSessionTemplate(dataSource)
            this.initMapperScan(dataSource)
        }
    }

    override fun getOrder(): Int {
        return Int.MAX_VALUE - 1
    }

    fun initDataSource(dataSource: MultipleDataSourceProperties.DataSource, validationQuery: String) {
        val propertyValues = MutablePropertyValues()
        propertyValues.addPropertyValue(PropertyValue("driverClass", dataSource.dataSourceBeanName))
        propertyValues.addPropertyValue(PropertyValue("jdbcUrl", dataSource.url))
        propertyValues.addPropertyValue(PropertyValue("username", dataSource.username))
        propertyValues.addPropertyValue(PropertyValue("password", dataSource.password))
        propertyValues.addPropertyValue(PropertyValue("validationQuery", validationQuery))
        val beanDefinition = RootBeanDefinition(DruidDataSource::class.java, null, propertyValues)

        dataSourceContext.registerBean(dataSource.dataSourceBeanName, DruidDataSource::class.java, beanDefinition)
    }

    fun initSqlSessionFactory(dataSource: MultipleDataSourceProperties.DataSource) {
        val druidDataSource = dataSourceContext.getBean(dataSource.dataSourceBeanName, DruidDataSource::class.java)
        val sqlSessionFactoryBean = SqlSessionFactoryBean()
        sqlSessionFactoryBean.setDataSource(druidDataSource)
        sqlSessionFactoryBean.setMapperLocations(
            *PathMatchingResourcePatternResolver()
                .getResources("classpath:${dataSource.resourcePattern}")
        )
        val supplier = Supplier { return@Supplier sqlSessionFactoryBean.`object` }

        dataSourceContext.registerBean(dataSource.sqlSessionFactoryRef, SqlSessionFactory::class.java, supplier)
    }

    fun initDataSourceTransactionManager(dataSource: MultipleDataSourceProperties.DataSource) {
        val druidDataSource = dataSourceContext.getBean(dataSource.dataSourceBeanName, DruidDataSource::class.java)
        val constructorArgumentValues = ConstructorArgumentValues()
        constructorArgumentValues.indexedArgumentValues[1] = ConstructorArgumentValues.ValueHolder(druidDataSource)
        val beanDefinition = RootBeanDefinition(
            DruidDataSource::class.java,
            constructorArgumentValues,
            null)
        dataSourceContext.registerBean(dataSource.dataSourceTransactionManagerBeanName, DataSourceTransactionManager::class.java, beanDefinition)
    }

    fun initSqlSessionTemplate(dataSource: MultipleDataSourceProperties.DataSource) {
        val sqlSessionFactory = dataSourceContext.getBean(dataSource.sqlSessionFactoryRef, SqlSessionFactory::class.java)

        val constructorArgumentValues = ConstructorArgumentValues()
        constructorArgumentValues.indexedArgumentValues[1] = ConstructorArgumentValues.ValueHolder(sqlSessionFactory)
        val beanDefinition = RootBeanDefinition(
            SqlSessionTemplate::class.java,
            constructorArgumentValues,
            null)
        dataSourceContext.registerBean(dataSource.dataSourceTransactionManagerBeanName, SqlSessionTemplate::class.java, beanDefinition)
    }

    fun initMapperScan(dataSource: MultipleDataSourceProperties.DataSource) {
        val dataSourceScan = DataSourceScan()
        dataSourceScan.setBasePackage(dataSource.mapperScanBasePackages.joinToString { "," })
        dataSourceScan.setSqlSessionFactoryBeanName(dataSource.sqlSessionFactoryRef)
        dataSourceScan.setSqlSessionTemplateBeanName(dataSource.sqlSessionTemplateBeanName)
        val supplier = Supplier { return@Supplier dataSourceScan }

        dataSourceContext.registerBean("${dataSource.dataSourceBeanName}dataSourceScan", MapperScannerConfigurer::class.java, supplier)
    }

}