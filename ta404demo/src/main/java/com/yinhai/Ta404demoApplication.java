package com.yinhai;

import com.yinhai.ta404.core.configmanager.TaConfigerListener;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@ServletComponentScan
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableTransactionManagement
@EnableAsync
@EnableScheduling
//@MapperScan(value = {"com.yinhai.ta404demo.mapper"})
public class Ta404demoApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Ta404demoApplication.class);
        application.addListeners(new TaConfigerListener());
//        application.setBannerMode(Banner.Mode.OFF);
        try {
            aaa;
            aaa;
            aaa;
            application.run(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
