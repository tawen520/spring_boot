package cn.com.baota.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>Description: Profile</p>
 * <p>Date: 2018-05-16</p>
 * <p>Time: 12:56</p>
 * <p>Author sunbaota</p>
 */
public class Main {
    /**
     * Profile为在不同环境下使用不同的配置提供了支持(开发环境下的配置和生产环境下的配置肯定是不一样的，例如数据库的位置)
     * 1.通过设定Environment的ActiveProfiles来设定当前context需要使用的配置环境。在开发中使用@Profile注解类或者方法，
     * 达到在不同情况下选择实例化不同的Bean。
     * 2.通过设定jvm的spring.profiles.active参数来配置环境。
     * 3.Web项目设置在Servlet的context parameter中
     */
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.close();
    }
}
