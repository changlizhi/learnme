package learn.partOne.appEvent.eventListener;

import learn.partOne.appEvent.event.SendMessageEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * Created by clz on 2017/1/15.
 */
@Service
public class SendMessageEventListener implements ApplicationListener<SendMessageEvent> {
    @Override
    public void onApplicationEvent(SendMessageEvent event) {
        String msg = event.getMeg();
        System.out.print("接收到msg===" + msg);
    }
}
