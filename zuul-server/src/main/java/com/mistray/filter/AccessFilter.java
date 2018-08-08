package com.mistray.filter;

import com.netflix.zuul.ZuulFilter;

/**
 * @author ZhangJunYi
 * @create 2018-08-08 19:02
 * @desc
 */
public class AccessFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        return null;
    }
}
