package com.jiang.hh.service.feign.feign.fallback;

import com.jiang.hh.service.feign.feign.ServiceAdmin;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ServiceAdminFallback implements ServiceAdmin{

    @Override
    public String sayHiFromClientOne(String name) {
        log.info("调用失败");

        return "sorry "+name;
    }
}
