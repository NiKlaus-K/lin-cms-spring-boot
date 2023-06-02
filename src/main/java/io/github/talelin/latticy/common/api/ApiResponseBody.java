package io.github.talelin.latticy.common.api;

import io.github.talelin.latticy.common.enumeration.BizCodeMsgEnum;
import java.io.Serializable;

public final class ApiResponseBody<T> implements Serializable {
    //("本次返回状态 true正常 ")
    private Boolean status;
    //("返回数据")
    private T data;
    //("返回码")
    private Integer code;
    //("返回信息")
    private String message;
    //("全局调用链id")
    private String txId;

    public static ApiResponseBody defaultSuccess() {
        return assembleCodeAndMsg((Object)null, BizCodeMsgEnum.SUCCESS.getCode(), BizCodeMsgEnum.SUCCESS.getMsg(), Boolean.TRUE);
    }

    public static <T> ApiResponseBody<T> defaultSuccess(T data) {
        return assembleCodeAndMsg(data, BizCodeMsgEnum.SUCCESS.getCode(), BizCodeMsgEnum.SUCCESS.getMsg(), Boolean.TRUE);
    }

    public static ApiResponseBody success(BizCodeMsgEnum bizCodeMsgEnum) {
        return bizCodeMsgEnum == null ? defaultSuccess() : assembleCodeAndMsg((Object)null, bizCodeMsgEnum.getCode(), bizCodeMsgEnum.getMsg(), Boolean.TRUE);
    }

    public static <T> ApiResponseBody<T> success(T data, BizCodeMsgEnum bizCodeMsgEnum) {
        return bizCodeMsgEnum == null ? defaultSuccess(data) : assembleCodeAndMsg(data, bizCodeMsgEnum.getCode(), bizCodeMsgEnum.getMsg(), Boolean.TRUE);
    }

    public static <T> ApiResponseBody<T> success(Integer code, String msg) {
        return assembleCodeAndMsg(null, code, msg, Boolean.TRUE);
    }

    public static <T> ApiResponseBody<T> success(T data, Integer code, String msg) {
        return assembleCodeAndMsg(data, code, msg, Boolean.TRUE);
    }

    public static ApiResponseBody error(BizCodeMsgEnum bizCodeMsgEnum) {
        return bizCodeMsgEnum == null ? defaultError() : assembleCodeAndMsg((Object)null, bizCodeMsgEnum.getCode(), bizCodeMsgEnum.getMsg(), Boolean.FALSE);
    }

    public static <T> ApiResponseBody<T> error(T data, BizCodeMsgEnum bizCodeMsgEnum) {
        return bizCodeMsgEnum == null ? defaultError(data) : assembleCodeAndMsg(data, bizCodeMsgEnum.getCode(), bizCodeMsgEnum.getMsg(), Boolean.FALSE);
    }

    public static ApiResponseBody error(Integer code, String msg) {
        return assembleCodeAndMsg((Object)null, code, msg, Boolean.FALSE);
    }

    public static <T> ApiResponseBody<T> error(T data, Integer code, String msg) {
        return assembleCodeAndMsg(data, code, msg, Boolean.FALSE);
    }

    private static <T> ApiResponseBody<T> defaultError(T data) {
        return assembleCodeAndMsg(data, BizCodeMsgEnum.ERROR.getCode(), BizCodeMsgEnum.ERROR.getMsg(), Boolean.FALSE);
    }

    private static ApiResponseBody defaultError() {
        return assembleCodeAndMsg((Object)null, BizCodeMsgEnum.ERROR.getCode(), BizCodeMsgEnum.ERROR.getMsg(), Boolean.FALSE);
    }

    private static <T> ApiResponseBody<T> assembleCodeAndMsg(T data, Integer code, String msg, Boolean status) {
        ApiResponseBody apiResponseBody = new ApiResponseBody();
        apiResponseBody.setStatus(status);
        apiResponseBody.setCode(code);
        apiResponseBody.setData(data);
        apiResponseBody.setMessage(msg);
       // apiResponseBody.setTxId(String.valueOf(HttpHeaderTool.getHeaderValue(HeaderEnum.TX_ID)));
        return apiResponseBody;
    }

    public ApiResponseBody() {
    }

    public Boolean getStatus() {
        return this.status;
    }

    public T getData() {
        return this.data;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getTxId() {
        return this.txId;
    }

    public void setStatus(final Boolean status) {
        this.status = status;
    }

    public void setData(final T data) {
        this.data = data;
    }

    public void setCode(final Integer code) {
        this.code = code;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setTxId(final String txId) {
        this.txId = txId;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ApiResponseBody)) {
            return false;
        } else {
            ApiResponseBody<?> other = (ApiResponseBody)o;
            Object this$status = this.getStatus();
            Object other$status = other.getStatus();
            if (this$status == null) {
                if (other$status != null) {
                    return false;
                }
            } else if (!this$status.equals(other$status)) {
                return false;
            }

            label61: {
                Object this$code = this.getCode();
                Object other$code = other.getCode();
                if (this$code == null) {
                    if (other$code == null) {
                        break label61;
                    }
                } else if (this$code.equals(other$code)) {
                    break label61;
                }

                return false;
            }

            label54: {
                Object this$data = this.getData();
                Object other$data = other.getData();
                if (this$data == null) {
                    if (other$data == null) {
                        break label54;
                    }
                } else if (this$data.equals(other$data)) {
                    break label54;
                }

                return false;
            }

            Object this$message = this.getMessage();
            Object other$message = other.getMessage();
            if (this$message == null) {
                if (other$message != null) {
                    return false;
                }
            } else if (!this$message.equals(other$message)) {
                return false;
            }

            Object this$txId = this.getTxId();
            Object other$txId = other.getTxId();
            if (this$txId == null) {
                if (other$txId != null) {
                    return false;
                }
            } else if (!this$txId.equals(other$txId)) {
                return false;
            }

            return true;
        }
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : $status.hashCode());
        Object $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        Object $data = this.getData();
        result = result * 59 + ($data == null ? 43 : $data.hashCode());
        Object $message = this.getMessage();
        result = result * 59 + ($message == null ? 43 : $message.hashCode());
        Object $txId = this.getTxId();
        result = result * 59 + ($txId == null ? 43 : $txId.hashCode());
        return result;
    }

    public String toString() {
        return "ApiResponseBody(status=" + this.getStatus() + ", data=" + this.getData() + ", code=" + this.getCode() + ", message=" + this.getMessage() + ", txId=" + this.getTxId() + ")";
    }
}


