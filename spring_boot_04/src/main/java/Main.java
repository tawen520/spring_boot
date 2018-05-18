import cn.com.baota.DemoSingletonService;
import cn.com.baota.DemoPrototypeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>Description: Bean的Scope（本示例简单演示默认的singleton和Prototype，分别从spring容器中获得2次bean，判断bean的实例是否相等）</p>
 * <p>Date: 2018-05-16</p>
 * <p>Time: 12:56</p>
 * <p>Author sunbaota</p>
 */
public class Main {
    /**
     * Scope描述的是spring容器如何新建bean的实例，spring的scope有以下几种，通过Scope来实现
     * 1.singleton:一个spring容器中只有一个bean的实例，此为spring的默认配置，全容器共享一个实例。
     * 2.prototype:每次调用新建一个bean的实例
     * 3.request:web项目中，给每一个http request新建一个bean实例
     * 4.session:web项目中，给每一个http session新建一个bean实例
     * 5.GlobalSession:这个只在portal应用中有用，给每一个global http session新建一个bean实例
     * 另外，在spring batch中还有一个scope使用@SetpScope
     */
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);
        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);
        System.out.println("s1与s2是否相等"+s1.equals(s2));
        System.out.println("p1与p2是否相等"+p1.equals(p2));
        context.close();
    }
}
