package com.alipay.sofa.ark.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengzhe
 * @date 2019-10-15 10:09
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/ok")
    public String test() {
        return "OK!!!!!!!!!!!!";
    }
}
