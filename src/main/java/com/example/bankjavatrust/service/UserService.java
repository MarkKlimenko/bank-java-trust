package com.example.bankjavatrust.service;

import com.example.bankjavatrust.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    Map<Long, User> userStorage = new HashMap<>();

    public User saveUser(User user) {
        userStorage.put(user.id, user);
        return user;
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(userStorage.values());
    }

    public User getUserById(long id) {
        return userStorage.get(id);
    }

    public User addUserBalance(long id, double amount) {
        User user = userStorage.get(id);
        user.amount = user.amount + amount;

        userStorage.put(user.id, user);

        return user;
    }

    public void deleteUserById(long id) {
        userStorage.remove(id);
    }

    public long countUsers() {
        return userStorage.size();
    }
}
