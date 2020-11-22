package top.jayu.api;

import top.jayu.api.model.User;

/**
 * 用户服务
 */
public interface IUserService {

    User getUserById(Integer id);

}
