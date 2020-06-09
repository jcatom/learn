package cc.jml1024.learn.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ApplicationStartup {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationStartup.class).run(args);
    }
}
