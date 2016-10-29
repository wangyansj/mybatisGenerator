package com.atguigu.mybatis.entities;

public class Order {
    private Float id;

    private Float itemCount;

    private Float money;

    private Float orderId;

    private Float productId;

    public Float getId() {
        return id;
    }

    public void setId(Float id) {
        this.id = id;
    }

    public Float getItemCount() {
        return itemCount;
    }

    public void setItemCount(Float itemCount) {
        this.itemCount = itemCount;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public Float getOrderId() {
        return orderId;
    }

    public void setOrderId(Float orderId) {
        this.orderId = orderId;
    }

    public Float getProductId() {
        return productId;
    }

    public void setProductId(Float productId) {
        this.productId = productId;
    }
}