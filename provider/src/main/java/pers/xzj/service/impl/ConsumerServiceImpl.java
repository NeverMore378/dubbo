package pers.xzj.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import pers.xzj.service.ConsumerService;

@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Override
    public String hello() {
        return "I am provider !!!";
    }
}
