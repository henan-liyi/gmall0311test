package com.atguigu.gmall0311test.gmallusermanage.controller;

import com.atguigu.gmall0311test.gmallusermanage.bean.UserInfo;
import com.atguigu.gmall0311test.gmallusermanage.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping("findAll")
    public List<UserInfo> findAll(){
        return userInfoService.findAll();
    }
    /**
     * 根据字段查询
     * @param userInfo
     * @return
     */
    @RequestMapping("findUserByName")
    public List<UserInfo> findUserByName(UserInfo userInfo){
        return userInfoService.getUsrInfoByName(userInfo);
    }

    @RequestMapping("findUserByNickName")
    public List<UserInfo> findUserByNickName(UserInfo userInfo){
        return userInfoService.getUsrInfoByNickName(userInfo);
    }

    @RequestMapping("addUser")
    public void addUser(UserInfo userInfo){
        userInfoService.addUser(userInfo);
    }

    @RequestMapping("updateUser")
    public void updateUser(UserInfo userInfo){
        userInfoService.update(userInfo);
    }

    @RequestMapping("deleteUser")
    public void deleteUser(UserInfo userInfo){
        userInfoService.deleteUser(userInfo);
    }
}
