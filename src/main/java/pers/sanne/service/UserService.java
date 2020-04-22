package pers.sanne.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.sanne.dao.UserMapper;
import pers.sanne.domain.User;

@Service
public class UserService {
    /**
     * 自动注入dao层user类
     */
    @Autowired
    UserMapper userMapper;

    public int addUser(User user) {
        return userMapper.addUser(user);
    }
}
