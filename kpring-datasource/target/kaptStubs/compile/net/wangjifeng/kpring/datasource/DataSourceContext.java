package net.wangjifeng.kpring.datasource;

import java.lang.System;

/**
 * @author: wjf
 * @date: 2021/6/11 10:40
 *
 * @see DataSourceContext 数据源上下文。
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J)\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000eH\u0016\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J$\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\f2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lnet/wangjifeng/kpring/datasource/DataSourceContext;", "Lorg/springframework/context/support/GenericApplicationContext;", "Lorg/springframework/context/ApplicationContextAware;", "Lorg/springframework/beans/factory/support/BeanDefinitionRegistryPostProcessor;", "()V", "applicationContext", "Lorg/springframework/context/ApplicationContext;", "registry", "Lorg/springframework/beans/factory/support/BeanDefinitionRegistry;", "getBean", "T", "name", "", "beanClass", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "postProcessBeanDefinitionRegistry", "", "postProcessBeanFactory", "beanFactory", "Lorg/springframework/beans/factory/config/ConfigurableListableBeanFactory;", "registerBean", "beanName", "clazz", "beanDefinition", "Lorg/springframework/beans/factory/config/BeanDefinition;", "setApplicationContext", "kpring-datasource"})
@org.springframework.stereotype.Component()
public class DataSourceContext extends org.springframework.context.support.GenericApplicationContext implements org.springframework.context.ApplicationContextAware, org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor {
    private org.springframework.context.ApplicationContext applicationContext;
    private org.springframework.beans.factory.support.BeanDefinitionRegistry registry;
    
    public DataSourceContext() {
        super();
    }
    
    @java.lang.Override()
    public void setApplicationContext(@org.jetbrains.annotations.NotNull()
    org.springframework.context.ApplicationContext applicationContext) {
    }
    
    @java.lang.Override()
    public void postProcessBeanFactory(@org.jetbrains.annotations.NotNull()
    org.springframework.beans.factory.config.ConfigurableListableBeanFactory beanFactory) {
    }
    
    @java.lang.Override()
    public void postProcessBeanDefinitionRegistry(@org.jetbrains.annotations.NotNull()
    org.springframework.beans.factory.support.BeanDefinitionRegistry registry) {
    }
    
    @java.lang.Override()
    public <T extends java.lang.Object>T getBean(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> beanClass) {
        return null;
    }
    
    public void registerBean(@org.jetbrains.annotations.NotNull()
    java.lang.String beanName, @org.jetbrains.annotations.NotNull()
    java.lang.Class<?> clazz, @org.jetbrains.annotations.NotNull()
    org.springframework.beans.factory.config.BeanDefinition beanDefinition) {
    }
}