package com.niu.dubbo.provider.user.impl;

import com.niu.dubbo.api.user.DubboUserApi;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class DubboUserApiImpl implements DubboUserApi {

    @Override
    public String getUser(Long userId) {
        log.info("userId:{}", userId);
        if (userId <= 10) {
            return "张三";
        }
        return "李四";
    }
}
