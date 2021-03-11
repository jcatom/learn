package cc.jml1024.learn.service.configuration.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("cc.jml1024.learn.service.dao")
public class MybatisConfig {

}
