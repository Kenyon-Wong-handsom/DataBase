package pers.sanne.http.emp;

import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import pers.sanne.http.HttpTest;

import java.util.List;

public class EmpHttpTest extends HttpTest {
    /**
     * 测试分页请求
     * @throws Exception
     *//*
    @Test
    public void testPage() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/emps").param("pn", "5")).andReturn();
        MockHttpServletRequest request = result.getRequest();
        PageInfo pageInfo = (PageInfo) request.getAttribute("pageInfo");
        System.out.println("当前页码： " + pageInfo.getPageNum());
        System.out.println("总页码： " + pageInfo.getPages());
        System.out.println("总记录数： " + pageInfo.getTotal());
        System.out.print("在页码需要连续显示的页码： ");
        int[] nums = pageInfo.getNavigatepageNums();
        for (int i : nums) {
            System.out.print("  " + i);
        }

        // 获取员工数据
        System.out.println();
        List<Emp> emps = pageInfo.getList();
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }*/
}
