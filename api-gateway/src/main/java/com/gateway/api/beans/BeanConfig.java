package com.gateway.api.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gateway.api.filters.SamplePostFilter;
import com.gateway.api.filters.SamplePreFilter;

/**
 * Created by heron.lee 2019-03-19
 */
@Configuration
public class BeanConfig {

    @Bean
    public SamplePreFilter samplePreFilter() {
        return new SamplePreFilter();
    }

    @Bean
    public SamplePostFilter samplePostFilter() {
        return new SamplePostFilter();
    }
}
