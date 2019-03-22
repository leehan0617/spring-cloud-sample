package com.coupon.api.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.coupon.api.service.CouponService;

/**
 * Created by heron.lee 2019-03-20
 */
@Service
public class CouponServiceImpl implements CouponService {

    Logger logger = LoggerFactory.getLogger(CouponServiceImpl.class);

    @Override
    public String getCoupon(int id) {
        logger.info("get coupon called" + id);
        return "not call other api" + id;
    }
}
