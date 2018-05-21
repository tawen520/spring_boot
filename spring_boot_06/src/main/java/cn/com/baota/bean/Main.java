package cn.com.baota.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>Description: Bean的初始化和销毁</p>
 * <p>Date: 2018-05-16</p>
 * <p>Time: 12:56</p>
 * <p>Author sunbaota</p>
 */
public class Main {
    /**
     * 有时候会遇到在使用Bean之前或者之后做些必要的操作，Spring对Bean的生命周期的操作提供了支持。在使用java配置和注解配置
     * 下提供了如下两种方式：
     * 1.java配置方式：使用@Bean的initMethod和destroyMethod(相当于xml配置的init-method和destory-method)。
     * 2.注解方式：利用JSR-250的@PostContruct和@ProDestroy。
     */
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
        context.close();
    }
}
