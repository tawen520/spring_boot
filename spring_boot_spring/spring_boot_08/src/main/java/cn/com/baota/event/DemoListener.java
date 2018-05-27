package cn.com.baota.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * <p>Description: 事件监听器</p>
 * <p>Date: 2018-05-22</p>
 * <p>Time: 09:02</p>
 * <p>Author: sunbaota</p>
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {//实现ApplicationListener接口并指定监听的事件类型

    public void onApplicationEvent(DemoEvent demoEvent){//使用onApplicationEvent方法对消息进行接受处理
        String msg = demoEvent.getMsg();
        System.out.println("我(bean-demoListener)接收到了bean-demoPublisher发布的消息："+msg);
    }
}
