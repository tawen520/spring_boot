package cn.com.baota.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * <p>Description: 需要被注入的bean</p>
 * <p>Date: 2018-05-17</p>
 * <p>Time: 08:57</p>
 * <p>Author sunbaota</p>
 */
@Service
public class DemoService {
    @Value("其他类的属性")//此为注入普通字符串
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
