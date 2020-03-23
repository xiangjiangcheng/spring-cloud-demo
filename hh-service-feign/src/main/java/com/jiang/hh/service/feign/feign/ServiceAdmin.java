package com.jiang.hh.service.feign.feign;

import com.jiang.hh.service.feign.feign.fallback.ServiceAdminFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 定义一个feign接口，通过@ FeignClient（“服务名”），来指定调用哪个服务。比如在代码中调用了service-admin服务的“/admin/hi”接口
 */
@FeignClient(value = "service-admin", fallback = ServiceAdminFallback.class)
public interface ServiceAdmin {

    @RequestMapping(value = "/admin/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
