package cn.com.baota.scheduled;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>Description: 计划任务</p>
 * <p>Date: 2018-05-16</p>
 * <p>Time: 12:56</p>
 * <p>Author sunbaota</p>
 */
public class Main {
    /**
     * 通过在配置类注解@EnableScheduling来开启对计划任务的支持，然后在要执行计划任务的方法上注解@Scheduled
     * ，声明这是一个计划任务。
     * spring支持多种类型的计划任务，包含corn、fixDelay、fixRate等。
     */
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
        Thread.sleep(1000000);
        context.close();
    }
}
