package com.example.code.core.ennum;

public enum IsDelEnum {

    IS_DEL("Y","已经删除"),
    IS_NOT_DEL("N","未删除");

    String code;
    String description;

    IsDelEnum(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
