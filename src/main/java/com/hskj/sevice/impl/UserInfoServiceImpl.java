package com.hskj.sevice.impl;

import com.hskj.dao.UserInfoDao;
import com.hskj.dto.UserDto;
import com.hskj.entity.UserInfo;
import com.hskj.sevice.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }

    @Override
    public void addUser(UserDto userDto) {
        UserInfo userInfo = new UserInfo();
        userInfo.setName(userDto.getName());
        userInfo.setPassword(userDto.getPassword());
        userInfo.setUsername(userDto.getUserName());
        userInfoDao.save(userInfo);
    }
}