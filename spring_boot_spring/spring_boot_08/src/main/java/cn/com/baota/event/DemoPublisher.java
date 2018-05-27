package cn.com.baota.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * <p>Description: 事件发布类</p>
 * <p>Date: 2018-05-22</p>
 * <p>Time: 11:43</p>
 * <p>Author: sunbaota</p>
 */
@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext applicationContext;//注入ApplicationContext用来发布事件
    public void publisher(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg));//使用ApplicationContext的publishEvent方法来发布
    }
}
