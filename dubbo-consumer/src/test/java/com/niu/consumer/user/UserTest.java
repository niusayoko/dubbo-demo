package com.niu.consumer.user;

import com.niu.consumer.BaseTest;
import com.niu.dubbo.api.user.DubboUserApi;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Log4j2
public class UserTest extends BaseTest {

    @Autowired
    private DubboUserApi dubboUserApi;

    @Test
    public void testGetUser(){
        String userName1 = dubboUserApi.getUser(1L);
        String userName2 = dubboUserApi.getUser(11L);
    }
}
