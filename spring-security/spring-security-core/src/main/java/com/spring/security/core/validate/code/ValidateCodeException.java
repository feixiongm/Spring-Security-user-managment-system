package com.spring.security.core.validate.code;

import org.springframework.security.core.AuthenticationException;

public class ValidateCodeException extends AuthenticationException {


    private static final long serialVersionUID = 1459255501442432452L;

    public ValidateCodeException(String msg) {
        super(msg);
    }
}
