package testlearn;

import learn.partOne.javaconfig.ScopeConfig;
import learn.partOne.service.ForTestScopeService;
import learn.partOne.service.FunctionService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by clz on 2017/1/15.
 */
public class ScopeMainTwo {
    @Test
    public void testScope2() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        ForTestScopeService service = context.getBean(ForTestScopeService.class);
        ForTestScopeService service2 = context.getBean(ForTestScopeService.class);
        FunctionService functionService = context.getBean(FunctionService.class);
        FunctionService functionService2 = context.getBean(FunctionService.class);
        System.out.print(service.equals(service2));
        System.out.print(functionService.equals(functionService2));
    }
}
