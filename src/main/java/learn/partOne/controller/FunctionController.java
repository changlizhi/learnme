package learn.partOne.controller;

import learn.partOne.service.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by clz on 2017/1/14.
 */
@Controller
public class FunctionController {

    @Autowired
    private FunctionService functionService;

    public String sayString(String str) {
        return functionService.sayString(str);
    }

}
