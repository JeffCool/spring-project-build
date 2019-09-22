package top.imau.starting.core.base.exception;


import top.imau.starting.core.base.enums.ResultEnum;

public class BizException extends RuntimeException {

    private static final long serialVersionUID = 1432584672815469239L;

    private Integer code;
    private String msg;

    public BizException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
    }

    public BizException(ResultEnum resultEnum, String customMsg) {
        this.code = resultEnum.getCode();
        this.msg = customMsg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
