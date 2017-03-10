package testlearn;

import learn.partOne.javaconfig.ProfileConfig;
import learn.partOne.profile.ProfileUseBean;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by clz on 2017/1/15.
 */
public class ProfileMain {

    @Test
    public void testProfile() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");
        context.register(ProfileConfig.class);//后置配置类，否则bean找不到。
        context.refresh();
        ProfileUseBean bean = context.getBean(ProfileUseBean.class);
        System.out.println(bean.getContent());
        context.close();
    }
}
