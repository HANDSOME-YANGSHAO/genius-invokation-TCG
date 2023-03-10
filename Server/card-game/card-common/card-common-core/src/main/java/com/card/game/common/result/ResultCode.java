package com.card.game.common.result;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author TomYou
 * @version v1.0 2022-07-30-11:33 AM
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
public enum ResultCode implements IResultCode, Serializable {
    SUCCESS(200, "成功"),
    ERROR(500, "系统错误"),

    UNAUTHORIZED(401, "未认证"),

    FORBIDDEN(403, "没有权限"),

    AUTHENTICATION_ERROR(500, "认证失败"),

    AUTHENTICATION_SUCCESS(200, "登录成功"),

    LOG_OUT_SUCCESS(200, "退出登录成功"),
    REQUIRE_MAIL_LOGIN_PARAM(500, "登陆认证请求体不能为空"),

    MAIL_CODE_IS_EXPIRE(500,"邮箱验证码已过期,请重新获取!"),

    NEED_REQUIRE_LOGIN(503, "用户已过期,请重新登陆"),

    MAIL_CODE_CHECK_ERROR(500,"验证码错误,请重新输入!"),

    ILLEGAL_TOKEN(504, "非法的Token"),
    EXPIRED_TOKEN(505, "Token已经过期"),

    ;

    private Integer code;

    private String message;

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
