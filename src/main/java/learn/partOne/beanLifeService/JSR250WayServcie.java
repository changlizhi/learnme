package learn.partOne.beanLifeService;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by clz on 2017/1/15.
 */
public class JSR250WayServcie {
    public JSR250WayServcie() {
        System.out.println("JSR250WayServcie构造了！");
    }

    @PostConstruct
    public void init() {
        System.out.println("JSR250WayServcie被@PostContruct注解执行了，构造后执行");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("JSR250WayServcie被注解了@PreDestroy执行了，销毁前执行");
    }
}
