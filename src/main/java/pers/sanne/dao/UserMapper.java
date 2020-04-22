package pers.sanne.dao;


import org.springframework.stereotype.Repository;
import pers.sanne.domain.User;

@Repository
public interface UserMapper {
    /**
     * 添加用户
     * @param user
     */
    public int addUser(User user);
}