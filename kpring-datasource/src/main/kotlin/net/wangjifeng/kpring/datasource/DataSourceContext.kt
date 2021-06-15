package net.wangjifeng.kpring.datasource

import org.springframework.beans.factory.config.BeanDefinition
import org.springframework.beans.factory.config.BeanFactoryPostProcessor
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory
import org.springframework.beans.factory.support.BeanDefinitionBuilder
import org.springframework.beans.factory.support.BeanDefinitionRegistry
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor
import org.springframework.beans.factory.support.DefaultListableBeanFactory
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware
import org.springframework.context.support.GenericApplicationContext
import org.springframework.stereotype.Component

/**
 * @author: wjf
 * @date: 2021/6/11 10:40
 *
 * @see DataSourceContext 数据源上下文。
 */
@Component
class DataSourceContext : GenericApplicationContext(), ApplicationContextAware, BeanDefinitionRegistryPostProcessor {

    private var applicationContext: ApplicationContext? = null
    private var registry: BeanDefinitionRegistry? = null

    override fun setApplicationContext(applicationContext: ApplicationContext) {
        this.applicationContext = applicationContext
    }

    override fun postProcessBeanFactory(beanFactory: ConfigurableListableBeanFactory) {}

    override fun postProcessBeanDefinitionRegistry(registry: BeanDefinitionRegistry) {
        this.registry = registry
    }

    override fun <T> getBean(name: String, beanClass: Class<T>): T {
        return applicationContext!!.getBean(name, beanClass)
    }

    fun registerBean(beanName: String, clazz: Class<*>, beanDefinition: BeanDefinition) {
        registry!!.registerBeanDefinition(beanName, beanDefinition)
    }

}