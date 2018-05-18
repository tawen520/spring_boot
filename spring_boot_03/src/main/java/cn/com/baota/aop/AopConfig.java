package cn.com.baota.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <p>Description: 配置类</p>
 * <p>Date: 20:54 2018/5/11/011</p>
 * <p>Author sunbaota</p>
 */
@Configuration
@ComponentScan("cn.com.baota.aop")
@EnableAspectJAutoProxy//使用@EnableAspectJAutoProxy注解开启spring对AspectJ的支持
public class AopConfig {
}
