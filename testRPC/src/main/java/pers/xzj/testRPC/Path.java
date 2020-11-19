package pers.xzj.testRPC;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解Path，用于指定要连接的服务端ip+port
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Path {
    String ipAndPort() default "127.0.0.1:80";
}

