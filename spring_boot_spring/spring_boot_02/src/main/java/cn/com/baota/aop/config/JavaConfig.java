package cn.com.baota.aop.config;

import cn.com.baota.aop.service.FunctionService;
import cn.com.baota.aop.service.UseFunctionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //使用@Configuration注解表明当前类是一个配置类，这意味着这个类里可能有0哥或多个@Bean注解，此处没有使用包扫描，是因为所有Bean都在此类中定义了。(相当于一个spring配置的xml文件)
public class JavaConfig {
    @Bean//使用@Bean注解声明当前方法Functionservice返回值是一个Bean,Bean的名称是方法名
    public FunctionService functionService(){
        return new FunctionService();
    }
    @Bean
    public UseFunctionService useFunctionService(){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());//注入FunctionService的Bean的时候直接调用functionService()
        return useFunctionService;
    }


    //另外一种注入的方式，直接将FunctionService作为参数给useFunctionService()，这也是Spring容器提供的极好功能
    //在spring容器中，只要容器中存在某个Bean，就可以在另一个Bean的声明方法的参数中注入
//    @Bean
//    public UseFunctionService useFunctionService(FunctionService functionService){
//        UseFunctionService useFunctionService = new UseFunctionService();
//        useFunctionService.setFunctionService(functionService);
//        return useFunctionService;
//    }
}
