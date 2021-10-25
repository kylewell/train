package com.kyle.train.controller;

import com.kyle.train.common.api.CommonResult;
import com.kyle.train.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sso")
public class UmsMemberController {
    private UmsMemberService memberService;

    @Autowired
    public UmsMemberController(UmsMemberService umsMemberService){
        this.memberService = umsMemberService;
    }

    @RequestMapping(value = "/getAuthCode", method = RequestMethod.GET)
    public CommonResult getAuthCode(@RequestParam String telephone) {
        return memberService.generateAuthCode(telephone);
    }

    @RequestMapping(value = "/verifyAuthCode", method = RequestMethod.POST)
    public CommonResult verifyAuthCode(@RequestParam String telephone, @RequestParam String authCode) {
        return memberService.verifyAuthCode(telephone, authCode);
    }
}
