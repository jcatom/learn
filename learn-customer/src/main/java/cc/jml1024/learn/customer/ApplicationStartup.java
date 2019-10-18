package cc.jml1024.learn.customer;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApplicationStartup {
    public static void main(String[] args) {
        new SpringApplication().run(ApplicationStartup.class, args);
    }
}
