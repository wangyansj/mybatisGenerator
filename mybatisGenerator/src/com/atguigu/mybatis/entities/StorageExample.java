package com.atguigu.mybatis.entities;

import java.util.ArrayList;
import java.util.List;

public class StorageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StorageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Float value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Float value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Float value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Float value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Float value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Float value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Float> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Float> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Float value1, Float value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Float value1, Float value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andStockCountIsNull() {
            addCriterion("stock_count is null");
            return (Criteria) this;
        }

        public Criteria andStockCountIsNotNull() {
            addCriterion("stock_count is not null");
            return (Criteria) this;
        }

        public Criteria andStockCountEqualTo(Float value) {
            addCriterion("stock_count =", value, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountNotEqualTo(Float value) {
            addCriterion("stock_count <>", value, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountGreaterThan(Float value) {
            addCriterion("stock_count >", value, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountGreaterThanOrEqualTo(Float value) {
            addCriterion("stock_count >=", value, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountLessThan(Float value) {
            addCriterion("stock_count <", value, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountLessThanOrEqualTo(Float value) {
            addCriterion("stock_count <=", value, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountIn(List<Float> values) {
            addCriterion("stock_count in", values, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountNotIn(List<Float> values) {
            addCriterion("stock_count not in", values, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountBetween(Float value1, Float value2) {
            addCriterion("stock_count between", value1, value2, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountNotBetween(Float value1, Float value2) {
            addCriterion("stock_count not between", value1, value2, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockWareIsNull() {
            addCriterion("stock_ware is null");
            return (Criteria) this;
        }

        public Criteria andStockWareIsNotNull() {
            addCriterion("stock_ware is not null");
            return (Criteria) this;
        }

        public Criteria andStockWareEqualTo(String value) {
            addCriterion("stock_ware =", value, "stockWare");
            return (Criteria) this;
        }

        public Criteria andStockWareNotEqualTo(String value) {
            addCriterion("stock_ware <>", value, "stockWare");
            return (Criteria) this;
        }

        public Criteria andStockWareGreaterThan(String value) {
            addCriterion("stock_ware >", value, "stockWare");
            return (Criteria) this;
        }

        public Criteria andStockWareGreaterThanOrEqualTo(String value) {
            addCriterion("stock_ware >=", value, "stockWare");
            return (Criteria) this;
        }

        public Criteria andStockWareLessThan(String value) {
            addCriterion("stock_ware <", value, "stockWare");
            return (Criteria) this;
        }

        public Criteria andStockWareLessThanOrEqualTo(String value) {
            addCriterion("stock_ware <=", value, "stockWare");
            return (Criteria) this;
        }

        public Criteria andStockWareLike(String value) {
            addCriterion("stock_ware like", value, "stockWare");
            return (Criteria) this;
        }

        public Criteria andStockWareNotLike(String value) {
            addCriterion("stock_ware not like", value, "stockWare");
            return (Criteria) this;
        }

        public Criteria andStockWareIn(List<String> values) {
            addCriterion("stock_ware in", values, "stockWare");
            return (Criteria) this;
        }

        public Criteria andStockWareNotIn(List<String> values) {
            addCriterion("stock_ware not in", values, "stockWare");
            return (Criteria) this;
        }

        public Criteria andStockWareBetween(String value1, String value2) {
            addCriterion("stock_ware between", value1, value2, "stockWare");
            return (Criteria) this;
        }

        public Criteria andStockWareNotBetween(String value1, String value2) {
            addCriterion("stock_ware not between", value1, value2, "stockWare");
            return (Criteria) this;
        }

        public Criteria andWareHouseIsNull() {
            addCriterion("ware_house is null");
            return (Criteria) this;
        }

        public Criteria andWareHouseIsNotNull() {
            addCriterion("ware_house is not null");
            return (Criteria) this;
        }

        public Criteria andWareHouseEqualTo(String value) {
            addCriterion("ware_house =", value, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseNotEqualTo(String value) {
            addCriterion("ware_house <>", value, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseGreaterThan(String value) {
            addCriterion("ware_house >", value, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseGreaterThanOrEqualTo(String value) {
            addCriterion("ware_house >=", value, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseLessThan(String value) {
            addCriterion("ware_house <", value, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseLessThanOrEqualTo(String value) {
            addCriterion("ware_house <=", value, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseLike(String value) {
            addCriterion("ware_house like", value, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseNotLike(String value) {
            addCriterion("ware_house not like", value, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseIn(List<String> values) {
            addCriterion("ware_house in", values, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseNotIn(List<String> values) {
            addCriterion("ware_house not in", values, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseBetween(String value1, String value2) {
            addCriterion("ware_house between", value1, value2, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andWareHouseNotBetween(String value1, String value2) {
            addCriterion("ware_house not between", value1, value2, "wareHouse");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Float value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Float value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Float value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Float value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Float value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Float value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Float> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Float> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Float value1, Float value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Float value1, Float value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}