package com.lejian.test.controller;

import cn.hutool.core.lang.Validator;
import com.lejian.test.InitCache;
import com.lejian.test.common.ResultResponse;
import com.lejian.test.dto.SignInDto;
import org.springframework.util.Assert;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author limeiqi
 * @date 2020/12/4 1:35
 */
@RestController
public class SignInController {

    @PostMapping(value = "/sign-in")
    public ResultResponse signIn(@RequestBody @Validated SignInDto dto) {
        //格式化字符串,去掉字符串中所有空格
        String mobile = dto.getMobile().replaceAll(" ", "");
        Assert.isTrue(!dto.getMobile().equals(InitCache.cache.get("mobile")), "该手机号已经被其他用户注册");
        Assert.isTrue(Validator.isMobile(mobile), "本手机号无法注册,为非法手机号");
        return ResultResponse.builder().message("注册成功").build();
    }


}
