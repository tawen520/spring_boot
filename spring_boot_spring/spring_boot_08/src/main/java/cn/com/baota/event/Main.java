package cn.com.baota.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>Description: 事件 (Application Event)</p>
 * <p>Date: 2018-05-16</p>
 * <p>Time: 12:56</p>
 * <p>Author sunbaota</p>
 */
public class Main {
    /**
     * Spring的事件为Bean和Bean之间的消息通信提供了支持。当一个Bean处理完一个任务后，希望另一个Bean知道并能做出相应的处理，这是我们就需要让
     * 另外一个Bean监听当前的Bean所发送的事件。
     * Spring的事件需要遵循如下流程：
     * 1.自定义事件，继承ApplicationEvent
     * 2.定义事件监听器，实现ApplicationListener
     * 3.使用容器发布事件
     */
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publisher("成功了！");
        context.close();
    }
}
