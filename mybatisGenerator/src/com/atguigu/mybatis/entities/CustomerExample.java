package com.atguigu.mybatis.entities;

import java.util.ArrayList;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("bank is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("bank is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("bank like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("bank not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("bank not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("bank_account is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("bank_account =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("bank_account <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("bank_account >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("bank_account <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("bank_account <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("bank_account like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("bank_account not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("bank_account in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("bank_account not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("bank_account between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("bank_account not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankrollIsNull() {
            addCriterion("bankroll is null");
            return (Criteria) this;
        }

        public Criteria andBankrollIsNotNull() {
            addCriterion("bankroll is not null");
            return (Criteria) this;
        }

        public Criteria andBankrollEqualTo(Float value) {
            addCriterion("bankroll =", value, "bankroll");
            return (Criteria) this;
        }

        public Criteria andBankrollNotEqualTo(Float value) {
            addCriterion("bankroll <>", value, "bankroll");
            return (Criteria) this;
        }

        public Criteria andBankrollGreaterThan(Float value) {
            addCriterion("bankroll >", value, "bankroll");
            return (Criteria) this;
        }

        public Criteria andBankrollGreaterThanOrEqualTo(Float value) {
            addCriterion("bankroll >=", value, "bankroll");
            return (Criteria) this;
        }

        public Criteria andBankrollLessThan(Float value) {
            addCriterion("bankroll <", value, "bankroll");
            return (Criteria) this;
        }

        public Criteria andBankrollLessThanOrEqualTo(Float value) {
            addCriterion("bankroll <=", value, "bankroll");
            return (Criteria) this;
        }

        public Criteria andBankrollIn(List<Float> values) {
            addCriterion("bankroll in", values, "bankroll");
            return (Criteria) this;
        }

        public Criteria andBankrollNotIn(List<Float> values) {
            addCriterion("bankroll not in", values, "bankroll");
            return (Criteria) this;
        }

        public Criteria andBankrollBetween(Float value1, Float value2) {
            addCriterion("bankroll between", value1, value2, "bankroll");
            return (Criteria) this;
        }

        public Criteria andBankrollNotBetween(Float value1, Float value2) {
            addCriterion("bankroll not between", value1, value2, "bankroll");
            return (Criteria) this;
        }

        public Criteria andChiefIsNull() {
            addCriterion("chief is null");
            return (Criteria) this;
        }

        public Criteria andChiefIsNotNull() {
            addCriterion("chief is not null");
            return (Criteria) this;
        }

        public Criteria andChiefEqualTo(String value) {
            addCriterion("chief =", value, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefNotEqualTo(String value) {
            addCriterion("chief <>", value, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefGreaterThan(String value) {
            addCriterion("chief >", value, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefGreaterThanOrEqualTo(String value) {
            addCriterion("chief >=", value, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefLessThan(String value) {
            addCriterion("chief <", value, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefLessThanOrEqualTo(String value) {
            addCriterion("chief <=", value, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefLike(String value) {
            addCriterion("chief like", value, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefNotLike(String value) {
            addCriterion("chief not like", value, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefIn(List<String> values) {
            addCriterion("chief in", values, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefNotIn(List<String> values) {
            addCriterion("chief not in", values, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefBetween(String value1, String value2) {
            addCriterion("chief between", value1, value2, "chief");
            return (Criteria) this;
        }

        public Criteria andChiefNotBetween(String value1, String value2) {
            addCriterion("chief not between", value1, value2, "chief");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(String value) {
            addCriterion("credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(String value) {
            addCriterion("credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(String value) {
            addCriterion("credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(String value) {
            addCriterion("credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(String value) {
            addCriterion("credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(String value) {
            addCriterion("credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLike(String value) {
            addCriterion("credit like", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotLike(String value) {
            addCriterion("credit not like", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<String> values) {
            addCriterion("credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<String> values) {
            addCriterion("credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(String value1, String value2) {
            addCriterion("credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(String value1, String value2) {
            addCriterion("credit not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andLicenceNoIsNull() {
            addCriterion("licence_no is null");
            return (Criteria) this;
        }

        public Criteria andLicenceNoIsNotNull() {
            addCriterion("licence_no is not null");
            return (Criteria) this;
        }

        public Criteria andLicenceNoEqualTo(String value) {
            addCriterion("licence_no =", value, "licenceNo");
            return (Criteria) this;
        }

        public Criteria andLicenceNoNotEqualTo(String value) {
            addCriterion("licence_no <>", value, "licenceNo");
            return (Criteria) this;
        }

        public Criteria andLicenceNoGreaterThan(String value) {
            addCriterion("licence_no >", value, "licenceNo");
            return (Criteria) this;
        }

        public Criteria andLicenceNoGreaterThanOrEqualTo(String value) {
            addCriterion("licence_no >=", value, "licenceNo");
            return (Criteria) this;
        }

        public Criteria andLicenceNoLessThan(String value) {
            addCriterion("licence_no <", value, "licenceNo");
            return (Criteria) this;
        }

        public Criteria andLicenceNoLessThanOrEqualTo(String value) {
            addCriterion("licence_no <=", value, "licenceNo");
            return (Criteria) this;
        }

        public Criteria andLicenceNoLike(String value) {
            addCriterion("licence_no like", value, "licenceNo");
            return (Criteria) this;
        }

        public Criteria andLicenceNoNotLike(String value) {
            addCriterion("licence_no not like", value, "licenceNo");
            return (Criteria) this;
        }

        public Criteria andLicenceNoIn(List<String> values) {
            addCriterion("licence_no in", values, "licenceNo");
            return (Criteria) this;
        }

        public Criteria andLicenceNoNotIn(List<String> values) {
            addCriterion("licence_no not in", values, "licenceNo");
            return (Criteria) this;
        }

        public Criteria andLicenceNoBetween(String value1, String value2) {
            addCriterion("licence_no between", value1, value2, "licenceNo");
            return (Criteria) this;
        }

        public Criteria andLicenceNoNotBetween(String value1, String value2) {
            addCriterion("licence_no not between", value1, value2, "licenceNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoIsNull() {
            addCriterion("local_tax_no is null");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoIsNotNull() {
            addCriterion("local_tax_no is not null");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoEqualTo(String value) {
            addCriterion("local_tax_no =", value, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoNotEqualTo(String value) {
            addCriterion("local_tax_no <>", value, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoGreaterThan(String value) {
            addCriterion("local_tax_no >", value, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoGreaterThanOrEqualTo(String value) {
            addCriterion("local_tax_no >=", value, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoLessThan(String value) {
            addCriterion("local_tax_no <", value, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoLessThanOrEqualTo(String value) {
            addCriterion("local_tax_no <=", value, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoLike(String value) {
            addCriterion("local_tax_no like", value, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoNotLike(String value) {
            addCriterion("local_tax_no not like", value, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoIn(List<String> values) {
            addCriterion("local_tax_no in", values, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoNotIn(List<String> values) {
            addCriterion("local_tax_no not in", values, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoBetween(String value1, String value2) {
            addCriterion("local_tax_no between", value1, value2, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andLocalTaxNoNotBetween(String value1, String value2) {
            addCriterion("local_tax_no not between", value1, value2, "localTaxNo");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoIsNull() {
            addCriterion("national_tax_no is null");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoIsNotNull() {
            addCriterion("national_tax_no is not null");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoEqualTo(String value) {
            addCriterion("national_tax_no =", value, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoNotEqualTo(String value) {
            addCriterion("national_tax_no <>", value, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoGreaterThan(String value) {
            addCriterion("national_tax_no >", value, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoGreaterThanOrEqualTo(String value) {
            addCriterion("national_tax_no >=", value, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoLessThan(String value) {
            addCriterion("national_tax_no <", value, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoLessThanOrEqualTo(String value) {
            addCriterion("national_tax_no <=", value, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoLike(String value) {
            addCriterion("national_tax_no like", value, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoNotLike(String value) {
            addCriterion("national_tax_no not like", value, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoIn(List<String> values) {
            addCriterion("national_tax_no in", values, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoNotIn(List<String> values) {
            addCriterion("national_tax_no not in", values, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoBetween(String value1, String value2) {
            addCriterion("national_tax_no between", value1, value2, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoNotBetween(String value1, String value2) {
            addCriterion("national_tax_no not between", value1, value2, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNoIsNull() {
            addCriterion("no is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("no is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(String value) {
            addCriterion("no =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(String value) {
            addCriterion("no <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(String value) {
            addCriterion("no >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(String value) {
            addCriterion("no >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(String value) {
            addCriterion("no <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(String value) {
            addCriterion("no <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLike(String value) {
            addCriterion("no like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotLike(String value) {
            addCriterion("no not like", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<String> values) {
            addCriterion("no in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<String> values) {
            addCriterion("no not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(String value1, String value2) {
            addCriterion("no between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(String value1, String value2) {
            addCriterion("no not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andSatifyIsNull() {
            addCriterion("satify is null");
            return (Criteria) this;
        }

        public Criteria andSatifyIsNotNull() {
            addCriterion("satify is not null");
            return (Criteria) this;
        }

        public Criteria andSatifyEqualTo(String value) {
            addCriterion("satify =", value, "satify");
            return (Criteria) this;
        }

        public Criteria andSatifyNotEqualTo(String value) {
            addCriterion("satify <>", value, "satify");
            return (Criteria) this;
        }

        public Criteria andSatifyGreaterThan(String value) {
            addCriterion("satify >", value, "satify");
            return (Criteria) this;
        }

        public Criteria andSatifyGreaterThanOrEqualTo(String value) {
            addCriterion("satify >=", value, "satify");
            return (Criteria) this;
        }

        public Criteria andSatifyLessThan(String value) {
            addCriterion("satify <", value, "satify");
            return (Criteria) this;
        }

        public Criteria andSatifyLessThanOrEqualTo(String value) {
            addCriterion("satify <=", value, "satify");
            return (Criteria) this;
        }

        public Criteria andSatifyLike(String value) {
            addCriterion("satify like", value, "satify");
            return (Criteria) this;
        }

        public Criteria andSatifyNotLike(String value) {
            addCriterion("satify not like", value, "satify");
            return (Criteria) this;
        }

        public Criteria andSatifyIn(List<String> values) {
            addCriterion("satify in", values, "satify");
            return (Criteria) this;
        }

        public Criteria andSatifyNotIn(List<String> values) {
            addCriterion("satify not in", values, "satify");
            return (Criteria) this;
        }

        public Criteria andSatifyBetween(String value1, String value2) {
            addCriterion("satify between", value1, value2, "satify");
            return (Criteria) this;
        }

        public Criteria andSatifyNotBetween(String value1, String value2) {
            addCriterion("satify not between", value1, value2, "satify");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTurnoverIsNull() {
            addCriterion("turnover is null");
            return (Criteria) this;
        }

        public Criteria andTurnoverIsNotNull() {
            addCriterion("turnover is not null");
            return (Criteria) this;
        }

        public Criteria andTurnoverEqualTo(Float value) {
            addCriterion("turnover =", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotEqualTo(Float value) {
            addCriterion("turnover <>", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverGreaterThan(Float value) {
            addCriterion("turnover >", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverGreaterThanOrEqualTo(Float value) {
            addCriterion("turnover >=", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverLessThan(Float value) {
            addCriterion("turnover <", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverLessThanOrEqualTo(Float value) {
            addCriterion("turnover <=", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverIn(List<Float> values) {
            addCriterion("turnover in", values, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotIn(List<Float> values) {
            addCriterion("turnover not in", values, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverBetween(Float value1, Float value2) {
            addCriterion("turnover between", value1, value2, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotBetween(Float value1, Float value2) {
            addCriterion("turnover not between", value1, value2, "turnover");
            return (Criteria) this;
        }

        public Criteria andWebsitIsNull() {
            addCriterion("websit is null");
            return (Criteria) this;
        }

        public Criteria andWebsitIsNotNull() {
            addCriterion("websit is not null");
            return (Criteria) this;
        }

        public Criteria andWebsitEqualTo(String value) {
            addCriterion("websit =", value, "websit");
            return (Criteria) this;
        }

        public Criteria andWebsitNotEqualTo(String value) {
            addCriterion("websit <>", value, "websit");
            return (Criteria) this;
        }

        public Criteria andWebsitGreaterThan(String value) {
            addCriterion("websit >", value, "websit");
            return (Criteria) this;
        }

        public Criteria andWebsitGreaterThanOrEqualTo(String value) {
            addCriterion("websit >=", value, "websit");
            return (Criteria) this;
        }

        public Criteria andWebsitLessThan(String value) {
            addCriterion("websit <", value, "websit");
            return (Criteria) this;
        }

        public Criteria andWebsitLessThanOrEqualTo(String value) {
            addCriterion("websit <=", value, "websit");
            return (Criteria) this;
        }

        public Criteria andWebsitLike(String value) {
            addCriterion("websit like", value, "websit");
            return (Criteria) this;
        }

        public Criteria andWebsitNotLike(String value) {
            addCriterion("websit not like", value, "websit");
            return (Criteria) this;
        }

        public Criteria andWebsitIn(List<String> values) {
            addCriterion("websit in", values, "websit");
            return (Criteria) this;
        }

        public Criteria andWebsitNotIn(List<String> values) {
            addCriterion("websit not in", values, "websit");
            return (Criteria) this;
        }

        public Criteria andWebsitBetween(String value1, String value2) {
            addCriterion("websit between", value1, value2, "websit");
            return (Criteria) this;
        }

        public Criteria andWebsitNotBetween(String value1, String value2) {
            addCriterion("websit not between", value1, value2, "websit");
            return (Criteria) this;
        }

        public Criteria andZipIsNull() {
            addCriterion("zip is null");
            return (Criteria) this;
        }

        public Criteria andZipIsNotNull() {
            addCriterion("zip is not null");
            return (Criteria) this;
        }

        public Criteria andZipEqualTo(String value) {
            addCriterion("zip =", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotEqualTo(String value) {
            addCriterion("zip <>", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipGreaterThan(String value) {
            addCriterion("zip >", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipGreaterThanOrEqualTo(String value) {
            addCriterion("zip >=", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLessThan(String value) {
            addCriterion("zip <", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLessThanOrEqualTo(String value) {
            addCriterion("zip <=", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLike(String value) {
            addCriterion("zip like", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotLike(String value) {
            addCriterion("zip not like", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipIn(List<String> values) {
            addCriterion("zip in", values, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotIn(List<String> values) {
            addCriterion("zip not in", values, "zip");
            return (Criteria) this;
        }

        public Criteria andZipBetween(String value1, String value2) {
            addCriterion("zip between", value1, value2, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotBetween(String value1, String value2) {
            addCriterion("zip not between", value1, value2, "zip");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNull() {
            addCriterion("manager_id is null");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNotNull() {
            addCriterion("manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andManagerIdEqualTo(Float value) {
            addCriterion("manager_id =", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotEqualTo(Float value) {
            addCriterion("manager_id <>", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThan(Float value) {
            addCriterion("manager_id >", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThanOrEqualTo(Float value) {
            addCriterion("manager_id >=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThan(Float value) {
            addCriterion("manager_id <", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThanOrEqualTo(Float value) {
            addCriterion("manager_id <=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIn(List<Float> values) {
            addCriterion("manager_id in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotIn(List<Float> values) {
            addCriterion("manager_id not in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdBetween(Float value1, Float value2) {
            addCriterion("manager_id between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotBetween(Float value1, Float value2) {
            addCriterion("manager_id not between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIsNull() {
            addCriterion("customer_level is null");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIsNotNull() {
            addCriterion("customer_level is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelEqualTo(String value) {
            addCriterion("customer_level =", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotEqualTo(String value) {
            addCriterion("customer_level <>", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelGreaterThan(String value) {
            addCriterion("customer_level >", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelGreaterThanOrEqualTo(String value) {
            addCriterion("customer_level >=", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelLessThan(String value) {
            addCriterion("customer_level <", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelLessThanOrEqualTo(String value) {
            addCriterion("customer_level <=", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelLike(String value) {
            addCriterion("customer_level like", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotLike(String value) {
            addCriterion("customer_level not like", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIn(List<String> values) {
            addCriterion("customer_level in", values, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotIn(List<String> values) {
            addCriterion("customer_level not in", values, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelBetween(String value1, String value2) {
            addCriterion("customer_level between", value1, value2, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotBetween(String value1, String value2) {
            addCriterion("customer_level not between", value1, value2, "customerLevel");
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