package testlearn;

import learn.partOne.javaconfig.LearnConditionConfig;
import learn.partOne.learnConditionAnnotion.beanService.ListDirService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by clz on 2017/1/16.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = {LearnConditionConfig.class})
public class ConditionMain {
    //        @Autowired
    private ListDirService listDirService;

    @Test
    public void testCondition() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LearnConditionConfig.class);
        listDirService = context.getBean(ListDirService.class);
        listDirService.getDirCmd();
    }
}
