package cc.jml1024.learn.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Date;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationStartup {
    public static void main(String[] args) {
        Date date = new Date();
        SpringApplication.run(ApplicationStartup.class, args);
    }
}
