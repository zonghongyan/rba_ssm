package com.rba.basebeans;

/**
 * Created by 仁伯安 on 2017/11/11.
 */
public enum BaseResultEnum {


    OK("1", "success"),
    ERROR("0", "error");

    BaseResultEnum() {
    }

    private String id;
    private String name;



    BaseResultEnum(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
