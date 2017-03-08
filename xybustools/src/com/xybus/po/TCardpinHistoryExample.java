package com.xybus.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCardpinHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TCardpinHistoryExample() {
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

        public Criteria andOldCardPinIsNull() {
            addCriterion("OLD_CARD_PIN is null");
            return (Criteria) this;
        }

        public Criteria andOldCardPinIsNotNull() {
            addCriterion("OLD_CARD_PIN is not null");
            return (Criteria) this;
        }

        public Criteria andOldCardPinEqualTo(String value) {
            addCriterion("OLD_CARD_PIN =", value, "oldCardPin");
            return (Criteria) this;
        }

        public Criteria andOldCardPinNotEqualTo(String value) {
            addCriterion("OLD_CARD_PIN <>", value, "oldCardPin");
            return (Criteria) this;
        }

        public Criteria andOldCardPinGreaterThan(String value) {
            addCriterion("OLD_CARD_PIN >", value, "oldCardPin");
            return (Criteria) this;
        }

        public Criteria andOldCardPinGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_CARD_PIN >=", value, "oldCardPin");
            return (Criteria) this;
        }

        public Criteria andOldCardPinLessThan(String value) {
            addCriterion("OLD_CARD_PIN <", value, "oldCardPin");
            return (Criteria) this;
        }

        public Criteria andOldCardPinLessThanOrEqualTo(String value) {
            addCriterion("OLD_CARD_PIN <=", value, "oldCardPin");
            return (Criteria) this;
        }

        public Criteria andOldCardPinLike(String value) {
            addCriterion("OLD_CARD_PIN like", value, "oldCardPin");
            return (Criteria) this;
        }

        public Criteria andOldCardPinNotLike(String value) {
            addCriterion("OLD_CARD_PIN not like", value, "oldCardPin");
            return (Criteria) this;
        }

        public Criteria andOldCardPinIn(List<String> values) {
            addCriterion("OLD_CARD_PIN in", values, "oldCardPin");
            return (Criteria) this;
        }

        public Criteria andOldCardPinNotIn(List<String> values) {
            addCriterion("OLD_CARD_PIN not in", values, "oldCardPin");
            return (Criteria) this;
        }

        public Criteria andOldCardPinBetween(String value1, String value2) {
            addCriterion("OLD_CARD_PIN between", value1, value2, "oldCardPin");
            return (Criteria) this;
        }

        public Criteria andOldCardPinNotBetween(String value1, String value2) {
            addCriterion("OLD_CARD_PIN not between", value1, value2, "oldCardPin");
            return (Criteria) this;
        }

        public Criteria andNewCardPinIsNull() {
            addCriterion("NEW_CARD_PIN is null");
            return (Criteria) this;
        }

        public Criteria andNewCardPinIsNotNull() {
            addCriterion("NEW_CARD_PIN is not null");
            return (Criteria) this;
        }

        public Criteria andNewCardPinEqualTo(String value) {
            addCriterion("NEW_CARD_PIN =", value, "newCardPin");
            return (Criteria) this;
        }

        public Criteria andNewCardPinNotEqualTo(String value) {
            addCriterion("NEW_CARD_PIN <>", value, "newCardPin");
            return (Criteria) this;
        }

        public Criteria andNewCardPinGreaterThan(String value) {
            addCriterion("NEW_CARD_PIN >", value, "newCardPin");
            return (Criteria) this;
        }

        public Criteria andNewCardPinGreaterThanOrEqualTo(String value) {
            addCriterion("NEW_CARD_PIN >=", value, "newCardPin");
            return (Criteria) this;
        }

        public Criteria andNewCardPinLessThan(String value) {
            addCriterion("NEW_CARD_PIN <", value, "newCardPin");
            return (Criteria) this;
        }

        public Criteria andNewCardPinLessThanOrEqualTo(String value) {
            addCriterion("NEW_CARD_PIN <=", value, "newCardPin");
            return (Criteria) this;
        }

        public Criteria andNewCardPinLike(String value) {
            addCriterion("NEW_CARD_PIN like", value, "newCardPin");
            return (Criteria) this;
        }

        public Criteria andNewCardPinNotLike(String value) {
            addCriterion("NEW_CARD_PIN not like", value, "newCardPin");
            return (Criteria) this;
        }

        public Criteria andNewCardPinIn(List<String> values) {
            addCriterion("NEW_CARD_PIN in", values, "newCardPin");
            return (Criteria) this;
        }

        public Criteria andNewCardPinNotIn(List<String> values) {
            addCriterion("NEW_CARD_PIN not in", values, "newCardPin");
            return (Criteria) this;
        }

        public Criteria andNewCardPinBetween(String value1, String value2) {
            addCriterion("NEW_CARD_PIN between", value1, value2, "newCardPin");
            return (Criteria) this;
        }

        public Criteria andNewCardPinNotBetween(String value1, String value2) {
            addCriterion("NEW_CARD_PIN not between", value1, value2, "newCardPin");
            return (Criteria) this;
        }

        public Criteria andOldJobNumberIsNull() {
            addCriterion("OLD_JOB_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andOldJobNumberIsNotNull() {
            addCriterion("OLD_JOB_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andOldJobNumberEqualTo(String value) {
            addCriterion("OLD_JOB_NUMBER =", value, "oldJobNumber");
            return (Criteria) this;
        }

        public Criteria andOldJobNumberNotEqualTo(String value) {
            addCriterion("OLD_JOB_NUMBER <>", value, "oldJobNumber");
            return (Criteria) this;
        }

        public Criteria andOldJobNumberGreaterThan(String value) {
            addCriterion("OLD_JOB_NUMBER >", value, "oldJobNumber");
            return (Criteria) this;
        }

        public Criteria andOldJobNumberGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_JOB_NUMBER >=", value, "oldJobNumber");
            return (Criteria) this;
        }

        public Criteria andOldJobNumberLessThan(String value) {
            addCriterion("OLD_JOB_NUMBER <", value, "oldJobNumber");
            return (Criteria) this;
        }

        public Criteria andOldJobNumberLessThanOrEqualTo(String value) {
            addCriterion("OLD_JOB_NUMBER <=", value, "oldJobNumber");
            return (Criteria) this;
        }

        public Criteria andOldJobNumberLike(String value) {
            addCriterion("OLD_JOB_NUMBER like", value, "oldJobNumber");
            return (Criteria) this;
        }

        public Criteria andOldJobNumberNotLike(String value) {
            addCriterion("OLD_JOB_NUMBER not like", value, "oldJobNumber");
            return (Criteria) this;
        }

        public Criteria andOldJobNumberIn(List<String> values) {
            addCriterion("OLD_JOB_NUMBER in", values, "oldJobNumber");
            return (Criteria) this;
        }

        public Criteria andOldJobNumberNotIn(List<String> values) {
            addCriterion("OLD_JOB_NUMBER not in", values, "oldJobNumber");
            return (Criteria) this;
        }

        public Criteria andOldJobNumberBetween(String value1, String value2) {
            addCriterion("OLD_JOB_NUMBER between", value1, value2, "oldJobNumber");
            return (Criteria) this;
        }

        public Criteria andOldJobNumberNotBetween(String value1, String value2) {
            addCriterion("OLD_JOB_NUMBER not between", value1, value2, "oldJobNumber");
            return (Criteria) this;
        }

        public Criteria andNewJobNumberIsNull() {
            addCriterion("NEW_JOB_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andNewJobNumberIsNotNull() {
            addCriterion("NEW_JOB_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andNewJobNumberEqualTo(String value) {
            addCriterion("NEW_JOB_NUMBER =", value, "newJobNumber");
            return (Criteria) this;
        }

        public Criteria andNewJobNumberNotEqualTo(String value) {
            addCriterion("NEW_JOB_NUMBER <>", value, "newJobNumber");
            return (Criteria) this;
        }

        public Criteria andNewJobNumberGreaterThan(String value) {
            addCriterion("NEW_JOB_NUMBER >", value, "newJobNumber");
            return (Criteria) this;
        }

        public Criteria andNewJobNumberGreaterThanOrEqualTo(String value) {
            addCriterion("NEW_JOB_NUMBER >=", value, "newJobNumber");
            return (Criteria) this;
        }

        public Criteria andNewJobNumberLessThan(String value) {
            addCriterion("NEW_JOB_NUMBER <", value, "newJobNumber");
            return (Criteria) this;
        }

        public Criteria andNewJobNumberLessThanOrEqualTo(String value) {
            addCriterion("NEW_JOB_NUMBER <=", value, "newJobNumber");
            return (Criteria) this;
        }

        public Criteria andNewJobNumberLike(String value) {
            addCriterion("NEW_JOB_NUMBER like", value, "newJobNumber");
            return (Criteria) this;
        }

        public Criteria andNewJobNumberNotLike(String value) {
            addCriterion("NEW_JOB_NUMBER not like", value, "newJobNumber");
            return (Criteria) this;
        }

        public Criteria andNewJobNumberIn(List<String> values) {
            addCriterion("NEW_JOB_NUMBER in", values, "newJobNumber");
            return (Criteria) this;
        }

        public Criteria andNewJobNumberNotIn(List<String> values) {
            addCriterion("NEW_JOB_NUMBER not in", values, "newJobNumber");
            return (Criteria) this;
        }

        public Criteria andNewJobNumberBetween(String value1, String value2) {
            addCriterion("NEW_JOB_NUMBER between", value1, value2, "newJobNumber");
            return (Criteria) this;
        }

        public Criteria andNewJobNumberNotBetween(String value1, String value2) {
            addCriterion("NEW_JOB_NUMBER not between", value1, value2, "newJobNumber");
            return (Criteria) this;
        }

        public Criteria andOldTcardIdIsNull() {
            addCriterion("OLD_TCARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andOldTcardIdIsNotNull() {
            addCriterion("OLD_TCARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOldTcardIdEqualTo(Integer value) {
            addCriterion("OLD_TCARD_ID =", value, "oldTcardId");
            return (Criteria) this;
        }

        public Criteria andOldTcardIdNotEqualTo(Integer value) {
            addCriterion("OLD_TCARD_ID <>", value, "oldTcardId");
            return (Criteria) this;
        }

        public Criteria andOldTcardIdGreaterThan(Integer value) {
            addCriterion("OLD_TCARD_ID >", value, "oldTcardId");
            return (Criteria) this;
        }

        public Criteria andOldTcardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("OLD_TCARD_ID >=", value, "oldTcardId");
            return (Criteria) this;
        }

        public Criteria andOldTcardIdLessThan(Integer value) {
            addCriterion("OLD_TCARD_ID <", value, "oldTcardId");
            return (Criteria) this;
        }

        public Criteria andOldTcardIdLessThanOrEqualTo(Integer value) {
            addCriterion("OLD_TCARD_ID <=", value, "oldTcardId");
            return (Criteria) this;
        }

        public Criteria andOldTcardIdIn(List<Integer> values) {
            addCriterion("OLD_TCARD_ID in", values, "oldTcardId");
            return (Criteria) this;
        }

        public Criteria andOldTcardIdNotIn(List<Integer> values) {
            addCriterion("OLD_TCARD_ID not in", values, "oldTcardId");
            return (Criteria) this;
        }

        public Criteria andOldTcardIdBetween(Integer value1, Integer value2) {
            addCriterion("OLD_TCARD_ID between", value1, value2, "oldTcardId");
            return (Criteria) this;
        }

        public Criteria andOldTcardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("OLD_TCARD_ID not between", value1, value2, "oldTcardId");
            return (Criteria) this;
        }

        public Criteria andNewTcardIdIsNull() {
            addCriterion("NEW_TCARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andNewTcardIdIsNotNull() {
            addCriterion("NEW_TCARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNewTcardIdEqualTo(Integer value) {
            addCriterion("NEW_TCARD_ID =", value, "newTcardId");
            return (Criteria) this;
        }

        public Criteria andNewTcardIdNotEqualTo(Integer value) {
            addCriterion("NEW_TCARD_ID <>", value, "newTcardId");
            return (Criteria) this;
        }

        public Criteria andNewTcardIdGreaterThan(Integer value) {
            addCriterion("NEW_TCARD_ID >", value, "newTcardId");
            return (Criteria) this;
        }

        public Criteria andNewTcardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NEW_TCARD_ID >=", value, "newTcardId");
            return (Criteria) this;
        }

        public Criteria andNewTcardIdLessThan(Integer value) {
            addCriterion("NEW_TCARD_ID <", value, "newTcardId");
            return (Criteria) this;
        }

        public Criteria andNewTcardIdLessThanOrEqualTo(Integer value) {
            addCriterion("NEW_TCARD_ID <=", value, "newTcardId");
            return (Criteria) this;
        }

        public Criteria andNewTcardIdIn(List<Integer> values) {
            addCriterion("NEW_TCARD_ID in", values, "newTcardId");
            return (Criteria) this;
        }

        public Criteria andNewTcardIdNotIn(List<Integer> values) {
            addCriterion("NEW_TCARD_ID not in", values, "newTcardId");
            return (Criteria) this;
        }

        public Criteria andNewTcardIdBetween(Integer value1, Integer value2) {
            addCriterion("NEW_TCARD_ID between", value1, value2, "newTcardId");
            return (Criteria) this;
        }

        public Criteria andNewTcardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NEW_TCARD_ID not between", value1, value2, "newTcardId");
            return (Criteria) this;
        }

        public Criteria andOldTpassenegerIdIsNull() {
            addCriterion("OLD_TPASSENEGER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOldTpassenegerIdIsNotNull() {
            addCriterion("OLD_TPASSENEGER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOldTpassenegerIdEqualTo(Integer value) {
            addCriterion("OLD_TPASSENEGER_ID =", value, "oldTpassenegerId");
            return (Criteria) this;
        }

        public Criteria andOldTpassenegerIdNotEqualTo(Integer value) {
            addCriterion("OLD_TPASSENEGER_ID <>", value, "oldTpassenegerId");
            return (Criteria) this;
        }

        public Criteria andOldTpassenegerIdGreaterThan(Integer value) {
            addCriterion("OLD_TPASSENEGER_ID >", value, "oldTpassenegerId");
            return (Criteria) this;
        }

        public Criteria andOldTpassenegerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("OLD_TPASSENEGER_ID >=", value, "oldTpassenegerId");
            return (Criteria) this;
        }

        public Criteria andOldTpassenegerIdLessThan(Integer value) {
            addCriterion("OLD_TPASSENEGER_ID <", value, "oldTpassenegerId");
            return (Criteria) this;
        }

        public Criteria andOldTpassenegerIdLessThanOrEqualTo(Integer value) {
            addCriterion("OLD_TPASSENEGER_ID <=", value, "oldTpassenegerId");
            return (Criteria) this;
        }

        public Criteria andOldTpassenegerIdIn(List<Integer> values) {
            addCriterion("OLD_TPASSENEGER_ID in", values, "oldTpassenegerId");
            return (Criteria) this;
        }

        public Criteria andOldTpassenegerIdNotIn(List<Integer> values) {
            addCriterion("OLD_TPASSENEGER_ID not in", values, "oldTpassenegerId");
            return (Criteria) this;
        }

        public Criteria andOldTpassenegerIdBetween(Integer value1, Integer value2) {
            addCriterion("OLD_TPASSENEGER_ID between", value1, value2, "oldTpassenegerId");
            return (Criteria) this;
        }

        public Criteria andOldTpassenegerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("OLD_TPASSENEGER_ID not between", value1, value2, "oldTpassenegerId");
            return (Criteria) this;
        }

        public Criteria andNewTpassenegerIdIsNull() {
            addCriterion("NEW_TPASSENEGER_ID is null");
            return (Criteria) this;
        }

        public Criteria andNewTpassenegerIdIsNotNull() {
            addCriterion("NEW_TPASSENEGER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNewTpassenegerIdEqualTo(Integer value) {
            addCriterion("NEW_TPASSENEGER_ID =", value, "newTpassenegerId");
            return (Criteria) this;
        }

        public Criteria andNewTpassenegerIdNotEqualTo(Integer value) {
            addCriterion("NEW_TPASSENEGER_ID <>", value, "newTpassenegerId");
            return (Criteria) this;
        }

        public Criteria andNewTpassenegerIdGreaterThan(Integer value) {
            addCriterion("NEW_TPASSENEGER_ID >", value, "newTpassenegerId");
            return (Criteria) this;
        }

        public Criteria andNewTpassenegerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NEW_TPASSENEGER_ID >=", value, "newTpassenegerId");
            return (Criteria) this;
        }

        public Criteria andNewTpassenegerIdLessThan(Integer value) {
            addCriterion("NEW_TPASSENEGER_ID <", value, "newTpassenegerId");
            return (Criteria) this;
        }

        public Criteria andNewTpassenegerIdLessThanOrEqualTo(Integer value) {
            addCriterion("NEW_TPASSENEGER_ID <=", value, "newTpassenegerId");
            return (Criteria) this;
        }

        public Criteria andNewTpassenegerIdIn(List<Integer> values) {
            addCriterion("NEW_TPASSENEGER_ID in", values, "newTpassenegerId");
            return (Criteria) this;
        }

        public Criteria andNewTpassenegerIdNotIn(List<Integer> values) {
            addCriterion("NEW_TPASSENEGER_ID not in", values, "newTpassenegerId");
            return (Criteria) this;
        }

        public Criteria andNewTpassenegerIdBetween(Integer value1, Integer value2) {
            addCriterion("NEW_TPASSENEGER_ID between", value1, value2, "newTpassenegerId");
            return (Criteria) this;
        }

        public Criteria andNewTpassenegerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NEW_TPASSENEGER_ID not between", value1, value2, "newTpassenegerId");
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

        public Criteria andUpdatedUserIsNull() {
            addCriterion("UPDATED_USER is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIsNotNull() {
            addCriterion("UPDATED_USER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserEqualTo(Short value) {
            addCriterion("UPDATED_USER =", value, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserNotEqualTo(Short value) {
            addCriterion("UPDATED_USER <>", value, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserGreaterThan(Short value) {
            addCriterion("UPDATED_USER >", value, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserGreaterThanOrEqualTo(Short value) {
            addCriterion("UPDATED_USER >=", value, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserLessThan(Short value) {
            addCriterion("UPDATED_USER <", value, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserLessThanOrEqualTo(Short value) {
            addCriterion("UPDATED_USER <=", value, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIn(List<Short> values) {
            addCriterion("UPDATED_USER in", values, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserNotIn(List<Short> values) {
            addCriterion("UPDATED_USER not in", values, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserBetween(Short value1, Short value2) {
            addCriterion("UPDATED_USER between", value1, value2, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserNotBetween(Short value1, Short value2) {
            addCriterion("UPDATED_USER not between", value1, value2, "updatedUser");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("UPDATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("UPDATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("UPDATED_TIME =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("UPDATED_TIME <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("UPDATED_TIME >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATED_TIME >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("UPDATED_TIME <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATED_TIME <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("UPDATED_TIME in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("UPDATED_TIME not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATED_TIME between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATED_TIME not between", value1, value2, "updatedTime");
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