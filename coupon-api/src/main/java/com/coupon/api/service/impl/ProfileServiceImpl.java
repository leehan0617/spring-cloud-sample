package com.coupon.api.service.impl;

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

    @Autowired
    private ProfileClient profileClient;

    @Override
    @HystrixCommand(fallbackMethod = "fallbackProfile")
    public String getProfile(int id) {
        return profileClient.getProfile(id);
    }

    private String fallbackProfile(int id) {
        return "fallback profile" + id;
    }
}
