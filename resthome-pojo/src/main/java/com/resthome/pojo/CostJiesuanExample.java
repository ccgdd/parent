package com.resthome.pojo;

import java.util.ArrayList;
import java.util.List;

public class CostJiesuanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CostJiesuanExample() {
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

        public Criteria andCostJiesuanIdIsNull() {
            addCriterion("cost_jiesuan_id is null");
            return (Criteria) this;
        }

        public Criteria andCostJiesuanIdIsNotNull() {
            addCriterion("cost_jiesuan_id is not null");
            return (Criteria) this;
        }

        public Criteria andCostJiesuanIdEqualTo(String value) {
            addCriterion("cost_jiesuan_id =", value, "costJiesuanId");
            return (Criteria) this;
        }

        public Criteria andCostJiesuanIdNotEqualTo(String value) {
            addCriterion("cost_jiesuan_id <>", value, "costJiesuanId");
            return (Criteria) this;
        }

        public Criteria andCostJiesuanIdGreaterThan(String value) {
            addCriterion("cost_jiesuan_id >", value, "costJiesuanId");
            return (Criteria) this;
        }

        public Criteria andCostJiesuanIdGreaterThanOrEqualTo(String value) {
            addCriterion("cost_jiesuan_id >=", value, "costJiesuanId");
            return (Criteria) this;
        }

        public Criteria andCostJiesuanIdLessThan(String value) {
            addCriterion("cost_jiesuan_id <", value, "costJiesuanId");
            return (Criteria) this;
        }

        public Criteria andCostJiesuanIdLessThanOrEqualTo(String value) {
            addCriterion("cost_jiesuan_id <=", value, "costJiesuanId");
            return (Criteria) this;
        }

        public Criteria andCostJiesuanIdLike(String value) {
            addCriterion("cost_jiesuan_id like", value, "costJiesuanId");
            return (Criteria) this;
        }

        public Criteria andCostJiesuanIdNotLike(String value) {
            addCriterion("cost_jiesuan_id not like", value, "costJiesuanId");
            return (Criteria) this;
        }

        public Criteria andCostJiesuanIdIn(List<String> values) {
            addCriterion("cost_jiesuan_id in", values, "costJiesuanId");
            return (Criteria) this;
        }

        public Criteria andCostJiesuanIdNotIn(List<String> values) {
            addCriterion("cost_jiesuan_id not in", values, "costJiesuanId");
            return (Criteria) this;
        }

        public Criteria andCostJiesuanIdBetween(String value1, String value2) {
            addCriterion("cost_jiesuan_id between", value1, value2, "costJiesuanId");
            return (Criteria) this;
        }

