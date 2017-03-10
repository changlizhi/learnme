package learn.partOne.javaconfig;

import learn.partOne.beanLifeService.BeanWayService;
import learn.partOne.beanLifeService.JSR250WayServcie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by clz on 2017/1/15.
 */
@Configuration
@ComponentScan(basePackages = {"learn.partOne.beanLifeService"})
public class BeanLifeConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    JSR250WayServcie jsr250WayServcie() {
        return new JSR250WayServcie();
    }
}
