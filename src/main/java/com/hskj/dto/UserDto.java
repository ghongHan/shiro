package com.hskj.dto;

/**
 * Created by hongHan_gao
 * Date: 2018/5/9
 */


public class UserDto {

    private String name;

    private String password;

    private String userName;

    public UserDto(String name, String password, String userName){
        this.name = name;
        this.password = password;
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }
}
