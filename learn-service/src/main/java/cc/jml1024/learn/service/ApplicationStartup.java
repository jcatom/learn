package cc.jml1024.learn.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ApplicationStartup {
    public static void main(String[] args) {
        new SpringApplication(ApplicationStartup.class).run(args);
    }
}
