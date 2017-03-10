package learn.partOne.aopAspectUseService;

import learn.partOne.aopAnnotation.Action;
import org.springframework.stereotype.Service;

/**
 * Created by clz on 2017/1/14.
 */
@Service
public class ActionUseService {

    @Action(name = "注解操作add方法")
    public void add() {
        System.out.println("调用了注解的ActionUseService.add()方法");
    }
}
