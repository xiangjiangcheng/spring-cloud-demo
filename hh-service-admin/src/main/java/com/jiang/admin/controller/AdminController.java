package com.jiang.admin.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@Slf4j
public class AdminController {

    @GetMapping("/hi")
    public String test() {
        log.info("Request hi ......");
        return "hi,  i am is admin.";
    }

}
