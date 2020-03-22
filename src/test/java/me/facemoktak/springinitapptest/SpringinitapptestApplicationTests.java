package me.facemoktak.springinitapptest;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@TestPropertySource(locations = "classpath:/test.properties")
@SpringBootTest
class SpringinitapptestApplicationTests {

    @Autowired
    Environment environment;

    @Test
    void contextLoads() {
        assertThat(environment.getProperty("yongtak.name")).isEqualTo("yongtak2");
    }

}
