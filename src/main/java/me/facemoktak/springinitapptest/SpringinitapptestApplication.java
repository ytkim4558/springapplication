package me.facemoktak.springinitapptest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringinitapptestApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(SpringinitapptestApplication.class)
                .run(args);
    }

}
