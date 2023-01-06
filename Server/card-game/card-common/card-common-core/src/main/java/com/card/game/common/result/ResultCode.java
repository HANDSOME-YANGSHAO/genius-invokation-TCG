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
