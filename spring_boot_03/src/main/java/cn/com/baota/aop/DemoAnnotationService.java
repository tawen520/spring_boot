package cn.com.baota.aop;

import org.springframework.stereotype.Service;

/**
 * <p>Description:编写使用注解的被拦截类 </p>
 * <p>Date: 20:41 2018/5/11/011</p>
 * <p>Author sunbaota</p>
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截的add操作")
    public void add(){}

}
