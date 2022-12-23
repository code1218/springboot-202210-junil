package com.study.springboot202210junil.web.controller.account;

import com.study.springboot202210junil.web.dto.CMRespDto;
import com.study.springboot202210junil.web.exception.CustomDuplicateUsernameException;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AccountApiControllerAdvice {

    @ExceptionHandler(CustomDuplicateUsernameException.class)
    public ResponseEntity<?> duplicateError(CustomDuplicateUsernameException e) {
        return ResponseEntity.badRequest().body(new CMRespDto<>(e.getMessage(), e.getErrorMap()));
    }

}
