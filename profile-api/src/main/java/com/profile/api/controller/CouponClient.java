package com.profile.api.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by heron.lee 2019-03-19
 */
@FeignClient(name = "coupon-api")
public interface CouponClient {

    // feign client에서는 PathVariable의 필드값을 반드시 명시해야 한다.
    @GetMapping("/feign/{id}")
    String getCouponForFeign(@PathVariable("id") int id);
}
