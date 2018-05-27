package cn.com.baota.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * <p>Description: </p>
 * <p>Date: 2018-05-23</p>
 * <p>Time: 11:48</p>
 * <p>Author: sunbaota</p>
 */
@Configuration
public class ConditionConfig {
    @Bean
    @Conditional(WindowsCondition.class)//通过@Conditional注解，符合WindowsCondition中的条件则实例化WindowsListService
    public ListService windowsListService(){
        return new WindowsListService();
    }
    @Bean
    @Conditional(LinuxCondition.class)//通过@Conditional注解，符合LinuxCondition中的条件则实例化LinuxListService
    public ListService linuxListService(){
        return new LinuxListService();
    }
}
