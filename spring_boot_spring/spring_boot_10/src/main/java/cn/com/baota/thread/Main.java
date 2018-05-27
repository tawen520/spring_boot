package cn.com.baota.thread;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>Description: 多线程</p>
 * <p>Date: 2018-05-16</p>
 * <p>Time: 12:56</p>
 * <p>Author sunbaota</p>
 */
public class Main {
    /**
     * Spring通过任务执行器(TaskExecutor)来实现多线程和并发编程。使用ThreadPoolTaskExecutor可实现一个基于线程池的TaskExecutor.而
     * 实际开发中任务一般是异步的，所以通过@EnableAsyncy开启对异步任务的支持，并通过在实际执行的Bean的方法中使用@Async注解来声明其
     * 是一个异步任务
     */
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
        for (int i = 0;i < 10;i++){
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }
        context.close();
    }
}
