package learn.partOne.springElService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

/**
 * Created by clz on 2017/1/15.
 */
@Component
@PropertySource("classpath:xxx/test.properties")
public class SpringElUse {
    @Value("I LOVE YOU!")
    private String normal;

    @Value("#{systemProperties['os.name']}")//注入系统名称，
    private String osName;

    @Value("#{T(java.lang.Math).random() * 100.0}")//表达式结果
    private double randomNumber;

    @Value("#{springElDemoService.author}")//注入其他BEAN的属性
    private String fromDemoService;

    @Value("${book.author}")
    private String fromProperty;

    @Value("classpath:sss/test.txt")
    private Resource resource;//注意Resource的类型

    @Autowired
    private Environment environment;//注入配置文件

    @Value("https://www.baidu.com")
    private Resource urlSource;//注入网址资源

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyHolder() {//注入配置文件
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void printAll() throws Exception {
        System.out.println("normal------" + normal);
        System.out.println("osName------" + osName);
        System.out.println("randomNumber------" + randomNumber);
        System.out.println("fromDemoService------" + fromDemoService);
        System.out.println("fromProperty------" + fromProperty);
        System.out.println("resource------" + resource.getURL());
        System.out.println("environment------" + environment);
        System.out.println("environment.activeProfile------" + environment.getActiveProfiles());

        System.out.println("urlSource------" + urlSource);
    }
}
