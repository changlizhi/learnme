package learn.partOne.javaconfig;

import learn.partOne.profile.ProfileUseBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by clz on 2017/1/15.
 */
@Configuration
public class ProfileConfig {
    @Bean
    @Profile("dev")
    public ProfileUseBean profileUseBeanDev() {
        return new ProfileUseBean("dev");
    }

    @Bean
    @Profile("product")
    public ProfileUseBean profileUseBeanProduct() {
        return new ProfileUseBean("product");
    }
}
