package learn.partOne.service;

import org.springframework.stereotype.Service;

/**
 * Created by clz on 2017/1/14.
 */
@Service
public class FunctionService {
    public String sayString(String str) {
        return str + "hello!";
    }
}
