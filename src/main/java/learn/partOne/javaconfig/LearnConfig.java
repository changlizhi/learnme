package learn.partOne.javaconfig;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * Created by clz on 2017/1/14.
 */
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
@ComponentScan(basePackages = {"learn.partOne"})
@EnableJpaRepositories(value = {"learn.partOne.jpaRepository"})
@EntityScan(basePackages = "learn.partOne.model")
@SpringBootApplication
public class LearnConfig {
}
