package com.resthome.pojo;

import java.util.ArrayList;
import java.util.List;

public class ReceptCheckinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReceptCheckinExample() {
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

        public Criteria andReceptCheckinIdIsNull() {
            addCriterion("recept_checkin_id is null");
            return (Criteria) this;
        }

        public Criteria andReceptCheckinIdIsNotNull() {
            addCriterion("recept_checkin_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceptCheckinIdEqualTo(Long value) {
            addCriterion("recept_checkin_id =", value, "receptCheckinId");
            return (Criteria) this;
        }

        public Criteria andReceptCheckinIdNotEqualTo(Long value) {
            addCriterion("recept_checkin_id <>", value, "receptCheckinId");
            return (Criteria) this;
        }

        public Criteria andReceptCheckinIdGreaterThan(Long value) {
            addCriterion("recept_checkin_id >", value, "receptCheckinId");
            return (Criteria) this;
        }

        public Criteria andReceptCheckinIdGreaterThanOrEqualTo(Long value) {
            addCriterion("recept_checkin_id >=", value, "receptCheckinId");
            return (Criteria) this;
        }

        public Criteria andReceptCheckinIdLessThan(Long value) {
            addCriterion("recept_checkin_id <", value, "receptCheckinId");
            return (Criteria) this;
        }

        public Criteria andReceptCheckinIdLessThanOrEqualTo(Long value) {
            addCriterion("recept_checkin_id <=", value, "receptCheckinId");
            return (Criteria) this;
        }

        public Criteria andReceptCheckinIdIn(List<Long> values) {
            addCriterion("recept_checkin_id in", values, "receptCheckinId");
            return (Criteria) this;
        }

        public Criteria andReceptCheckinIdNotIn(List<Long> values) {
            addCriterion("recept_checkin_id not in", values, "receptCheckinId");
            return (Criteria) this;
        }

        public Criteria andReceptCheckinIdBetween(Long value1, Long value2) {
            addCriterion("recept_checkin_id between", value1, value2, "receptCheckinId");
            return (Criteria) this;
        }

        public Criteria andReceptCheckinIdNotBetween(Long value1, Long value2) {
            addCriterion("recept_checkin_id not between", value1, value2, "receptCheckinId");
            return (Criteria) this;
        }

        public Criteria andReceptedNameIsNull() {
            addCriterion("recepted_name is null");
            return (Criteria) this;
        }

        public Criteria andReceptedNameIsNotNull() {
            addCriterion("recepted_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceptedNameEqualTo(String value) {
            addCriterion("recepted_name =", value, "receptedName");
            return (Criteria) this;
        }

        public Criteria andReceptedNameNotEqualTo(String value) {
            addCriterion("recepted_name <>", value, "receptedName");
            return (Criteria) this;
        }

        public Criteria andReceptedNameGreaterThan(String value) {
            addCriterion("recepted_name >", value, "receptedName");
            return (Criteria) this;
        }

        public Criteria andReceptedNameGreaterThanOrEqualTo(String value) {
            addCriterion("recepted_name >=", value, "receptedName");
            return (Criteria) this;
        }

        public Criteria andReceptedNameLessThan(String value) {
            addCriterion("recepted_name <", value, "receptedName");
            return (Criteria) this;
        }

        public Criteria andReceptedNameLessThanOrEqualTo(String value) {
            addCriterion("recepted_name <=", value, "receptedName");
            return (Criteria) this;
        }

        public Criteria andReceptedNameLike(String value) {
            addCriterion("recepted_name like", value, "receptedName");
            return (Criteria) this;
        }

        public Criteria andReceptedNameNotLike(String value) {
            addCriterion("recepted_name not like", value, "receptedName");
            return (Criteria) this;
        }

        public Criteria andReceptedNameIn(List<String> values) {
            addCriterion("recepted_name in", values, "receptedName");
            return (Criteria) this;
        }

        public Criteria andReceptedNameNotIn(List<String> values) {
            addCriterion("recepted_name not in", values, "receptedName");
            return (Criteria) this;
        }

        public Criteria andReceptedNameBetween(String value1, String value2) {
            addCriterion("recepted_name between", value1, value2, "receptedName");
            return (Criteria) this;
        }

        public Criteria andReceptedNameNotBetween(String value1, String value2) {
            addCriterion("recepted_name not between", value1, value2, "receptedName");
            return (Criteria) this;
        }

        public Criteria andReceptDateIsNull() {
            addCriterion("recept_date is null");
            return (Criteria) this;
        }

        public Criteria andReceptDateIsNotNull() {
            addCriterion("recept_date is not null");
            return (Criteria) this;
        }

        public Criteria andReceptDateEqualTo(String value) {
            addCriterion("recept_date =", value, "receptDate");
            return (Criteria) this;
        }

        public Criteria andReceptDateNotEqualTo(String value) {
            addCriterion("recept_date <>", value, "receptDate");
            return (Criteria) this;
        }

        public Criteria andReceptDateGreaterThan(String value) {
            addCriterion("recept_date >", value, "receptDate");
            return (Criteria) this;
        }

        public Criteria andReceptDateGreaterThanOrEqualTo(String value) {
            addCriterion("recept_date >=", value, "receptDate");
            return (Criteria) this;
        }

        public Criteria andReceptDateLessThan(String value) {
            addCriterion("recept_date <", value, "receptDate");
            return (Criteria) this;
        }

        public Criteria andReceptDateLessThanOrEqualTo(String value) {
            addCriterion("recept_date <=", value, "receptDate");
            return (Criteria) this;
        }

        public Criteria andReceptDateLike(String value) {
            addCriterion("recept_date like", value, "receptDate");
            return (Criteria) this;
        }

        public Criteria andReceptDateNotLike(String value) {
            addCriterion("recept_date not like", value, "receptDate");
            return (Criteria) this;
        }

        public Criteria andReceptDateIn(List<String> values) {
            addCriterion("recept_date in", values, "receptDate");
            return (Criteria) this;
        }

        public Criteria andReceptDateNotIn(List<String> values) {
            addCriterion("recept_date not in", values, "receptDate");
            return (Criteria) this;
        }

        public Criteria andReceptDateBetween(String value1, String value2) {
            addCriterion("recept_date between", value1, value2, "receptDate");
            return (Criteria) this;
        }

        public Criteria andReceptDateNotBetween(String value1, String value2) {
            addCriterion("recept_date not between", value1, value2, "receptDate");
            return (Criteria) this;
        }

        public Criteria andReceptNameIdIsNull() {
            addCriterion("recept_name_id is null");
            return (Criteria) this;
        }

        public Criteria andReceptNameIdIsNotNull() {
            addCriterion("recept_name_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceptNameIdEqualTo(String value) {
            addCriterion("recept_name_id =", value, "receptNameId");
            return (Criteria) this;
        }

        public Criteria andReceptNameIdNotEqualTo(String value) {
            addCriterion("recept_name_id <>", value, "receptNameId");
            return (Criteria) this;
        }

        public Criteria andReceptNameIdGreaterThan(String value) {
            addCriterion("recept_name_id >", value, "receptNameId");
            return (Criteria) this;
        }

        public Criteria andReceptNameIdGreaterThanOrEqualTo(String value) {
            addCriterion("recept_name_id >=", value, "receptNameId");
            return (Criteria) this;
        }

        public Criteria andReceptNameIdLessThan(String value) {
            addCriterion("recept_name_id <", value, "receptNameId");
            return (Criteria) this;
        }

        public Criteria andReceptNameIdLessThanOrEqualTo(String value) {
            addCriterion("recept_name_id <=", value, "receptNameId");
            return (Criteria) this;
        }

        public Criteria andReceptNameIdLike(String value) {
            addCriterion("recept_name_id like", value, "receptNameId");
            return (Criteria) this;
        }

        public Criteria andReceptNameIdNotLike(String value) {
            addCriterion("recept_name_id not like", value, "receptNameId");
            return (Criteria) this;
        }

        public Criteria andReceptNameIdIn(List<String> values) {
            addCriterion("recept_name_id in", values, "receptNameId");
            return (Criteria) this;
        }

        public Criteria andReceptNameIdNotIn(List<String> values) {
            addCriterion("recept_name_id not in", values, "receptNameId");
            return (Criteria) this;
        }

        public Criteria andReceptNameIdBetween(String value1, String value2) {
            addCriterion("recept_name_id between", value1, value2, "receptNameId");
            return (Criteria) this;
        }

        public Criteria andReceptNameIdNotBetween(String value1, String value2) {
            addCriterion("recept_name_id not between", value1, value2, "receptNameId");
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