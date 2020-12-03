package top.jayu.platform.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.jayu.api.IUserService;
import top.jayu.api.model.User;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Reference(group = "dev", version = "1.0")
    IUserService userService;

    @RequestMapping("/get")
    public User getUser(Integer id) throws Exception {
        log.info("==> /user/get 发起请求, id: " + id);
        if(null == id){
            throw new Exception("id不能为空");
        }
        return userService.getUserById(id);
    }

}
