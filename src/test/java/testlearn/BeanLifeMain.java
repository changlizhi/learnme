package testlearn;

import learn.partOne.beanLifeService.BeanWayService;
import learn.partOne.beanLifeService.JSR250WayServcie;
import learn.partOne.javaconfig.BeanLifeConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by clz on 2017/1/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {BeanLifeConfig.class})
public class BeanLifeMain {

    @Autowired
    private BeanWayService beanWayService;
    @Autowired
    private JSR250WayServcie jsr250WayServcie;

    @Test
    public void justUse() {
        beanWayService.equals("d");
        jsr250WayServcie.equals("d");
    }
}
