package testlearn;

import learn.partOne.aopAspectUseService.ActionUseService;
import learn.partOne.aopAspectUseService.DemoMethodService;
import learn.partOne.javaconfig.AopConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by clz on 2017/1/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {AopConfig.class})
public class AopMain {
    @Autowired
    private ActionUseService actionUseService;
    @Autowired
    private DemoMethodService demoMethodService;

    @Test
    public void testAop() {
        actionUseService.add();
        demoMethodService.add();
        demoMethodService.delete();
    }
}
