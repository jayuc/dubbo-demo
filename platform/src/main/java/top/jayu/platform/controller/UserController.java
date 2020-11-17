package top.jayu.platform.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.jayu.api.IUserService;
import top.jayu.api.model.User;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Reference
    IUserService userService;

    @RequestMapping("/get")
    public User getUser(){
        log.info("==> /user/get 发起请求");
        return userService.getUserById("1");
    }

}
