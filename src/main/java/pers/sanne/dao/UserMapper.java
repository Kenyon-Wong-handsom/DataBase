package pers.sanne.dao;


import org.springframework.stereotype.Repository;
import pers.sanne.domain.User;

import java.util.List;

@Repository
public interface UserMapper {
    /**
     * 添加用户
     * @param user
     *
     */
    //public List<User> listUser();//查询所有
    public User getUser(int id); // 查询单条
    public int addUser(User user);//添加
    public void deleteUser(int id); // 删除
    public int updateUser(User user); // 修改
}