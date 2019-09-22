package top.imau.starting.core.base.res;

import lombok.Getter;
import lombok.ToString;
import top.imau.starting.core.base.enums.ResultEnum;

import java.io.Serializable;

@ToString
@Getter
public final class ResultEntity<T> implements Serializable {

    private static final long serialVersionUID = -1380549967046025190L;

    private Integer code;
    private String msg;
    private T data;

    private ResultEntity(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMsg();
    }

    private ResultEntity(ResultEnum resultEnum, String msg, T data) {
        this.code = resultEnum.getCode();
        this.msg = msg;
        this.data = data;
    }

    /**
     * 返回结果
     * @param resultEnum
     * @return
     */
    public static ResultEntity create(ResultEnum resultEnum) {
        return new ResultEntity(resultEnum);
    }

    /**
     * 默认返回成功结果
     * @return
     */
    public static ResultEntity createSuccess() {
        return ResultEntity.create(ResultEnum.SUCCESS);
    }

    /**
     * 默认返回失败结果
     * @return
     */
    public static ResultEntity createFail() {
        return new ResultEntity<>(ResultEnum.FAIL);
    }

    /**
     * 返回结果 - 提示信息自定义（静态常量 或 其他枚举的msg)
     * - 不可直接使用字符串(例如：ResultEntity.create(ResultEnum.SUCCESS, "返回成功")
     * @param resultEnum
     * @param customMsg
     * @return
     */
    public static ResultEntity create(ResultEnum resultEnum, String customMsg) {
        return new ResultEntity<>(resultEnum, customMsg, null);
    }

    /**
     * 返回结果 - 数据data
     * - 不可直接使用字符串(例如：ResultEntity.create(ResultEnum.SUCCESS, "返回成功")
     * @param resultEnum
     * @param customMsg
     * @param data
     * @return
     */
    public static <T> ResultEntity<T> createDataResult(ResultEnum resultEnum, String customMsg, T data) {
        return new ResultEntity<>(resultEnum, customMsg, data);
    }

    /**
     * 返回结果 - 数据data
     * @param resultEnum
     * @param data
     * @return
     */
    public static <T> ResultEntity<T> createDataResult(ResultEnum resultEnum, T data) {
        return new ResultEntity<>(resultEnum, resultEnum.getMsg(), data);
    }

}
