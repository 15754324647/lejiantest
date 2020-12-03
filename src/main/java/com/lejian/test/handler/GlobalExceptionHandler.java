package com.lejian.test.handler;

import com.lejian.test.common.ResultResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author limeiqi
 * @date 2020/12/4 1:53
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResultResponse validationException(Exception exception) {
        return ResultResponse.builder().message(exception.getLocalizedMessage()).build();
    }
}
