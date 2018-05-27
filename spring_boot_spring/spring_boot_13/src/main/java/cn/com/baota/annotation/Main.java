package cn.com.baota.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>Description: 3.5 组合注解和元注解</p>
 * <p>Date: 2018-05-16</p>
 * <p>Time: 12:56</p>
 * <p>Author sunbaota</p>
 */
public class Main {
    /**
     *  元注解：就可以注解到别的注解上的注解
     *  组合注解：被注解的注解称之为组合注解。组合注解具备注解其上的元注解的功能。
     * spring有很多元注解，也有很多组合注解，@Configuration就是一个组合注解@Component注解，表明这个类其实也是一个Bean
     */
    public static void main(String[] args) throws InterruptedException {
        /**
         * 本示例：将@Configuration和@ComponentScan这两个元注解组成一个组合注解
         * */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService = context.getBean(DemoService.class);
        demoService.outputResult();
        context.close();
    }
}
