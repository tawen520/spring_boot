package cn.com.baota.aop.service;

public class UseFunctionService {
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }
    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
