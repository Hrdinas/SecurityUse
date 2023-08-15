package com.example.SecurityUse.tuils;
import com.baomidou.mybatisplus.extension.api.IErrorCode;

/**
 * 枚举了一些常用API操作码
 */
public enum ResultCode implements IErrorCode {
    SUCCESS(200, "操作成功!"),
    FAILED(400, "操作失败!"),
    VALIDATE_FAILED(404, "参数检验失败!"),
    NOTFOUND_FAILED(405, "服务未找到!"),
    UNKNOWN_FAILED(406,"服务器内部错误!"),
    UNAUTHORIZED(401, "暂未登录或token已经过期!"),
    FORBIDDEN(403, "没有相关权限!"),;

    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public long getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return null;
    }

    public String getMessage() {
        return message;
    }
}
