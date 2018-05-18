package cn.com.baota.aop.main;

import cn.com.baota.aop.config.DiConfig;
import cn.com.baota.aop.service.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 示例：基于注解的Bean的初始化和依赖注入，Spring容器类选用AnnotationConfigApplicationContext
 */
public class Main {
    public static void main(String[] args){
        //AnnotationConfigApplicationContext作为spring容器,接受输入一个配置类作为参数
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        //获得声明配置的UseFunctionService的Bean
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.print(useFunctionService.sayHello("Spring"));
        context.close();
    }
}
