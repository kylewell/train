package com.kyle.train.service;

import com.kyle.train.common.api.CommonResult;

public interface UmsMemberService {
    CommonResult generateAuthCode(String telephone);
    CommonResult verifyAuthCode(String telephone, String authCode);
}
