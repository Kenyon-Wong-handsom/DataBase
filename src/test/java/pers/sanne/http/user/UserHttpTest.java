package pers.sanne.http.user;

import org.junit.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import pers.sanne.http.HttpTest;

/**
 * http测试User
 * test包下的测试类是从service层开始测试的，这个http是从controller层开始测试，模拟http请求
 */
public class UserHttpTest extends HttpTest {
    /**
     * 测试添加用户
     */
    @Test
    public void testAddUser() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                .post("/user")
//                .content()
        ).andReturn();
    }
}
