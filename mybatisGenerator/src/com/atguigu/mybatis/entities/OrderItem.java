package com.atguigu.mybatis.entities;

import java.util.Date;

public class OrderItem {
    private Float id;

    private String address;

    private Date orderDate;

    private String no;

    private String status;

    private Float customerId;

    public Float getId() {
        return id;
    }

    public void setId(Float id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
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