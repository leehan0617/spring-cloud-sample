package com.profile.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.profile.api.controller.CouponClient;
import com.profile.api.service.CouponService;

/**
 * Created by heron.lee 2019-03-19
 */
@Service
public class CouponServiceImpl implements CouponService {

    @Autowired
    CouponClient couponClient;

    @Override
    @HystrixCommand(fallbackMethod = "fallbackCoupon")
    public String getCoupon(int id) {
        return couponClient.getCouponForFeign(id);
    }

    private String fallbackCoupon(int id) {
        return "fallback" + id;
    }
}
