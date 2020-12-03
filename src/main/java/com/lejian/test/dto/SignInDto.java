package com.lejian.test.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author limeiqi
 * @date 2020/12/4 1:33
 */
@Data
public class SignInDto {

    @NotBlank(message = "手机号不能为空")
    private String mobile;
}
