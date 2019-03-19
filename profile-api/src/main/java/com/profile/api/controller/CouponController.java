package com.profile.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by heron.lee 2019-03-19
 */
@RestController
@RequestMapping("/coupon")
public class CouponController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public String getCoupon(@PathVariable int id) {
        String result = restTemplate.getForObject("http://coupon-api/{id}", String.class, id);
        return result;
    }
}
