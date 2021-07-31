package life.huangsl.community.service;

import life.huangsl.community.mapper.UserMapper;
import life.huangsl.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hsl
 * @create 2021-07-30 12:52
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User getById(int id){
        return userMapper.getById(id);
    }
}
