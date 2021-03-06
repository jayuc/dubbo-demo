package top.jayu.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.jayu.api.model.User;

@Mapper
public interface UserMapper {

    @Select("select * from t_sys_user where id = #{id}")
    User getUserById(Integer id);

}
