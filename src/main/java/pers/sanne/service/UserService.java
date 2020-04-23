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
    public User getUser(int id) {
        return userMapper.getUser(id);
    }

    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }
    public int deleteUser(int id){
        return userMapper.deleteUser(id);
    }
    public int getUserIDByEmail(String email){
        return userMapper.getUserIDByEmail(email);
    }
}
