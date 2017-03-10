package learn.partOne.javaconfig;

import learn.partOne.learnConditionAnnotion.beanService.ListDirService;
import learn.partOne.learnConditionAnnotion.beanServiceImpl.LinuxListDirServiceImpl;
import learn.partOne.learnConditionAnnotion.beanServiceImpl.WindowsListDirServiceImpl;
import learn.partOne.learnConditionAnnotion.conditonFirst.CmdWinowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by clz on 2017/1/16.
 */
@Configuration
public class LearnConditionConfig {

    @Bean
    @Conditional(CmdWinowsCondition.class)
    public ListDirService windowCondition() {
        return new WindowsListDirServiceImpl();
    }

    @Bean
    @Conditional(CmdWinowsCondition.class)
    public ListDirService linuxCondition() {
        return new LinuxListDirServiceImpl();
    }
}
