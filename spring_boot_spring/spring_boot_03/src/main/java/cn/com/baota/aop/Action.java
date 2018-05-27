package cn.com.baota.aop;

import java.lang.annotation.*;

/**
 * <p>Description: 编写拦截规则的注解</p>
 * <p>Date: 20:40 2018/5/11/011</p>
 * <p>Author sunbaota</p>
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
    //代码解释：注解本身是没有功能的，就和xml一样。注解和xml都是一种元数据，元数据是解释数据的数据，这就是所谓的配置。
    //注解的功能来自于用这个注解的地方
}
