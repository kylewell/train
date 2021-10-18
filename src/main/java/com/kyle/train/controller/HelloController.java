package com.kyle.train.controller;

import cn.hutool.core.util.StrUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${my.name}")
    private String name;

    @GetMapping("/hello")
    public String sayHello(@RequestParam(required = false,name="who") String who) {
        if(StrUtil.isBlank(who)) {
            who = this.name;
        }

        return StrUtil.format("Hello,{}!", who);
    }
}
