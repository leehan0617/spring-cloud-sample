package com.coupon.api.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coupon.api.client.ProfileClient;
import com.coupon.api.service.ProfileService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * Created by heron.lee 2019-03-20
 */
@Service
public class ProfileServiceImpl implements ProfileService {

    Logger logger = LoggerFactory.getLogger(ProfileServiceImpl.class);
    @Autowired
    private ProfileClient profileClient;

    @Override
    @HystrixCommand(fallbackMethod = "fallbackProfile")
    public String getProfile(int id) {
        logger.info("get profile called" + id);
        return profileClient.getProfile(id);
    }

    private String fallbackProfile(int id) {
        return "fallback profile" + id;
    }
}
