package learn.partOne.appEvent.eventPublisher;

import learn.partOne.appEvent.event.SendMessageEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by clz on 2017/1/15.
 */
@Component
public class AppEventPublisher {
    @Autowired
    private ApplicationContext context;

    public void publish(String msg) {
        context.publishEvent(new SendMessageEvent(this, msg));
    }
}
