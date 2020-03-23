package com.jiang.admin.entity.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AdminRequest {

    private String name;

    @NotNull(message = "url不能为空")
    private String url;

    private int age;

    private String text;

}
