package cn.com.baota;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p>Description: 测试</p>
 * <p>Date: 2018-05-27</p>
 * <p>Time: 22:51</p>
 * <p>Author: sunbaota</p>
 */
@RunWith(SpringJUnit4ClassRunner.class)//在JUnit环境下提供Spring TestContextFramework的功能
@ContextConfiguration(classes = {TestConfig.class})//加载ApplicationContext,其中classes属性用来加载配置类
@ActiveProfiles("prod")//用来加载活动的profile
public class DemoBeanIntegrationTests {
    @Autowired
    private TestBean testBean;
    @Test//通过Junit的Assert来校验结果是否与预期一致
    public void prodBeanShouldInject(){
        String exepected = "from production profile";
        String actual = testBean.getContent();
        Assert.assertEquals(exepected,actual);
    }
}
