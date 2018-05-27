package cn.com.baota.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * <p>Description: 3.4 条件注解@Conditional</p>
 * <p>Date: 2018-05-16</p>
 * <p>Time: 12:56</p>
 * <p>Author sunbaota</p>
 */
public class Main {
    /**
     * 通过活动的profile,可以获得不同的bean。spring提供了一个更通过的基于条件的Bean的创建，即使用Conditional注解。
     * @conditional根据满足一个特定条件创建一个特定的Bean。
     * 比如，当某一个jar包在一个类路径下，自动配置一个或多个Bean；或者只有某个Bean被创建时才会创建另外一个Bean。
     * 总的来说，就是根据特定条件来控制Bean的创建行为，这样我们可以利用这个特性进行一些自动配置。
     */
    public static void main(String[] args) throws InterruptedException {
        /**
         * 本示例：以不同系统作为条件
         * 通过实现Condition接口，并重写matches方法构造判断条件。
         * */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name")+"系统下的列表命令为："+listService.showListCmd());
        context.close();
    }
}
