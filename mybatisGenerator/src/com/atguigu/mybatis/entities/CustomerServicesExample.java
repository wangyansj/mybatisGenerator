package com.atguigu.mybatis.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerServicesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerServicesExample() {
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

        public Criteria andAllotDateIsNull() {
            addCriterion("allot_date is null");
            return (Criteria) this;
        }

        public Criteria andAllotDateIsNotNull() {
            addCriterion("allot_date is not null");
            return (Criteria) this;
        }

        public Criteria andAllotDateEqualTo(Date value) {
            addCriterion("allot_date =", value, "allotDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateNotEqualTo(Date value) {
            addCriterion("allot_date <>", value, "allotDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateGreaterThan(Date value) {
            addCriterion("allot_date >", value, "allotDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateGreaterThanOrEqualTo(Date value) {
            addCriterion("allot_date >=", value, "allotDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateLessThan(Date value) {
            addCriterion("allot_date <", value, "allotDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateLessThanOrEqualTo(Date value) {
            addCriterion("allot_date <=", value, "allotDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateIn(List<Date> values) {
            addCriterion("allot_date in", values, "allotDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateNotIn(List<Date> values) {
            addCriterion("allot_date not in", values, "allotDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateBetween(Date value1, Date value2) {
            addCriterion("allot_date between", value1, value2, "allotDate");
            return (Criteria) this;
        }

        public Criteria andAllotDateNotBetween(Date value1, Date value2) {
            addCriterion("allot_date not between", value1, value2, "allotDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andDealDateIsNull() {
            addCriterion("deal_date is null");
            return (Criteria) this;
        }

        public Criteria andDealDateIsNotNull() {
            addCriterion("deal_date is not null");
            return (Criteria) this;
        }

        public Criteria andDealDateEqualTo(Date value) {
            addCriterion("deal_date =", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateNotEqualTo(Date value) {
            addCriterion("deal_date <>", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateGreaterThan(Date value) {
            addCriterion("deal_date >", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateGreaterThanOrEqualTo(Date value) {
            addCriterion("deal_date >=", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateLessThan(Date value) {
            addCriterion("deal_date <", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateLessThanOrEqualTo(Date value) {
            addCriterion("deal_date <=", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateIn(List<Date> values) {
            addCriterion("deal_date in", values, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateNotIn(List<Date> values) {
            addCriterion("deal_date not in", values, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateBetween(Date value1, Date value2) {
            addCriterion("deal_date between", value1, value2, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateNotBetween(Date value1, Date value2) {
            addCriterion("deal_date not between", value1, value2, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealResultIsNull() {
            addCriterion("deal_result is null");
            return (Criteria) this;
        }

        public Criteria andDealResultIsNotNull() {
            addCriterion("deal_result is not null");
            return (Criteria) this;
        }

        public Criteria andDealResultEqualTo(String value) {
            addCriterion("deal_result =", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultNotEqualTo(String value) {
            addCriterion("deal_result <>", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultGreaterThan(String value) {
            addCriterion("deal_result >", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultGreaterThanOrEqualTo(String value) {
            addCriterion("deal_result >=", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultLessThan(String value) {
            addCriterion("deal_result <", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultLessThanOrEqualTo(String value) {
            addCriterion("deal_result <=", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultLike(String value) {
            addCriterion("deal_result like", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultNotLike(String value) {
            addCriterion("deal_result not like", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultIn(List<String> values) {
            addCriterion("deal_result in", values, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultNotIn(List<String> values) {
            addCriterion("deal_result not in", values, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultBetween(String value1, String value2) {
            addCriterion("deal_result between", value1, value2, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultNotBetween(String value1, String value2) {
            addCriterion("deal_result not between", value1, value2, "dealResult");
            return (Criteria) this;
        }

        public Criteria andSatisfyIsNull() {
            addCriterion("satisfy is null");
            return (Criteria) this;
        }

        public Criteria andSatisfyIsNotNull() {
            addCriterion("satisfy is not null");
            return (Criteria) this;
        }

        public Criteria andSatisfyEqualTo(String value) {
            addCriterion("satisfy =", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyNotEqualTo(String value) {
            addCriterion("satisfy <>", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyGreaterThan(String value) {
            addCriterion("satisfy >", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyGreaterThanOrEqualTo(String value) {
            addCriterion("satisfy >=", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyLessThan(String value) {
            addCriterion("satisfy <", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyLessThanOrEqualTo(String value) {
            addCriterion("satisfy <=", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyLike(String value) {
            addCriterion("satisfy like", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyNotLike(String value) {
            addCriterion("satisfy not like", value, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyIn(List<String> values) {
            addCriterion("satisfy in", values, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyNotIn(List<String> values) {
            addCriterion("satisfy not in", values, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyBetween(String value1, String value2) {
            addCriterion("satisfy between", value1, value2, "satisfy");
            return (Criteria) this;
        }

        public Criteria andSatisfyNotBetween(String value1, String value2) {
            addCriterion("satisfy not between", value1, value2, "satisfy");
            return (Criteria) this;
        }

        public Criteria andServiceDealIsNull() {
            addCriterion("service_deal is null");
            return (Criteria) this;
        }

        public Criteria andServiceDealIsNotNull() {
            addCriterion("service_deal is not null");
            return (Criteria) this;
        }

        public Criteria andServiceDealEqualTo(String value) {
            addCriterion("service_deal =", value, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealNotEqualTo(String value) {
            addCriterion("service_deal <>", value, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealGreaterThan(String value) {
            addCriterion("service_deal >", value, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealGreaterThanOrEqualTo(String value) {
            addCriterion("service_deal >=", value, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealLessThan(String value) {
            addCriterion("service_deal <", value, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealLessThanOrEqualTo(String value) {
            addCriterion("service_deal <=", value, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealLike(String value) {
            addCriterion("service_deal like", value, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealNotLike(String value) {
            addCriterion("service_deal not like", value, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealIn(List<String> values) {
            addCriterion("service_deal in", values, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealNotIn(List<String> values) {
            addCriterion("service_deal not in", values, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealBetween(String value1, String value2) {
            addCriterion("service_deal between", value1, value2, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceDealNotBetween(String value1, String value2) {
            addCriterion("service_deal not between", value1, value2, "serviceDeal");
            return (Criteria) this;
        }

        public Criteria andServiceRequestIsNull() {
            addCriterion("service_request is null");
            return (Criteria) this;
        }

        public Criteria andServiceRequestIsNotNull() {
            addCriterion("service_request is not null");
            return (Criteria) this;
        }

        public Criteria andServiceRequestEqualTo(String value) {
            addCriterion("service_request =", value, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestNotEqualTo(String value) {
            addCriterion("service_request <>", value, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestGreaterThan(String value) {
            addCriterion("service_request >", value, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestGreaterThanOrEqualTo(String value) {
            addCriterion("service_request >=", value, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestLessThan(String value) {
            addCriterion("service_request <", value, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestLessThanOrEqualTo(String value) {
            addCriterion("service_request <=", value, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestLike(String value) {
            addCriterion("service_request like", value, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestNotLike(String value) {
            addCriterion("service_request not like", value, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestIn(List<String> values) {
            addCriterion("service_request in", values, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestNotIn(List<String> values) {
            addCriterion("service_request not in", values, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestBetween(String value1, String value2) {
            addCriterion("service_request between", value1, value2, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceRequestNotBetween(String value1, String value2) {
            addCriterion("service_request not between", value1, value2, "serviceRequest");
            return (Criteria) this;
        }

        public Criteria andServiceStateIsNull() {
            addCriterion("service_state is null");
            return (Criteria) this;
        }

        public Criteria andServiceStateIsNotNull() {
            addCriterion("service_state is not null");
            return (Criteria) this;
        }

        public Criteria andServiceStateEqualTo(String value) {
            addCriterion("service_state =", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateNotEqualTo(String value) {
            addCriterion("service_state <>", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateGreaterThan(String value) {
            addCriterion("service_state >", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateGreaterThanOrEqualTo(String value) {
            addCriterion("service_state >=", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateLessThan(String value) {
            addCriterion("service_state <", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateLessThanOrEqualTo(String value) {
            addCriterion("service_state <=", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateLike(String value) {
            addCriterion("service_state like", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateNotLike(String value) {
            addCriterion("service_state not like", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateIn(List<String> values) {
            addCriterion("service_state in", values, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateNotIn(List<String> values) {
            addCriterion("service_state not in", values, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateBetween(String value1, String value2) {
            addCriterion("service_state between", value1, value2, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateNotBetween(String value1, String value2) {
            addCriterion("service_state not between", value1, value2, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceTitleIsNull() {
            addCriterion("service_title is null");
            return (Criteria) this;
        }

        public Criteria andServiceTitleIsNotNull() {
            addCriterion("service_title is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTitleEqualTo(String value) {
            addCriterion("service_title =", value, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleNotEqualTo(String value) {
            addCriterion("service_title <>", value, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleGreaterThan(String value) {
            addCriterion("service_title >", value, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleGreaterThanOrEqualTo(String value) {
            addCriterion("service_title >=", value, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleLessThan(String value) {
            addCriterion("service_title <", value, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleLessThanOrEqualTo(String value) {
            addCriterion("service_title <=", value, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleLike(String value) {
            addCriterion("service_title like", value, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleNotLike(String value) {
            addCriterion("service_title not like", value, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleIn(List<String> values) {
            addCriterion("service_title in", values, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleNotIn(List<String> values) {
            addCriterion("service_title not in", values, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleBetween(String value1, String value2) {
            addCriterion("service_title between", value1, value2, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTitleNotBetween(String value1, String value2) {
            addCriterion("service_title not between", value1, value2, "serviceTitle");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNull() {
            addCriterion("service_type is null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNotNull() {
            addCriterion("service_type is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeEqualTo(String value) {
            addCriterion("service_type =", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotEqualTo(String value) {
            addCriterion("service_type <>", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThan(String value) {
            addCriterion("service_type >", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("service_type >=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThan(String value) {
            addCriterion("service_type <", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThanOrEqualTo(String value) {
            addCriterion("service_type <=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLike(String value) {
            addCriterion("service_type like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotLike(String value) {
            addCriterion("service_type not like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIn(List<String> values) {
            addCriterion("service_type in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotIn(List<String> values) {
            addCriterion("service_type not in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeBetween(String value1, String value2) {
            addCriterion("service_type between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotBetween(String value1, String value2) {
            addCriterion("service_type not between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andAllotIdIsNull() {
            addCriterion("allot_id is null");
            return (Criteria) this;
        }

        public Criteria andAllotIdIsNotNull() {
            addCriterion("allot_id is not null");
            return (Criteria) this;
        }

        public Criteria andAllotIdEqualTo(Float value) {
            addCriterion("allot_id =", value, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdNotEqualTo(Float value) {
            addCriterion("allot_id <>", value, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdGreaterThan(Float value) {
            addCriterion("allot_id >", value, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdGreaterThanOrEqualTo(Float value) {
            addCriterion("allot_id >=", value, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdLessThan(Float value) {
            addCriterion("allot_id <", value, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdLessThanOrEqualTo(Float value) {
            addCriterion("allot_id <=", value, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdIn(List<Float> values) {
            addCriterion("allot_id in", values, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdNotIn(List<Float> values) {
            addCriterion("allot_id not in", values, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdBetween(Float value1, Float value2) {
            addCriterion("allot_id between", value1, value2, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdNotBetween(Float value1, Float value2) {
            addCriterion("allot_id not between", value1, value2, "allotId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdIsNull() {
            addCriterion("created_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIdIsNotNull() {
            addCriterion("created_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedIdEqualTo(Float value) {
            addCriterion("created_id =", value, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdNotEqualTo(Float value) {
            addCriterion("created_id <>", value, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdGreaterThan(Float value) {
            addCriterion("created_id >", value, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdGreaterThanOrEqualTo(Float value) {
            addCriterion("created_id >=", value, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdLessThan(Float value) {
            addCriterion("created_id <", value, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdLessThanOrEqualTo(Float value) {
            addCriterion("created_id <=", value, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdIn(List<Float> values) {
            addCriterion("created_id in", values, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdNotIn(List<Float> values) {
            addCriterion("created_id not in", values, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdBetween(Float value1, Float value2) {
            addCriterion("created_id between", value1, value2, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdNotBetween(Float value1, Float value2) {
            addCriterion("created_id not between", value1, value2, "createdId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Float value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Float value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Float value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Float value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Float value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Float value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Float> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Float> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Float value1, Float value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Float value1, Float value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
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