package com.resthome.pojo;

import java.util.ArrayList;
import java.util.List;

public class CostTuoguanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CostTuoguanExample() {
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

        public Criteria andTuoguanIdIsNull() {
            addCriterion("tuoguan_id is null");
            return (Criteria) this;
        }

        public Criteria andTuoguanIdIsNotNull() {
            addCriterion("tuoguan_id is not null");
            return (Criteria) this;
        }

        public Criteria andTuoguanIdEqualTo(Integer value) {
            addCriterion("tuoguan_id =", value, "tuoguanId");
            return (Criteria) this;
        }

        public Criteria andTuoguanIdNotEqualTo(Integer value) {
            addCriterion("tuoguan_id <>", value, "tuoguanId");
            return (Criteria) this;
        }

        public Criteria andTuoguanIdGreaterThan(Integer value) {
            addCriterion("tuoguan_id >", value, "tuoguanId");
            return (Criteria) this;
        }

        public Criteria andTuoguanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tuoguan_id >=", value, "tuoguanId");
            return (Criteria) this;
        }

        public Criteria andTuoguanIdLessThan(Integer value) {
            addCriterion("tuoguan_id <", value, "tuoguanId");
            return (Criteria) this;
        }

        public Criteria andTuoguanIdLessThanOrEqualTo(Integer value) {
            addCriterion("tuoguan_id <=", value, "tuoguanId");
            return (Criteria) this;
        }

        public Criteria andTuoguanIdIn(List<Integer> values) {
            addCriterion("tuoguan_id in", values, "tuoguanId");
            return (Criteria) this;
        }

        public Criteria andTuoguanIdNotIn(List<Integer> values) {
            addCriterion("tuoguan_id not in", values, "tuoguanId");
            return (Criteria) this;
        }

        public Criteria andTuoguanIdBetween(Integer value1, Integer value2) {
            addCriterion("tuoguan_id between", value1, value2, "tuoguanId");
            return (Criteria) this;
        }

        public Criteria andTuoguanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tuoguan_id not between", value1, value2, "tuoguanId");
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

        public Criteria andOldmanIdEqualTo(Integer value) {
            addCriterion("oldman_id =", value, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdNotEqualTo(Integer value) {
            addCriterion("oldman_id <>", value, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdGreaterThan(Integer value) {
            addCriterion("oldman_id >", value, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("oldman_id >=", value, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdLessThan(Integer value) {
            addCriterion("oldman_id <", value, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdLessThanOrEqualTo(Integer value) {
            addCriterion("oldman_id <=", value, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdIn(List<Integer> values) {
            addCriterion("oldman_id in", values, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdNotIn(List<Integer> values) {
            addCriterion("oldman_id not in", values, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdBetween(Integer value1, Integer value2) {
            addCriterion("oldman_id between", value1, value2, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andOldmanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("oldman_id not between", value1, value2, "oldmanId");
            return (Criteria) this;
        }

        public Criteria andCostBalanceIsNull() {
            addCriterion("cost_balance is null");
            return (Criteria) this;
        }

        public Criteria andCostBalanceIsNotNull() {
            addCriterion("cost_balance is not null");
            return (Criteria) this;
        }

        public Criteria andCostBalanceEqualTo(String value) {
            addCriterion("cost_balance =", value, "costBalance");
            return (Criteria) this;
        }

        public Criteria andCostBalanceNotEqualTo(String value) {
            addCriterion("cost_balance <>", value, "costBalance");
            return (Criteria) this;
        }

        public Criteria andCostBalanceGreaterThan(String value) {
            addCriterion("cost_balance >", value, "costBalance");
            return (Criteria) this;
        }

        public Criteria andCostBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("cost_balance >=", value, "costBalance");
            return (Criteria) this;
        }

        public Criteria andCostBalanceLessThan(String value) {
            addCriterion("cost_balance <", value, "costBalance");
            return (Criteria) this;
        }

        public Criteria andCostBalanceLessThanOrEqualTo(String value) {
            addCriterion("cost_balance <=", value, "costBalance");
            return (Criteria) this;
        }

        public Criteria andCostBalanceLike(String value) {
            addCriterion("cost_balance like", value, "costBalance");
            return (Criteria) this;
        }

        public Criteria andCostBalanceNotLike(String value) {
            addCriterion("cost_balance not like", value, "costBalance");
            return (Criteria) this;
        }

        public Criteria andCostBalanceIn(List<String> values) {
            addCriterion("cost_balance in", values, "costBalance");
            return (Criteria) this;
        }

        public Criteria andCostBalanceNotIn(List<String> values) {
            addCriterion("cost_balance not in", values, "costBalance");
            return (Criteria) this;
        }

        public Criteria andCostBalanceBetween(String value1, String value2) {
            addCriterion("cost_balance between", value1, value2, "costBalance");
            return (Criteria) this;
        }

        public Criteria andCostBalanceNotBetween(String value1, String value2) {
            addCriterion("cost_balance not between", value1, value2, "costBalance");
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