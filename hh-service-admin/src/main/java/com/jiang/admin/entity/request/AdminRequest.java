package com.jiang.admin.entity.request;

import com.jiang.admin.annotation.Hello;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AdminRequest {

    private String name;

    @NotNull(message = "url不能为空")
    private String url;

    private int age;

    private String text;

    @Hello(min = 6, max = 10, description = "密码最少6位，最多10位")
    private String password;

}
