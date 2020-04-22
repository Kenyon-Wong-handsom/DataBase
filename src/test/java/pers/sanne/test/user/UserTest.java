package pers.sanne.test.user;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import pers.sanne.domain.User;
import pers.sanne.service.UserService;
import pers.sanne.test.MapperTest;

/**
 *  测试User类
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
        user.setEmail("123456@qq.com");
        user.setName("sanne");
        user.setPassword("123456");
        int result = userService.addUser(user);
        // 断言
        Assert.assertEquals(1, result);
    }

}
