package com.coupon.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heron.lee 2019-03-19
 */
@RestController
public class CouponController {

    @GetMapping("/feign/{id}")
    public String getCouponForFeign(@PathVariable int id) {
        return "feign & coupon" + id;
    }
}
