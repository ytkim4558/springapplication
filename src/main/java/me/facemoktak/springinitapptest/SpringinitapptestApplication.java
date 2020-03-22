package me.facemoktak.springinitapptest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
@EnableConfigurationProperties(YongtakProperties.class)
public class SpringinitapptestApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringinitapptestApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }

}
