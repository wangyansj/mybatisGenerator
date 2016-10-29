package com.atguigu.mybatis.entities;

public class Authority {
    private Float id;

    private String name;

    private String displayName;

    private String permissions;

    private Float parentAuthorityId;

    private String url;

    public Float getId() {
        return id;
    }

    public void setId(Float id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions == null ? null : permissions.trim();
    }

    public Float getParentAuthorityId() {
        return parentAuthorityId;
    }

    public void setParentAuthorityId(Float parentAuthorityId) {
        this.parentAuthorityId = parentAuthorityId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}