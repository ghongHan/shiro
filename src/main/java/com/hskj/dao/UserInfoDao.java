package com.hskj.dao;


import com.hskj.dto.UserDto;
import com.hskj.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserInfoDao extends JpaRepository<UserInfo,Long> {
    //通过username查找用户信息
    public UserInfo findByUsername(String username);

}