package cn.com.baota;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * <p>Description: 配置类</p>
 * <p>Date: 2018-05-27</p>
 * <p>Time: 22:03</p>
 * <p>Author: sunbaota</p>
 */
@Configuration
public class TestConfig {
    @Bean
    @Profile("dev")
    public TestBean devTestBean(){
        return new TestBean("from devlopment profile");
    }
    @Bean
    @Profile("prod")
    public TestBean prodTestBean(){
        return new TestBean("from production profile");
    }

}
