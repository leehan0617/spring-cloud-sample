package com.coupon.api.service.impl;

import org.springframework.stereotype.Service;

import com.coupon.api.service.CouponService;

/**
 * Created by heron.lee 2019-03-20
 */
@Service
public class CouponServiceImpl implements CouponService {

    @Override
    public String getCoupon(int id) {
        return "not call other api" + id;
    }
}
