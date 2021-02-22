package com.spring.security.core.validate.code.sms;

public class DefaultSmsCodeSender implements SmsCodeSender {
    @Override
    public void send(String mobile, String code) {
        System.out.print("phone number: " + mobile + ", Validate code: " + code);
    }
}
