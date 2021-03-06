package com.zjjzfy.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbOrgBalanceExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_org_balance
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_org_balance
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_org_balance
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_org_balance
     *
     * @mbggenerated
     */
    public TbOrgBalanceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_org_balance
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_org_balance
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_org_balance
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_org_balance
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_org_balance
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_org_balance
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_org_balance
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_org_balance
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_org_balance
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_org_balance
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_org_balance
     *
     * @mbggenerated
     */
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("`month` is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("`month` is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(String value) {
            addCriterion("`month` =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(String value) {
            addCriterion("`month` <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(String value) {
            addCriterion("`month` >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(String value) {
            addCriterion("`month` >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(String value) {
            addCriterion("`month` <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(String value) {
            addCriterion("`month` <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLike(String value) {
            addCriterion("`month` like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotLike(String value) {
            addCriterion("`month` not like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<String> values) {
            addCriterion("`month` in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<String> values) {
            addCriterion("`month` not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(String value1, String value2) {
            addCriterion("`month` between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(String value1, String value2) {
            addCriterion("`month` not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Integer value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Integer value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Integer value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Integer value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Integer> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Integer> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andBranchnoIsNull() {
            addCriterion("branchno is null");
            return (Criteria) this;
        }

        public Criteria andBranchnoIsNotNull() {
            addCriterion("branchno is not null");
            return (Criteria) this;
        }

        public Criteria andBranchnoEqualTo(String value) {
            addCriterion("branchno =", value, "branchno");
            return (Criteria) this;
        }

        public Criteria andBranchnoNotEqualTo(String value) {
            addCriterion("branchno <>", value, "branchno");
            return (Criteria) this;
        }

        public Criteria andBranchnoGreaterThan(String value) {
            addCriterion("branchno >", value, "branchno");
            return (Criteria) this;
        }

        public Criteria andBranchnoGreaterThanOrEqualTo(String value) {
            addCriterion("branchno >=", value, "branchno");
            return (Criteria) this;
        }

        public Criteria andBranchnoLessThan(String value) {
            addCriterion("branchno <", value, "branchno");
            return (Criteria) this;
        }

        public Criteria andBranchnoLessThanOrEqualTo(String value) {
            addCriterion("branchno <=", value, "branchno");
            return (Criteria) this;
        }

        public Criteria andBranchnoLike(String value) {
            addCriterion("branchno like", value, "branchno");
            return (Criteria) this;
        }

        public Criteria andBranchnoNotLike(String value) {
            addCriterion("branchno not like", value, "branchno");
            return (Criteria) this;
        }

        public Criteria andBranchnoIn(List<String> values) {
            addCriterion("branchno in", values, "branchno");
            return (Criteria) this;
        }

        public Criteria andBranchnoNotIn(List<String> values) {
            addCriterion("branchno not in", values, "branchno");
            return (Criteria) this;
        }

        public Criteria andBranchnoBetween(String value1, String value2) {
            addCriterion("branchno between", value1, value2, "branchno");
            return (Criteria) this;
        }

        public Criteria andBranchnoNotBetween(String value1, String value2) {
            addCriterion("branchno not between", value1, value2, "branchno");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andUsedBanlanceIsNull() {
            addCriterion("used_banlance is null");
            return (Criteria) this;
        }

        public Criteria andUsedBanlanceIsNotNull() {
            addCriterion("used_banlance is not null");
            return (Criteria) this;
        }

        public Criteria andUsedBanlanceEqualTo(BigDecimal value) {
            addCriterion("used_banlance =", value, "usedBanlance");
            return (Criteria) this;
        }

        public Criteria andUsedBanlanceNotEqualTo(BigDecimal value) {
            addCriterion("used_banlance <>", value, "usedBanlance");
            return (Criteria) this;
        }

        public Criteria andUsedBanlanceGreaterThan(BigDecimal value) {
            addCriterion("used_banlance >", value, "usedBanlance");
            return (Criteria) this;
        }

        public Criteria andUsedBanlanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("used_banlance >=", value, "usedBanlance");
            return (Criteria) this;
        }

        public Criteria andUsedBanlanceLessThan(BigDecimal value) {
            addCriterion("used_banlance <", value, "usedBanlance");
            return (Criteria) this;
        }

        public Criteria andUsedBanlanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("used_banlance <=", value, "usedBanlance");
            return (Criteria) this;
        }

        public Criteria andUsedBanlanceIn(List<BigDecimal> values) {
            addCriterion("used_banlance in", values, "usedBanlance");
            return (Criteria) this;
        }

        public Criteria andUsedBanlanceNotIn(List<BigDecimal> values) {
            addCriterion("used_banlance not in", values, "usedBanlance");
            return (Criteria) this;
        }

        public Criteria andUsedBanlanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("used_banlance between", value1, value2, "usedBanlance");
            return (Criteria) this;
        }

        public Criteria andUsedBanlanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("used_banlance not between", value1, value2, "usedBanlance");
            return (Criteria) this;
        }

        public Criteria andLastUsedTimeIsNull() {
            addCriterion("last_used_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUsedTimeIsNotNull() {
            addCriterion("last_used_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUsedTimeEqualTo(Date value) {
            addCriterion("last_used_time =", value, "lastUsedTime");
            return (Criteria) this;
        }

        public Criteria andLastUsedTimeNotEqualTo(Date value) {
            addCriterion("last_used_time <>", value, "lastUsedTime");
            return (Criteria) this;
        }

        public Criteria andLastUsedTimeGreaterThan(Date value) {
            addCriterion("last_used_time >", value, "lastUsedTime");
            return (Criteria) this;
        }

        public Criteria andLastUsedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_used_time >=", value, "lastUsedTime");
            return (Criteria) this;
        }

        public Criteria andLastUsedTimeLessThan(Date value) {
            addCriterion("last_used_time <", value, "lastUsedTime");
            return (Criteria) this;
        }

        public Criteria andLastUsedTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_used_time <=", value, "lastUsedTime");
            return (Criteria) this;
        }

        public Criteria andLastUsedTimeIn(List<Date> values) {
            addCriterion("last_used_time in", values, "lastUsedTime");
            return (Criteria) this;
        }

        public Criteria andLastUsedTimeNotIn(List<Date> values) {
            addCriterion("last_used_time not in", values, "lastUsedTime");
            return (Criteria) this;
        }

        public Criteria andLastUsedTimeBetween(Date value1, Date value2) {
            addCriterion("last_used_time between", value1, value2, "lastUsedTime");
            return (Criteria) this;
        }

        public Criteria andLastUsedTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_used_time not between", value1, value2, "lastUsedTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_org_balance
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_org_balance
     *
     * @mbggenerated
     */
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