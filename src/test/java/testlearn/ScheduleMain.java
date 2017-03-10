package testlearn;

import learn.partOne.javaconfig.LearnScheduleConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by clz on 2017/1/16.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = {LearnScheduleConfig.class})
public class ScheduleMain {
//    @Autowired
//    private LearnScheduleService service;

//    @Test
//    public void testSchedule() {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LearnScheduleConfig.class);
//    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LearnScheduleConfig.class);
    }
}

