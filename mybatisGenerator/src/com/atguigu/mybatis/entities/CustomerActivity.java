package com.atguigu.mybatis.entities;

import java.util.Date;

public class CustomerActivity {
    private Float id;

    private Date activityDate;

    private String description;

    private String place;

    private String title;

    private Float customerId;

    public Float getId() {
        return id;
    }

    public void setId(Float id) {
        this.id = id;
    }

    public Date getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Float getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Float customerId) {
        this.customerId = customerId;
    }
}