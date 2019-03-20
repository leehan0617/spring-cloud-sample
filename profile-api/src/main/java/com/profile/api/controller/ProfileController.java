package com.profile.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heron.lee 2019-03-20
 */
@RestController
@RequestMapping("/profile")
public class ProfileController {

    @GetMapping("/feign/{id}")
    public String getProfile(@PathVariable int id) {
        return "hello profile" + id;
    }
}
