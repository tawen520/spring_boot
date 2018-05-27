package cn.com.baota.bean;

/**
 * <p>Description: 使用@Bean形式的Bean</p>
 * <p>Date: 2018-05-21</p>
 * <p>Time: 20:25</p>
 * <p>Author:sunbaota</p>
 */
public class BeanWayService {
    public void init(){
        System.out.println("@Bean-init-method");
    }
    public BeanWayService(){
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }
    public void destroy(){
        System.out.println("@Bean-init-destroy");
    }
}
