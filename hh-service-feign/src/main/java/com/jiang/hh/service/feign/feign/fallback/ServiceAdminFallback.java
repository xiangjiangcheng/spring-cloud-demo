package com.jiang.hh.service.feign.feign.fallback;

import com.jiang.hh.service.feign.feign.ServiceAdmin;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ServiceAdminFallback implements ServiceAdmin {

    @Setter
    private Throwable cause;

    @Override
    public String sayHiFromClientOne(String name) {
        log.info("调用失败");
        log.warn("系统降级处理 >>>>>>>>> {}", cause.getMessage(), cause);
        return "sorry " + name;
    }
}
