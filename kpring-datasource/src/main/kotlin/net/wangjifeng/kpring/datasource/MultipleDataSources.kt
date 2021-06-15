package net.wangjifeng.kpring.datasource

import org.mybatis.spring.mapper.MapperScannerConfigurer
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.boot.context.properties.NestedConfigurationProperty

/**
 * @author: wjf
 * @date: 2021/6/11 11:31
 *
 * @see MultipleDataSourceProperties 多数据源的配置信息。
 */
@ConstructorBinding
@ConfigurationProperties(prefix = "net.wangjifeng.multiple-datasource")
data class MultipleDataSourceProperties(
    /**
     * 验证SQL语句
     */
    var validationQuery: String = "select 'x'",
    /**
     * 数据源连接信息列表
     */
    var dataSources: MutableList<DataSource> = mutableListOf()

) {

    data class DataSource(
        /**
         * 数据库驱动名称
         */
        var driverClassName: String,
        /**
         * 数据库链接url
         */
        var url: String,
        /**
         * 数据库用户名
         */
        var username: String? = null,
        /**
         * 数据库密码
         */
        var password: String? = null,
        /**
         * mybatis的数据库映射接口包名
         */
        var mapperScanBasePackages: MutableList<String> = mutableListOf(),
        /**
         * mybatis的数据库映射资源pattern:classpath
         */
        var resourcePattern: String,
        /**
         * sqlSessionFactoryRef
         */
        var sqlSessionFactoryRef: String,
        /**
         * 数据源beanName
         */
        var dataSourceBeanName: String,
        /**
         * 数据源事务管理器beanName
         */
        var dataSourceTransactionManagerBeanName: String,
        /**
         * sqlSessionTemplateBeanName
         */
        var sqlSessionTemplateBeanName: String
    )

}

/**
 * @author: wjf
 * @date: 2021/6/11 11:19
 *
 * @see DataSourceScan 数据源扫描。
 */
class DataSourceScan : MapperScannerConfigurer()