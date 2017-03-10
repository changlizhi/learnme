package learn.partOne.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by clz on 2017/1/15.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"learn.partOne.aopAnnotation", "learn.partOne.aopAspectUseService", "learn.partOne.aopAnnotationParse"})
public class AopConfig {
}
