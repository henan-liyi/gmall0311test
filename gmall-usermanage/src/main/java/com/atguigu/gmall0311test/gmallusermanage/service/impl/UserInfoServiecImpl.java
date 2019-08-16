package com.atguigu.gmall0311test.gmallusermanage.service.impl;

import com.atguigu.gmall0311test.gmallusermanage.bean.UserInfo;
import com.atguigu.gmall0311test.gmallusermanage.mapper.UserInfoMapper;
import com.atguigu.gmall0311test.gmallusermanage.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserInfoServiecImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserInfo> getUsrInfoByName(UserInfo userInfo) {
        //return userInfoMapper.select(userInfo);
        Example example =new Example(UserInfo.class);
        example.createCriteria().andEqualTo("name",userInfo.getName());

        return userInfoMapper.selectByExample(example);

    }

    @Override
    public List<UserInfo> getUsrInfoByNickName(UserInfo userInfo) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andLike("nickName","%"+userInfo.getNickName()+"%");
        return userInfoMapper.selectByExample(example);
    }

    @Override
    public void addUser(UserInfo userInfo) {
        userInfo.setName("姓名");
        userInfo.setLoginName("红桥区行情");
        userInfo.setPasswd("123456");
        userInfoMapper.insertSelective(userInfo);
    }

    @Override
    public void update(UserInfo userInfo) {

        userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public void deleteUser(UserInfo userInfo) {
        userInfoMapper.delete(userInfo);
    }
}
