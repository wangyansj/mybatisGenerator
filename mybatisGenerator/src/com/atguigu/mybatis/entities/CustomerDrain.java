package com.atguigu.mybatis.entities;

import java.util.Date;

public class CustomerDrain {
    private Float id;

    private String delay;

    private Date drainDate;

    private Date lastOrderDate;

    private String reason;

    private String status;

    private Float customerId;

    public Float getId() {
        return id;
    }

    public void setId(Float id) {
        this.id = id;
    }

    public String getDelay() {
        return delay;
    }

    public void setDelay(String delay) {
        this.delay = delay == null ? null : delay.trim();
    }

    public Date getDrainDate() {
        return drainDate;
    }

    public void setDrainDate(Date drainDate) {
        this.drainDate = drainDate;
    }

    public Date getLastOrderDate() {
        return lastOrderDate;
    }

    public void setLastOrderDate(Date lastOrderDate) {
        this.lastOrderDate = lastOrderDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Float getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Float customerId) {
        this.customerId = customerId;
    }
}