package cn.com.baota.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * <p>Description: 示例组合注解</p>
 * <p>Date: 2018-05-23</p>
 * <p>Time: 12:46</p>
 * <p>Author: sunbaota</p>
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration//@Configuration元注解
@ComponentScan//@ComponentScan元注解
public @interface MyselfConfiguration {
    String[] value() default {};//覆盖value参数
}
