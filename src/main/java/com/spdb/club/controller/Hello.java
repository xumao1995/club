package com.spdb.club.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Hello 类
 * @Description TODO
 * @Author 许茂
 * @Date 2021/3/20 16:02
 * @Version 1.0
 */
@RestController
public class Hello {
    @GetMapping("/hello")
    public String say(){
        return "test 43";
    }
}
