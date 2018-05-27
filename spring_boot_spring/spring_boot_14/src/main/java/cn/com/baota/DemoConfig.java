package cn.com.baota;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * <p>Description: </p>
 * <p>Date: 2018-05-23</p>
 * <p>Time: 13:00</p>
 * <p>Author: sunbaota</p>
 */
@EnableScheduling
@EnableAsync
@EnableAspectJAutoProxy
public class DemoConfig {
}
