package cn.com.baota;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>Description: Bean的Scope（本示例简单演示默认的singleton和Prototype，分别从spring容器中获得2次bean，判断bean的实例是否相等）</p>
 * <p>Date: 2018-05-16</p>
 * <p>Time: 12:56</p>
 * <p>Author sunbaota</p>
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);

        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);

        System.out.println("s1与s2是否相等："+s1.equals(s2));
        System.out.println("p1与p2是否相等："+p1.equals(p2));
        context.close();
    }
}
