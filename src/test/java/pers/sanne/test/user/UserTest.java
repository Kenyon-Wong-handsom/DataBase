package pers.sanne.test.user;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import pers.sanne.domain.User;
import pers.sanne.service.UserService;
import pers.sanne.test.MapperTest;

/**
 * 测试User类
 */
public class UserTest extends MapperTest {
    @Autowired
    UserService userService;

    /**
     * 测试添加账户
     */
    @Test
    public void testAddUser() {
        User user = new User();
        user.setEmail("903881709@qq.com");
        user.setName("peipei");
        user.setPassword("168668");
        int result = userService.addUser(user);
        // 断言
        Assert.assertEquals(1, result);
    }

    /*
        测试获取用户信息
     */
    @Test
    public void testGetUser() {
        User user = new User();
        user = userService.getUser(18);
        System.out.println(user);
    }

    @Test
    public void testUpdateUser() {

        User user = new User();
        user.setId(18);
        user.setEmail("36373839@qq.com");
        user.setName("王勇超");
        user.setPassword("111111111111");

        int result = userService.updateUser(user);


    }
    @Test
    public void testDeleteUser() {

        int result = userService.deleteUser(18);
    }

    @Test
    public void testGetUserIDByEmail() {

        User user = new User();
        String email = user.getEmail("903881709@qq.com");
        Integer id = user.getId();

    }

}
