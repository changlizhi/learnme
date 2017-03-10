package learn.partTwo.helloapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import javax.servlet.annotation.WebServlet;

/**
 * Created by clz on 2017/1/12.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"learn.partTwo.springMVC"})
public class HelloApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        builder.sources(HelloApplication.class);
        return super.configure(builder);
    }
}
