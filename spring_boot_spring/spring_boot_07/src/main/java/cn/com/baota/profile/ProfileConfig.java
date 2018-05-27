package cn.com.baota.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * <p>Description: </p>
 * <p>Date: 2018-05-21</p>
 * <p>Time: 20:49</p>
 * <p>Author: sunbaota</p>
 */
@Configuration
@ComponentScan("cn.com.baota.profile")
public class ProfileConfig {
    @Bean
    @Profile("dev")//profile为dev时实例化devDemoBean
    public DemoBean devDemoBean(){
        return  new DemoBean("from development profile");
    }
    @Bean
    @Profile("prod")//profile为prod时实例化prodDemoBean
    public DemoBean prodDemoBean(){
        return  new DemoBean("from production profile");
    }
}
