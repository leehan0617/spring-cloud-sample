package com.gateway.api.filters;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * Created by heron.lee 2019-03-19
 */
public class SamplePreFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String sampleHeader = Optional.ofNullable(request.getHeader("test"))
                .orElse("empty header");
        System.out.println(sampleHeader);
        return null;
    }
}
