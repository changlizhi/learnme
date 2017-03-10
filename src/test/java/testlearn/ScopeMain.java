package testlearn;

import learn.partOne.javaconfig.ScopeConfig;
import learn.partOne.service.ForTestScopeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by clz on 2017/1/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {ScopeConfig.class})
public class ScopeMain {
    @Autowired
    private ForTestScopeService forTestScopeService;
    @Autowired
    private ForTestScopeService forTestScopeService2;

    @Test
    public void testScope() {
        System.out.println(forTestScopeService.equals(forTestScopeService2));
    }
}
