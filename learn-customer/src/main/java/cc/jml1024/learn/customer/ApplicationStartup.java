package cc.jml1024.learn.customer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ApplicationStartup {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationStartup.class).run(args);
    }
}
