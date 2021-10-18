package com.kyle.train.controller;

import com.kyle.train.model.User;
import com.kyle.train.result.ExceptionMsg;
import com.kyle.train.result.ResponseData;
import com.kyle.train.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity queryById(@PathVariable("id") Integer id) throws IOException {
        User user = userService.queryById(id);
        if (user != null) {
//            return new ResponseData<>(ExceptionMsg.SUCCESS, user);
            return ResponseEntity.ok(user);
        }
//        return new ResponseData<>(ExceptionMsg.FAILED, null);
        return ResponseEntity.noContent().build();
    }
}
