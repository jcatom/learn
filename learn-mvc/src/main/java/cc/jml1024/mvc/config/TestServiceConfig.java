package cc.jml1024.mvc.config;

import cc.jml1024.mvc.service.TestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestServiceConfig {

    @Bean
    public TestService getTestService() {
        return new TestService("Evil","100");
    }
}
