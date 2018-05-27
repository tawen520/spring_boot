package cn.com.baota.el;

import cn.com.baota.el.ELConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>Description: Spring EL 和资源调用</p>
 * <p>Date: 2018-05-16</p>
 * <p>Time: 12:56</p>
 * <p>Author sunbaota</p>
 */
public class Main {
    /**
     * Spring EL-Spring表达语言，支持在xml和注解中使用表达式，类似于使用jsp的EL表达式语言
     * spring开发中经常涉及调用各种资源的情况，包含普通文件、网址、配置文件、系统环境变量等，我们可以使用spring的表达式语言实现资源的注入。
     * Spring主要在注解@Value的参数中使用表达式。
     * 本节央视实现以下几种情况：
     * 1.注入普通字符
     * 2.注入操作系统属性
     * 3.注入表达式运算结果
     * 4.注入其他bean属性
     * 5.注入文件内容
     * 6.注入网址内容
     * 7.注入属性文件
     */
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ELConfig.class);
        ELConfig resourceService = context.getBean(ELConfig.class);
        resourceService.outputResource();
        context.close();
    }
}
