package com.zm.apps.whddemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringBoot 项目学习-第四次提交至测试分支
 * @author Administrator
 *
 */
@RestController
public class HelloWorldController {
	@RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
