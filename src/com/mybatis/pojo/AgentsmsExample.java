package com.mybatis.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AgentsmsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AgentsmsExample() {
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

        public Criteria andUsercodeIsNull() {
            addCriterion("USERCODE is null");
            return (Criteria) this;
        }

        public Criteria andUsercodeIsNotNull() {
            addCriterion("USERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andUsercodeEqualTo(String value) {
            addCriterion("USERCODE =", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotEqualTo(String value) {
            addCriterion("USERCODE <>", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThan(String value) {
            addCriterion("USERCODE >", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThanOrEqualTo(String value) {
            addCriterion("USERCODE >=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThan(String value) {
            addCriterion("USERCODE <", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThanOrEqualTo(String value) {
            addCriterion("USERCODE <=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLike(String value) {
            addCriterion("USERCODE like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotLike(String value) {
            addCriterion("USERCODE not like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeIn(List<String> values) {
            addCriterion("USERCODE in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotIn(List<String> values) {
            addCriterion("USERCODE not in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeBetween(String value1, String value2) {
            addCriterion("USERCODE between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotBetween(String value1, String value2) {
            addCriterion("USERCODE not between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("FLAG =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("FLAG <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("FLAG >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("FLAG >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("FLAG <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("FLAG <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("FLAG like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("FLAG not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("FLAG in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("FLAG not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("FLAG between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("FLAG not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andInputdateIsNull() {
            addCriterion("INPUTDATE is null");
            return (Criteria) this;
        }

        public Criteria andInputdateIsNotNull() {
            addCriterion("INPUTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andInputdateEqualTo(Date value) {
            addCriterionForJDBCDate("INPUTDATE =", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("INPUTDATE <>", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThan(Date value) {
            addCriterionForJDBCDate("INPUTDATE >", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INPUTDATE >=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThan(Date value) {
            addCriterionForJDBCDate("INPUTDATE <", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INPUTDATE <=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateIn(List<Date> values) {
            addCriterionForJDBCDate("INPUTDATE in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("INPUTDATE not in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INPUTDATE between", value1, value2, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INPUTDATE not between", value1, value2, "inputdate");
            return (Criteria) this;
        }

        public Criteria andClaimtypeIsNull() {
            addCriterion("CLAIMTYPE is null");
            return (Criteria) this;
        }

        public Criteria andClaimtypeIsNotNull() {
            addCriterion("CLAIMTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andClaimtypeEqualTo(String value) {
            addCriterion("CLAIMTYPE =", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeNotEqualTo(String value) {
            addCriterion("CLAIMTYPE <>", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeGreaterThan(String value) {
            addCriterion("CLAIMTYPE >", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeGreaterThanOrEqualTo(String value) {
            addCriterion("CLAIMTYPE >=", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeLessThan(String value) {
            addCriterion("CLAIMTYPE <", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeLessThanOrEqualTo(String value) {
            addCriterion("CLAIMTYPE <=", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeLike(String value) {
            addCriterion("CLAIMTYPE like", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeNotLike(String value) {
            addCriterion("CLAIMTYPE not like", value, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeIn(List<String> values) {
            addCriterion("CLAIMTYPE in", values, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeNotIn(List<String> values) {
            addCriterion("CLAIMTYPE not in", values, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeBetween(String value1, String value2) {
            addCriterion("CLAIMTYPE between", value1, value2, "claimtype");
            return (Criteria) this;
        }

        public Criteria andClaimtypeNotBetween(String value1, String value2) {
            addCriterion("CLAIMTYPE not between", value1, value2, "claimtype");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeIsNull() {
            addCriterion("OPERATORCODE is null");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeIsNotNull() {
            addCriterion("OPERATORCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeEqualTo(String value) {
            addCriterion("OPERATORCODE =", value, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeNotEqualTo(String value) {
            addCriterion("OPERATORCODE <>", value, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeGreaterThan(String value) {
            addCriterion("OPERATORCODE >", value, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATORCODE >=", value, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeLessThan(String value) {
            addCriterion("OPERATORCODE <", value, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeLessThanOrEqualTo(String value) {
            addCriterion("OPERATORCODE <=", value, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeLike(String value) {
            addCriterion("OPERATORCODE like", value, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeNotLike(String value) {
            addCriterion("OPERATORCODE not like", value, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeIn(List<String> values) {
            addCriterion("OPERATORCODE in", values, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeNotIn(List<String> values) {
            addCriterion("OPERATORCODE not in", values, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeBetween(String value1, String value2) {
            addCriterion("OPERATORCODE between", value1, value2, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andOperatorcodeNotBetween(String value1, String value2) {
            addCriterion("OPERATORCODE not between", value1, value2, "operatorcode");
            return (Criteria) this;
        }

        public Criteria andComcodeIsNull() {
            addCriterion("COMCODE is null");
            return (Criteria) this;
        }

        public Criteria andComcodeIsNotNull() {
            addCriterion("COMCODE is not null");
            return (Criteria) this;
        }

        public Criteria andComcodeEqualTo(String value) {
            addCriterion("COMCODE =", value, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeNotEqualTo(String value) {
            addCriterion("COMCODE <>", value, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeGreaterThan(String value) {
            addCriterion("COMCODE >", value, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeGreaterThanOrEqualTo(String value) {
            addCriterion("COMCODE >=", value, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeLessThan(String value) {
            addCriterion("COMCODE <", value, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeLessThanOrEqualTo(String value) {
            addCriterion("COMCODE <=", value, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeLike(String value) {
            addCriterion("COMCODE like", value, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeNotLike(String value) {
            addCriterion("COMCODE not like", value, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeIn(List<String> values) {
            addCriterion("COMCODE in", values, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeNotIn(List<String> values) {
            addCriterion("COMCODE not in", values, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeBetween(String value1, String value2) {
            addCriterion("COMCODE between", value1, value2, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeNotBetween(String value1, String value2) {
            addCriterion("COMCODE not between", value1, value2, "comcode");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("COMPANYNAME is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("COMPANYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("COMPANYNAME =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("COMPANYNAME <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("COMPANYNAME >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANYNAME >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("COMPANYNAME <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("COMPANYNAME <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("COMPANYNAME like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("COMPANYNAME not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("COMPANYNAME in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("COMPANYNAME not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("COMPANYNAME between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("COMPANYNAME not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andGradetypeIsNull() {
            addCriterion("GRADETYPE is null");
            return (Criteria) this;
        }

        public Criteria andGradetypeIsNotNull() {
            addCriterion("GRADETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGradetypeEqualTo(String value) {
            addCriterion("GRADETYPE =", value, "gradetype");
            return (Criteria) this;
        }

        public Criteria andGradetypeNotEqualTo(String value) {
            addCriterion("GRADETYPE <>", value, "gradetype");
            return (Criteria) this;
        }

        public Criteria andGradetypeGreaterThan(String value) {
            addCriterion("GRADETYPE >", value, "gradetype");
            return (Criteria) this;
        }

        public Criteria andGradetypeGreaterThanOrEqualTo(String value) {
            addCriterion("GRADETYPE >=", value, "gradetype");
            return (Criteria) this;
        }

        public Criteria andGradetypeLessThan(String value) {
            addCriterion("GRADETYPE <", value, "gradetype");
            return (Criteria) this;
        }

        public Criteria andGradetypeLessThanOrEqualTo(String value) {
            addCriterion("GRADETYPE <=", value, "gradetype");
            return (Criteria) this;
        }

        public Criteria andGradetypeLike(String value) {
            addCriterion("GRADETYPE like", value, "gradetype");
            return (Criteria) this;
        }

        public Criteria andGradetypeNotLike(String value) {
            addCriterion("GRADETYPE not like", value, "gradetype");
            return (Criteria) this;
        }

        public Criteria andGradetypeIn(List<String> values) {
            addCriterion("GRADETYPE in", values, "gradetype");
            return (Criteria) this;
        }

        public Criteria andGradetypeNotIn(List<String> values) {
            addCriterion("GRADETYPE not in", values, "gradetype");
            return (Criteria) this;
        }

        public Criteria andGradetypeBetween(String value1, String value2) {
            addCriterion("GRADETYPE between", value1, value2, "gradetype");
            return (Criteria) this;
        }

        public Criteria andGradetypeNotBetween(String value1, String value2) {
            addCriterion("GRADETYPE not between", value1, value2, "gradetype");
            return (Criteria) this;
        }

        public Criteria andRecordidIsNull() {
            addCriterion("RECORDID is null");
            return (Criteria) this;
        }

        public Criteria andRecordidIsNotNull() {
            addCriterion("RECORDID is not null");
            return (Criteria) this;
        }

        public Criteria andRecordidEqualTo(String value) {
            addCriterion("RECORDID =", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidNotEqualTo(String value) {
            addCriterion("RECORDID <>", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidGreaterThan(String value) {
            addCriterion("RECORDID >", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidGreaterThanOrEqualTo(String value) {
            addCriterion("RECORDID >=", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidLessThan(String value) {
            addCriterion("RECORDID <", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidLessThanOrEqualTo(String value) {
            addCriterion("RECORDID <=", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidLike(String value) {
            addCriterion("RECORDID like", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidNotLike(String value) {
            addCriterion("RECORDID not like", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidIn(List<String> values) {
            addCriterion("RECORDID in", values, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidNotIn(List<String> values) {
            addCriterion("RECORDID not in", values, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidBetween(String value1, String value2) {
            addCriterion("RECORDID between", value1, value2, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidNotBetween(String value1, String value2) {
            addCriterion("RECORDID not between", value1, value2, "recordid");
            return (Criteria) this;
        }

        public Criteria andComcode2IsNull() {
            addCriterion("COMCODE2 is null");
            return (Criteria) this;
        }

        public Criteria andComcode2IsNotNull() {
            addCriterion("COMCODE2 is not null");
            return (Criteria) this;
        }

        public Criteria andComcode2EqualTo(String value) {
            addCriterion("COMCODE2 =", value, "comcode2");
            return (Criteria) this;
        }

        public Criteria andComcode2NotEqualTo(String value) {
            addCriterion("COMCODE2 <>", value, "comcode2");
            return (Criteria) this;
        }

        public Criteria andComcode2GreaterThan(String value) {
            addCriterion("COMCODE2 >", value, "comcode2");
            return (Criteria) this;
        }

        public Criteria andComcode2GreaterThanOrEqualTo(String value) {
            addCriterion("COMCODE2 >=", value, "comcode2");
            return (Criteria) this;
        }

        public Criteria andComcode2LessThan(String value) {
            addCriterion("COMCODE2 <", value, "comcode2");
            return (Criteria) this;
        }

        public Criteria andComcode2LessThanOrEqualTo(String value) {
            addCriterion("COMCODE2 <=", value, "comcode2");
            return (Criteria) this;
        }

        public Criteria andComcode2Like(String value) {
            addCriterion("COMCODE2 like", value, "comcode2");
            return (Criteria) this;
        }

        public Criteria andComcode2NotLike(String value) {
            addCriterion("COMCODE2 not like", value, "comcode2");
            return (Criteria) this;
        }

        public Criteria andComcode2In(List<String> values) {
            addCriterion("COMCODE2 in", values, "comcode2");
            return (Criteria) this;
        }

        public Criteria andComcode2NotIn(List<String> values) {
            addCriterion("COMCODE2 not in", values, "comcode2");
            return (Criteria) this;
        }

        public Criteria andComcode2Between(String value1, String value2) {
            addCriterion("COMCODE2 between", value1, value2, "comcode2");
            return (Criteria) this;
        }

        public Criteria andComcode2NotBetween(String value1, String value2) {
            addCriterion("COMCODE2 not between", value1, value2, "comcode2");
            return (Criteria) this;
        }

        public Criteria andCompanyname2IsNull() {
            addCriterion("COMPANYNAME2 is null");
            return (Criteria) this;
        }

        public Criteria andCompanyname2IsNotNull() {
            addCriterion("COMPANYNAME2 is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyname2EqualTo(String value) {
            addCriterion("COMPANYNAME2 =", value, "companyname2");
            return (Criteria) this;
        }

        public Criteria andCompanyname2NotEqualTo(String value) {
            addCriterion("COMPANYNAME2 <>", value, "companyname2");
            return (Criteria) this;
        }

        public Criteria andCompanyname2GreaterThan(String value) {
            addCriterion("COMPANYNAME2 >", value, "companyname2");
            return (Criteria) this;
        }

        public Criteria andCompanyname2GreaterThanOrEqualTo(String value) {
            addCriterion("COMPANYNAME2 >=", value, "companyname2");
            return (Criteria) this;
        }

        public Criteria andCompanyname2LessThan(String value) {
            addCriterion("COMPANYNAME2 <", value, "companyname2");
            return (Criteria) this;
        }

        public Criteria andCompanyname2LessThanOrEqualTo(String value) {
            addCriterion("COMPANYNAME2 <=", value, "companyname2");
            return (Criteria) this;
        }

        public Criteria andCompanyname2Like(String value) {
            addCriterion("COMPANYNAME2 like", value, "companyname2");
            return (Criteria) this;
        }

        public Criteria andCompanyname2NotLike(String value) {
            addCriterion("COMPANYNAME2 not like", value, "companyname2");
            return (Criteria) this;
        }

        public Criteria andCompanyname2In(List<String> values) {
            addCriterion("COMPANYNAME2 in", values, "companyname2");
            return (Criteria) this;
        }

        public Criteria andCompanyname2NotIn(List<String> values) {
            addCriterion("COMPANYNAME2 not in", values, "companyname2");
            return (Criteria) this;
        }

        public Criteria andCompanyname2Between(String value1, String value2) {
            addCriterion("COMPANYNAME2 between", value1, value2, "companyname2");
            return (Criteria) this;
        }

        public Criteria andCompanyname2NotBetween(String value1, String value2) {
            addCriterion("COMPANYNAME2 not between", value1, value2, "companyname2");
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