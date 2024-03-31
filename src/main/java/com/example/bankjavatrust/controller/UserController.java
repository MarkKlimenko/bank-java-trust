package com.example.bankjavatrust.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
Использование версионирования в пути эндпоинта (контроллера) является хорошим тоном.
Мы начнем наше версионирование с v1
 */
@RestController
@RequestMapping("api/v1/users")
public class UserController {
    @GetMapping("")
    public String getUser() {
        return "This is your user";
    }
}
