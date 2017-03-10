package learn.partTwo.springMVC.service;

import org.springframework.stereotype.Service;

/**
 * Created by clz on 2017/1/31.
 */
@Service
public class EchoService {
    public String saySome(String some) {
        return some + " like me!";
    }
}
