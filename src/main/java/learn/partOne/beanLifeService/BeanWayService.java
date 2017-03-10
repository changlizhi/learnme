package learn.partOne.beanLifeService;

/**
 * Created by clz on 2017/1/15.
 */
public class BeanWayService {
    public BeanWayService() {
        System.out.println("BeanWayService构造执行了！");
    }

    public void init() {
        System.out.println("BeanWayService构造执行后调用");
    }

    public void destroy() {
        System.out.println("BeanWayService销毁前调用");
    }

}
