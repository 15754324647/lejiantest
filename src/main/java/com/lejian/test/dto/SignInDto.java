package com.lejian.test.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author limeiqi
 * @date 2020/12/4 1:33
 */
@Data
public class SignInDto implements Serializable {

    @NotBlank(message = "手机号不能为空")
    private String mobile;
}
