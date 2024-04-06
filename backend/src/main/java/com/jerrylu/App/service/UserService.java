package com.jerrylu.App.service;

import com.jerrylu.App.mapper.*;
import com.jerrylu.App.pojo.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private BlacklistMapper blacklistMapper;

    // user

    public List<User> getAllUsers() {
        System.out.println("Service Getting all users");
        return userMapper.getAllUsers();
    }

    public User getUserById(int id) {
        System.out.println("Service Getting user by id" + id);
        return userMapper.selectById(id);
    }

    public User addUser(User user) {
        System.out.println("Service Adding user" + user.toString());
        userMapper.insert(user);
        return user;
    }

    public User updateUser(User user) {
        System.out.println("Service Updating user" + user.toString());
        userMapper.updateById(user);
        return user;
    }

    public void deleteUser(int id) {
        System.out.println("Service Deleting user by id" + id);
        userMapper.deleteById(id);
    }

    // blacklist
    
    public List<Blacklist> getAllBannedUsers() {
        System.out.println("Service Getting all banned users");
        return blacklistMapper.getAllBlacklists();
    }

    public Blacklist getBannedUserById(int id) {
        System.out.println("Service Getting banned user by id" + id);
        return blacklistMapper.selectById(id);
    }

    public Blacklist addBannedUser(Blacklist blacklist) {
        System.out.println("Service Adding banned user" + blacklist.toString());
        blacklistMapper.insert(blacklist);
        return blacklist;
    }

    public Blacklist updateBannedUser(Blacklist blacklist) {
        System.out.println("Service Updating banned user" + blacklist.toString());
        blacklistMapper.updateById(blacklist);
        return blacklist;
    }

    public void deleteBannedUser(int id) {
        System.out.println("Service Deleting banned user by id" + id);
        blacklistMapper.deleteById(id);
    }
}
