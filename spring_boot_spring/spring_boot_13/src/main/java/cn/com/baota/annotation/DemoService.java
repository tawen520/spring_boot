package cn.com.baota.annotation;

import org.springframework.stereotype.Service;

/**
 * <p>Description: </p>
 * <p>Date: 2018-05-23</p>
 * <p>Time: 12:49</p>
 * <p>Author: sunbaota</p>
 */
@Service
public class DemoService {
    public void outputResult(){
        System.out.println("从组合注解配置照样获得的Bean");
    }
}
