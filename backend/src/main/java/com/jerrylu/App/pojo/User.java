package com.jerrylu.App.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("User")
public class User {
    @TableId
    private int userID;
    private int membershipID;
    private String name;
    private String password;
    private String gender;
    private String email;
    private String phoneNumber;
    private String hkid;
    private Date birthday;
    private String address;
    private Date dateRegistered;
}