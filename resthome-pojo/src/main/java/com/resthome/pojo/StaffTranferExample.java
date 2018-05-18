package com.resthome.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StaffTranferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffTranferExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Integer value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Integer value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Integer value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Integer value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Integer> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Integer> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNull() {
            addCriterion("staff_name is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("staff_name =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("staff_name <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("staff_name >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_name >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("staff_name <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("staff_name <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("staff_name like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("staff_name not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("staff_name in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("staff_name not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("staff_name between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("staff_name not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andOlddepartmentIsNull() {
            addCriterion("oldDepartment is null");
            return (Criteria) this;
        }

        public Criteria andOlddepartmentIsNotNull() {
            addCriterion("oldDepartment is not null");
            return (Criteria) this;
        }

        public Criteria andOlddepartmentEqualTo(String value) {
            addCriterion("oldDepartment =", value, "olddepartment");
            return (Criteria) this;
        }

        public Criteria andOlddepartmentNotEqualTo(String value) {
            addCriterion("oldDepartment <>", value, "olddepartment");
            return (Criteria) this;
        }

        public Criteria andOlddepartmentGreaterThan(String value) {
            addCriterion("oldDepartment >", value, "olddepartment");
            return (Criteria) this;
        }

        public Criteria andOlddepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("oldDepartment >=", value, "olddepartment");
            return (Criteria) this;
        }

        public Criteria andOlddepartmentLessThan(String value) {
            addCriterion("oldDepartment <", value, "olddepartment");
            return (Criteria) this;
        }

        public Criteria andOlddepartmentLessThanOrEqualTo(String value) {
            addCriterion("oldDepartment <=", value, "olddepartment");
            return (Criteria) this;
        }

        public Criteria andOlddepartmentLike(String value) {
            addCriterion("oldDepartment like", value, "olddepartment");
            return (Criteria) this;
        }

        public Criteria andOlddepartmentNotLike(String value) {
            addCriterion("oldDepartment not like", value, "olddepartment");
            return (Criteria) this;
        }

        public Criteria andOlddepartmentIn(List<String> values) {
            addCriterion("oldDepartment in", values, "olddepartment");
            return (Criteria) this;
        }

        public Criteria andOlddepartmentNotIn(List<String> values) {
            addCriterion("oldDepartment not in", values, "olddepartment");
            return (Criteria) this;
        }

        public Criteria andOlddepartmentBetween(String value1, String value2) {
            addCriterion("oldDepartment between", value1, value2, "olddepartment");
            return (Criteria) this;
        }

        public Criteria andOlddepartmentNotBetween(String value1, String value2) {
            addCriterion("oldDepartment not between", value1, value2, "olddepartment");
            return (Criteria) this;
        }

        public Criteria andOldpositionIsNull() {
            addCriterion("oldPosition is null");
            return (Criteria) this;
        }

        public Criteria andOldpositionIsNotNull() {
            addCriterion("oldPosition is not null");
            return (Criteria) this;
        }

        public Criteria andOldpositionEqualTo(String value) {
            addCriterion("oldPosition =", value, "oldposition");
            return (Criteria) this;
        }

        public Criteria andOldpositionNotEqualTo(String value) {
            addCriterion("oldPosition <>", value, "oldposition");
            return (Criteria) this;
        }

        public Criteria andOldpositionGreaterThan(String value) {
            addCriterion("oldPosition >", value, "oldposition");
            return (Criteria) this;
        }

        public Criteria andOldpositionGreaterThanOrEqualTo(String value) {
            addCriterion("oldPosition >=", value, "oldposition");
            return (Criteria) this;
        }

        public Criteria andOldpositionLessThan(String value) {
            addCriterion("oldPosition <", value, "oldposition");
            return (Criteria) this;
        }

        public Criteria andOldpositionLessThanOrEqualTo(String value) {
            addCriterion("oldPosition <=", value, "oldposition");
            return (Criteria) this;
        }

        public Criteria andOldpositionLike(String value) {
            addCriterion("oldPosition like", value, "oldposition");
            return (Criteria) this;
        }

        public Criteria andOldpositionNotLike(String value) {
            addCriterion("oldPosition not like", value, "oldposition");
            return (Criteria) this;
        }

        public Criteria andOldpositionIn(List<String> values) {
            addCriterion("oldPosition in", values, "oldposition");
            return (Criteria) this;
        }

        public Criteria andOldpositionNotIn(List<String> values) {
            addCriterion("oldPosition not in", values, "oldposition");
            return (Criteria) this;
        }

        public Criteria andOldpositionBetween(String value1, String value2) {
            addCriterion("oldPosition between", value1, value2, "oldposition");
            return (Criteria) this;
        }

        public Criteria andOldpositionNotBetween(String value1, String value2) {
            addCriterion("oldPosition not between", value1, value2, "oldposition");
            return (Criteria) this;
        }

        public Criteria andTransferdepartmentIsNull() {
            addCriterion("tranSferDepartment is null");
            return (Criteria) this;
        }

        public Criteria andTransferdepartmentIsNotNull() {
            addCriterion("tranSferDepartment is not null");
            return (Criteria) this;
        }

        public Criteria andTransferdepartmentEqualTo(String value) {
            addCriterion("tranSferDepartment =", value, "transferdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferdepartmentNotEqualTo(String value) {
            addCriterion("tranSferDepartment <>", value, "transferdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferdepartmentGreaterThan(String value) {
            addCriterion("tranSferDepartment >", value, "transferdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferdepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("tranSferDepartment >=", value, "transferdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferdepartmentLessThan(String value) {
            addCriterion("tranSferDepartment <", value, "transferdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferdepartmentLessThanOrEqualTo(String value) {
            addCriterion("tranSferDepartment <=", value, "transferdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferdepartmentLike(String value) {
            addCriterion("tranSferDepartment like", value, "transferdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferdepartmentNotLike(String value) {
            addCriterion("tranSferDepartment not like", value, "transferdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferdepartmentIn(List<String> values) {
            addCriterion("tranSferDepartment in", values, "transferdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferdepartmentNotIn(List<String> values) {
            addCriterion("tranSferDepartment not in", values, "transferdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferdepartmentBetween(String value1, String value2) {
            addCriterion("tranSferDepartment between", value1, value2, "transferdepartment");
            return (Criteria) this;
        }

        public Criteria andTransferdepartmentNotBetween(String value1, String value2) {
            addCriterion("tranSferDepartment not between", value1, value2, "transferdepartment");
            return (Criteria) this;
        }

        public Criteria andNewpositionIsNull() {
            addCriterion("newPosition is null");
            return (Criteria) this;
        }

        public Criteria andNewpositionIsNotNull() {
            addCriterion("newPosition is not null");
            return (Criteria) this;
        }

        public Criteria andNewpositionEqualTo(String value) {
            addCriterion("newPosition =", value, "newposition");
            return (Criteria) this;
        }

        public Criteria andNewpositionNotEqualTo(String value) {
            addCriterion("newPosition <>", value, "newposition");
            return (Criteria) this;
        }

        public Criteria andNewpositionGreaterThan(String value) {
            addCriterion("newPosition >", value, "newposition");
            return (Criteria) this;
        }

        public Criteria andNewpositionGreaterThanOrEqualTo(String value) {
            addCriterion("newPosition >=", value, "newposition");
            return (Criteria) this;
        }

        public Criteria andNewpositionLessThan(String value) {
            addCriterion("newPosition <", value, "newposition");
            return (Criteria) this;
        }

        public Criteria andNewpositionLessThanOrEqualTo(String value) {
            addCriterion("newPosition <=", value, "newposition");
            return (Criteria) this;
        }

        public Criteria andNewpositionLike(String value) {
            addCriterion("newPosition like", value, "newposition");
            return (Criteria) this;
        }

        public Criteria andNewpositionNotLike(String value) {
            addCriterion("newPosition not like", value, "newposition");
            return (Criteria) this;
        }

        public Criteria andNewpositionIn(List<String> values) {
            addCriterion("newPosition in", values, "newposition");
            return (Criteria) this;
        }

        public Criteria andNewpositionNotIn(List<String> values) {
            addCriterion("newPosition not in", values, "newposition");
            return (Criteria) this;
        }

        public Criteria andNewpositionBetween(String value1, String value2) {
            addCriterion("newPosition between", value1, value2, "newposition");
            return (Criteria) this;
        }

        public Criteria andNewpositionNotBetween(String value1, String value2) {
            addCriterion("newPosition not between", value1, value2, "newposition");
            return (Criteria) this;
        }

        public Criteria andTranferdateIsNull() {
            addCriterion("tranferDate is null");
            return (Criteria) this;
        }

        public Criteria andTranferdateIsNotNull() {
            addCriterion("tranferDate is not null");
            return (Criteria) this;
        }

        public Criteria andTranferdateEqualTo(Date value) {
            addCriterionForJDBCDate("tranferDate =", value, "tranferdate");
            return (Criteria) this;
        }

        public Criteria andTranferdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("tranferDate <>", value, "tranferdate");
            return (Criteria) this;
        }

        public Criteria andTranferdateGreaterThan(Date value) {
            addCriterionForJDBCDate("tranferDate >", value, "tranferdate");
            return (Criteria) this;
        }

        public Criteria andTranferdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tranferDate >=", value, "tranferdate");
            return (Criteria) this;
        }

        public Criteria andTranferdateLessThan(Date value) {
            addCriterionForJDBCDate("tranferDate <", value, "tranferdate");
            return (Criteria) this;
        }

        public Criteria andTranferdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tranferDate <=", value, "tranferdate");
            return (Criteria) this;
        }

        public Criteria andTranferdateIn(List<Date> values) {
            addCriterionForJDBCDate("tranferDate in", values, "tranferdate");
            return (Criteria) this;
        }

        public Criteria andTranferdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("tranferDate not in", values, "tranferdate");
            return (Criteria) this;
        }

        public Criteria andTranferdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tranferDate between", value1, value2, "tranferdate");
            return (Criteria) this;
        }

        public Criteria andTranferdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tranferDate not between", value1, value2, "tranferdate");
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