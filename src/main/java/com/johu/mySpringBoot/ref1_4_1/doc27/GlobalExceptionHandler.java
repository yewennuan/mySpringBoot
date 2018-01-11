package com.johu.mySpringBoot.ref1_4_1.doc27;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wennan
 * 2018/1/11
 */

@ControllerAdvice(basePackages = "com.johu.mySpringBoot.ref1_4_1")
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    ErrorInfo handleException(HttpServletRequest request,Throwable ex){
        HttpStatus status = getStatus(request);
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setCode(status.value());
        errorInfo.setMessage(ex.getMessage());
        return errorInfo;
    }

    private HttpStatus getStatus(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == null) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return HttpStatus.valueOf(statusCode);
    }
}

@Data
class ErrorInfo{
    private int code;
    private String message;
}
