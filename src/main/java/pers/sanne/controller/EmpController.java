package pers.sanne.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.sanne.message.Message;

import java.util.List;

public class EmpController {
/*
    @Autowired
    EmpService empService;

    *//**
     * 查询员工数据
     * @param pageNum  页数
     * @return 返回“empList”页面
     *//*
    @RequestMapping("/emps")
    @ResponseBody
    public Message findEmps(@RequestParam(value = "pn", defaultValue = "1") int pageNum) {
        PageHelper.startPage(pageNum, 5);
        List<Emp> emps = empService.findAll();
        PageInfo pageInfo = new PageInfo<>(emps, 5);
        return Message.success().add("pageInfo", pageInfo);
    }*/
}
