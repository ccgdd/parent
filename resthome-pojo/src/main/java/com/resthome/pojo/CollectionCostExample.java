package com.resthome.pojo;

import java.util.ArrayList;
import java.util.List;

public class CollectionCostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectionCostExample() {
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

        public Criteria andCostIdIsNull() {
            addCriterion("cost_id is null");
            return (Criteria) this;
        }

        public Criteria andCostIdIsNotNull() {
            addCriterion("cost_id is not null");
            return (Criteria) this;
        }

        public Criteria andCostIdEqualTo(String value) {
            addCriterion("cost_id =", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotEqualTo(String value) {
            addCriterion("cost_id <>", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdGreaterThan(String value) {
            addCriterion("cost_id >", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdGreaterThanOrEqualTo(String value) {
            addCriterion("cost_id >=", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdLessThan(String value) {
            addCriterion("cost_id <", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdLessThanOrEqualTo(String value) {
            addCriterion("cost_id <=", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdLike(String value) {
            addCriterion("cost_id like", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotLike(String value) {
            addCriterion("cost_id not like", value, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdIn(List<String> values) {
            addCriterion("cost_id in", values, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotIn(List<String> values) {
            addCriterion("cost_id not in", values, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdBetween(String value1, String value2) {
            addCriterion("cost_id between", value1, value2, "costId");
            return (Criteria) this;
        }

        public Criteria andCostIdNotBetween(String value1, String value2) {
            addCriterion("cost_id not between", value1, value2, "costId");
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

        public Criteria andCollectionCostIsNull() {
            addCriterion("collection_cost is null");
            return (Criteria) this;
        }

        public Criteria andCollectionCostIsNotNull() {
            addCriterion("collection_cost is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionCostEqualTo(String value) {
            addCriterion("collection_cost =", value, "collectionCost");
            return (Criteria) this;
        }

        public Criteria andCollectionCostNotEqualTo(String value) {
            addCriterion("collection_cost <>", value, "collectionCost");
            return (Criteria) this;
        }

        public Criteria andCollectionCostGreaterThan(String value) {
            addCriterion("collection_cost >", value, "collectionCost");
            return (Criteria) this;
        }

        public Criteria andCollectionCostGreaterThanOrEqualTo(String value) {
            addCriterion("collection_cost >=", value, "collectionCost");
            return (Criteria) this;
        }

        public Criteria andCollectionCostLessThan(String value) {
            addCriterion("collection_cost <", value, "collectionCost");
            return (Criteria) this;
        }

        public Criteria andCollectionCostLessThanOrEqualTo(String value) {
            addCriterion("collection_cost <=", value, "collectionCost");
            return (Criteria) this;
        }

        public Criteria andCollectionCostLike(String value) {
            addCriterion("collection_cost like", value, "collectionCost");
            return (Criteria) this;
        }

        public Criteria andCollectionCostNotLike(String value) {
            addCriterion("collection_cost not like", value, "collectionCost");
            return (Criteria) this;
        }

        public Criteria andCollectionCostIn(List<String> values) {
            addCriterion("collection_cost in", values, "collectionCost");
            return (Criteria) this;
        }

        public Criteria andCollectionCostNotIn(List<String> values) {
            addCriterion("collection_cost not in", values, "collectionCost");
            return (Criteria) this;
        }

        public Criteria andCollectionCostBetween(String value1, String value2) {
            addCriterion("collection_cost between", value1, value2, "collectionCost");
            return (Criteria) this;
        }

        public Criteria andCollectionCostNotBetween(String value1, String value2) {
            addCriterion("collection_cost not between", value1, value2, "collectionCost");
            return (Criteria) this;
        }

        public Criteria andCollectionDateIsNull() {
            addCriterion("collection_date is null");
            return (Criteria) this;
        }

        public Criteria andCollectionDateIsNotNull() {
            addCriterion("collection_date is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionDateEqualTo(String value) {
            addCriterion("collection_date =", value, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateNotEqualTo(String value) {
            addCriterion("collection_date <>", value, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateGreaterThan(String value) {
            addCriterion("collection_date >", value, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateGreaterThanOrEqualTo(String value) {
            addCriterion("collection_date >=", value, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateLessThan(String value) {
            addCriterion("collection_date <", value, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateLessThanOrEqualTo(String value) {
            addCriterion("collection_date <=", value, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateLike(String value) {
            addCriterion("collection_date like", value, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateNotLike(String value) {
            addCriterion("collection_date not like", value, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateIn(List<String> values) {
            addCriterion("collection_date in", values, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateNotIn(List<String> values) {
            addCriterion("collection_date not in", values, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateBetween(String value1, String value2) {
            addCriterion("collection_date between", value1, value2, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionDateNotBetween(String value1, String value2) {
            addCriterion("collection_date not between", value1, value2, "collectionDate");
            return (Criteria) this;
        }

        public Criteria andCollectionNameIsNull() {
            addCriterion("collection_name is null");
            return (Criteria) this;
        }

        public Criteria andCollectionNameIsNotNull() {
            addCriterion("collection_name is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionNameEqualTo(String value) {
            addCriterion("collection_name =", value, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameNotEqualTo(String value) {
            addCriterion("collection_name <>", value, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameGreaterThan(String value) {
            addCriterion("collection_name >", value, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameGreaterThanOrEqualTo(String value) {
            addCriterion("collection_name >=", value, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameLessThan(String value) {
            addCriterion("collection_name <", value, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameLessThanOrEqualTo(String value) {
            addCriterion("collection_name <=", value, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameLike(String value) {
            addCriterion("collection_name like", value, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameNotLike(String value) {
            addCriterion("collection_name not like", value, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameIn(List<String> values) {
            addCriterion("collection_name in", values, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameNotIn(List<String> values) {
            addCriterion("collection_name not in", values, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameBetween(String value1, String value2) {
            addCriterion("collection_name between", value1, value2, "collectionName");
            return (Criteria) this;
        }

        public Criteria andCollectionNameNotBetween(String value1, String value2) {
            addCriterion("collection_name not between", value1, value2, "collectionName");
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