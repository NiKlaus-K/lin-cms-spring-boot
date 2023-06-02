package io.github.talelin.latticy.common.enumeration;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import io.github.talelin.latticy.common.constant.BaseConstants;

public enum BizCodeMsgEnum {
    SUCCESS(BaseConstants.BASIC_SUCCESS_CODE, "成功"),
    ERROR(BaseConstants.BASIC_ERROR_CODE, "失败"),
    PHONE_NOT_REGISTER(BaseConstants.BASIC_SUCCESS_CODE + 10, "手机号未注册，请前往注册"),
    PHONE_LOGIN(BaseConstants.BASIC_SUCCESS_CODE + 20, "短信发已发送，请前往登录"),
    PARAM_ERROR(BaseConstants.BASIC_ERROR_CODE - 10, "参数错误"),
    NET_EXCEPTION(BaseConstants.BASIC_ERROR_CODE - 20, "网络异常"),
    SYS_BUSY(BaseConstants.BASIC_ERROR_CODE - 30, "系统正忙"),
    SYS_ERROR(BaseConstants.BASIC_ERROR_CODE - 40, "系统异常"),
    CLIENT_ERROR(BaseConstants.BASIC_ERROR_CODE - 50, "客户端请求未授权"),
    NO_AUTH(BaseConstants.BASIC_ERROR_CODE - 60, "无权限访问"),
    TOKEN_ERROR(BaseConstants.BASIC_ERROR_CODE - 70, "请求未授权"),
    CAPTCHA_ERROR(BaseConstants.BASIC_ERROR_CODE - 80, "验证码错误"),
    CAPTCHA_EXPIRED(BaseConstants.BASIC_ERROR_CODE - 90, "验证码已过期，请重新获取"),
    PHONE_NOT_FOUND(BaseConstants.BASIC_ERROR_CODE - 100, "手机号未注册"),
    ACCOUNT_SLEEP(BaseConstants.BASIC_ERROR_CODE - 110, "账号已休眠，请联系管理员解决"),
    ACCOUNT_LOGOUT(BaseConstants.BASIC_ERROR_CODE - 120, "账号已注销，请联系管理员解决"),
    NO_SIGN_AUTH(BaseConstants.BASIC_ERROR_CODE - 130, "签名校验失败，无权限访问"),
    NO_TOKEN_AUTH(BaseConstants.BASIC_ERROR_CODE - 140, "未登录，无权限访问"),
    NO_URL_AUTH(BaseConstants.BASIC_ERROR_CODE - 150, "无此接口访问权限，无权限访问"),
    NO_LICENSE_AUTH(BaseConstants.BASIC_ERROR_CODE - 160, "未安装证书或证书失效，无权限访问"),
    SESSION_INVALID(BaseConstants.BASIC_ERROR_CODE - 170, "会话失效，请重新登录"),
    IP_NOT_AUTH(BaseConstants.BASIC_ERROR_CODE - 180, "当前ip无权限访问"),
    NO_TIME_AUTH(BaseConstants.BASIC_ERROR_CODE - 190, "当前时间无权限访问"),
    COMMON_ERROR_UNIQUE(BaseConstants.BASIC_ERROR_CODE - 10000 - 10, "唯一键存在重复"),
    COMMON_ERROR_NULL_DATA(BaseConstants.BASIC_ERROR_CODE - 10000 - 20, "数据不存在"),
    EMAIL_EXIST(BaseConstants.BASIC_ERROR_CODE - 20000 - 10, "邮箱已存在"),
    USER_NOT_FOUND(BaseConstants.BASIC_ERROR_CODE - 20000 - 20, "用户不存在"),
    USER_ROLE_EXIST(BaseConstants.BASIC_ERROR_CODE - 20000 - 30, "用户不能多次分配相同角色"),
    ROLE_CODE_EXIST(BaseConstants.BASIC_ERROR_CODE - 20000 - 40, "角色编码重复"),
    USER_NAME_EXIST(BaseConstants.BASIC_ERROR_CODE - 20000 - 50, "用户名已存在"),
    USERNAME_PWD_ERROR(BaseConstants.BASIC_ERROR_CODE - 20000 - 60, "用户名或密码错误"),
    PHONE_EXIST(BaseConstants.BASIC_ERROR_CODE - 20000 - 70, "手机号已存在"),
    PWD_CURRENT_REPEAT(BaseConstants.BASIC_ERROR_CODE - 20000 - 80, "新密码不能与原密码相同，请重新输入"),
    PHONE_FORMAT_ERROR(BaseConstants.BASIC_ERROR_CODE - 20000 - 90, "手机号格式错误"),
    EMAIL_FORMAT_ERROR(BaseConstants.BASIC_ERROR_CODE - 20000 - 100, "邮箱格式错误"),
    PWD_OLD_ERROR(BaseConstants.BASIC_ERROR_CODE - 20000 - 110, "原密码输入错误，请重新输入"),
    USER_NAME_SENSITIVE(BaseConstants.BASIC_ERROR_CODE - 20000 - 120, "用户名包含敏感词"),
    USER_FULLNAME_SENSITIVE(BaseConstants.BASIC_ERROR_CODE - 20000 - 130, "姓名包含敏感词"),
    OAUTH_USER_ALREADY_BIND(BaseConstants.BASIC_ERROR_CODE - 20000 - 140, "该第三方账号已绑定其他用户，请先解绑"),
    PHONE_EXIST_REGISTER(BaseConstants.BASIC_ERROR_CODE - 20000 - 150, "该手机号已注册"),
    PHONE_IS_OLD(BaseConstants.BASIC_ERROR_CODE - 20000 - 160, "新手机号码不能和原手机号码相同"),
    PHONE_EXIST_BIND(BaseConstants.BASIC_ERROR_CODE - 20000 - 160, "该手机号已绑定其他用户，请先解绑"),
    SEND_MAIL_ERROR(BaseConstants.BASIC_ERROR_CODE - 30000 - 10, "邮件发送失败"),
    SEND_SMS_ERROR(BaseConstants.BASIC_ERROR_CODE - 30000 - 20, "短信发送失败"),
    SYS_BPM_MODEL_KEY_ERROR(BaseConstants.BASIC_ERROR_CODE - '鱀' - 10, "modelId、modelKey不能同时为空"),
    SYS_BPM_MODEL_NULL_ERROR(BaseConstants.BASIC_ERROR_CODE - '鱀' - 20, "流程模型不存在"),
    SYS_BPM_TASK_NULL_ERROR(BaseConstants.BASIC_ERROR_CODE - '鱀' - 30, "流程节点不存在"),
    SYS_BPM_TASK_HISTORY_NULL_ERROR(BaseConstants.BASIC_ERROR_CODE - '鱀' - 40, "驳回失败，历史流程不存在"),
    SYS_BPM_TASK_MODEL_KEY_ERROR(BaseConstants.BASIC_ERROR_CODE - '鱀' - 50, "modelKey重复"),
    SYS_BPM_TASK_PERMISSION_ERROR(BaseConstants.BASIC_ERROR_CODE - '鱀' - 60, "非本人待办无法处理"),
    SYS_BPM_TASK_FORM_ERROR_ERROR(BaseConstants.BASIC_ERROR_CODE - '鱀' - 70, "formKey重复"),
    SYS_BPM_INSTANCE_MISSING_COLLECTION(BaseConstants.BASIC_ERROR_CODE - '鱀' - 80, "instance不存在"),
    ANSER_WIKI_ICON_CODE_ERROR(BaseConstants.BASIC_ERROR_CODE - '썐' - 10, "icon编号重复"),
    ANSER_WIKI_ICON_TYPE_ERROR(BaseConstants.BASIC_ERROR_CODE - '썐' - 20, "上传文件格式有误"),
    SYS_DICTIONARY_CODE_ERROR(BaseConstants.BASIC_ERROR_CODE - '\uea60' - 10, "CODE重复"),
    SYS_DICTIONARY_CODE_VALUE_ERROR(BaseConstants.BASIC_ERROR_CODE - '\uea60' - 20, "字典键值重复"),
    SYS_DICTIONARY_CODE_EXIST(BaseConstants.BASIC_ERROR_CODE - '\uea60' - 30, "字典键名重复"),
    SYS_DOCUMENT_FILE_ERROR(BaseConstants.BASIC_ERROR_CODE - 70000 - 10, "文件不存在"),
    SYS_DOCUMENT_FILE_EXIST_ERROR(BaseConstants.BASIC_ERROR_CODE - 70000 - 20, "不支持的文件格式"),
    HR_ORG_NOT_EXIST_ERROR(BaseConstants.BASIC_ERROR_CODE - 80000 - 10, "此部门存在子部门，不能删除！"),
    EM_FORM_BEAN_ERROR(BaseConstants.BASIC_ERROR_CODE - 90000 - 10, "实体对象不存在"),
    EM_FORM_BEAN_DETAIL_ERROR(BaseConstants.BASIC_ERROR_CODE - 90000 - 20, "明细表实体对象不存在"),
    SYS_STORAGE_OSSPROPERTY_NOT_EXIST(BaseConstants.BASIC_ERROR_CODE - 100000 - 10, "配置文件不存在"),
    SYS_STORAGE_FILETOKEN_NOT_EXIST(BaseConstants.BASIC_ERROR_CODE - 100000 - 20, "token下的文件不存在"),
    OAUTH_CLIENT_EXIST(BaseConstants.BASIC_ERROR_CODE - 110000 - 10, "此第三方配置已存在"),
    DETAIL_CODE_EXIST(BaseConstants.BASIC_ERROR_CODE - 110000 - 20, "编码重复"),
    MENU_FORMAT_ERROR(BaseConstants.BASIC_ERROR_CODE - 110000 - 30, "菜单格式错误"),
    SYS_FORM_GROUP_ERROR(BaseConstants.BASIC_ERROR_CODE - 120000 - 10, "表单分组已存在");

    private Integer code;
    private String msg;

    public Integer getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    private BizCodeMsgEnum(final Integer code, final String msg) {
        this.code = code;
        this.msg = msg;
    }
}
