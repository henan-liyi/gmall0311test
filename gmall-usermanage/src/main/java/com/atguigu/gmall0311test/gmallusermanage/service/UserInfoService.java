package com.atguigu.gmall0311test.gmallusermanage.service;

import com.atguigu.gmall0311test.gmallusermanage.bean.UserInfo;

import java.util.List;

public interface UserInfoService {
    /**
     * 查询所有
     * @return
     */
    List<UserInfo> findAll();

    List<UserInfo> getUsrInfoByName(UserInfo userInfo);

    List<UserInfo> getUsrInfoByNickName(UserInfo userInfo);

    /**
     * 添加用户
     * @param userInfo
     */
    void addUser(UserInfo userInfo);

    /**
     * 修改用户
     * @param userInfo
     */
    void update(UserInfo userInfo);

    void deleteUser(UserInfo userInfo);
}
