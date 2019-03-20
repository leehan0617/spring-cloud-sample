package com.coupon.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by heron.lee 2019-03-20
 */
@FeignClient(name = "profile-api")
public interface ProfileClient {

    @GetMapping("/profile/feign/{id}")
    String getProfile(@PathVariable("id") int id);
}
