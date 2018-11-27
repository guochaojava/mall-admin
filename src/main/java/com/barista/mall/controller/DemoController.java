package com.barista.mall.controller;

import com.barista.mall.exception.TestException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 演示controller
 *
 * @author guochao
 * @since 1.0.0
 */
@Controller
public class DemoController {

    @GetMapping("/exception")
    public String exception() {

        throw new TestException(202, "错误演示");
    }
}