package pers.sanne.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pers.sanne.domain.User;
import pers.sanne.message.Message;
import pers.sanne.service.UserService;

/**
 * 用户控制层类
 */
@Controller
public class UserController {
    /**
     * 自动注入用户服务层类
     */
    @Autowired
    UserService userService;

    /**
     * 添加用户
     */
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    public Message addUser(@ModelAttribute User user) {
        Message message = null;
        // 返回 i 是操作数据库受影响的行数
        int result = userService.addUser(user);
        if (result == 0) {
            message = Message.fail();
        } else if (result == 1) {
            message = Message.success();
        }
        return message;
    }
}
