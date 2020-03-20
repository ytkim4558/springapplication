package me.facemoktak.springinitapptest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringinitapptestApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringinitapptestApplication.class);
        application.run(args);
    }

}
