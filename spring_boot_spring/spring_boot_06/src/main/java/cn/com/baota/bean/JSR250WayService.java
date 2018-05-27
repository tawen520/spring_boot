package cn.com.baota.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * <p>Description: 使用JSR250形式的Bean</p>
 * <p>Date: 2018-05-21</p>
 * <p>Time: 20:25</p>
 * <p>Author:sunbaota</p>
 */
public class JSR250WayService {
    @PostConstruct//在构造函数执行完之后执行
    public void init(){
        System.out.println("JSR250-init-method");
    }
    public JSR250WayService(){
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }
    @PreDestroy//在Bean销毁之前执行
    public void destroy(){
        System.out.println("JSR250-init-destroy");
    }
}
