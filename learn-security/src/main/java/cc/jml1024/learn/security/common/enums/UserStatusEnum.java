package cc.jml1024.learn.security.common.enums;

public enum UserStatusEnum {
    ON(0, "启用"),
    OFF(1, "停用"),
    FROZEN(2, "冻结");


    private Integer code;
    private String desc;

    UserStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
