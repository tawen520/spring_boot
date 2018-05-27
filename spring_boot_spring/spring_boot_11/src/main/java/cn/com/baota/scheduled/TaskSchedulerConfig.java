package cn.com.baota.scheduled;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * <p>Description: 配置类</p>
 * <p>Date: 2018-05-23</p>
 * <p>Time: 08:47</p>
 * <p>Author: sunbaota</p>
 */
@Configuration
@ComponentScan("cn.com.baota.scheduled")
@EnableScheduling
public class TaskSchedulerConfig {
}
