package cn.com.baota.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import sun.nio.ch.IOUtil;

/**
 * <p>Description: spring aware演示bean</p>
 * <p>Date: 2018-05-22</p>
 * <p>Time: 12:53</p>
 * <p>Author: sunbaota</p>
 */
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware {
    private String beanName;
    private ResourceLoader loader;

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }
    public void outputResult(){
        System.out.println("Bean的名称为："+beanName);
        Resource resource = loader.getResource("classpath:cn/com/baota/aware/test.txt");
        try {
            System.out.println("ResourceLoader加载的文件内容为："+ IOUtils.toString(resource.getInputStream()));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
