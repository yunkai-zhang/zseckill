package com.zhangyun.zseckill.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

//get方法,toString方法，全参构造
@Getter
@ToString
@AllArgsConstructor
public enum RespBeanEnum {
    //编写枚举成员
    //基本的两个成员
    SUCCESS(200,"SUCCESS"),
    ERROR(500,"服务端异常"),
    //登录模块5002xx
    LOGIN_ERROR(500210, "用户名或者密码不正确"),
    MOBILE_ERROR(500211, "手机号码格式不正确"),
    BIND_ERROR(500212, "参数校验异常"),
    MOBILE_NOT_EXIST(500213, "手机号码不存在"),
    PASSWORD_UPDATE_FAIL(500214, "更新密码失败"),
    //秒杀模块5005xx
    EMPTY_STOCK(500500, "库存不足"),
    REPEATE_ERROR(500501, "该商品每人限购一件");


    //准备 状态码，状态码相应信息
    private final Integer code;
    private final String message;
}


















