package com.lejian.test.common;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 模拟封装返回参数
 *
 * @author limeiqi
 * @date 2020/12/4 1:48
 */
@Data
@Builder
public class ResultResponse implements Serializable {
    private String message;
}
