package com.niu.dubbo.api.user;

public interface DubboUserApi {

    /**
     * 根据用户id获取用户名dubbo接口
     *
     * @param id
     * @return
     * @author niuqingsong
     * @Date 2021/8/13
     */
    String getUser(Long id);
}
