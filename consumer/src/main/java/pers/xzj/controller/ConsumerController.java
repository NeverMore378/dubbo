package pers.xzj.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.xzj.service.ConsumerService;

@RestController
public class ConsumerController {

    @Reference
    private ConsumerService cs;

    @GetMapping("/hello")
    public String sayHello(){
        return cs.hello();
    }
}
