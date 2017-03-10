package testlearn;

import learn.partOne.appEvent.eventPublisher.AppEventPublisher;
import learn.partOne.javaconfig.AppEventConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by clz on 2017/1/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {AppEventConfig.class})
public class EventMain {

    @Autowired
    private AppEventPublisher publisher;

    @Test
    public void testMessageEvent() {
        publisher.publish("言诺！");
    }
}
