package top.jayu.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import lombok.extern.slf4j.Slf4j;
import top.jayu.api.IUserService;
import top.jayu.api.model.User;

@Service
@Slf4j
public class UserService implements IUserService {
    @Override
    public User getUserById(String id) {
        log.info("<== return user");
        User user = new User();
        user.setId("2");
        user.setName("中华");
        return user;
    }
}
