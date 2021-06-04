package cc.jml1024.learn.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableTransactionManagement
public class ApplicationStartup {
    public static void main(String[] args) {
        SpringApplication ctx = new SpringApplication(ApplicationStartup.class);
        ctx.run(args);
    }
}
