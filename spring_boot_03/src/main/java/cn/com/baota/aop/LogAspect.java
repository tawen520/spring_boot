package cn.com.baota.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * <p>Description: 编写切面</p>
 * <p>Date: 20:44 2018/5/11/011</p>
 * <p>Author sunbaota</p>
 */
@Aspect //声明一个切面
@Component //让此切面成为spring容器管理的Bean
public class LogAspect {
    @Pointcut("@annotation(cn.com.baota.aop.Action)")  //注解声明切点
    public void annotationPointCut(){}
    @After("annotationPointCut()") //使用@After注解声明一个建言，并使用@PointCut切点
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截"+action.name());//通过反射可获得注解上的属性，然后做日志记录相关的操作
    }
    @Before("execution(* cn.com.baota.aop.DemoMethodService.*(..))")//使用@Before注解声明一个建言，此建言直接使用拦截规则作为参数
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截"+method.getName());
    }
}
