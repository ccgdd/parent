package com.resthome.pojo;

import java.util.ArrayList;
import java.util.List;

public class ChangeRoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChangeRoomExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOldmanNameIsNull() {
            addCriterion("oldman_name is null");
            return (Criteria) this;
        }

        public Criteria andOldmanNameIsNotNull() {
            addCriterion("oldman_name is not null");
            return (Criteria) this;
        }

        public Criteria andOldmanNameEqualTo(String value) {
            addCriterion("oldman_name =", value, "oldmanName");
            return (Criteria) this;
        }

        public Criteria andOldmanNameNotEqualTo(String value) {
            addCriterion("oldman_name <>", value, "oldmanName");
            return (Criteria) this;
        }

        public Criteria andOldmanNameGreaterThan(String value) {
            addCriterion("oldman_name >", value, "oldmanName");
            return (Criteria) this;
        }

        public Criteria andOldmanNameGreaterThanOrEqualTo(String value) {
            addCriterion("oldman_name >=", value, "oldmanName");
            return (Criteria) this;
        }

        public Criteria andOldmanNameLessThan(String value) {
            addCriterion("oldman_name <", value, "oldmanName");
            return (Criteria) this;
        }

        public Criteria andOldmanNameLessThanOrEqualTo(String value) {
            addCriterion("oldman_name <=", value, "oldmanName");
            return (Criteria) this;
        }

        public Criteria andOldmanNameLike(String value) {
            addCriterion("oldman_name like", value, "oldmanName");
            return (Criteria) this;
        }

        public Criteria andOldmanNameNotLike(String value) {
            addCriterion("oldman_name not like", value, "oldmanName");
            return (Criteria) this;
        }

        public Criteria andOldmanNameIn(List<String> values) {
            addCriterion("oldman_name in", values, "oldmanName");
            return (Criteria) this;
        }

        public Criteria andOldmanNameNotIn(List<String> values) {
            addCriterion("oldman_name not in", values, "oldmanName");
            return (Criteria) this;
        }

        public Criteria andOldmanNameBetween(String value1, String value2) {
            addCriterion("oldman_name between", value1, value2, "oldmanName");
            return (Criteria) this;
        }

        public Criteria andOldmanNameNotBetween(String value1, String value2) {
            addCriterion("oldman_name not between", value1, value2, "oldmanName");
            return (Criteria) this;
        }

        public Criteria andBedIdIsNull() {
            addCriterion("bed_id is null");
            return (Criteria) this;
        }

        public Criteria andBedIdIsNotNull() {
            addCriterion("bed_id is not null");
            return (Criteria) this;
        }

        public Criteria andBedIdEqualTo(Integer value) {
            addCriterion("bed_id =", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdNotEqualTo(Integer value) {
            addCriterion("bed_id <>", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdGreaterThan(Integer value) {
            addCriterion("bed_id >", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bed_id >=", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdLessThan(Integer value) {
            addCriterion("bed_id <", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdLessThanOrEqualTo(Integer value) {
            addCriterion("bed_id <=", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdIn(List<Integer> values) {
            addCriterion("bed_id in", values, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdNotIn(List<Integer> values) {
            addCriterion("bed_id not in", values, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdBetween(Integer value1, Integer value2) {
            addCriterion("bed_id between", value1, value2, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bed_id not between", value1, value2, "bedId");
            return (Criteria) this;
        }

        public Criteria andChangeBedIdIsNull() {
            addCriterion("change_bed_id is null");
            return (Criteria) this;
        }

        public Criteria andChangeBedIdIsNotNull() {
            addCriterion("change_bed_id is not null");
            return (Criteria) this;
        }

        public Criteria andChangeBedIdEqualTo(Integer value) {
            addCriterion("change_bed_id =", value, "changeBedId");
            return (Criteria) this;
        }

        public Criteria andChangeBedIdNotEqualTo(Integer value) {
            addCriterion("change_bed_id <>", value, "changeBedId");
            return (Criteria) this;
        }

        public Criteria andChangeBedIdGreaterThan(Integer value) {
            addCriterion("change_bed_id >", value, "changeBedId");
            return (Criteria) this;
        }

        public Criteria andChangeBedIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_bed_id >=", value, "changeBedId");
            return (Criteria) this;
        }

        public Criteria andChangeBedIdLessThan(Integer value) {
            addCriterion("change_bed_id <", value, "changeBedId");
            return (Criteria) this;
        }

        public Criteria andChangeBedIdLessThanOrEqualTo(Integer value) {
            addCriterion("change_bed_id <=", value, "changeBedId");
            return (Criteria) this;
        }

        public Criteria andChangeBedIdIn(List<Integer> values) {
            addCriterion("change_bed_id in", values, "changeBedId");
            return (Criteria) this;
        }

        public Criteria andChangeBedIdNotIn(List<Integer> values) {
            addCriterion("change_bed_id not in", values, "changeBedId");
            return (Criteria) this;
        }

        public Criteria andChangeBedIdBetween(Integer value1, Integer value2) {
            addCriterion("change_bed_id between", value1, value2, "changeBedId");
            return (Criteria) this;
        }

        public Criteria andChangeBedIdNotBetween(Integer value1, Integer value2) {
            addCriterion("change_bed_id not between", value1, value2, "changeBedId");
            return (Criteria) this;
        }

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andChangeDateIsNull() {
            addCriterion("change_date is null");
            return (Criteria) this;
        }

        public Criteria andChangeDateIsNotNull() {
            addCriterion("change_date is not null");
            return (Criteria) this;
        }

        public Criteria andChangeDateEqualTo(String value) {
            addCriterion("change_date =", value, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateNotEqualTo(String value) {
            addCriterion("change_date <>", value, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateGreaterThan(String value) {
            addCriterion("change_date >", value, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateGreaterThanOrEqualTo(String value) {
            addCriterion("change_date >=", value, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateLessThan(String value) {
            addCriterion("change_date <", value, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateLessThanOrEqualTo(String value) {
            addCriterion("change_date <=", value, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateLike(String value) {
            addCriterion("change_date like", value, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateNotLike(String value) {
            addCriterion("change_date not like", value, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateIn(List<String> values) {
            addCriterion("change_date in", values, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateNotIn(List<String> values) {
            addCriterion("change_date not in", values, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateBetween(String value1, String value2) {
            addCriterion("change_date between", value1, value2, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateNotBetween(String value1, String value2) {
            addCriterion("change_date not between", value1, value2, "changeDate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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