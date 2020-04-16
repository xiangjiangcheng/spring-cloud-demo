package com.jiang.admin;

import com.jiang.admin.annotation.Hello;
import com.jiang.admin.entity.request.AdminRequest;

import java.lang.reflect.Field;

public class Test {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException {

        String password = "12345";

        AdminRequest request = new AdminRequest();
        request.setPassword(password);
        boolean validate = validate(request);

        if (!validate) {

            System.out.println("password validate error.");
        } else {
            System.out.println("OK");
        }
    }

    private static boolean validate(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getFields();
        Field[] declaredFields = clazz.getDeclaredFields();

        for (Field field : declaredFields) {

            Hello test = field.getAnnotation(Hello.class);
            if (test != null) {
                // 设置属性可访问
                field.setAccessible(true);
                // 字符串类型的才判断长度
                if ("class java.lang.String".equals(field.getGenericType().toString())) {
                    String value = (String) field.get(obj);
                    if (value == null || ((value.length() < test.min()) || value.length() > test.max())) {
                        System.out.println(test.description());
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
