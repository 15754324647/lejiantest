package com.lejian.test;

import cn.hutool.cache.CacheUtil;
import cn.hutool.cache.impl.FIFOCache;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author limeiqi
 * @date 2020/12/4 1:50
 */
@Component
public class InitCache {
    public static FIFOCache<Object, Object> cache = CacheUtil.newFIFOCache(1);
    @PostConstruct
    private void initMobile() {
        cache.put("mobile", "13812345678");
    }
}
