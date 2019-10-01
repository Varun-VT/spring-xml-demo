package com.stackroute;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    private String message;
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Container is destroy! Customer clean up");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init method after properties are set : " + message);
    }

    public void customInit(){
        System.out.println("Hey! You're in my custom Init method");
    }

    public void customDestroy(){
        System.out.println("Hey! You're in my custom Destroy method");
    }
}
