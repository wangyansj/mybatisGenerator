package com.atguigu.mybatis.entities;

public class Storage {
    private Float id;

    private String memo;

    private Float stockCount;

    private String stockWare;

    private String wareHouse;

    private Float productId;

    public Float getId() {
        return id;
    }

    public void setId(Float id) {
        this.id = id;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Float getStockCount() {
        return stockCount;
    }

    public void setStockCount(Float stockCount) {
        this.stockCount = stockCount;
    }

    public String getStockWare() {
        return stockWare;
    }

    public void setStockWare(String stockWare) {
        this.stockWare = stockWare == null ? null : stockWare.trim();
    }

    public String getWareHouse() {
        return wareHouse;
    }

    public void setWareHouse(String wareHouse) {
        this.wareHouse = wareHouse == null ? null : wareHouse.trim();
    }

    public Float getProductId() {
        return productId;
    }

    public void setProductId(Float productId) {
        this.productId = productId;
    }
}