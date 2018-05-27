package cn.com.baota.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>Description: 计划任务执行类</p>
 * <p>Date: 2018-05-23</p>
 * <p>Time: 08:37</p>
 * <p>Author: sunbaota</p>
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    @Scheduled(fixedRate = 5000)//每五秒执行一次
    public void reportCurrentTime(){
        System.out.println("每隔五秒执行一次："+dateFormat.format(new Date()));
    }
    @Scheduled(cron = "0 52 08 ? * *")//指定时间执行，此处指定时间为每天08点52分；cron是UNIX和类UNIX系统下的定时任务
    public void fixTimeExecution(){
        System.out.println("在指定时间执行："+dateFormat.format(new Date()));
    }
}

