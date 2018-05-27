package cn.com.baota.event;

import org.springframework.context.ApplicationEvent;

/**
 * <p>Description: 自定义事件</p>
 * <p>Date: 2018-05-22</p>
 * <p>Time: 08:54</p>
 * <p>Author: sunbaota</p>
 */
public class DemoEvent extends ApplicationEvent {


    private static final long serialVersionUID = -3249619288848926392L;
    private String msg;
    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
