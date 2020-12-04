package com.lejian.test;

import cn.hutool.cache.CacheUtil;
import cn.hutool.cache.impl.FIFOCache;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 初始化缓存数据
 *
 * @author limeiqi
 * @date 2020/12/4 1:50
 */
@Component
public class InitCache {
    public static final FIFOCache<Object, Object> cache = CacheUtil.newFIFOCache(1);

    @PostConstruct
    private void initMobile() {
        cache.put("mobile", "13812345678");
    }
}
