package com.jiang.hh.service.feign.web;

import com.jiang.hh.service.feign.feign.ServiceAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private ServiceAdmin serviceAdmin;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam("name") String name) {
        return serviceAdmin.sayHiFromClientOne(name);
    }

}
