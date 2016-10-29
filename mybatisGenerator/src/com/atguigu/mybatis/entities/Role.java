package com.atguigu.mybatis.entities;

public class Role {
    private Float id;

    private String description;

    private Float enabled;

    private String name;

    public Float getId() {
        return id;
    }

    public void setId(Float id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Float getEnabled() {
        return enabled;
    }

    public void setEnabled(Float enabled) {
        this.enabled = enabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}