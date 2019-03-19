package com.profile.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heron.lee 2019-03-19
 */
@RestController
public class CouponController {

    @Autowired
    private CouponClient couponClient;

    @GetMapping("/coupon/{id}")
    public String getCouponForFeign(@PathVariable int id) {
        return couponClient.getCouponForFeign(id);
    }
}
