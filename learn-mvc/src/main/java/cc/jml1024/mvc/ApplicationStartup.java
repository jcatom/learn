package cc.jml1024.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author jml
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ApplicationStartup {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStartup.class, args);
    }
}
