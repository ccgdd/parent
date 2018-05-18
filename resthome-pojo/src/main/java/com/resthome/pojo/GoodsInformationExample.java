package com.resthome.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GoodsInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsInformationExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsModelIsNull() {
            addCriterion("goods_model is null");
            return (Criteria) this;
        }

        public Criteria andGoodsModelIsNotNull() {
            addCriterion("goods_model is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsModelEqualTo(String value) {
            addCriterion("goods_model =", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelNotEqualTo(String value) {
            addCriterion("goods_model <>", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelGreaterThan(String value) {
            addCriterion("goods_model >", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelGreaterThanOrEqualTo(String value) {
            addCriterion("goods_model >=", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelLessThan(String value) {
            addCriterion("goods_model <", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelLessThanOrEqualTo(String value) {
            addCriterion("goods_model <=", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelLike(String value) {
            addCriterion("goods_model like", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelNotLike(String value) {
            addCriterion("goods_model not like", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelIn(List<String> values) {
            addCriterion("goods_model in", values, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelNotIn(List<String> values) {
            addCriterion("goods_model not in", values, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelBetween(String value1, String value2) {
            addCriterion("goods_model between", value1, value2, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelNotBetween(String value1, String value2) {
            addCriterion("goods_model not between", value1, value2, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNull() {
            addCriterion("goods_number is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNotNull() {
            addCriterion("goods_number is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberEqualTo(String value) {
            addCriterion("goods_number =", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotEqualTo(String value) {
            addCriterion("goods_number <>", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThan(String value) {
            addCriterion("goods_number >", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("goods_number >=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThan(String value) {
            addCriterion("goods_number <", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThanOrEqualTo(String value) {
            addCriterion("goods_number <=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLike(String value) {
            addCriterion("goods_number like", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotLike(String value) {
            addCriterion("goods_number not like", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIn(List<String> values) {
            addCriterion("goods_number in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotIn(List<String> values) {
            addCriterion("goods_number not in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberBetween(String value1, String value2) {
            addCriterion("goods_number between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotBetween(String value1, String value2) {
            addCriterion("goods_number not between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSdateIsNull() {
            addCriterion("sdate is null");
            return (Criteria) this;
        }

        public Criteria andSdateIsNotNull() {
            addCriterion("sdate is not null");
            return (Criteria) this;
        }

        public Criteria andSdateEqualTo(Date value) {
            addCriterionForJDBCDate("sdate =", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sdate <>", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateGreaterThan(Date value) {
            addCriterionForJDBCDate("sdate >", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sdate >=", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateLessThan(Date value) {
            addCriterionForJDBCDate("sdate <", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sdate <=", value, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateIn(List<Date> values) {
            addCriterionForJDBCDate("sdate in", values, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sdate not in", values, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sdate between", value1, value2, "sdate");
            return (Criteria) this;
        }

        public Criteria andSdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sdate not between", value1, value2, "sdate");
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

        public Criteria andNowNumIsNull() {
            addCriterion("now_num is null");
            return (Criteria) this;
        }

        public Criteria andNowNumIsNotNull() {
            addCriterion("now_num is not null");
            return (Criteria) this;
        }

        public Criteria andNowNumEqualTo(Integer value) {
            addCriterion("now_num =", value, "nowNum");
            return (Criteria) this;
        }

        public Criteria andNowNumNotEqualTo(Integer value) {
            addCriterion("now_num <>", value, "nowNum");
            return (Criteria) this;
        }

        public Criteria andNowNumGreaterThan(Integer value) {
            addCriterion("now_num >", value, "nowNum");
            return (Criteria) this;
        }

        public Criteria andNowNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("now_num >=", value, "nowNum");
            return (Criteria) this;
        }

        public Criteria andNowNumLessThan(Integer value) {
            addCriterion("now_num <", value, "nowNum");
            return (Criteria) this;
        }

        public Criteria andNowNumLessThanOrEqualTo(Integer value) {
            addCriterion("now_num <=", value, "nowNum");
            return (Criteria) this;
        }

        public Criteria andNowNumIn(List<Integer> values) {
            addCriterion("now_num in", values, "nowNum");
            return (Criteria) this;
        }

        public Criteria andNowNumNotIn(List<Integer> values) {
            addCriterion("now_num not in", values, "nowNum");
            return (Criteria) this;
        }

        public Criteria andNowNumBetween(Integer value1, Integer value2) {
            addCriterion("now_num between", value1, value2, "nowNum");
            return (Criteria) this;
        }

        public Criteria andNowNumNotBetween(Integer value1, Integer value2) {
            addCriterion("now_num not between", value1, value2, "nowNum");
            return (Criteria) this;
        }

        public Criteria andInNumIsNull() {
            addCriterion("in_num is null");
            return (Criteria) this;
        }

        public Criteria andInNumIsNotNull() {
            addCriterion("in_num is not null");
            return (Criteria) this;
        }

        public Criteria andInNumEqualTo(Integer value) {
            addCriterion("in_num =", value, "inNum");
            return (Criteria) this;
        }

        public Criteria andInNumNotEqualTo(Integer value) {
            addCriterion("in_num <>", value, "inNum");
            return (Criteria) this;
        }

        public Criteria andInNumGreaterThan(Integer value) {
            addCriterion("in_num >", value, "inNum");
            return (Criteria) this;
        }

        public Criteria andInNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_num >=", value, "inNum");
            return (Criteria) this;
        }

        public Criteria andInNumLessThan(Integer value) {
            addCriterion("in_num <", value, "inNum");
            return (Criteria) this;
        }

        public Criteria andInNumLessThanOrEqualTo(Integer value) {
            addCriterion("in_num <=", value, "inNum");
            return (Criteria) this;
        }

        public Criteria andInNumIn(List<Integer> values) {
            addCriterion("in_num in", values, "inNum");
            return (Criteria) this;
        }

        public Criteria andInNumNotIn(List<Integer> values) {
            addCriterion("in_num not in", values, "inNum");
            return (Criteria) this;
        }

        public Criteria andInNumBetween(Integer value1, Integer value2) {
            addCriterion("in_num between", value1, value2, "inNum");
            return (Criteria) this;
        }

        public Criteria andInNumNotBetween(Integer value1, Integer value2) {
            addCriterion("in_num not between", value1, value2, "inNum");
            return (Criteria) this;
        }

        public Criteria andOutNumIsNull() {
            addCriterion("out_num is null");
            return (Criteria) this;
        }

        public Criteria andOutNumIsNotNull() {
            addCriterion("out_num is not null");
            return (Criteria) this;
        }

        public Criteria andOutNumEqualTo(Integer value) {
            addCriterion("out_num =", value, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumNotEqualTo(Integer value) {
            addCriterion("out_num <>", value, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumGreaterThan(Integer value) {
            addCriterion("out_num >", value, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_num >=", value, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumLessThan(Integer value) {
            addCriterion("out_num <", value, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumLessThanOrEqualTo(Integer value) {
            addCriterion("out_num <=", value, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumIn(List<Integer> values) {
            addCriterion("out_num in", values, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumNotIn(List<Integer> values) {
            addCriterion("out_num not in", values, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumBetween(Integer value1, Integer value2) {
            addCriterion("out_num between", value1, value2, "outNum");
            return (Criteria) this;
        }

        public Criteria andOutNumNotBetween(Integer value1, Integer value2) {
            addCriterion("out_num not between", value1, value2, "outNum");
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