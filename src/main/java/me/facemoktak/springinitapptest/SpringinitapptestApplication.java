package me.facemoktak.springinitapptest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringinitapptestApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringinitapptestApplication.class);
        application.run(args);
//        new SpringApplicationBuilder()
//                .main(SpringinitapptestApplication.class)
//                .run(args);
    }

}
