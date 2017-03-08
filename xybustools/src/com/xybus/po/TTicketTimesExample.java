package com.xybus.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TTicketTimesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TTicketTimesExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andFreeAIsNull() {
            addCriterion("FREE_A is null");
            return (Criteria) this;
        }

        public Criteria andFreeAIsNotNull() {
            addCriterion("FREE_A is not null");
            return (Criteria) this;
        }

        public Criteria andFreeAEqualTo(Short value) {
            addCriterion("FREE_A =", value, "freeA");
            return (Criteria) this;
        }

        public Criteria andFreeANotEqualTo(Short value) {
            addCriterion("FREE_A <>", value, "freeA");
            return (Criteria) this;
        }

        public Criteria andFreeAGreaterThan(Short value) {
            addCriterion("FREE_A >", value, "freeA");
            return (Criteria) this;
        }

        public Criteria andFreeAGreaterThanOrEqualTo(Short value) {
            addCriterion("FREE_A >=", value, "freeA");
            return (Criteria) this;
        }

        public Criteria andFreeALessThan(Short value) {
            addCriterion("FREE_A <", value, "freeA");
            return (Criteria) this;
        }

        public Criteria andFreeALessThanOrEqualTo(Short value) {
            addCriterion("FREE_A <=", value, "freeA");
            return (Criteria) this;
        }

        public Criteria andFreeAIn(List<Short> values) {
            addCriterion("FREE_A in", values, "freeA");
            return (Criteria) this;
        }

        public Criteria andFreeANotIn(List<Short> values) {
            addCriterion("FREE_A not in", values, "freeA");
            return (Criteria) this;
        }

        public Criteria andFreeABetween(Short value1, Short value2) {
            addCriterion("FREE_A between", value1, value2, "freeA");
            return (Criteria) this;
        }

        public Criteria andFreeANotBetween(Short value1, Short value2) {
            addCriterion("FREE_A not between", value1, value2, "freeA");
            return (Criteria) this;
        }

        public Criteria andFreeBIsNull() {
            addCriterion("FREE_B is null");
            return (Criteria) this;
        }

        public Criteria andFreeBIsNotNull() {
            addCriterion("FREE_B is not null");
            return (Criteria) this;
        }

        public Criteria andFreeBEqualTo(Short value) {
            addCriterion("FREE_B =", value, "freeB");
            return (Criteria) this;
        }

        public Criteria andFreeBNotEqualTo(Short value) {
            addCriterion("FREE_B <>", value, "freeB");
            return (Criteria) this;
        }

        public Criteria andFreeBGreaterThan(Short value) {
            addCriterion("FREE_B >", value, "freeB");
            return (Criteria) this;
        }

        public Criteria andFreeBGreaterThanOrEqualTo(Short value) {
            addCriterion("FREE_B >=", value, "freeB");
            return (Criteria) this;
        }

        public Criteria andFreeBLessThan(Short value) {
            addCriterion("FREE_B <", value, "freeB");
            return (Criteria) this;
        }

        public Criteria andFreeBLessThanOrEqualTo(Short value) {
            addCriterion("FREE_B <=", value, "freeB");
            return (Criteria) this;
        }

        public Criteria andFreeBIn(List<Short> values) {
            addCriterion("FREE_B in", values, "freeB");
            return (Criteria) this;
        }

        public Criteria andFreeBNotIn(List<Short> values) {
            addCriterion("FREE_B not in", values, "freeB");
            return (Criteria) this;
        }

        public Criteria andFreeBBetween(Short value1, Short value2) {
            addCriterion("FREE_B between", value1, value2, "freeB");
            return (Criteria) this;
        }

        public Criteria andFreeBNotBetween(Short value1, Short value2) {
            addCriterion("FREE_B not between", value1, value2, "freeB");
            return (Criteria) this;
        }

        public Criteria andFreeCIsNull() {
            addCriterion("FREE_C is null");
            return (Criteria) this;
        }

        public Criteria andFreeCIsNotNull() {
            addCriterion("FREE_C is not null");
            return (Criteria) this;
        }

        public Criteria andFreeCEqualTo(Short value) {
            addCriterion("FREE_C =", value, "freeC");
            return (Criteria) this;
        }

        public Criteria andFreeCNotEqualTo(Short value) {
            addCriterion("FREE_C <>", value, "freeC");
            return (Criteria) this;
        }

        public Criteria andFreeCGreaterThan(Short value) {
            addCriterion("FREE_C >", value, "freeC");
            return (Criteria) this;
        }

        public Criteria andFreeCGreaterThanOrEqualTo(Short value) {
            addCriterion("FREE_C >=", value, "freeC");
            return (Criteria) this;
        }

        public Criteria andFreeCLessThan(Short value) {
            addCriterion("FREE_C <", value, "freeC");
            return (Criteria) this;
        }

        public Criteria andFreeCLessThanOrEqualTo(Short value) {
            addCriterion("FREE_C <=", value, "freeC");
            return (Criteria) this;
        }

        public Criteria andFreeCIn(List<Short> values) {
            addCriterion("FREE_C in", values, "freeC");
            return (Criteria) this;
        }

        public Criteria andFreeCNotIn(List<Short> values) {
            addCriterion("FREE_C not in", values, "freeC");
            return (Criteria) this;
        }

        public Criteria andFreeCBetween(Short value1, Short value2) {
            addCriterion("FREE_C between", value1, value2, "freeC");
            return (Criteria) this;
        }

        public Criteria andFreeCNotBetween(Short value1, Short value2) {
            addCriterion("FREE_C not between", value1, value2, "freeC");
            return (Criteria) this;
        }

        public Criteria andOvertimeAIsNull() {
            addCriterion("OVERTIME_A is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeAIsNotNull() {
            addCriterion("OVERTIME_A is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeAEqualTo(Short value) {
            addCriterion("OVERTIME_A =", value, "overtimeA");
            return (Criteria) this;
        }

        public Criteria andOvertimeANotEqualTo(Short value) {
            addCriterion("OVERTIME_A <>", value, "overtimeA");
            return (Criteria) this;
        }

        public Criteria andOvertimeAGreaterThan(Short value) {
            addCriterion("OVERTIME_A >", value, "overtimeA");
            return (Criteria) this;
        }

        public Criteria andOvertimeAGreaterThanOrEqualTo(Short value) {
            addCriterion("OVERTIME_A >=", value, "overtimeA");
            return (Criteria) this;
        }

        public Criteria andOvertimeALessThan(Short value) {
            addCriterion("OVERTIME_A <", value, "overtimeA");
            return (Criteria) this;
        }

        public Criteria andOvertimeALessThanOrEqualTo(Short value) {
            addCriterion("OVERTIME_A <=", value, "overtimeA");
            return (Criteria) this;
        }

        public Criteria andOvertimeAIn(List<Short> values) {
            addCriterion("OVERTIME_A in", values, "overtimeA");
            return (Criteria) this;
        }

        public Criteria andOvertimeANotIn(List<Short> values) {
            addCriterion("OVERTIME_A not in", values, "overtimeA");
            return (Criteria) this;
        }

        public Criteria andOvertimeABetween(Short value1, Short value2) {
            addCriterion("OVERTIME_A between", value1, value2, "overtimeA");
            return (Criteria) this;
        }

        public Criteria andOvertimeANotBetween(Short value1, Short value2) {
            addCriterion("OVERTIME_A not between", value1, value2, "overtimeA");
            return (Criteria) this;
        }

        public Criteria andOvertimeBIsNull() {
            addCriterion("OVERTIME_B is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeBIsNotNull() {
            addCriterion("OVERTIME_B is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeBEqualTo(Short value) {
            addCriterion("OVERTIME_B =", value, "overtimeB");
            return (Criteria) this;
        }

        public Criteria andOvertimeBNotEqualTo(Short value) {
            addCriterion("OVERTIME_B <>", value, "overtimeB");
            return (Criteria) this;
        }

        public Criteria andOvertimeBGreaterThan(Short value) {
            addCriterion("OVERTIME_B >", value, "overtimeB");
            return (Criteria) this;
        }

        public Criteria andOvertimeBGreaterThanOrEqualTo(Short value) {
            addCriterion("OVERTIME_B >=", value, "overtimeB");
            return (Criteria) this;
        }

        public Criteria andOvertimeBLessThan(Short value) {
            addCriterion("OVERTIME_B <", value, "overtimeB");
            return (Criteria) this;
        }

        public Criteria andOvertimeBLessThanOrEqualTo(Short value) {
            addCriterion("OVERTIME_B <=", value, "overtimeB");
            return (Criteria) this;
        }

        public Criteria andOvertimeBIn(List<Short> values) {
            addCriterion("OVERTIME_B in", values, "overtimeB");
            return (Criteria) this;
        }

        public Criteria andOvertimeBNotIn(List<Short> values) {
            addCriterion("OVERTIME_B not in", values, "overtimeB");
            return (Criteria) this;
        }

        public Criteria andOvertimeBBetween(Short value1, Short value2) {
            addCriterion("OVERTIME_B between", value1, value2, "overtimeB");
            return (Criteria) this;
        }

        public Criteria andOvertimeBNotBetween(Short value1, Short value2) {
            addCriterion("OVERTIME_B not between", value1, value2, "overtimeB");
            return (Criteria) this;
        }

        public Criteria andOvertimeCIsNull() {
            addCriterion("OVERTIME_C is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeCIsNotNull() {
            addCriterion("OVERTIME_C is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeCEqualTo(Short value) {
            addCriterion("OVERTIME_C =", value, "overtimeC");
            return (Criteria) this;
        }

        public Criteria andOvertimeCNotEqualTo(Short value) {
            addCriterion("OVERTIME_C <>", value, "overtimeC");
            return (Criteria) this;
        }

        public Criteria andOvertimeCGreaterThan(Short value) {
            addCriterion("OVERTIME_C >", value, "overtimeC");
            return (Criteria) this;
        }

        public Criteria andOvertimeCGreaterThanOrEqualTo(Short value) {
            addCriterion("OVERTIME_C >=", value, "overtimeC");
            return (Criteria) this;
        }

        public Criteria andOvertimeCLessThan(Short value) {
            addCriterion("OVERTIME_C <", value, "overtimeC");
            return (Criteria) this;
        }

        public Criteria andOvertimeCLessThanOrEqualTo(Short value) {
            addCriterion("OVERTIME_C <=", value, "overtimeC");
            return (Criteria) this;
        }

        public Criteria andOvertimeCIn(List<Short> values) {
            addCriterion("OVERTIME_C in", values, "overtimeC");
            return (Criteria) this;
        }

        public Criteria andOvertimeCNotIn(List<Short> values) {
            addCriterion("OVERTIME_C not in", values, "overtimeC");
            return (Criteria) this;
        }

        public Criteria andOvertimeCBetween(Short value1, Short value2) {
            addCriterion("OVERTIME_C between", value1, value2, "overtimeC");
            return (Criteria) this;
        }

        public Criteria andOvertimeCNotBetween(Short value1, Short value2) {
            addCriterion("OVERTIME_C not between", value1, value2, "overtimeC");
            return (Criteria) this;
        }

        public Criteria andRechargeAIsNull() {
            addCriterion("RECHARGE_A is null");
            return (Criteria) this;
        }

        public Criteria andRechargeAIsNotNull() {
            addCriterion("RECHARGE_A is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeAEqualTo(Short value) {
            addCriterion("RECHARGE_A =", value, "rechargeA");
            return (Criteria) this;
        }

        public Criteria andRechargeANotEqualTo(Short value) {
            addCriterion("RECHARGE_A <>", value, "rechargeA");
            return (Criteria) this;
        }

        public Criteria andRechargeAGreaterThan(Short value) {
            addCriterion("RECHARGE_A >", value, "rechargeA");
            return (Criteria) this;
        }

        public Criteria andRechargeAGreaterThanOrEqualTo(Short value) {
            addCriterion("RECHARGE_A >=", value, "rechargeA");
            return (Criteria) this;
        }

        public Criteria andRechargeALessThan(Short value) {
            addCriterion("RECHARGE_A <", value, "rechargeA");
            return (Criteria) this;
        }

        public Criteria andRechargeALessThanOrEqualTo(Short value) {
            addCriterion("RECHARGE_A <=", value, "rechargeA");
            return (Criteria) this;
        }

        public Criteria andRechargeAIn(List<Short> values) {
            addCriterion("RECHARGE_A in", values, "rechargeA");
            return (Criteria) this;
        }

        public Criteria andRechargeANotIn(List<Short> values) {
            addCriterion("RECHARGE_A not in", values, "rechargeA");
            return (Criteria) this;
        }

        public Criteria andRechargeABetween(Short value1, Short value2) {
            addCriterion("RECHARGE_A between", value1, value2, "rechargeA");
            return (Criteria) this;
        }

        public Criteria andRechargeANotBetween(Short value1, Short value2) {
            addCriterion("RECHARGE_A not between", value1, value2, "rechargeA");
            return (Criteria) this;
        }

        public Criteria andRechargeBIsNull() {
            addCriterion("RECHARGE_B is null");
            return (Criteria) this;
        }

        public Criteria andRechargeBIsNotNull() {
            addCriterion("RECHARGE_B is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeBEqualTo(Short value) {
            addCriterion("RECHARGE_B =", value, "rechargeB");
            return (Criteria) this;
        }

        public Criteria andRechargeBNotEqualTo(Short value) {
            addCriterion("RECHARGE_B <>", value, "rechargeB");
            return (Criteria) this;
        }

        public Criteria andRechargeBGreaterThan(Short value) {
            addCriterion("RECHARGE_B >", value, "rechargeB");
            return (Criteria) this;
        }

        public Criteria andRechargeBGreaterThanOrEqualTo(Short value) {
            addCriterion("RECHARGE_B >=", value, "rechargeB");
            return (Criteria) this;
        }

        public Criteria andRechargeBLessThan(Short value) {
            addCriterion("RECHARGE_B <", value, "rechargeB");
            return (Criteria) this;
        }

        public Criteria andRechargeBLessThanOrEqualTo(Short value) {
            addCriterion("RECHARGE_B <=", value, "rechargeB");
            return (Criteria) this;
        }

        public Criteria andRechargeBIn(List<Short> values) {
            addCriterion("RECHARGE_B in", values, "rechargeB");
            return (Criteria) this;
        }

        public Criteria andRechargeBNotIn(List<Short> values) {
            addCriterion("RECHARGE_B not in", values, "rechargeB");
            return (Criteria) this;
        }

        public Criteria andRechargeBBetween(Short value1, Short value2) {
            addCriterion("RECHARGE_B between", value1, value2, "rechargeB");
            return (Criteria) this;
        }

        public Criteria andRechargeBNotBetween(Short value1, Short value2) {
            addCriterion("RECHARGE_B not between", value1, value2, "rechargeB");
            return (Criteria) this;
        }

        public Criteria andRechargeCIsNull() {
            addCriterion("RECHARGE_C is null");
            return (Criteria) this;
        }

        public Criteria andRechargeCIsNotNull() {
            addCriterion("RECHARGE_C is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeCEqualTo(Short value) {
            addCriterion("RECHARGE_C =", value, "rechargeC");
            return (Criteria) this;
        }

        public Criteria andRechargeCNotEqualTo(Short value) {
            addCriterion("RECHARGE_C <>", value, "rechargeC");
            return (Criteria) this;
        }

        public Criteria andRechargeCGreaterThan(Short value) {
            addCriterion("RECHARGE_C >", value, "rechargeC");
            return (Criteria) this;
        }

        public Criteria andRechargeCGreaterThanOrEqualTo(Short value) {
            addCriterion("RECHARGE_C >=", value, "rechargeC");
            return (Criteria) this;
        }

        public Criteria andRechargeCLessThan(Short value) {
            addCriterion("RECHARGE_C <", value, "rechargeC");
            return (Criteria) this;
        }

        public Criteria andRechargeCLessThanOrEqualTo(Short value) {
            addCriterion("RECHARGE_C <=", value, "rechargeC");
            return (Criteria) this;
        }

        public Criteria andRechargeCIn(List<Short> values) {
            addCriterion("RECHARGE_C in", values, "rechargeC");
            return (Criteria) this;
        }

        public Criteria andRechargeCNotIn(List<Short> values) {
            addCriterion("RECHARGE_C not in", values, "rechargeC");
            return (Criteria) this;
        }

        public Criteria andRechargeCBetween(Short value1, Short value2) {
            addCriterion("RECHARGE_C between", value1, value2, "rechargeC");
            return (Criteria) this;
        }

        public Criteria andRechargeCNotBetween(Short value1, Short value2) {
            addCriterion("RECHARGE_C not between", value1, value2, "rechargeC");
            return (Criteria) this;
        }

        public Criteria andSpecialAIsNull() {
            addCriterion("SPECIAL_A is null");
            return (Criteria) this;
        }

        public Criteria andSpecialAIsNotNull() {
            addCriterion("SPECIAL_A is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialAEqualTo(Short value) {
            addCriterion("SPECIAL_A =", value, "specialA");
            return (Criteria) this;
        }

        public Criteria andSpecialANotEqualTo(Short value) {
            addCriterion("SPECIAL_A <>", value, "specialA");
            return (Criteria) this;
        }

        public Criteria andSpecialAGreaterThan(Short value) {
            addCriterion("SPECIAL_A >", value, "specialA");
            return (Criteria) this;
        }

        public Criteria andSpecialAGreaterThanOrEqualTo(Short value) {
            addCriterion("SPECIAL_A >=", value, "specialA");
            return (Criteria) this;
        }

        public Criteria andSpecialALessThan(Short value) {
            addCriterion("SPECIAL_A <", value, "specialA");
            return (Criteria) this;
        }

        public Criteria andSpecialALessThanOrEqualTo(Short value) {
            addCriterion("SPECIAL_A <=", value, "specialA");
            return (Criteria) this;
        }

        public Criteria andSpecialAIn(List<Short> values) {
            addCriterion("SPECIAL_A in", values, "specialA");
            return (Criteria) this;
        }

        public Criteria andSpecialANotIn(List<Short> values) {
            addCriterion("SPECIAL_A not in", values, "specialA");
            return (Criteria) this;
        }

        public Criteria andSpecialABetween(Short value1, Short value2) {
            addCriterion("SPECIAL_A between", value1, value2, "specialA");
            return (Criteria) this;
        }

        public Criteria andSpecialANotBetween(Short value1, Short value2) {
            addCriterion("SPECIAL_A not between", value1, value2, "specialA");
            return (Criteria) this;
        }

        public Criteria andSpecialBIsNull() {
            addCriterion("SPECIAL_B is null");
            return (Criteria) this;
        }

        public Criteria andSpecialBIsNotNull() {
            addCriterion("SPECIAL_B is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialBEqualTo(Short value) {
            addCriterion("SPECIAL_B =", value, "specialB");
            return (Criteria) this;
        }

        public Criteria andSpecialBNotEqualTo(Short value) {
            addCriterion("SPECIAL_B <>", value, "specialB");
            return (Criteria) this;
        }

        public Criteria andSpecialBGreaterThan(Short value) {
            addCriterion("SPECIAL_B >", value, "specialB");
            return (Criteria) this;
        }

        public Criteria andSpecialBGreaterThanOrEqualTo(Short value) {
            addCriterion("SPECIAL_B >=", value, "specialB");
            return (Criteria) this;
        }

        public Criteria andSpecialBLessThan(Short value) {
            addCriterion("SPECIAL_B <", value, "specialB");
            return (Criteria) this;
        }

        public Criteria andSpecialBLessThanOrEqualTo(Short value) {
            addCriterion("SPECIAL_B <=", value, "specialB");
            return (Criteria) this;
        }

        public Criteria andSpecialBIn(List<Short> values) {
            addCriterion("SPECIAL_B in", values, "specialB");
            return (Criteria) this;
        }

        public Criteria andSpecialBNotIn(List<Short> values) {
            addCriterion("SPECIAL_B not in", values, "specialB");
            return (Criteria) this;
        }

        public Criteria andSpecialBBetween(Short value1, Short value2) {
            addCriterion("SPECIAL_B between", value1, value2, "specialB");
            return (Criteria) this;
        }

        public Criteria andSpecialBNotBetween(Short value1, Short value2) {
            addCriterion("SPECIAL_B not between", value1, value2, "specialB");
            return (Criteria) this;
        }

        public Criteria andSpecialCIsNull() {
            addCriterion("SPECIAL_C is null");
            return (Criteria) this;
        }

        public Criteria andSpecialCIsNotNull() {
            addCriterion("SPECIAL_C is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialCEqualTo(Short value) {
            addCriterion("SPECIAL_C =", value, "specialC");
            return (Criteria) this;
        }

        public Criteria andSpecialCNotEqualTo(Short value) {
            addCriterion("SPECIAL_C <>", value, "specialC");
            return (Criteria) this;
        }

        public Criteria andSpecialCGreaterThan(Short value) {
            addCriterion("SPECIAL_C >", value, "specialC");
            return (Criteria) this;
        }

        public Criteria andSpecialCGreaterThanOrEqualTo(Short value) {
            addCriterion("SPECIAL_C >=", value, "specialC");
            return (Criteria) this;
        }

        public Criteria andSpecialCLessThan(Short value) {
            addCriterion("SPECIAL_C <", value, "specialC");
            return (Criteria) this;
        }

        public Criteria andSpecialCLessThanOrEqualTo(Short value) {
            addCriterion("SPECIAL_C <=", value, "specialC");
            return (Criteria) this;
        }

        public Criteria andSpecialCIn(List<Short> values) {
            addCriterion("SPECIAL_C in", values, "specialC");
            return (Criteria) this;
        }

        public Criteria andSpecialCNotIn(List<Short> values) {
            addCriterion("SPECIAL_C not in", values, "specialC");
            return (Criteria) this;
        }

        public Criteria andSpecialCBetween(Short value1, Short value2) {
            addCriterion("SPECIAL_C between", value1, value2, "specialC");
            return (Criteria) this;
        }

        public Criteria andSpecialCNotBetween(Short value1, Short value2) {
            addCriterion("SPECIAL_C not between", value1, value2, "specialC");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(Short value) {
            addCriterion("CREATE_USER =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(Short value) {
            addCriterion("CREATE_USER <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(Short value) {
            addCriterion("CREATE_USER >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(Short value) {
            addCriterion("CREATE_USER >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(Short value) {
            addCriterion("CREATE_USER <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(Short value) {
            addCriterion("CREATE_USER <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<Short> values) {
            addCriterion("CREATE_USER in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<Short> values) {
            addCriterion("CREATE_USER not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(Short value1, Short value2) {
            addCriterion("CREATE_USER between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(Short value1, Short value2) {
            addCriterion("CREATE_USER not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("UPDATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("UPDATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(Short value) {
            addCriterion("UPDATE_USER =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(Short value) {
            addCriterion("UPDATE_USER <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(Short value) {
            addCriterion("UPDATE_USER >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(Short value) {
            addCriterion("UPDATE_USER >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(Short value) {
            addCriterion("UPDATE_USER <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(Short value) {
            addCriterion("UPDATE_USER <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<Short> values) {
            addCriterion("UPDATE_USER in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<Short> values) {
            addCriterion("UPDATE_USER not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(Short value1, Short value2) {
            addCriterion("UPDATE_USER between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(Short value1, Short value2) {
            addCriterion("UPDATE_USER not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andOtherAIsNull() {
            addCriterion("OTHER_A is null");
            return (Criteria) this;
        }

        public Criteria andOtherAIsNotNull() {
            addCriterion("OTHER_A is not null");
            return (Criteria) this;
        }

        public Criteria andOtherAEqualTo(Short value) {
            addCriterion("OTHER_A =", value, "otherA");
            return (Criteria) this;
        }

        public Criteria andOtherANotEqualTo(Short value) {
            addCriterion("OTHER_A <>", value, "otherA");
            return (Criteria) this;
        }

        public Criteria andOtherAGreaterThan(Short value) {
            addCriterion("OTHER_A >", value, "otherA");
            return (Criteria) this;
        }

        public Criteria andOtherAGreaterThanOrEqualTo(Short value) {
            addCriterion("OTHER_A >=", value, "otherA");
            return (Criteria) this;
        }

        public Criteria andOtherALessThan(Short value) {
            addCriterion("OTHER_A <", value, "otherA");
            return (Criteria) this;
        }

        public Criteria andOtherALessThanOrEqualTo(Short value) {
            addCriterion("OTHER_A <=", value, "otherA");
            return (Criteria) this;
        }

        public Criteria andOtherAIn(List<Short> values) {
            addCriterion("OTHER_A in", values, "otherA");
            return (Criteria) this;
        }

        public Criteria andOtherANotIn(List<Short> values) {
            addCriterion("OTHER_A not in", values, "otherA");
            return (Criteria) this;
        }

        public Criteria andOtherABetween(Short value1, Short value2) {
            addCriterion("OTHER_A between", value1, value2, "otherA");
            return (Criteria) this;
        }

        public Criteria andOtherANotBetween(Short value1, Short value2) {
            addCriterion("OTHER_A not between", value1, value2, "otherA");
            return (Criteria) this;
        }

        public Criteria andOtherBIsNull() {
            addCriterion("OTHER_B is null");
            return (Criteria) this;
        }

        public Criteria andOtherBIsNotNull() {
            addCriterion("OTHER_B is not null");
            return (Criteria) this;
        }

        public Criteria andOtherBEqualTo(Short value) {
            addCriterion("OTHER_B =", value, "otherB");
            return (Criteria) this;
        }

        public Criteria andOtherBNotEqualTo(Short value) {
            addCriterion("OTHER_B <>", value, "otherB");
            return (Criteria) this;
        }

        public Criteria andOtherBGreaterThan(Short value) {
            addCriterion("OTHER_B >", value, "otherB");
            return (Criteria) this;
        }

        public Criteria andOtherBGreaterThanOrEqualTo(Short value) {
            addCriterion("OTHER_B >=", value, "otherB");
            return (Criteria) this;
        }

        public Criteria andOtherBLessThan(Short value) {
            addCriterion("OTHER_B <", value, "otherB");
            return (Criteria) this;
        }

        public Criteria andOtherBLessThanOrEqualTo(Short value) {
            addCriterion("OTHER_B <=", value, "otherB");
            return (Criteria) this;
        }

        public Criteria andOtherBIn(List<Short> values) {
            addCriterion("OTHER_B in", values, "otherB");
            return (Criteria) this;
        }

        public Criteria andOtherBNotIn(List<Short> values) {
            addCriterion("OTHER_B not in", values, "otherB");
            return (Criteria) this;
        }

        public Criteria andOtherBBetween(Short value1, Short value2) {
            addCriterion("OTHER_B between", value1, value2, "otherB");
            return (Criteria) this;
        }

        public Criteria andOtherBNotBetween(Short value1, Short value2) {
            addCriterion("OTHER_B not between", value1, value2, "otherB");
            return (Criteria) this;
        }

        public Criteria andOtherCIsNull() {
            addCriterion("OTHER_C is null");
            return (Criteria) this;
        }

        public Criteria andOtherCIsNotNull() {
            addCriterion("OTHER_C is not null");
            return (Criteria) this;
        }

        public Criteria andOtherCEqualTo(Short value) {
            addCriterion("OTHER_C =", value, "otherC");
            return (Criteria) this;
        }

        public Criteria andOtherCNotEqualTo(Short value) {
            addCriterion("OTHER_C <>", value, "otherC");
            return (Criteria) this;
        }

        public Criteria andOtherCGreaterThan(Short value) {
            addCriterion("OTHER_C >", value, "otherC");
            return (Criteria) this;
        }

        public Criteria andOtherCGreaterThanOrEqualTo(Short value) {
            addCriterion("OTHER_C >=", value, "otherC");
            return (Criteria) this;
        }

        public Criteria andOtherCLessThan(Short value) {
            addCriterion("OTHER_C <", value, "otherC");
            return (Criteria) this;
        }

        public Criteria andOtherCLessThanOrEqualTo(Short value) {
            addCriterion("OTHER_C <=", value, "otherC");
            return (Criteria) this;
        }

        public Criteria andOtherCIn(List<Short> values) {
            addCriterion("OTHER_C in", values, "otherC");
            return (Criteria) this;
        }

        public Criteria andOtherCNotIn(List<Short> values) {
            addCriterion("OTHER_C not in", values, "otherC");
            return (Criteria) this;
        }

        public Criteria andOtherCBetween(Short value1, Short value2) {
            addCriterion("OTHER_C between", value1, value2, "otherC");
            return (Criteria) this;
        }

        public Criteria andOtherCNotBetween(Short value1, Short value2) {
            addCriterion("OTHER_C not between", value1, value2, "otherC");
            return (Criteria) this;
        }
    }

    /**
     */
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