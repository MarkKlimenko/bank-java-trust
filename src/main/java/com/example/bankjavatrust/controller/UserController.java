package com.example.bankjavatrust.controller;

import com.example.bankjavatrust.entity.User;
import com.example.bankjavatrust.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
Использование версионирования в пути эндпоинта (контроллера) является хорошим тоном.
Мы начнем наше версионирование с v1
 */
@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("{id}")
    public User getUserById(@PathVariable long id) {
        return userService.getUserById(id);
    }

    @PostMapping("{id}/up-balance/{amount}")
    public User addUserBalance(@PathVariable long id, @PathVariable double amount) {
        return userService.addUserBalance(id, amount);
    }

    @DeleteMapping("{id}")
    public void deleteUserById(@PathVariable long id) {
        userService.deleteUserById(id);
    }

    @GetMapping("count")
    public long countUsers() {
        return userService.countUsers();
    }
}
