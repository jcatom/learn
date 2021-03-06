package cc.jml1024.learn.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationStartup {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStartup.class, args);
    }
}
