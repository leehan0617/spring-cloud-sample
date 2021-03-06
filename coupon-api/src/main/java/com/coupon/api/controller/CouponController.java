package com.coupon.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coupon.api.service.CouponService;

/**
 * Created by heron.lee 2019-03-19
 */
@RestController
@RequestMapping("/coupon")
public class CouponController {

    @Autowired
    private CouponService couponService;

    @GetMapping("/feign/{id}")
    public String getCouponForFeign(@PathVariable int id) {
        return "feign & coupon" + id;
    }

    @GetMapping("/{id}")
    public String getCoupon(@PathVariable int id) {
        return couponService.getCoupon(id);
    }
}
