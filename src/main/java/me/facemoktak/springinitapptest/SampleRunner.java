package me.facemoktak.springinitapptest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

    @Autowired
    YongtakProperties yongtakProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=========");
        System.out.println(yongtakProperties.getName());
        System.out.println(yongtakProperties.getAge());
        System.out.println(yongtakProperties.getSessionTimeout());
        System.out.println("=========");
    }
}
