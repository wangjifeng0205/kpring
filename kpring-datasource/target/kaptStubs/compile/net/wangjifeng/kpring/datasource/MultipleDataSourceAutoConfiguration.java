package net.wangjifeng.kpring.datasource;

import java.lang.System;

/**
 * @author: wjf
 * @date: 2021/6/11 11:30
 *
 * @see MultipleDataSourceAutoConfiguration 多数据源的自动配置。
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u0012\u0010\u0006\u001a\u00020\u00078\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005\u00a8\u0006\u001a"}, d2 = {"Lnet/wangjifeng/kpring/datasource/MultipleDataSourceAutoConfiguration;", "Lorg/springframework/boot/ApplicationRunner;", "Lorg/springframework/core/Ordered;", "multipleDataSourceProperties", "Lnet/wangjifeng/kpring/datasource/MultipleDataSourceProperties;", "(Lnet/wangjifeng/kpring/datasource/MultipleDataSourceProperties;)V", "dataSourceContext", "Lnet/wangjifeng/kpring/datasource/DataSourceContext;", "getMultipleDataSourceProperties", "()Lnet/wangjifeng/kpring/datasource/MultipleDataSourceProperties;", "setMultipleDataSourceProperties", "getOrder", "", "initDataSource", "", "dataSource", "Lnet/wangjifeng/kpring/datasource/MultipleDataSourceProperties$DataSource;", "validationQuery", "", "initDataSourceTransactionManager", "initMapperScan", "initSqlSessionFactory", "initSqlSessionTemplate", "run", "args", "Lorg/springframework/boot/ApplicationArguments;", "kpring-datasource"})
@org.springframework.boot.context.properties.EnableConfigurationProperties(value = {net.wangjifeng.kpring.datasource.MultipleDataSourceProperties.class})
@org.springframework.context.annotation.Configuration()
public class MultipleDataSourceAutoConfiguration implements org.springframework.boot.ApplicationRunner, org.springframework.core.Ordered {
    @org.jetbrains.annotations.NotNull()
    private net.wangjifeng.kpring.datasource.MultipleDataSourceProperties multipleDataSourceProperties;
    @javax.annotation.Resource()
    private net.wangjifeng.kpring.datasource.DataSourceContext dataSourceContext;
    
    public MultipleDataSourceAutoConfiguration(@org.jetbrains.annotations.NotNull()
    net.wangjifeng.kpring.datasource.MultipleDataSourceProperties multipleDataSourceProperties) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public net.wangjifeng.kpring.datasource.MultipleDataSourceProperties getMultipleDataSourceProperties() {
        return null;
    }
    
    public void setMultipleDataSourceProperties(@org.jetbrains.annotations.NotNull()
    net.wangjifeng.kpring.datasource.MultipleDataSourceProperties p0) {
    }
    
    @java.lang.Override()
    public void run(@org.jetbrains.annotations.Nullable()
    org.springframework.boot.ApplicationArguments args) {
    }
    
    @java.lang.Override()
    public int getOrder() {
        return 0;
    }
    
    public void initDataSource(@org.jetbrains.annotations.NotNull()
    net.wangjifeng.kpring.datasource.MultipleDataSourceProperties.DataSource dataSource, @org.jetbrains.annotations.NotNull()
    java.lang.String validationQuery) {
    }
    
    public void initSqlSessionFactory(@org.jetbrains.annotations.NotNull()
    net.wangjifeng.kpring.datasource.MultipleDataSourceProperties.DataSource dataSource) {
    }
    
    public void initDataSourceTransactionManager(@org.jetbrains.annotations.NotNull()
    net.wangjifeng.kpring.datasource.MultipleDataSourceProperties.DataSource dataSource) {
    }
    
    public void initSqlSessionTemplate(@org.jetbrains.annotations.NotNull()
    net.wangjifeng.kpring.datasource.MultipleDataSourceProperties.DataSource dataSource) {
    }
    
    public void initMapperScan(@org.jetbrains.annotations.NotNull()
    net.wangjifeng.kpring.datasource.MultipleDataSourceProperties.DataSource dataSource) {
    }
}