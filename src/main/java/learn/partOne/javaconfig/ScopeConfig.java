package learn.partOne.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by clz on 2017/1/15.
 */
@Configuration
@ComponentScan(basePackages = {"learn.partOne.service"})
public class ScopeConfig {
}
