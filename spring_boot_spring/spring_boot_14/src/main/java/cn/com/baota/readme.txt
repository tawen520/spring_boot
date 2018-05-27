3.6 @Enable*注解的工作原理
@EnableAspectJAutoProxy：开启对AspectJ自动代理的支持
@EnableAsync：开启异步方法的支持
@EnableScheduling：开启计划任务的支持
@EnableWebMvc：开启WebMVC的配置支持
@EnableConfigurationProperties：开启对@ConfigurationProperties注解配置Bean的支持
@EnableJpaRepositories：开启对Spring Data JPA Repository的支持
@EnableTransactionManagement：开启注解式事务支持
@EnableCaching:开启注解式的缓存支持
查看这些注解源码，发现这些注解都一个@Import注解，这个注解是用来导入配置类的，这也就意味着这些自动开启的实现其实时导入一些自动配置
的Bean。这些导入的配置方式主要分为以下三种类型。
3.6.1
    第一类：直接导入配置类
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @Import(SchedulingConfiguration.class)
    @Documented
    public @interface EnableScheduling {

    }
    直接导入配置类SchedulingConfiguration，这个类注解了@Configuration，且注册了一个ScheduledAnnotationBeanPostProcessor的Bean
    第二类：依据条件选择配置类
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @Import(AsyncConfigurationSelector.class)
    public @interface EnableAsync {
    }
    第三类：动态注册Bean
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @Import(AspectJAutoProxyRegistrar.class)
    public @interface EnableAspectJAutoProxy {
    }
    AspectJAutoProxyRegistrar实现了ImportBeanDefinitionRegistrar接口，ImportBeanDefinitionRegistrar作用就是在运行时自动添加Bean到已有的配置类
    通过重写方法；
    其中，AnnotationMetadata参数用来获得当前配置类上的注解；BeanDefinitionRegistry用来注册Bean;

