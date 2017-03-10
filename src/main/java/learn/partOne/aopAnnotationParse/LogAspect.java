package learn.partOne.aopAnnotationParse;

import learn.partOne.aopAnnotation.Action;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by clz on 2017/1/14.
 */

@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(learn.partOne.aopAnnotation.Action)")
    public void annotationPointCut() {
    }

    @Before("annotationPointCut()")
    public void beforeAnnotation(JoinPoint joinPoint) {

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("action============" + action);
        System.out.println("--------Before注解式拦截了方法" + method.getName());
    }

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
//        Action action = method.getAnnotation(Action.class);
        System.out.println("--------After注解式拦截了方法" + method.getName());
    }

    @Before("execution(* learn.partOne.aopAspectUseService.DemoMethodService.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("before方法式规则拦截了方法：" + method.getName());
    }

    @After("execution(* learn.partOne.aopAspectUseService.DemoMethodService.*(..))")
    public void afterMethod(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("after方法式规则拦截了方法：" + method.getName());
    }
}
