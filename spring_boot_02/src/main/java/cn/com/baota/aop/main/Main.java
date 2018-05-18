package cn.com.baota.aop.main;

import cn.com.baota.aop.config.JavaConfig;
import cn.com.baota.aop.service.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 示例：简单的java配置
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.print(useFunctionService.sayHello("Java Config"));
        context.close();
    }
}