        public Criteria andCostJiesuanIdNotBetween(String value1, String value2) {
            addCriterion("cost_jiesuan_id not between", value1, value2, "costJiesuanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdIsNull() {
            addCriterion("oldman_id is null");
            return (Criteria) this;
        }

        public Criteria andOldmanIdIsNotNull() {
            addCriterion("oldman_id is not null");
            return (Criteria) this;
        }

        public Criteria andOldmanIdEqualTo(String value) {
            addCriterion("oldman_id =", value, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdNotEqualTo(String value) {
            addCriterion("oldman_id <>", value, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdGreaterThan(String value) {
            addCriterion("oldman_id >", value, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdGreaterThanOrEqualTo(String value) {
            addCriterion("oldman_id >=", value, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdLessThan(String value) {
            addCriterion("oldman_id <", value, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdLessThanOrEqualTo(String value) {
            addCriterion("oldman_id <=", value, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdLike(String value) {
            addCriterion("oldman_id like", value, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdNotLike(String value) {
            addCriterion("oldman_id not like", value, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdIn(List<String> values) {
            addCriterion("oldman_id in", values, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdNotIn(List<String> values) {
            addCriterion("oldman_id not in", values, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdBetween(String value1, String value2) {
            addCriterion("oldman_id between", value1, value2, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdNotBetween(String value1, String value2) {
            addCriterion("oldman_id not between", value1, value2, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andJiesuanDateIsNull() {
            addCriterion("jiesuan_date is null");
            return (Criteria) this;
        }

        public Criteria andJiesuanDateIsNotNull() {
            addCriterion("jiesuan_date is not null");
            return (Criteria) this;
        }

        public Criteria andJiesuanDateEqualTo(String value) {
            addCriterion("jiesuan_date =", value, "jiesuanDate");
            return (Criteria) this;
        }

        public Criteria andJiesuanDateNotEqualTo(String value) {
            addCriterion("jiesuan_date <>", value, "jiesuanDate");
            return (Criteria) this;
        }

        public Criteria andJiesuanDateGreaterThan(String value) {
            addCriterion("jiesuan_date >", value, "jiesuanDate");
            return (Criteria) this;
        }

        public Criteria andJiesuanDateGreaterThanOrEqualTo(String value) {
            addCriterion("jiesuan_date >=", value, "jiesuanDate");
            return (Criteria) this;
        }

        public Criteria andJiesuanDateLessThan(String value) {
            addCriterion("jiesuan_date <", value, "jiesuanDate");
            return (Criteria) this;
        }

        public Criteria andJiesuanDateLessThanOrEqualTo(String value) {
            addCriterion("jiesuan_date <=", value, "jiesuanDate");
            return (Criteria) this;
        }

        public Criteria andJiesuanDateLike(String value) {
            addCriterion("jiesuan_date like", value, "jiesuanDate");
            return (Criteria) this;
        }

        public Criteria andJiesuanDateNotLike(String value) {
            addCriterion("jiesuan_date not like", value, "jiesuanDate");
            return (Criteria) this;
        }

        public Criteria andJiesuanDateIn(List<String> values) {
            addCriterion("jiesuan_date in", values, "jiesuanDate");
            return (Criteria) this;
        }

        public Criteria andJiesuanDateNotIn(List<String> values) {
            addCriterion("jiesuan_date not in", values, "jiesuanDate");
            return (Criteria) this;
        }

        public Criteria andJiesuanDateBetween(String value1, String value2) {
            addCriterion("jiesuan_date between", value1, value2, "jiesuanDate");
            return (Criteria) this;
        }

        public Criteria andJiesuanDateNotBetween(String value1, String value2) {
            addCriterion("jiesuan_date not between", value1, value2, "jiesuanDate");
            return (Criteria) this;
        }

        public Criteria andJiesuanStatusIsNull() {
            addCriterion("jiesuan_status is null");
            return (Criteria) this;
        }

        public Criteria andJiesuanStatusIsNotNull() {
            addCriterion("jiesuan_status is not null");
            return (Criteria) this;
        }

        public Criteria andJiesuanStatusEqualTo(String value) {
            addCriterion("jiesuan_status =", value, "jiesuanStatus");
            return (Criteria) this;
        }

        public Criteria andJiesuanStatusNotEqualTo(String value) {
            addCriterion("jiesuan_status <>", value, "jiesuanStatus");
            return (Criteria) this;
        }

        public Criteria andJiesuanStatusGreaterThan(String value) {
            addCriterion("jiesuan_status >", value, "jiesuanStatus");
            return (Criteria) this;
        }

        public Criteria andJiesuanStatusGreaterThanOrEqualTo(String value) {
            addCriterion("jiesuan_status >=", value, "jiesuanStatus");
            return (Criteria) this;
        }

        public Criteria andJiesuanStatusLessThan(String value) {
            addCriterion("jiesuan_status <", value, "jiesuanStatus");
            return (Criteria) this;
        }

        public Criteria andJiesuanStatusLessThanOrEqualTo(String value) {
            addCriterion("jiesuan_status <=", value, "jiesuanStatus");
            return (Criteria) this;
        }

        public Criteria andJiesuanStatusLike(String value) {
            addCriterion("jiesuan_status like", value, "jiesuanStatus");
            return (Criteria) this;
        }

        public Criteria andJiesuanStatusNotLike(String value) {
            addCriterion("jiesuan_status not like", value, "jiesuanStatus");
            return (Criteria) this;
        }

        public Criteria andJiesuanStatusIn(List<String> values) {
            addCriterion("jiesuan_status in", values, "jiesuanStatus");
            return (Criteria) this;
        }

        public Criteria andJiesuanStatusNotIn(List<String> values) {
            addCriterion("jiesuan_status not in", values, "jiesuanStatus");
            return (Criteria) this;
        }

        public Criteria andJiesuanStatusBetween(String value1, String value2) {
            addCriterion("jiesuan_status between", value1, value2, "jiesuanStatus");
            return (Criteria) this;
        }

        public Criteria andJiesuanStatusNotBetween(String value1, String value2) {
            addCriterion("jiesuan_status not between", value1, value2, "jiesuanStatus");
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