package cn.com.baota.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>Description: AOP,Spring的AOP的存在目的是为了解耦，AOP可以让一组类共享相同的行为/p>
 * <p>Date: 20:55 2018/5/11/011</p>
 * <p>Author sunbaota</p>
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();
        context.close();
    }
}
