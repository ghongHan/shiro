package com.hskj.sevice;


import com.hskj.dto.UserDto;
import com.hskj.entity.UserInfo;

public interface UserInfoService {
    //通过username查找用户信息
    public UserInfo findByUsername(String username);
    //添加用户信息
    public void addUser(UserDto userDto);
}