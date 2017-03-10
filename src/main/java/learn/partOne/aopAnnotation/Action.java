package learn.partOne.aopAnnotation;

import java.lang.annotation.*;

/**
 * Created by clz on 2017/1/14.
 */
@Documented
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

public @interface Action {
    String name();
}
