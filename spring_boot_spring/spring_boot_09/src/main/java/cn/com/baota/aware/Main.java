package cn.com.baota.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>Description: Spring Aware</p>
 * <p>Date: 2018-05-16</p>
 * <p>Time: 12:56</p>
 * <p>Author sunbaota</p>
 */
public class Main {
    /**
     * Spring的依赖注入最大亮点就是，Bean对Spring容器的存在是没有意识的，可以换成别的容器。
     * 若要调用spring容器本身的功能资源，则必须意识到spring容器的存在，才能调用spring容器本身的资源，这就是springaware，spring aware
     * 本来就是spring设计用来框架内部使用的，若使用了spring aware，bean将会和spring框架耦合
     * spring 提供的aware接口：
     * BeanNameAware:获得容器中Bean的名称
     * BeanFactoryAware：获得当前Bean Factory，这样可以调用容器的服务
     * ApplicationContextAware*:当前的application context，这样可以调用容器的服务
     * MessageSourceAware:获得message source,这样可以获得文本信息
     * ApplicationEventPublisherAware:应用事件发布器，DemoPublisher也可以实现这个接口来发布事件
     * ResourceLoaderAware:获得资源加载器，可以获得外部资源文件
     * 注：虽然Bean继承ApplicationContextAware接口可以获得spring容器的所有服务，但是原则上还是用哪个，实现哪个接口
     */
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService = context.getBean(AwareService.class);
        awareService.outputResult();
        context.close();
    }
}
