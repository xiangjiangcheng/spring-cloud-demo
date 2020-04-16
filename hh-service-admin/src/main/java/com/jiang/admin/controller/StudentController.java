package com.jiang.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SuppressWarnings("ALL")
@Controller
@RequestMapping("/students")
public class StudentController {

    @GetMapping("")
    public String list() {
        System.out.println("请求了获取学生列表接口");
        return "";
    }

}
