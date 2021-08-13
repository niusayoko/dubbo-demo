package com.niu.consumer.user;

import com.niu.dubbo.api.user.DubboUserApi;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private DubboUserApi dubboUserApi;

    @RequestMapping("/{userId}")
    public String getUser(@PathVariable("userId") Long userId) {
        log.info("getUser start userId:{}", userId);
        String userName = dubboUserApi.getUser(userId);
        log.info("getUser end userId:{}, userName:{}", userId, userName);
        return userName;
    }
}
