package net.wangjifeng.kpring.datasource;

import java.lang.System;

/**
 * @author: wjf
 * @date: 2021/6/11 11:31
 *
 * @see MultipleDataSourceProperties 多数据源的配置信息。
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lnet/wangjifeng/kpring/datasource/MultipleDataSourceProperties;", "", "validationQuery", "", "dataSources", "", "Lnet/wangjifeng/kpring/datasource/MultipleDataSourceProperties$DataSource;", "(Ljava/lang/String;Ljava/util/List;)V", "getDataSources", "()Ljava/util/List;", "setDataSources", "(Ljava/util/List;)V", "getValidationQuery", "()Ljava/lang/String;", "setValidationQuery", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "DataSource", "kpring-datasource"})
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "net.wangjifeng.multiple-datasource")
@org.springframework.boot.context.properties.ConstructorBinding()
public final class MultipleDataSourceProperties {
    
    /**
     * 验证SQL语句
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String validationQuery;
    
    /**
     * 数据源连接信息列表
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.List<net.wangjifeng.kpring.datasource.MultipleDataSourceProperties.DataSource> dataSources;
    
    /**
     * @author: wjf
     * @date: 2021/6/11 11:31
     *
     * @see MultipleDataSourceProperties 多数据源的配置信息。
     */
    @org.jetbrains.annotations.NotNull()
    public final net.wangjifeng.kpring.datasource.MultipleDataSourceProperties copy(@org.jetbrains.annotations.NotNull()
    java.lang.String validationQuery, @org.jetbrains.annotations.NotNull()
    java.util.List<net.wangjifeng.kpring.datasource.MultipleDataSourceProperties.DataSource> dataSources) {
        return null;
    }
    
    /**
     * @author: wjf
     * @date: 2021/6/11 11:31
     *
     * @see MultipleDataSourceProperties 多数据源的配置信息。
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    /**
     * @author: wjf
     * @date: 2021/6/11 11:31
     *
     * @see MultipleDataSourceProperties 多数据源的配置信息。
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * @author: wjf
     * @date: 2021/6/11 11:31
     *
     * @see MultipleDataSourceProperties 多数据源的配置信息。
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public MultipleDataSourceProperties() {
        super();
    }
    
    public MultipleDataSourceProperties(@org.jetbrains.annotations.NotNull()
    java.lang.String validationQuery, @org.jetbrains.annotations.NotNull()
    java.util.List<net.wangjifeng.kpring.datasource.MultipleDataSourceProperties.DataSource> dataSources) {
        super();
    }
    
    /**
     * 验证SQL语句
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * 验证SQL语句
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getValidationQuery() {
        return null;
    }
    
    /**
     * 验证SQL语句
     */
    public final void setValidationQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    /**
     * 数据源连接信息列表
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.wangjifeng.kpring.datasource.MultipleDataSourceProperties.DataSource> component2() {
        return null;
    }
    
    /**
     * 数据源连接信息列表
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.wangjifeng.kpring.datasource.MultipleDataSourceProperties.DataSource> getDataSources() {
        return null;
    }
    
    /**
     * 数据源连接信息列表
     */
    public final void setDataSources(@org.jetbrains.annotations.NotNull()
    java.util.List<net.wangjifeng.kpring.datasource.MultipleDataSourceProperties.DataSource> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003Jw\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u000206H\u00d6\u0001J\t\u00107\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012\u00a8\u00068"}, d2 = {"Lnet/wangjifeng/kpring/datasource/MultipleDataSourceProperties$DataSource;", "", "driverClassName", "", "url", "username", "password", "mapperScanBasePackages", "", "resourcePattern", "sqlSessionFactoryRef", "dataSourceBeanName", "dataSourceTransactionManagerBeanName", "sqlSessionTemplateBeanName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDataSourceBeanName", "()Ljava/lang/String;", "setDataSourceBeanName", "(Ljava/lang/String;)V", "getDataSourceTransactionManagerBeanName", "setDataSourceTransactionManagerBeanName", "getDriverClassName", "setDriverClassName", "getMapperScanBasePackages", "()Ljava/util/List;", "setMapperScanBasePackages", "(Ljava/util/List;)V", "getPassword", "setPassword", "getResourcePattern", "setResourcePattern", "getSqlSessionFactoryRef", "setSqlSessionFactoryRef", "getSqlSessionTemplateBeanName", "setSqlSessionTemplateBeanName", "getUrl", "setUrl", "getUsername", "setUsername", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "kpring-datasource"})
    public static final class DataSource {
        
        /**
         * 数据库驱动名称
         */
        @org.jetbrains.annotations.NotNull()
        private java.lang.String driverClassName;
        
        /**
         * 数据库链接url
         */
        @org.jetbrains.annotations.NotNull()
        private java.lang.String url;
        
        /**
         * 数据库用户名
         */
        @org.jetbrains.annotations.Nullable()
        private java.lang.String username;
        
        /**
         * 数据库密码
         */
        @org.jetbrains.annotations.Nullable()
        private java.lang.String password;
        
        /**
         * mybatis的数据库映射接口包名
         */
        @org.jetbrains.annotations.NotNull()
        private java.util.List<java.lang.String> mapperScanBasePackages;
        
        /**
         * mybatis的数据库映射资源pattern:classpath
         */
        @org.jetbrains.annotations.NotNull()
        private java.lang.String resourcePattern;
        
        /**
         * sqlSessionFactoryRef
         */
        @org.jetbrains.annotations.NotNull()
        private java.lang.String sqlSessionFactoryRef;
        
        /**
         * 数据源beanName
         */
        @org.jetbrains.annotations.NotNull()
        private java.lang.String dataSourceBeanName;
        
        /**
         * 数据源事务管理器beanName
         */
        @org.jetbrains.annotations.NotNull()
        private java.lang.String dataSourceTransactionManagerBeanName;
        
        /**
         * sqlSessionTemplateBeanName
         */
        @org.jetbrains.annotations.NotNull()
        private java.lang.String sqlSessionTemplateBeanName;
        
        @org.jetbrains.annotations.NotNull()
        public final net.wangjifeng.kpring.datasource.MultipleDataSourceProperties.DataSource copy(@org.jetbrains.annotations.NotNull()
        java.lang.String driverClassName, @org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.Nullable()
        java.lang.String username, @org.jetbrains.annotations.Nullable()
        java.lang.String password, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> mapperScanBasePackages, @org.jetbrains.annotations.NotNull()
        java.lang.String resourcePattern, @org.jetbrains.annotations.NotNull()
        java.lang.String sqlSessionFactoryRef, @org.jetbrains.annotations.NotNull()
        java.lang.String dataSourceBeanName, @org.jetbrains.annotations.NotNull()
        java.lang.String dataSourceTransactionManagerBeanName, @org.jetbrains.annotations.NotNull()
        java.lang.String sqlSessionTemplateBeanName) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public DataSource(@org.jetbrains.annotations.NotNull()
        java.lang.String driverClassName, @org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.Nullable()
        java.lang.String username, @org.jetbrains.annotations.Nullable()
        java.lang.String password, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> mapperScanBasePackages, @org.jetbrains.annotations.NotNull()
        java.lang.String resourcePattern, @org.jetbrains.annotations.NotNull()
        java.lang.String sqlSessionFactoryRef, @org.jetbrains.annotations.NotNull()
        java.lang.String dataSourceBeanName, @org.jetbrains.annotations.NotNull()
        java.lang.String dataSourceTransactionManagerBeanName, @org.jetbrains.annotations.NotNull()
        java.lang.String sqlSessionTemplateBeanName) {
            super();
        }
        
        /**
         * 数据库驱动名称
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        /**
         * 数据库驱动名称
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDriverClassName() {
            return null;
        }
        
        /**
         * 数据库驱动名称
         */
        public final void setDriverClassName(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        /**
         * 数据库链接url
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        /**
         * 数据库链接url
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrl() {
            return null;
        }
        
        /**
         * 数据库链接url
         */
        public final void setUrl(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        /**
         * 数据库用户名
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        /**
         * 数据库用户名
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUsername() {
            return null;
        }
        
        /**
         * 数据库用户名
         */
        public final void setUsername(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        /**
         * 数据库密码
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        /**
         * 数据库密码
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPassword() {
            return null;
        }
        
        /**
         * 数据库密码
         */
        public final void setPassword(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        /**
         * mybatis的数据库映射接口包名
         */
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> component5() {
            return null;
        }
        
        /**
         * mybatis的数据库映射接口包名
         */
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getMapperScanBasePackages() {
            return null;
        }
        
        /**
         * mybatis的数据库映射接口包名
         */
        public final void setMapperScanBasePackages(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> p0) {
        }
        
        /**
         * mybatis的数据库映射资源pattern:classpath
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component6() {
            return null;
        }
        
        /**
         * mybatis的数据库映射资源pattern:classpath
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getResourcePattern() {
            return null;
        }
        
        /**
         * mybatis的数据库映射资源pattern:classpath
         */
        public final void setResourcePattern(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        /**
         * sqlSessionFactoryRef
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component7() {
            return null;
        }
        
        /**
         * sqlSessionFactoryRef
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSqlSessionFactoryRef() {
            return null;
        }
        
        /**
         * sqlSessionFactoryRef
         */
        public final void setSqlSessionFactoryRef(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        /**
         * 数据源beanName
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component8() {
            return null;
        }
        
        /**
         * 数据源beanName
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDataSourceBeanName() {
            return null;
        }
        
        /**
         * 数据源beanName
         */
        public final void setDataSourceBeanName(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        /**
         * 数据源事务管理器beanName
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component9() {
            return null;
        }
        
        /**
         * 数据源事务管理器beanName
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDataSourceTransactionManagerBeanName() {
            return null;
        }
        
        /**
         * 数据源事务管理器beanName
         */
        public final void setDataSourceTransactionManagerBeanName(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        /**
         * sqlSessionTemplateBeanName
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component10() {
            return null;
        }
        
        /**
         * sqlSessionTemplateBeanName
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSqlSessionTemplateBeanName() {
            return null;
        }
        
        /**
         * sqlSessionTemplateBeanName
         */
        public final void setSqlSessionTemplateBeanName(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
    }
}