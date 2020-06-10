package cc.jml1024.learn.service.configuration.mybatis;

import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan("cc.jml1024.learn.service.dao")
@EnableTransactionManagement
public class MybatisConfig {


    public Interceptor getInterceptor() {
        PageInterceptor pageInterceptor = new PageInterceptor();
        return pageInterceptor;
    }

}
