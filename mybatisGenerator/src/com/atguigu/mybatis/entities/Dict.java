package com.atguigu.mybatis.entities;

public class Dict {
    private Float id;

    private Float editable;

    private String item;

    private String type;

    private String value;

    public Float getId() {
        return id;
    }

    public void setId(Float id) {
        this.id = id;
    }

    public Float getEditable() {
        return editable;
    }

    public void setEditable(Float editable) {
        this.editable = editable;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item == null ? null : item.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}