package pers.sanne.dao;


import org.springframework.stereotype.Repository;
import pers.sanne.domain.User;

@Repository
public interface UserMapper {
    /**
     * 添加用户
     * @param user
     *
     */
    public User getUser(int id); // 查询
    public int addUser(User user);//添加
    public int deleteUser(int id); // 删除
    public int updateUser(User user); // 修改



}