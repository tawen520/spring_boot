package cn.com.baota.profile;

/**
 * <p>Description: 示例Bean </p>
 * <p>Date: 2018-05-21</p>
 * <p>Time: 20:47</p>
 * <p>Author: sunbaota</p>
 */
public class DemoBean {
    private String content;
    public DemoBean(String content){
        super();
        this.content = content;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
