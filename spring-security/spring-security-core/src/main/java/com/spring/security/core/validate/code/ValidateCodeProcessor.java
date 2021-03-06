package com.spring.security.core.validate.code;

import org.springframework.web.context.request.ServletWebRequest;

public interface ValidateCodeProcessor {

    String SESSION_KEY_PREFIX = "SESSION_KEY_FOR_CODE_";
    //create validate code
    void create(ServletWebRequest request) throws Exception;

}
