package com.resthome.pojo;

import java.util.ArrayList;
import java.util.List;

public class VisitCheckinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VisitCheckinExample() {
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

        public Criteria andVisitIdIsNull() {
            addCriterion("visit_id is null");
            return (Criteria) this;
        }

        public Criteria andVisitIdIsNotNull() {
            addCriterion("visit_id is not null");
            return (Criteria) this;
        }

        public Criteria andVisitIdEqualTo(Long value) {
            addCriterion("visit_id =", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdNotEqualTo(Long value) {
            addCriterion("visit_id <>", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdGreaterThan(Long value) {
            addCriterion("visit_id >", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdGreaterThanOrEqualTo(Long value) {
            addCriterion("visit_id >=", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdLessThan(Long value) {
            addCriterion("visit_id <", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdLessThanOrEqualTo(Long value) {
            addCriterion("visit_id <=", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdIn(List<Long> values) {
            addCriterion("visit_id in", values, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdNotIn(List<Long> values) {
            addCriterion("visit_id not in", values, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdBetween(Long value1, Long value2) {
            addCriterion("visit_id between", value1, value2, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdNotBetween(Long value1, Long value2) {
            addCriterion("visit_id not between", value1, value2, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitNameIsNull() {
            addCriterion("visit_name is null");
            return (Criteria) this;
        }

        public Criteria andVisitNameIsNotNull() {
            addCriterion("visit_name is not null");
            return (Criteria) this;
        }

        public Criteria andVisitNameEqualTo(String value) {
            addCriterion("visit_name =", value, "visitName");
            return (Criteria) this;
        }

        public Criteria andVisitNameNotEqualTo(String value) {
            addCriterion("visit_name <>", value, "visitName");
            return (Criteria) this;
        }

        public Criteria andVisitNameGreaterThan(String value) {
            addCriterion("visit_name >", value, "visitName");
            return (Criteria) this;
        }

        public Criteria andVisitNameGreaterThanOrEqualTo(String value) {
            addCriterion("visit_name >=", value, "visitName");
            return (Criteria) this;
        }

        public Criteria andVisitNameLessThan(String value) {
            addCriterion("visit_name <", value, "visitName");
            return (Criteria) this;
        }

        public Criteria andVisitNameLessThanOrEqualTo(String value) {
            addCriterion("visit_name <=", value, "visitName");
            return (Criteria) this;
        }

        public Criteria andVisitNameLike(String value) {
            addCriterion("visit_name like", value, "visitName");
            return (Criteria) this;
        }

        public Criteria andVisitNameNotLike(String value) {
            addCriterion("visit_name not like", value, "visitName");
            return (Criteria) this;
        }

        public Criteria andVisitNameIn(List<String> values) {
            addCriterion("visit_name in", values, "visitName");
            return (Criteria) this;
        }

        public Criteria andVisitNameNotIn(List<String> values) {
            addCriterion("visit_name not in", values, "visitName");
            return (Criteria) this;
        }

        public Criteria andVisitNameBetween(String value1, String value2) {
            addCriterion("visit_name between", value1, value2, "visitName");
            return (Criteria) this;
        }

        public Criteria andVisitNameNotBetween(String value1, String value2) {
            addCriterion("visit_name not between", value1, value2, "visitName");
            return (Criteria) this;
        }

        public Criteria andVisitDatetimeIsNull() {
            addCriterion("visit_datetime is null");
            return (Criteria) this;
        }

        public Criteria andVisitDatetimeIsNotNull() {
            addCriterion("visit_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andVisitDatetimeEqualTo(String value) {
            addCriterion("visit_datetime =", value, "visitDatetime");
            return (Criteria) this;
        }

        public Criteria andVisitDatetimeNotEqualTo(String value) {
            addCriterion("visit_datetime <>", value, "visitDatetime");
            return (Criteria) this;
        }

        public Criteria andVisitDatetimeGreaterThan(String value) {
            addCriterion("visit_datetime >", value, "visitDatetime");
            return (Criteria) this;
        }

        public Criteria andVisitDatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("visit_datetime >=", value, "visitDatetime");
            return (Criteria) this;
        }

        public Criteria andVisitDatetimeLessThan(String value) {
            addCriterion("visit_datetime <", value, "visitDatetime");
            return (Criteria) this;
        }

        public Criteria andVisitDatetimeLessThanOrEqualTo(String value) {
            addCriterion("visit_datetime <=", value, "visitDatetime");
            return (Criteria) this;
        }

        public Criteria andVisitDatetimeLike(String value) {
            addCriterion("visit_datetime like", value, "visitDatetime");
            return (Criteria) this;
        }

        public Criteria andVisitDatetimeNotLike(String value) {
            addCriterion("visit_datetime not like", value, "visitDatetime");
            return (Criteria) this;
        }

        public Criteria andVisitDatetimeIn(List<String> values) {
            addCriterion("visit_datetime in", values, "visitDatetime");
            return (Criteria) this;
        }

        public Criteria andVisitDatetimeNotIn(List<String> values) {
            addCriterion("visit_datetime not in", values, "visitDatetime");
            return (Criteria) this;
        }

        public Criteria andVisitDatetimeBetween(String value1, String value2) {
            addCriterion("visit_datetime between", value1, value2, "visitDatetime");
            return (Criteria) this;
        }

        public Criteria andVisitDatetimeNotBetween(String value1, String value2) {
            addCriterion("visit_datetime not between", value1, value2, "visitDatetime");
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

        public Criteria andVisitLeavetimeIsNull() {
            addCriterion("visit_leavetime is null");
            return (Criteria) this;
        }

        public Criteria andVisitLeavetimeIsNotNull() {
            addCriterion("visit_leavetime is not null");
            return (Criteria) this;
        }

        public Criteria andVisitLeavetimeEqualTo(String value) {
            addCriterion("visit_leavetime =", value, "visitLeavetime");
            return (Criteria) this;
        }

        public Criteria andVisitLeavetimeNotEqualTo(String value) {
            addCriterion("visit_leavetime <>", value, "visitLeavetime");
            return (Criteria) this;
        }

        public Criteria andVisitLeavetimeGreaterThan(String value) {
            addCriterion("visit_leavetime >", value, "visitLeavetime");
            return (Criteria) this;
        }

        public Criteria andVisitLeavetimeGreaterThanOrEqualTo(String value) {
            addCriterion("visit_leavetime >=", value, "visitLeavetime");
            return (Criteria) this;
        }

        public Criteria andVisitLeavetimeLessThan(String value) {
            addCriterion("visit_leavetime <", value, "visitLeavetime");
            return (Criteria) this;
        }

        public Criteria andVisitLeavetimeLessThanOrEqualTo(String value) {
            addCriterion("visit_leavetime <=", value, "visitLeavetime");
            return (Criteria) this;
        }

        public Criteria andVisitLeavetimeLike(String value) {
            addCriterion("visit_leavetime like", value, "visitLeavetime");
            return (Criteria) this;
        }

        public Criteria andVisitLeavetimeNotLike(String value) {
            addCriterion("visit_leavetime not like", value, "visitLeavetime");
            return (Criteria) this;
        }

        public Criteria andVisitLeavetimeIn(List<String> values) {
            addCriterion("visit_leavetime in", values, "visitLeavetime");
            return (Criteria) this;
        }

        public Criteria andVisitLeavetimeNotIn(List<String> values) {
            addCriterion("visit_leavetime not in", values, "visitLeavetime");
            return (Criteria) this;
        }

        public Criteria andVisitLeavetimeBetween(String value1, String value2) {
            addCriterion("visit_leavetime between", value1, value2, "visitLeavetime");
            return (Criteria) this;
        }

        public Criteria andVisitLeavetimeNotBetween(String value1, String value2) {
            addCriterion("visit_leavetime not between", value1, value2, "visitLeavetime");
            return (Criteria) this;
        }

        public Criteria andHandleNameIsNull() {
            addCriterion("handle_name is null");
            return (Criteria) this;
        }

        public Criteria andHandleNameIsNotNull() {
            addCriterion("handle_name is not null");
            return (Criteria) this;
        }

        public Criteria andHandleNameEqualTo(String value) {
            addCriterion("handle_name =", value, "handleName");
            return (Criteria) this;
        }

        public Criteria andHandleNameNotEqualTo(String value) {
            addCriterion("handle_name <>", value, "handleName");
            return (Criteria) this;
        }

        public Criteria andHandleNameGreaterThan(String value) {
            addCriterion("handle_name >", value, "handleName");
            return (Criteria) this;
        }

        public Criteria andHandleNameGreaterThanOrEqualTo(String value) {
            addCriterion("handle_name >=", value, "handleName");
            return (Criteria) this;
        }

        public Criteria andHandleNameLessThan(String value) {
            addCriterion("handle_name <", value, "handleName");
            return (Criteria) this;
        }

        public Criteria andHandleNameLessThanOrEqualTo(String value) {
            addCriterion("handle_name <=", value, "handleName");
            return (Criteria) this;
        }

        public Criteria andHandleNameLike(String value) {
            addCriterion("handle_name like", value, "handleName");
            return (Criteria) this;
        }

        public Criteria andHandleNameNotLike(String value) {
            addCriterion("handle_name not like", value, "handleName");
            return (Criteria) this;
        }

        public Criteria andHandleNameIn(List<String> values) {
            addCriterion("handle_name in", values, "handleName");
            return (Criteria) this;
        }

        public Criteria andHandleNameNotIn(List<String> values) {
            addCriterion("handle_name not in", values, "handleName");
            return (Criteria) this;
        }

        public Criteria andHandleNameBetween(String value1, String value2) {
            addCriterion("handle_name between", value1, value2, "handleName");
            return (Criteria) this;
        }

        public Criteria andHandleNameNotBetween(String value1, String value2) {
            addCriterion("handle_name not between", value1, value2, "handleName");
            return (Criteria) this;
        }

        public Criteria andHandleDateIsNull() {
            addCriterion("handle_date is null");
            return (Criteria) this;
        }

        public Criteria andHandleDateIsNotNull() {
            addCriterion("handle_date is not null");
            return (Criteria) this;
        }

        public Criteria andHandleDateEqualTo(String value) {
            addCriterion("handle_date =", value, "handleDate");
            return (Criteria) this;
        }

        public Criteria andHandleDateNotEqualTo(String value) {
            addCriterion("handle_date <>", value, "handleDate");
            return (Criteria) this;
        }

        public Criteria andHandleDateGreaterThan(String value) {
            addCriterion("handle_date >", value, "handleDate");
            return (Criteria) this;
        }

        public Criteria andHandleDateGreaterThanOrEqualTo(String value) {
            addCriterion("handle_date >=", value, "handleDate");
            return (Criteria) this;
        }

        public Criteria andHandleDateLessThan(String value) {
            addCriterion("handle_date <", value, "handleDate");
            return (Criteria) this;
        }

        public Criteria andHandleDateLessThanOrEqualTo(String value) {
            addCriterion("handle_date <=", value, "handleDate");
            return (Criteria) this;
        }

        public Criteria andHandleDateLike(String value) {
            addCriterion("handle_date like", value, "handleDate");
            return (Criteria) this;
        }

        public Criteria andHandleDateNotLike(String value) {
            addCriterion("handle_date not like", value, "handleDate");
            return (Criteria) this;
        }

        public Criteria andHandleDateIn(List<String> values) {
            addCriterion("handle_date in", values, "handleDate");
            return (Criteria) this;
        }

        public Criteria andHandleDateNotIn(List<String> values) {
            addCriterion("handle_date not in", values, "handleDate");
            return (Criteria) this;
        }

        public Criteria andHandleDateBetween(String value1, String value2) {
            addCriterion("handle_date between", value1, value2, "handleDate");
            return (Criteria) this;
        }

        public Criteria andHandleDateNotBetween(String value1, String value2) {
            addCriterion("handle_date not between", value1, value2, "handleDate");
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