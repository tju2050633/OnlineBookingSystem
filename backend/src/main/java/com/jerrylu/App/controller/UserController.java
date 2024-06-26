package com.jerrylu.App.controller;

import com.jerrylu.App.pojo.*;
import com.jerrylu.App.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    // user

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers() {
        System.out.println("Controller Getting all users");
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id) {
        System.out.println("Controller Getting user by id: " + id);
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @PostMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        System.out.println("Controller Adding user: " + user.toString());
        return ResponseEntity.ok(userService.addUser(user));
    }

    @PutMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        System.out.println("Controller Updating user: " + user.toString());
        return ResponseEntity.ok(userService.updateUser(user));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id) {
        System.out.println("Controller Deleting user: " + id);
        userService.deleteUser(id);
        return ResponseEntity.ok().build();
    }

    // blacklist

    @GetMapping("/blacklist/all")
    public ResponseEntity<List<Blacklist>> getAllBannedUsers() {
        System.out.println("Controller Getting all banned users");
        return ResponseEntity.ok(userService.getAllBannedUsers());
    }

    @GetMapping("/blacklist/{id}")
    public ResponseEntity<Blacklist> getBannedUserById(@PathVariable int id) {
        System.out.println("Controller Getting banned user by id: " + id);
        return ResponseEntity.ok(userService.getBannedUserById(id));
    }

    @PostMapping("/blacklist/add")
    public ResponseEntity<Blacklist> addBannedUser(@RequestBody Blacklist blacklist) {
        System.out.println("Controller Adding banned user: " + blacklist.toString());
        return ResponseEntity.ok(userService.addBannedUser(blacklist));
    }

    @PutMapping("/blacklist/update")
    public ResponseEntity<Blacklist> updateBannedUser(@RequestBody Blacklist blacklist) {
        System.out.println("Controller Updating banned user: " + blacklist.toString());
        return ResponseEntity.ok(userService.updateBannedUser(blacklist));
    }

    @DeleteMapping("/blacklist/delete/{id}")
    public ResponseEntity<Void> deleteBannedUser(@PathVariable int id) {
        System.out.println("Controller Deleting banned user: " + id);
        userService.deleteBannedUser(id);
        return ResponseEntity.ok().build();
    }
}