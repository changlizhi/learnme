package learn.partOne.appEvent.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by clz on 2017/1/15.
 */
public class SendMessageEvent extends ApplicationEvent {
    private String meg;

    public SendMessageEvent(Object source, String msg) {
        super(source);
        this.meg = msg;
    }

    public String getMeg() {
        return meg;
    }

    public void setMeg(String meg) {
        this.meg = meg;
    }
}
