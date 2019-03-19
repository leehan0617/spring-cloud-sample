package com.profile.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.profile.api.service.CouponService;

/**
 * Created by heron.lee 2019-03-19
 */
@RestController
public class CouponController {

    @Autowired
    private CouponService couponService;

    @GetMapping("/coupon/{id}")
    public String getCouponForFeign(@PathVariable int id) {
        return couponService.getCoupon(id);
    }
}
