package net.wangjifeng.kpring.datasource;

import java.lang.System;

/**
 * @author: wjf
 * @date: 2021/6/11 10:38
 *
 * @see MultipleDataSource 多数据源的运作机制。
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u0005\u0012\u001a\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\t\u0018\u00010\u00060\u0005\u0012\u0016\u0010\n\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u00060\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0005\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00110\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0002\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"Lnet/wangjifeng/kpring/datasource/MultipleDataSource;", "Lorg/mybatis/spring/boot/autoconfigure/MybatisAutoConfiguration;", "properties", "Lorg/mybatis/spring/boot/autoconfigure/MybatisProperties;", "interceptorsProvider", "Lorg/springframework/beans/factory/ObjectProvider;", "", "Lorg/apache/ibatis/plugin/Interceptor;", "typeHandlersProvider", "Lorg/apache/ibatis/type/TypeHandler;", "languageDriversProvider", "Lorg/apache/ibatis/scripting/LanguageDriver;", "resourceLoader", "Lorg/springframework/core/io/ResourceLoader;", "databaseIdProvider", "Lorg/apache/ibatis/mapping/DatabaseIdProvider;", "configurationCustomizersProvider", "", "Lorg/mybatis/spring/boot/autoconfigure/ConfigurationCustomizer;", "dataSourceScan", "Lnet/wangjifeng/kpring/datasource/DataSourceScan;", "(Lorg/mybatis/spring/boot/autoconfigure/MybatisProperties;Lorg/springframework/beans/factory/ObjectProvider;Lorg/springframework/beans/factory/ObjectProvider;Lorg/springframework/beans/factory/ObjectProvider;Lorg/springframework/core/io/ResourceLoader;Lorg/springframework/beans/factory/ObjectProvider;Lorg/springframework/beans/factory/ObjectProvider;Lnet/wangjifeng/kpring/datasource/DataSourceScan;)V", "kpring-datasource"})
public class MultipleDataSource extends org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration {
    
    public MultipleDataSource(@org.jetbrains.annotations.Nullable()
    org.mybatis.spring.boot.autoconfigure.MybatisProperties properties, @org.jetbrains.annotations.NotNull()
    org.springframework.beans.factory.ObjectProvider<org.apache.ibatis.plugin.Interceptor[]> interceptorsProvider, @org.jetbrains.annotations.NotNull()
    org.springframework.beans.factory.ObjectProvider<org.apache.ibatis.type.TypeHandler<?>[]> typeHandlersProvider, @org.jetbrains.annotations.NotNull()
    org.springframework.beans.factory.ObjectProvider<org.apache.ibatis.scripting.LanguageDriver[]> languageDriversProvider, @org.jetbrains.annotations.Nullable()
    org.springframework.core.io.ResourceLoader resourceLoader, @org.jetbrains.annotations.NotNull()
    org.springframework.beans.factory.ObjectProvider<org.apache.ibatis.mapping.DatabaseIdProvider> databaseIdProvider, @org.jetbrains.annotations.NotNull()
    org.springframework.beans.factory.ObjectProvider<java.util.List<org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer>> configurationCustomizersProvider, @org.jetbrains.annotations.NotNull()
    net.wangjifeng.kpring.datasource.DataSourceScan dataSourceScan) {
        super(null, null, null, null, null, null, null);
    }
}