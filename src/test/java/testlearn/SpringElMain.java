package testlearn;

import learn.partOne.javaconfig.SpringElConfig;
import learn.partOne.springElService.SpringElUse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by clz on 2017/1/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {SpringElConfig.class})
public class SpringElMain {
    @Autowired
    private SpringElUse springElUse;

    @Test
    public void testSpringEl() throws Exception {
        springElUse.printAll();
    }
}
