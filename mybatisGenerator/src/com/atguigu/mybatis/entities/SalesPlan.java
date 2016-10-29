package com.atguigu.mybatis.entities;

import java.util.Date;

public class SalesPlan {
    private Float id;

    private Date planDate;

    private String planResult;

    private String todo;

    private Float chanceId;

    public Float getId() {
        return id;
    }

    public void setId(Float id) {
        this.id = id;
    }

    public Date getPlanDate() {
        return planDate;
    }

    public void setPlanDate(Date planDate) {
        this.planDate = planDate;
    }

    public String getPlanResult() {
        return planResult;
    }

    public void setPlanResult(String planResult) {
        this.planResult = planResult == null ? null : planResult.trim();
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo == null ? null : todo.trim();
    }

    public Float getChanceId() {
        return chanceId;
    }

    public void setChanceId(Float chanceId) {
        this.chanceId = chanceId;
    }
}