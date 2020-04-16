package com.jiang.admin.controller;


import com.jiang.admin.entity.request.AdminRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/admin")
@Slf4j
public class AdminController {

    @GetMapping("/hi")
    public String test() {
        log.info("Request hi ......");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hi,  i am is admin.";
    }

    @PostMapping("/hi")
    public String test2(@RequestBody @Valid AdminRequest request) {
        log.info("Request hi2 ......");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hi,  i am is admin2.";
    }


}
