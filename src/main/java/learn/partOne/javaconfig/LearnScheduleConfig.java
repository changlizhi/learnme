package learn.partOne.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by clz on 2017/1/16.
 */
@Configuration
@ComponentScan(basePackages = {"learn.partOne.scheduleService"})
@EnableScheduling
public class LearnScheduleConfig {
}
