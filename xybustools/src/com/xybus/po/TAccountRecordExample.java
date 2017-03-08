package com.xybus.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TAccountRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TAccountRecordExample() {
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

        public Criteria andPassengerIdIsNull() {
            addCriterion("PASSENGER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPassengerIdIsNotNull() {
            addCriterion("PASSENGER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerIdEqualTo(String value) {
            addCriterion("PASSENGER_ID =", value, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdNotEqualTo(String value) {
            addCriterion("PASSENGER_ID <>", value, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdGreaterThan(String value) {
            addCriterion("PASSENGER_ID >", value, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdGreaterThanOrEqualTo(String value) {
            addCriterion("PASSENGER_ID >=", value, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdLessThan(String value) {
            addCriterion("PASSENGER_ID <", value, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdLessThanOrEqualTo(String value) {
            addCriterion("PASSENGER_ID <=", value, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdLike(String value) {
            addCriterion("PASSENGER_ID like", value, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdNotLike(String value) {
            addCriterion("PASSENGER_ID not like", value, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdIn(List<String> values) {
            addCriterion("PASSENGER_ID in", values, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdNotIn(List<String> values) {
            addCriterion("PASSENGER_ID not in", values, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdBetween(String value1, String value2) {
            addCriterion("PASSENGER_ID between", value1, value2, "passengerId");
            return (Criteria) this;
        }

        public Criteria andPassengerIdNotBetween(String value1, String value2) {
            addCriterion("PASSENGER_ID not between", value1, value2, "passengerId");
            return (Criteria) this;
        }

        public Criteria andCardPinIsNull() {
            addCriterion("CARD_PIN is null");
            return (Criteria) this;
        }

        public Criteria andCardPinIsNotNull() {
            addCriterion("CARD_PIN is not null");
            return (Criteria) this;
        }

        public Criteria andCardPinEqualTo(String value) {
            addCriterion("CARD_PIN =", value, "cardPin");
            return (Criteria) this;
        }

        public Criteria andCardPinNotEqualTo(String value) {
            addCriterion("CARD_PIN <>", value, "cardPin");
            return (Criteria) this;
        }

        public Criteria andCardPinGreaterThan(String value) {
            addCriterion("CARD_PIN >", value, "cardPin");
            return (Criteria) this;
        }

        public Criteria andCardPinGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_PIN >=", value, "cardPin");
            return (Criteria) this;
        }

        public Criteria andCardPinLessThan(String value) {
            addCriterion("CARD_PIN <", value, "cardPin");
            return (Criteria) this;
        }

        public Criteria andCardPinLessThanOrEqualTo(String value) {
            addCriterion("CARD_PIN <=", value, "cardPin");
            return (Criteria) this;
        }

        public Criteria andCardPinLike(String value) {
            addCriterion("CARD_PIN like", value, "cardPin");
            return (Criteria) this;
        }

        public Criteria andCardPinNotLike(String value) {
            addCriterion("CARD_PIN not like", value, "cardPin");
            return (Criteria) this;
        }

        public Criteria andCardPinIn(List<String> values) {
            addCriterion("CARD_PIN in", values, "cardPin");
            return (Criteria) this;
        }

        public Criteria andCardPinNotIn(List<String> values) {
            addCriterion("CARD_PIN not in", values, "cardPin");
            return (Criteria) this;
        }

        public Criteria andCardPinBetween(String value1, String value2) {
            addCriterion("CARD_PIN between", value1, value2, "cardPin");
            return (Criteria) this;
        }

        public Criteria andCardPinNotBetween(String value1, String value2) {
            addCriterion("CARD_PIN not between", value1, value2, "cardPin");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIsNull() {
            addCriterion("CHANGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIsNotNull() {
            addCriterion("CHANGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeEqualTo(String value) {
            addCriterion("CHANGE_TYPE =", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotEqualTo(String value) {
            addCriterion("CHANGE_TYPE <>", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeGreaterThan(String value) {
            addCriterion("CHANGE_TYPE >", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANGE_TYPE >=", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLessThan(String value) {
            addCriterion("CHANGE_TYPE <", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLessThanOrEqualTo(String value) {
            addCriterion("CHANGE_TYPE <=", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLike(String value) {
            addCriterion("CHANGE_TYPE like", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotLike(String value) {
            addCriterion("CHANGE_TYPE not like", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIn(List<String> values) {
            addCriterion("CHANGE_TYPE in", values, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotIn(List<String> values) {
            addCriterion("CHANGE_TYPE not in", values, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeBetween(String value1, String value2) {
            addCriterion("CHANGE_TYPE between", value1, value2, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotBetween(String value1, String value2) {
            addCriterion("CHANGE_TYPE not between", value1, value2, "changeType");
            return (Criteria) this;
        }

        public Criteria andAmountBeforeIsNull() {
            addCriterion("AMOUNT_BEFORE is null");
            return (Criteria) this;
        }

        public Criteria andAmountBeforeIsNotNull() {
            addCriterion("AMOUNT_BEFORE is not null");
            return (Criteria) this;
        }

        public Criteria andAmountBeforeEqualTo(Long value) {
            addCriterion("AMOUNT_BEFORE =", value, "amountBefore");
            return (Criteria) this;
        }

        public Criteria andAmountBeforeNotEqualTo(Long value) {
            addCriterion("AMOUNT_BEFORE <>", value, "amountBefore");
            return (Criteria) this;
        }

        public Criteria andAmountBeforeGreaterThan(Long value) {
            addCriterion("AMOUNT_BEFORE >", value, "amountBefore");
            return (Criteria) this;
        }

        public Criteria andAmountBeforeGreaterThanOrEqualTo(Long value) {
            addCriterion("AMOUNT_BEFORE >=", value, "amountBefore");
            return (Criteria) this;
        }

        public Criteria andAmountBeforeLessThan(Long value) {
            addCriterion("AMOUNT_BEFORE <", value, "amountBefore");
            return (Criteria) this;
        }

        public Criteria andAmountBeforeLessThanOrEqualTo(Long value) {
            addCriterion("AMOUNT_BEFORE <=", value, "amountBefore");
            return (Criteria) this;
        }

        public Criteria andAmountBeforeIn(List<Long> values) {
            addCriterion("AMOUNT_BEFORE in", values, "amountBefore");
            return (Criteria) this;
        }

        public Criteria andAmountBeforeNotIn(List<Long> values) {
            addCriterion("AMOUNT_BEFORE not in", values, "amountBefore");
            return (Criteria) this;
        }

        public Criteria andAmountBeforeBetween(Long value1, Long value2) {
            addCriterion("AMOUNT_BEFORE between", value1, value2, "amountBefore");
            return (Criteria) this;
        }

        public Criteria andAmountBeforeNotBetween(Long value1, Long value2) {
            addCriterion("AMOUNT_BEFORE not between", value1, value2, "amountBefore");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Long value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Long value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Long value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Long value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Long value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Long> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Long> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Long value1, Long value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Long value1, Long value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountAfterIsNull() {
            addCriterion("AMOUNT_AFTER is null");
            return (Criteria) this;
        }

        public Criteria andAmountAfterIsNotNull() {
            addCriterion("AMOUNT_AFTER is not null");
            return (Criteria) this;
        }

        public Criteria andAmountAfterEqualTo(Long value) {
            addCriterion("AMOUNT_AFTER =", value, "amountAfter");
            return (Criteria) this;
        }

        public Criteria andAmountAfterNotEqualTo(Long value) {
            addCriterion("AMOUNT_AFTER <>", value, "amountAfter");
            return (Criteria) this;
        }

        public Criteria andAmountAfterGreaterThan(Long value) {
            addCriterion("AMOUNT_AFTER >", value, "amountAfter");
            return (Criteria) this;
        }

        public Criteria andAmountAfterGreaterThanOrEqualTo(Long value) {
            addCriterion("AMOUNT_AFTER >=", value, "amountAfter");
            return (Criteria) this;
        }

        public Criteria andAmountAfterLessThan(Long value) {
            addCriterion("AMOUNT_AFTER <", value, "amountAfter");
            return (Criteria) this;
        }

        public Criteria andAmountAfterLessThanOrEqualTo(Long value) {
            addCriterion("AMOUNT_AFTER <=", value, "amountAfter");
            return (Criteria) this;
        }

        public Criteria andAmountAfterIn(List<Long> values) {
            addCriterion("AMOUNT_AFTER in", values, "amountAfter");
            return (Criteria) this;
        }

        public Criteria andAmountAfterNotIn(List<Long> values) {
            addCriterion("AMOUNT_AFTER not in", values, "amountAfter");
            return (Criteria) this;
        }

        public Criteria andAmountAfterBetween(Long value1, Long value2) {
            addCriterion("AMOUNT_AFTER between", value1, value2, "amountAfter");
            return (Criteria) this;
        }

        public Criteria andAmountAfterNotBetween(Long value1, Long value2) {
            addCriterion("AMOUNT_AFTER not between", value1, value2, "amountAfter");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNull() {
            addCriterion("PAY_WAY is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNotNull() {
            addCriterion("PAY_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayEqualTo(String value) {
            addCriterion("PAY_WAY =", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(String value) {
            addCriterion("PAY_WAY <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(String value) {
            addCriterion("PAY_WAY >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_WAY >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(String value) {
            addCriterion("PAY_WAY <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(String value) {
            addCriterion("PAY_WAY <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLike(String value) {
            addCriterion("PAY_WAY like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotLike(String value) {
            addCriterion("PAY_WAY not like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayIn(List<String> values) {
            addCriterion("PAY_WAY in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotIn(List<String> values) {
            addCriterion("PAY_WAY not in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayBetween(String value1, String value2) {
            addCriterion("PAY_WAY between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotBetween(String value1, String value2) {
            addCriterion("PAY_WAY not between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPosIdIsNull() {
            addCriterion("POS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPosIdIsNotNull() {
            addCriterion("POS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPosIdEqualTo(String value) {
            addCriterion("POS_ID =", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotEqualTo(String value) {
            addCriterion("POS_ID <>", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdGreaterThan(String value) {
            addCriterion("POS_ID >", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdGreaterThanOrEqualTo(String value) {
            addCriterion("POS_ID >=", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdLessThan(String value) {
            addCriterion("POS_ID <", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdLessThanOrEqualTo(String value) {
            addCriterion("POS_ID <=", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdLike(String value) {
            addCriterion("POS_ID like", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotLike(String value) {
            addCriterion("POS_ID not like", value, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdIn(List<String> values) {
            addCriterion("POS_ID in", values, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotIn(List<String> values) {
            addCriterion("POS_ID not in", values, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdBetween(String value1, String value2) {
            addCriterion("POS_ID between", value1, value2, "posId");
            return (Criteria) this;
        }

        public Criteria andPosIdNotBetween(String value1, String value2) {
            addCriterion("POS_ID not between", value1, value2, "posId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIsNull() {
            addCriterion("CREATED_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIsNotNull() {
            addCriterion("CREATED_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserEqualTo(Short value) {
            addCriterion("CREATED_USER =", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotEqualTo(Short value) {
            addCriterion("CREATED_USER <>", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserGreaterThan(Short value) {
            addCriterion("CREATED_USER >", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserGreaterThanOrEqualTo(Short value) {
            addCriterion("CREATED_USER >=", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLessThan(Short value) {
            addCriterion("CREATED_USER <", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLessThanOrEqualTo(Short value) {
            addCriterion("CREATED_USER <=", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIn(List<Short> values) {
            addCriterion("CREATED_USER in", values, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotIn(List<Short> values) {
            addCriterion("CREATED_USER not in", values, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserBetween(Short value1, Short value2) {
            addCriterion("CREATED_USER between", value1, value2, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotBetween(Short value1, Short value2) {
            addCriterion("CREATED_USER not between", value1, value2, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("CREATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("CREATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("CREATED_TIME =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("CREATED_TIME <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("CREATED_TIME >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("CREATED_TIME <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("CREATED_TIME in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("CREATED_TIME not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME not between", value1, value2, "createdTime");
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