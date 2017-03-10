package learn.partTwo.mvcJavaConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by clz on 2017/1/17.
 */
@Configuration
@ComponentScan(basePackages = {"learn.partTwo.springMVC"})
public class LearnWebConfig {
}
