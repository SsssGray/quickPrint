package cn.xydata.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author kaiqian
 * @CreateDate 2017/9/27
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface OPLoggerBean {
    String description() default "";
}
