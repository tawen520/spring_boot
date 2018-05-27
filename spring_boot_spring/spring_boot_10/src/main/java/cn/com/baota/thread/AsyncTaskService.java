package cn.com.baota.thread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * <p>Description: 任务执行类</p>
 * <p>Date: 2018-05-22</p>
 * <p>Time: 18:31</p>
 * <p>Author: sunbaota</p>
 */
@Service
public class AsyncTaskService {
    @Async
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务："+i);
    }
    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务（i+1）："+(i+1));
    }
}
