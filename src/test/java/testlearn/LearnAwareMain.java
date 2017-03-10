package testlearn;

import learn.partOne.awareService.LearnAwareService;
import learn.partOne.javaconfig.LearnAwareConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by clz on 2017/1/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {LearnAwareConfig.class})
public class LearnAwareMain {

    @Autowired
    private LearnAwareService service;

    @Test
    public void testWare() {
        service.outPutResult();
    }
}
