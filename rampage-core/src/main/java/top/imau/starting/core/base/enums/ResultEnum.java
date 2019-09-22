package top.imau.starting.core.base.enums;

public enum ResultEnum {

    SUCCESS(0, "成功"),

    BIZ_FAIL(-1, "业务异常"),

    FAIL(-2, "失败");

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
