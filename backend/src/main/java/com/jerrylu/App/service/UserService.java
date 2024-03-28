package com.jerrylu.App.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jerrylu.App.mapper.*;
import com.jerrylu.App.pojo.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    private BlacklistMapper blacklistMapper;

    // user

    public List<User> getAllUsers() {
        return userMapper.selectList(new QueryWrapper<>());
    }

    public User getUserById(int id) {
        return userMapper.selectById(id);
    }

    public User addUser(User user) {
        userMapper.insert(user);
        return user;
    }

    public User updateUser(User user) {
        userMapper.updateById(user);
        return user;
    }

    public void deleteUser(int id) {
        userMapper.deleteById(id);
    }

    // blacklist
    
    public List<Blacklist> getAllBannedUsers() {
        return blacklistMapper.selectList(new QueryWrapper<>());
    }

    public Blacklist getBannedUserById(int id) {
        return blacklistMapper.selectById(id);
    }

    public Blacklist addBannedUser(Blacklist blacklist) {
        blacklistMapper.insert(blacklist);
        return blacklist;
    }

    public Blacklist updateBannedUser(Blacklist blacklist) {
        blacklistMapper.updateById(blacklist);
        return blacklist;
    }

    public void deleteBannedUser(int id) {
        blacklistMapper.deleteById(id);
    }
}
