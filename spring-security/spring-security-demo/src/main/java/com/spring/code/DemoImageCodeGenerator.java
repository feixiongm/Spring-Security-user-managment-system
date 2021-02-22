package com.spring.code;

import com.spring.security.core.validate.code.ValidateCodeGenerator;
import com.spring.security.core.validate.code.image.ImageCode;
import org.springframework.web.context.request.ServletWebRequest;

//@Component("imageCodeGenerator")
public class DemoImageCodeGenerator implements ValidateCodeGenerator {
    @Override
    public ImageCode generate(ServletWebRequest request) {
        System.out.println("Other way to generate Image code picture.");
        return null;
    }
}
