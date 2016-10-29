package com.atguigu.mybatis.entities;

public class User {
    private Float id;

    private Float enabled;

    private String name;

    private String password;

    private Float roleId;

    private String salt;

    public Float getId() {
        return id;
    }

    public void setId(Float id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Float getRoleId() {
        return roleId;
    }

    public void setRoleId(Float roleId) {
        this.roleId = roleId;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }
}