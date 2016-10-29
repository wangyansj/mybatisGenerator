package com.atguigu.mybatis.entities;

import java.util.Date;

public class SalesChance {
    private Float id;

    private String contact;

    private String contactTel;

    private Date createDate;

    private String custName;

    private String description;

    private Date designeeDate;

    private Float rate;

    private String source;

    private Float status;

    private String title;

    private Float createdUserId;

    private Float designeeId;

    public Float getId() {
        return id;
    }

    public void setId(Float id) {
        this.id = id;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel == null ? null : contactTel.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getDesigneeDate() {
        return designeeDate;
    }

    public void setDesigneeDate(Date designeeDate) {
        this.designeeDate = designeeDate;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Float getStatus() {
        return status;
    }

    public void setStatus(Float status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Float getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(Float createdUserId) {
        this.createdUserId = createdUserId;
    }

    public Float getDesigneeId() {
        return designeeId;
    }

    public void setDesigneeId(Float designeeId) {
        this.designeeId = designeeId;
    }
}