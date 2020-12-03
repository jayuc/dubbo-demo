package top.jayu.user.service;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import top.jayu.api.IUserService;
import top.jayu.api.model.User;
import top.jayu.user.mapper.UserMapper;

@Service(group = "dev", version = "1.0")
@Slf4j
public class UserService implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        log.info("<== return user, id: " + id);
        User user = userMapper.getUserById(id);
        if(null == user){
            return new User();
        }
        return user;
    }
}
