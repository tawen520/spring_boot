package cn.com.baota.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>Description: 配置类</p>
 * <p>Date: 2018-05-21</p>
 * <p>Time: 20:31</p>
 * <p>Author: sunbaota</p>
 */
@Configuration
@ComponentScan("cn.com.baota.bean")
public class PrePostConfig {
    @Bean(initMethod = "init",destroyMethod = "destroy")//分别指定BeanWayService类的init和destroy方法在构造之后，Bean销毁之前执行
    BeanWayService beanWayService(){
        return  new BeanWayService();
    }
    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
