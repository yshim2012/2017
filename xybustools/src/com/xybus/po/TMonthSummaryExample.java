package com.xybus.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TMonthSummaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TMonthSummaryExample() {
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

        public Criteria andTPassengerIdIsNull() {
            addCriterion("T_PASSENGER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTPassengerIdIsNotNull() {
            addCriterion("T_PASSENGER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTPassengerIdEqualTo(Integer value) {
            addCriterion("T_PASSENGER_ID =", value, "tPassengerId");
            return (Criteria) this;
        }

        public Criteria andTPassengerIdNotEqualTo(Integer value) {
            addCriterion("T_PASSENGER_ID <>", value, "tPassengerId");
            return (Criteria) this;
        }

        public Criteria andTPassengerIdGreaterThan(Integer value) {
            addCriterion("T_PASSENGER_ID >", value, "tPassengerId");
            return (Criteria) this;
        }

        public Criteria andTPassengerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_PASSENGER_ID >=", value, "tPassengerId");
            return (Criteria) this;
        }

        public Criteria andTPassengerIdLessThan(Integer value) {
            addCriterion("T_PASSENGER_ID <", value, "tPassengerId");
            return (Criteria) this;
        }

        public Criteria andTPassengerIdLessThanOrEqualTo(Integer value) {
            addCriterion("T_PASSENGER_ID <=", value, "tPassengerId");
            return (Criteria) this;
        }

        public Criteria andTPassengerIdIn(List<Integer> values) {
            addCriterion("T_PASSENGER_ID in", values, "tPassengerId");
            return (Criteria) this;
        }

        public Criteria andTPassengerIdNotIn(List<Integer> values) {
            addCriterion("T_PASSENGER_ID not in", values, "tPassengerId");
            return (Criteria) this;
        }

        public Criteria andTPassengerIdBetween(Integer value1, Integer value2) {
            addCriterion("T_PASSENGER_ID between", value1, value2, "tPassengerId");
            return (Criteria) this;
        }

        public Criteria andTPassengerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("T_PASSENGER_ID not between", value1, value2, "tPassengerId");
            return (Criteria) this;
        }

        public Criteria andTicketTimesIdIsNull() {
            addCriterion("TICKET_TIMES_ID is null");
            return (Criteria) this;
        }

        public Criteria andTicketTimesIdIsNotNull() {
            addCriterion("TICKET_TIMES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTicketTimesIdEqualTo(Integer value) {
            addCriterion("TICKET_TIMES_ID =", value, "ticketTimesId");
            return (Criteria) this;
        }

        public Criteria andTicketTimesIdNotEqualTo(Integer value) {
            addCriterion("TICKET_TIMES_ID <>", value, "ticketTimesId");
            return (Criteria) this;
        }

        public Criteria andTicketTimesIdGreaterThan(Integer value) {
            addCriterion("TICKET_TIMES_ID >", value, "ticketTimesId");
            return (Criteria) this;
        }

        public Criteria andTicketTimesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TICKET_TIMES_ID >=", value, "ticketTimesId");
            return (Criteria) this;
        }

        public Criteria andTicketTimesIdLessThan(Integer value) {
            addCriterion("TICKET_TIMES_ID <", value, "ticketTimesId");
            return (Criteria) this;
        }

        public Criteria andTicketTimesIdLessThanOrEqualTo(Integer value) {
            addCriterion("TICKET_TIMES_ID <=", value, "ticketTimesId");
            return (Criteria) this;
        }

        public Criteria andTicketTimesIdIn(List<Integer> values) {
            addCriterion("TICKET_TIMES_ID in", values, "ticketTimesId");
            return (Criteria) this;
        }

        public Criteria andTicketTimesIdNotIn(List<Integer> values) {
            addCriterion("TICKET_TIMES_ID not in", values, "ticketTimesId");
            return (Criteria) this;
        }

        public Criteria andTicketTimesIdBetween(Integer value1, Integer value2) {
            addCriterion("TICKET_TIMES_ID between", value1, value2, "ticketTimesId");
            return (Criteria) this;
        }

        public Criteria andTicketTimesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TICKET_TIMES_ID not between", value1, value2, "ticketTimesId");
            return (Criteria) this;
        }

        public Criteria andValidMonthIsNull() {
            addCriterion("VALID_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andValidMonthIsNotNull() {
            addCriterion("VALID_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andValidMonthEqualTo(String value) {
            addCriterion("VALID_MONTH =", value, "validMonth");
            return (Criteria) this;
        }

        public Criteria andValidMonthNotEqualTo(String value) {
            addCriterion("VALID_MONTH <>", value, "validMonth");
            return (Criteria) this;
        }

        public Criteria andValidMonthGreaterThan(String value) {
            addCriterion("VALID_MONTH >", value, "validMonth");
            return (Criteria) this;
        }

        public Criteria andValidMonthGreaterThanOrEqualTo(String value) {
            addCriterion("VALID_MONTH >=", value, "validMonth");
            return (Criteria) this;
        }

        public Criteria andValidMonthLessThan(String value) {
            addCriterion("VALID_MONTH <", value, "validMonth");
            return (Criteria) this;
        }

        public Criteria andValidMonthLessThanOrEqualTo(String value) {
            addCriterion("VALID_MONTH <=", value, "validMonth");
            return (Criteria) this;
        }

        public Criteria andValidMonthLike(String value) {
            addCriterion("VALID_MONTH like", value, "validMonth");
            return (Criteria) this;
        }

        public Criteria andValidMonthNotLike(String value) {
            addCriterion("VALID_MONTH not like", value, "validMonth");
            return (Criteria) this;
        }

        public Criteria andValidMonthIn(List<String> values) {
            addCriterion("VALID_MONTH in", values, "validMonth");
            return (Criteria) this;
        }

        public Criteria andValidMonthNotIn(List<String> values) {
            addCriterion("VALID_MONTH not in", values, "validMonth");
            return (Criteria) this;
        }

        public Criteria andValidMonthBetween(String value1, String value2) {
            addCriterion("VALID_MONTH between", value1, value2, "validMonth");
            return (Criteria) this;
        }

        public Criteria andValidMonthNotBetween(String value1, String value2) {
            addCriterion("VALID_MONTH not between", value1, value2, "validMonth");
            return (Criteria) this;
        }

        public Criteria andUiFreeTimesIsNull() {
            addCriterion("UI_FREE_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andUiFreeTimesIsNotNull() {
            addCriterion("UI_FREE_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andUiFreeTimesEqualTo(Integer value) {
            addCriterion("UI_FREE_TIMES =", value, "uiFreeTimes");
            return (Criteria) this;
        }

        public Criteria andUiFreeTimesNotEqualTo(Integer value) {
            addCriterion("UI_FREE_TIMES <>", value, "uiFreeTimes");
            return (Criteria) this;
        }

        public Criteria andUiFreeTimesGreaterThan(Integer value) {
            addCriterion("UI_FREE_TIMES >", value, "uiFreeTimes");
            return (Criteria) this;
        }

        public Criteria andUiFreeTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("UI_FREE_TIMES >=", value, "uiFreeTimes");
            return (Criteria) this;
        }

        public Criteria andUiFreeTimesLessThan(Integer value) {
            addCriterion("UI_FREE_TIMES <", value, "uiFreeTimes");
            return (Criteria) this;
        }

        public Criteria andUiFreeTimesLessThanOrEqualTo(Integer value) {
            addCriterion("UI_FREE_TIMES <=", value, "uiFreeTimes");
            return (Criteria) this;
        }

        public Criteria andUiFreeTimesIn(List<Integer> values) {
            addCriterion("UI_FREE_TIMES in", values, "uiFreeTimes");
            return (Criteria) this;
        }

        public Criteria andUiFreeTimesNotIn(List<Integer> values) {
            addCriterion("UI_FREE_TIMES not in", values, "uiFreeTimes");
            return (Criteria) this;
        }

        public Criteria andUiFreeTimesBetween(Integer value1, Integer value2) {
            addCriterion("UI_FREE_TIMES between", value1, value2, "uiFreeTimes");
            return (Criteria) this;
        }

        public Criteria andUiFreeTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("UI_FREE_TIMES not between", value1, value2, "uiFreeTimes");
            return (Criteria) this;
        }

        public Criteria andUiFreeAfterTimesIsNull() {
            addCriterion("UI_FREE_AFTER_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andUiFreeAfterTimesIsNotNull() {
            addCriterion("UI_FREE_AFTER_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andUiFreeAfterTimesEqualTo(Integer value) {
            addCriterion("UI_FREE_AFTER_TIMES =", value, "uiFreeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiFreeAfterTimesNotEqualTo(Integer value) {
            addCriterion("UI_FREE_AFTER_TIMES <>", value, "uiFreeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiFreeAfterTimesGreaterThan(Integer value) {
            addCriterion("UI_FREE_AFTER_TIMES >", value, "uiFreeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiFreeAfterTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("UI_FREE_AFTER_TIMES >=", value, "uiFreeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiFreeAfterTimesLessThan(Integer value) {
            addCriterion("UI_FREE_AFTER_TIMES <", value, "uiFreeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiFreeAfterTimesLessThanOrEqualTo(Integer value) {
            addCriterion("UI_FREE_AFTER_TIMES <=", value, "uiFreeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiFreeAfterTimesIn(List<Integer> values) {
            addCriterion("UI_FREE_AFTER_TIMES in", values, "uiFreeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiFreeAfterTimesNotIn(List<Integer> values) {
            addCriterion("UI_FREE_AFTER_TIMES not in", values, "uiFreeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiFreeAfterTimesBetween(Integer value1, Integer value2) {
            addCriterion("UI_FREE_AFTER_TIMES between", value1, value2, "uiFreeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiFreeAfterTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("UI_FREE_AFTER_TIMES not between", value1, value2, "uiFreeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiOthersTimesIsNull() {
            addCriterion("UI_OTHERS_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andUiOthersTimesIsNotNull() {
            addCriterion("UI_OTHERS_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andUiOthersTimesEqualTo(Integer value) {
            addCriterion("UI_OTHERS_TIMES =", value, "uiOthersTimes");
            return (Criteria) this;
        }

        public Criteria andUiOthersTimesNotEqualTo(Integer value) {
            addCriterion("UI_OTHERS_TIMES <>", value, "uiOthersTimes");
            return (Criteria) this;
        }

        public Criteria andUiOthersTimesGreaterThan(Integer value) {
            addCriterion("UI_OTHERS_TIMES >", value, "uiOthersTimes");
            return (Criteria) this;
        }

        public Criteria andUiOthersTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("UI_OTHERS_TIMES >=", value, "uiOthersTimes");
            return (Criteria) this;
        }

        public Criteria andUiOthersTimesLessThan(Integer value) {
            addCriterion("UI_OTHERS_TIMES <", value, "uiOthersTimes");
            return (Criteria) this;
        }

        public Criteria andUiOthersTimesLessThanOrEqualTo(Integer value) {
            addCriterion("UI_OTHERS_TIMES <=", value, "uiOthersTimes");
            return (Criteria) this;
        }

        public Criteria andUiOthersTimesIn(List<Integer> values) {
            addCriterion("UI_OTHERS_TIMES in", values, "uiOthersTimes");
            return (Criteria) this;
        }

        public Criteria andUiOthersTimesNotIn(List<Integer> values) {
            addCriterion("UI_OTHERS_TIMES not in", values, "uiOthersTimes");
            return (Criteria) this;
        }

        public Criteria andUiOthersTimesBetween(Integer value1, Integer value2) {
            addCriterion("UI_OTHERS_TIMES between", value1, value2, "uiOthersTimes");
            return (Criteria) this;
        }

        public Criteria andUiOthersTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("UI_OTHERS_TIMES not between", value1, value2, "uiOthersTimes");
            return (Criteria) this;
        }

        public Criteria andUiOthersAfterTimesIsNull() {
            addCriterion("UI_OTHERS_AFTER_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andUiOthersAfterTimesIsNotNull() {
            addCriterion("UI_OTHERS_AFTER_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andUiOthersAfterTimesEqualTo(Integer value) {
            addCriterion("UI_OTHERS_AFTER_TIMES =", value, "uiOthersAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiOthersAfterTimesNotEqualTo(Integer value) {
            addCriterion("UI_OTHERS_AFTER_TIMES <>", value, "uiOthersAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiOthersAfterTimesGreaterThan(Integer value) {
            addCriterion("UI_OTHERS_AFTER_TIMES >", value, "uiOthersAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiOthersAfterTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("UI_OTHERS_AFTER_TIMES >=", value, "uiOthersAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiOthersAfterTimesLessThan(Integer value) {
            addCriterion("UI_OTHERS_AFTER_TIMES <", value, "uiOthersAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiOthersAfterTimesLessThanOrEqualTo(Integer value) {
            addCriterion("UI_OTHERS_AFTER_TIMES <=", value, "uiOthersAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiOthersAfterTimesIn(List<Integer> values) {
            addCriterion("UI_OTHERS_AFTER_TIMES in", values, "uiOthersAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiOthersAfterTimesNotIn(List<Integer> values) {
            addCriterion("UI_OTHERS_AFTER_TIMES not in", values, "uiOthersAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiOthersAfterTimesBetween(Integer value1, Integer value2) {
            addCriterion("UI_OTHERS_AFTER_TIMES between", value1, value2, "uiOthersAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiOthersAfterTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("UI_OTHERS_AFTER_TIMES not between", value1, value2, "uiOthersAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiOvertimeTimesIsNull() {
            addCriterion("UI_OVERTIME_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andUiOvertimeTimesIsNotNull() {
            addCriterion("UI_OVERTIME_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andUiOvertimeTimesEqualTo(Integer value) {
            addCriterion("UI_OVERTIME_TIMES =", value, "uiOvertimeTimes");
            return (Criteria) this;
        }

        public Criteria andUiOvertimeTimesNotEqualTo(Integer value) {
            addCriterion("UI_OVERTIME_TIMES <>", value, "uiOvertimeTimes");
            return (Criteria) this;
        }

        public Criteria andUiOvertimeTimesGreaterThan(Integer value) {
            addCriterion("UI_OVERTIME_TIMES >", value, "uiOvertimeTimes");
            return (Criteria) this;
        }

        public Criteria andUiOvertimeTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("UI_OVERTIME_TIMES >=", value, "uiOvertimeTimes");
            return (Criteria) this;
        }

        public Criteria andUiOvertimeTimesLessThan(Integer value) {
            addCriterion("UI_OVERTIME_TIMES <", value, "uiOvertimeTimes");
            return (Criteria) this;
        }

        public Criteria andUiOvertimeTimesLessThanOrEqualTo(Integer value) {
            addCriterion("UI_OVERTIME_TIMES <=", value, "uiOvertimeTimes");
            return (Criteria) this;
        }

        public Criteria andUiOvertimeTimesIn(List<Integer> values) {
            addCriterion("UI_OVERTIME_TIMES in", values, "uiOvertimeTimes");
            return (Criteria) this;
        }

        public Criteria andUiOvertimeTimesNotIn(List<Integer> values) {
            addCriterion("UI_OVERTIME_TIMES not in", values, "uiOvertimeTimes");
            return (Criteria) this;
        }

        public Criteria andUiOvertimeTimesBetween(Integer value1, Integer value2) {
            addCriterion("UI_OVERTIME_TIMES between", value1, value2, "uiOvertimeTimes");
            return (Criteria) this;
        }

        public Criteria andUiOvertimeTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("UI_OVERTIME_TIMES not between", value1, value2, "uiOvertimeTimes");
            return (Criteria) this;
        }

        public Criteria andUiOvertimeAfterTimesIsNull() {
            addCriterion("UI_OVERTIME_AFTER_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andUiOvertimeAfterTimesIsNotNull() {
            addCriterion("UI_OVERTIME_AFTER_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andUiOvertimeAfterTimesEqualTo(Integer value) {
            addCriterion("UI_OVERTIME_AFTER_TIMES =", value, "uiOvertimeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiOvertimeAfterTimesNotEqualTo(Integer value) {
            addCriterion("UI_OVERTIME_AFTER_TIMES <>", value, "uiOvertimeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiOvertimeAfterTimesGreaterThan(Integer value) {
            addCriterion("UI_OVERTIME_AFTER_TIMES >", value, "uiOvertimeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiOvertimeAfterTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("UI_OVERTIME_AFTER_TIMES >=", value, "uiOvertimeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiOvertimeAfterTimesLessThan(Integer value) {
            addCriterion("UI_OVERTIME_AFTER_TIMES <", value, "uiOvertimeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiOvertimeAfterTimesLessThanOrEqualTo(Integer value) {
            addCriterion("UI_OVERTIME_AFTER_TIMES <=", value, "uiOvertimeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiOvertimeAfterTimesIn(List<Integer> values) {
            addCriterion("UI_OVERTIME_AFTER_TIMES in", values, "uiOvertimeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiOvertimeAfterTimesNotIn(List<Integer> values) {
            addCriterion("UI_OVERTIME_AFTER_TIMES not in", values, "uiOvertimeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiOvertimeAfterTimesBetween(Integer value1, Integer value2) {
            addCriterion("UI_OVERTIME_AFTER_TIMES between", value1, value2, "uiOvertimeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiOvertimeAfterTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("UI_OVERTIME_AFTER_TIMES not between", value1, value2, "uiOvertimeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiSpecialTimesIsNull() {
            addCriterion("UI_SPECIAL_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andUiSpecialTimesIsNotNull() {
            addCriterion("UI_SPECIAL_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andUiSpecialTimesEqualTo(Integer value) {
            addCriterion("UI_SPECIAL_TIMES =", value, "uiSpecialTimes");
            return (Criteria) this;
        }

        public Criteria andUiSpecialTimesNotEqualTo(Integer value) {
            addCriterion("UI_SPECIAL_TIMES <>", value, "uiSpecialTimes");
            return (Criteria) this;
        }

        public Criteria andUiSpecialTimesGreaterThan(Integer value) {
            addCriterion("UI_SPECIAL_TIMES >", value, "uiSpecialTimes");
            return (Criteria) this;
        }

        public Criteria andUiSpecialTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("UI_SPECIAL_TIMES >=", value, "uiSpecialTimes");
            return (Criteria) this;
        }

        public Criteria andUiSpecialTimesLessThan(Integer value) {
            addCriterion("UI_SPECIAL_TIMES <", value, "uiSpecialTimes");
            return (Criteria) this;
        }

        public Criteria andUiSpecialTimesLessThanOrEqualTo(Integer value) {
            addCriterion("UI_SPECIAL_TIMES <=", value, "uiSpecialTimes");
            return (Criteria) this;
        }

        public Criteria andUiSpecialTimesIn(List<Integer> values) {
            addCriterion("UI_SPECIAL_TIMES in", values, "uiSpecialTimes");
            return (Criteria) this;
        }

        public Criteria andUiSpecialTimesNotIn(List<Integer> values) {
            addCriterion("UI_SPECIAL_TIMES not in", values, "uiSpecialTimes");
            return (Criteria) this;
        }

        public Criteria andUiSpecialTimesBetween(Integer value1, Integer value2) {
            addCriterion("UI_SPECIAL_TIMES between", value1, value2, "uiSpecialTimes");
            return (Criteria) this;
        }

        public Criteria andUiSpecialTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("UI_SPECIAL_TIMES not between", value1, value2, "uiSpecialTimes");
            return (Criteria) this;
        }

        public Criteria andUiSpecialAfterTimesIsNull() {
            addCriterion("UI_SPECIAL_AFTER_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andUiSpecialAfterTimesIsNotNull() {
            addCriterion("UI_SPECIAL_AFTER_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andUiSpecialAfterTimesEqualTo(Integer value) {
            addCriterion("UI_SPECIAL_AFTER_TIMES =", value, "uiSpecialAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiSpecialAfterTimesNotEqualTo(Integer value) {
            addCriterion("UI_SPECIAL_AFTER_TIMES <>", value, "uiSpecialAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiSpecialAfterTimesGreaterThan(Integer value) {
            addCriterion("UI_SPECIAL_AFTER_TIMES >", value, "uiSpecialAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiSpecialAfterTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("UI_SPECIAL_AFTER_TIMES >=", value, "uiSpecialAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiSpecialAfterTimesLessThan(Integer value) {
            addCriterion("UI_SPECIAL_AFTER_TIMES <", value, "uiSpecialAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiSpecialAfterTimesLessThanOrEqualTo(Integer value) {
            addCriterion("UI_SPECIAL_AFTER_TIMES <=", value, "uiSpecialAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiSpecialAfterTimesIn(List<Integer> values) {
            addCriterion("UI_SPECIAL_AFTER_TIMES in", values, "uiSpecialAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiSpecialAfterTimesNotIn(List<Integer> values) {
            addCriterion("UI_SPECIAL_AFTER_TIMES not in", values, "uiSpecialAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiSpecialAfterTimesBetween(Integer value1, Integer value2) {
            addCriterion("UI_SPECIAL_AFTER_TIMES between", value1, value2, "uiSpecialAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiSpecialAfterTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("UI_SPECIAL_AFTER_TIMES not between", value1, value2, "uiSpecialAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiRechargeTimesIsNull() {
            addCriterion("UI_RECHARGE_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andUiRechargeTimesIsNotNull() {
            addCriterion("UI_RECHARGE_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andUiRechargeTimesEqualTo(Integer value) {
            addCriterion("UI_RECHARGE_TIMES =", value, "uiRechargeTimes");
            return (Criteria) this;
        }

        public Criteria andUiRechargeTimesNotEqualTo(Integer value) {
            addCriterion("UI_RECHARGE_TIMES <>", value, "uiRechargeTimes");
            return (Criteria) this;
        }

        public Criteria andUiRechargeTimesGreaterThan(Integer value) {
            addCriterion("UI_RECHARGE_TIMES >", value, "uiRechargeTimes");
            return (Criteria) this;
        }

        public Criteria andUiRechargeTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("UI_RECHARGE_TIMES >=", value, "uiRechargeTimes");
            return (Criteria) this;
        }

        public Criteria andUiRechargeTimesLessThan(Integer value) {
            addCriterion("UI_RECHARGE_TIMES <", value, "uiRechargeTimes");
            return (Criteria) this;
        }

        public Criteria andUiRechargeTimesLessThanOrEqualTo(Integer value) {
            addCriterion("UI_RECHARGE_TIMES <=", value, "uiRechargeTimes");
            return (Criteria) this;
        }

        public Criteria andUiRechargeTimesIn(List<Integer> values) {
            addCriterion("UI_RECHARGE_TIMES in", values, "uiRechargeTimes");
            return (Criteria) this;
        }

        public Criteria andUiRechargeTimesNotIn(List<Integer> values) {
            addCriterion("UI_RECHARGE_TIMES not in", values, "uiRechargeTimes");
            return (Criteria) this;
        }

        public Criteria andUiRechargeTimesBetween(Integer value1, Integer value2) {
            addCriterion("UI_RECHARGE_TIMES between", value1, value2, "uiRechargeTimes");
            return (Criteria) this;
        }

        public Criteria andUiRechargeTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("UI_RECHARGE_TIMES not between", value1, value2, "uiRechargeTimes");
            return (Criteria) this;
        }

        public Criteria andUiRechargeAfterTimesIsNull() {
            addCriterion("UI_RECHARGE_AFTER_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andUiRechargeAfterTimesIsNotNull() {
            addCriterion("UI_RECHARGE_AFTER_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andUiRechargeAfterTimesEqualTo(Integer value) {
            addCriterion("UI_RECHARGE_AFTER_TIMES =", value, "uiRechargeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiRechargeAfterTimesNotEqualTo(Integer value) {
            addCriterion("UI_RECHARGE_AFTER_TIMES <>", value, "uiRechargeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiRechargeAfterTimesGreaterThan(Integer value) {
            addCriterion("UI_RECHARGE_AFTER_TIMES >", value, "uiRechargeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiRechargeAfterTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("UI_RECHARGE_AFTER_TIMES >=", value, "uiRechargeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiRechargeAfterTimesLessThan(Integer value) {
            addCriterion("UI_RECHARGE_AFTER_TIMES <", value, "uiRechargeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiRechargeAfterTimesLessThanOrEqualTo(Integer value) {
            addCriterion("UI_RECHARGE_AFTER_TIMES <=", value, "uiRechargeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiRechargeAfterTimesIn(List<Integer> values) {
            addCriterion("UI_RECHARGE_AFTER_TIMES in", values, "uiRechargeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiRechargeAfterTimesNotIn(List<Integer> values) {
            addCriterion("UI_RECHARGE_AFTER_TIMES not in", values, "uiRechargeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiRechargeAfterTimesBetween(Integer value1, Integer value2) {
            addCriterion("UI_RECHARGE_AFTER_TIMES between", value1, value2, "uiRechargeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiRechargeAfterTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("UI_RECHARGE_AFTER_TIMES not between", value1, value2, "uiRechargeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiCardRechargeTimesIsNull() {
            addCriterion("UI_CARD_RECHARGE_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andUiCardRechargeTimesIsNotNull() {
            addCriterion("UI_CARD_RECHARGE_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andUiCardRechargeTimesEqualTo(Integer value) {
            addCriterion("UI_CARD_RECHARGE_TIMES =", value, "uiCardRechargeTimes");
            return (Criteria) this;
        }

        public Criteria andUiCardRechargeTimesNotEqualTo(Integer value) {
            addCriterion("UI_CARD_RECHARGE_TIMES <>", value, "uiCardRechargeTimes");
            return (Criteria) this;
        }

        public Criteria andUiCardRechargeTimesGreaterThan(Integer value) {
            addCriterion("UI_CARD_RECHARGE_TIMES >", value, "uiCardRechargeTimes");
            return (Criteria) this;
        }

        public Criteria andUiCardRechargeTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("UI_CARD_RECHARGE_TIMES >=", value, "uiCardRechargeTimes");
            return (Criteria) this;
        }

        public Criteria andUiCardRechargeTimesLessThan(Integer value) {
            addCriterion("UI_CARD_RECHARGE_TIMES <", value, "uiCardRechargeTimes");
            return (Criteria) this;
        }

        public Criteria andUiCardRechargeTimesLessThanOrEqualTo(Integer value) {
            addCriterion("UI_CARD_RECHARGE_TIMES <=", value, "uiCardRechargeTimes");
            return (Criteria) this;
        }

        public Criteria andUiCardRechargeTimesIn(List<Integer> values) {
            addCriterion("UI_CARD_RECHARGE_TIMES in", values, "uiCardRechargeTimes");
            return (Criteria) this;
        }

        public Criteria andUiCardRechargeTimesNotIn(List<Integer> values) {
            addCriterion("UI_CARD_RECHARGE_TIMES not in", values, "uiCardRechargeTimes");
            return (Criteria) this;
        }

        public Criteria andUiCardRechargeTimesBetween(Integer value1, Integer value2) {
            addCriterion("UI_CARD_RECHARGE_TIMES between", value1, value2, "uiCardRechargeTimes");
            return (Criteria) this;
        }

        public Criteria andUiCardRechargeTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("UI_CARD_RECHARGE_TIMES not between", value1, value2, "uiCardRechargeTimes");
            return (Criteria) this;
        }

        public Criteria andUiCardRechargeAfterTimesIsNull() {
            addCriterion("UI_CARD_RECHARGE_AFTER_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andUiCardRechargeAfterTimesIsNotNull() {
            addCriterion("UI_CARD_RECHARGE_AFTER_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andUiCardRechargeAfterTimesEqualTo(Integer value) {
            addCriterion("UI_CARD_RECHARGE_AFTER_TIMES =", value, "uiCardRechargeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiCardRechargeAfterTimesNotEqualTo(Integer value) {
            addCriterion("UI_CARD_RECHARGE_AFTER_TIMES <>", value, "uiCardRechargeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiCardRechargeAfterTimesGreaterThan(Integer value) {
            addCriterion("UI_CARD_RECHARGE_AFTER_TIMES >", value, "uiCardRechargeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiCardRechargeAfterTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("UI_CARD_RECHARGE_AFTER_TIMES >=", value, "uiCardRechargeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiCardRechargeAfterTimesLessThan(Integer value) {
            addCriterion("UI_CARD_RECHARGE_AFTER_TIMES <", value, "uiCardRechargeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiCardRechargeAfterTimesLessThanOrEqualTo(Integer value) {
            addCriterion("UI_CARD_RECHARGE_AFTER_TIMES <=", value, "uiCardRechargeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiCardRechargeAfterTimesIn(List<Integer> values) {
            addCriterion("UI_CARD_RECHARGE_AFTER_TIMES in", values, "uiCardRechargeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiCardRechargeAfterTimesNotIn(List<Integer> values) {
            addCriterion("UI_CARD_RECHARGE_AFTER_TIMES not in", values, "uiCardRechargeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiCardRechargeAfterTimesBetween(Integer value1, Integer value2) {
            addCriterion("UI_CARD_RECHARGE_AFTER_TIMES between", value1, value2, "uiCardRechargeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andUiCardRechargeAfterTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("UI_CARD_RECHARGE_AFTER_TIMES not between", value1, value2, "uiCardRechargeAfterTimes");
            return (Criteria) this;
        }

        public Criteria andCompanyMoneyIsNull() {
            addCriterion("COMPANY_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andCompanyMoneyIsNotNull() {
            addCriterion("COMPANY_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyMoneyEqualTo(BigDecimal value) {
            addCriterion("COMPANY_MONEY =", value, "companyMoney");
            return (Criteria) this;
        }

        public Criteria andCompanyMoneyNotEqualTo(BigDecimal value) {
            addCriterion("COMPANY_MONEY <>", value, "companyMoney");
            return (Criteria) this;
        }

        public Criteria andCompanyMoneyGreaterThan(BigDecimal value) {
            addCriterion("COMPANY_MONEY >", value, "companyMoney");
            return (Criteria) this;
        }

        public Criteria andCompanyMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPANY_MONEY >=", value, "companyMoney");
            return (Criteria) this;
        }

        public Criteria andCompanyMoneyLessThan(BigDecimal value) {
            addCriterion("COMPANY_MONEY <", value, "companyMoney");
            return (Criteria) this;
        }

        public Criteria andCompanyMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPANY_MONEY <=", value, "companyMoney");
            return (Criteria) this;
        }

        public Criteria andCompanyMoneyIn(List<BigDecimal> values) {
            addCriterion("COMPANY_MONEY in", values, "companyMoney");
            return (Criteria) this;
        }

        public Criteria andCompanyMoneyNotIn(List<BigDecimal> values) {
            addCriterion("COMPANY_MONEY not in", values, "companyMoney");
            return (Criteria) this;
        }

        public Criteria andCompanyMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPANY_MONEY between", value1, value2, "companyMoney");
            return (Criteria) this;
        }

        public Criteria andCompanyMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPANY_MONEY not between", value1, value2, "companyMoney");
            return (Criteria) this;
        }

        public Criteria andPersonalMoneyIsNull() {
            addCriterion("PERSONAL_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andPersonalMoneyIsNotNull() {
            addCriterion("PERSONAL_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalMoneyEqualTo(BigDecimal value) {
            addCriterion("PERSONAL_MONEY =", value, "personalMoney");
            return (Criteria) this;
        }

        public Criteria andPersonalMoneyNotEqualTo(BigDecimal value) {
            addCriterion("PERSONAL_MONEY <>", value, "personalMoney");
            return (Criteria) this;
        }

        public Criteria andPersonalMoneyGreaterThan(BigDecimal value) {
            addCriterion("PERSONAL_MONEY >", value, "personalMoney");
            return (Criteria) this;
        }

        public Criteria andPersonalMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PERSONAL_MONEY >=", value, "personalMoney");
            return (Criteria) this;
        }

        public Criteria andPersonalMoneyLessThan(BigDecimal value) {
            addCriterion("PERSONAL_MONEY <", value, "personalMoney");
            return (Criteria) this;
        }

        public Criteria andPersonalMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PERSONAL_MONEY <=", value, "personalMoney");
            return (Criteria) this;
        }

        public Criteria andPersonalMoneyIn(List<BigDecimal> values) {
            addCriterion("PERSONAL_MONEY in", values, "personalMoney");
            return (Criteria) this;
        }

        public Criteria andPersonalMoneyNotIn(List<BigDecimal> values) {
            addCriterion("PERSONAL_MONEY not in", values, "personalMoney");
            return (Criteria) this;
        }

        public Criteria andPersonalMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PERSONAL_MONEY between", value1, value2, "personalMoney");
            return (Criteria) this;
        }

        public Criteria andPersonalMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PERSONAL_MONEY not between", value1, value2, "personalMoney");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesAIsNull() {
            addCriterion("P_TOTAL_TIMES_A is null");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesAIsNotNull() {
            addCriterion("P_TOTAL_TIMES_A is not null");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesAEqualTo(Integer value) {
            addCriterion("P_TOTAL_TIMES_A =", value, "pTotalTimesA");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesANotEqualTo(Integer value) {
            addCriterion("P_TOTAL_TIMES_A <>", value, "pTotalTimesA");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesAGreaterThan(Integer value) {
            addCriterion("P_TOTAL_TIMES_A >", value, "pTotalTimesA");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesAGreaterThanOrEqualTo(Integer value) {
            addCriterion("P_TOTAL_TIMES_A >=", value, "pTotalTimesA");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesALessThan(Integer value) {
            addCriterion("P_TOTAL_TIMES_A <", value, "pTotalTimesA");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesALessThanOrEqualTo(Integer value) {
            addCriterion("P_TOTAL_TIMES_A <=", value, "pTotalTimesA");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesAIn(List<Integer> values) {
            addCriterion("P_TOTAL_TIMES_A in", values, "pTotalTimesA");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesANotIn(List<Integer> values) {
            addCriterion("P_TOTAL_TIMES_A not in", values, "pTotalTimesA");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesABetween(Integer value1, Integer value2) {
            addCriterion("P_TOTAL_TIMES_A between", value1, value2, "pTotalTimesA");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesANotBetween(Integer value1, Integer value2) {
            addCriterion("P_TOTAL_TIMES_A not between", value1, value2, "pTotalTimesA");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesBIsNull() {
            addCriterion("P_TOTAL_TIMES_B is null");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesBIsNotNull() {
            addCriterion("P_TOTAL_TIMES_B is not null");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesBEqualTo(Integer value) {
            addCriterion("P_TOTAL_TIMES_B =", value, "pTotalTimesB");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesBNotEqualTo(Integer value) {
            addCriterion("P_TOTAL_TIMES_B <>", value, "pTotalTimesB");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesBGreaterThan(Integer value) {
            addCriterion("P_TOTAL_TIMES_B >", value, "pTotalTimesB");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesBGreaterThanOrEqualTo(Integer value) {
            addCriterion("P_TOTAL_TIMES_B >=", value, "pTotalTimesB");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesBLessThan(Integer value) {
            addCriterion("P_TOTAL_TIMES_B <", value, "pTotalTimesB");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesBLessThanOrEqualTo(Integer value) {
            addCriterion("P_TOTAL_TIMES_B <=", value, "pTotalTimesB");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesBIn(List<Integer> values) {
            addCriterion("P_TOTAL_TIMES_B in", values, "pTotalTimesB");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesBNotIn(List<Integer> values) {
            addCriterion("P_TOTAL_TIMES_B not in", values, "pTotalTimesB");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesBBetween(Integer value1, Integer value2) {
            addCriterion("P_TOTAL_TIMES_B between", value1, value2, "pTotalTimesB");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesBNotBetween(Integer value1, Integer value2) {
            addCriterion("P_TOTAL_TIMES_B not between", value1, value2, "pTotalTimesB");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesCIsNull() {
            addCriterion("P_TOTAL_TIMES_C is null");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesCIsNotNull() {
            addCriterion("P_TOTAL_TIMES_C is not null");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesCEqualTo(Integer value) {
            addCriterion("P_TOTAL_TIMES_C =", value, "pTotalTimesC");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesCNotEqualTo(Integer value) {
            addCriterion("P_TOTAL_TIMES_C <>", value, "pTotalTimesC");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesCGreaterThan(Integer value) {
            addCriterion("P_TOTAL_TIMES_C >", value, "pTotalTimesC");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesCGreaterThanOrEqualTo(Integer value) {
            addCriterion("P_TOTAL_TIMES_C >=", value, "pTotalTimesC");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesCLessThan(Integer value) {
            addCriterion("P_TOTAL_TIMES_C <", value, "pTotalTimesC");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesCLessThanOrEqualTo(Integer value) {
            addCriterion("P_TOTAL_TIMES_C <=", value, "pTotalTimesC");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesCIn(List<Integer> values) {
            addCriterion("P_TOTAL_TIMES_C in", values, "pTotalTimesC");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesCNotIn(List<Integer> values) {
            addCriterion("P_TOTAL_TIMES_C not in", values, "pTotalTimesC");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesCBetween(Integer value1, Integer value2) {
            addCriterion("P_TOTAL_TIMES_C between", value1, value2, "pTotalTimesC");
            return (Criteria) this;
        }

        public Criteria andPTotalTimesCNotBetween(Integer value1, Integer value2) {
            addCriterion("P_TOTAL_TIMES_C not between", value1, value2, "pTotalTimesC");
            return (Criteria) this;
        }

        public Criteria andCalTicketTypeTimesIsNull() {
            addCriterion("CAL_TICKET_TYPE_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andCalTicketTypeTimesIsNotNull() {
            addCriterion("CAL_TICKET_TYPE_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andCalTicketTypeTimesEqualTo(Integer value) {
            addCriterion("CAL_TICKET_TYPE_TIMES =", value, "calTicketTypeTimes");
            return (Criteria) this;
        }

        public Criteria andCalTicketTypeTimesNotEqualTo(Integer value) {
            addCriterion("CAL_TICKET_TYPE_TIMES <>", value, "calTicketTypeTimes");
            return (Criteria) this;
        }

        public Criteria andCalTicketTypeTimesGreaterThan(Integer value) {
            addCriterion("CAL_TICKET_TYPE_TIMES >", value, "calTicketTypeTimes");
            return (Criteria) this;
        }

        public Criteria andCalTicketTypeTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAL_TICKET_TYPE_TIMES >=", value, "calTicketTypeTimes");
            return (Criteria) this;
        }

        public Criteria andCalTicketTypeTimesLessThan(Integer value) {
            addCriterion("CAL_TICKET_TYPE_TIMES <", value, "calTicketTypeTimes");
            return (Criteria) this;
        }

        public Criteria andCalTicketTypeTimesLessThanOrEqualTo(Integer value) {
            addCriterion("CAL_TICKET_TYPE_TIMES <=", value, "calTicketTypeTimes");
            return (Criteria) this;
        }

        public Criteria andCalTicketTypeTimesIn(List<Integer> values) {
            addCriterion("CAL_TICKET_TYPE_TIMES in", values, "calTicketTypeTimes");
            return (Criteria) this;
        }

        public Criteria andCalTicketTypeTimesNotIn(List<Integer> values) {
            addCriterion("CAL_TICKET_TYPE_TIMES not in", values, "calTicketTypeTimes");
            return (Criteria) this;
        }

        public Criteria andCalTicketTypeTimesBetween(Integer value1, Integer value2) {
            addCriterion("CAL_TICKET_TYPE_TIMES between", value1, value2, "calTicketTypeTimes");
            return (Criteria) this;
        }

        public Criteria andCalTicketTypeTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("CAL_TICKET_TYPE_TIMES not between", value1, value2, "calTicketTypeTimes");
            return (Criteria) this;
        }

        public Criteria andCalTicketTypeIsNull() {
            addCriterion("CAL_TICKET_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCalTicketTypeIsNotNull() {
            addCriterion("CAL_TICKET_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCalTicketTypeEqualTo(String value) {
            addCriterion("CAL_TICKET_TYPE =", value, "calTicketType");
            return (Criteria) this;
        }

        public Criteria andCalTicketTypeNotEqualTo(String value) {
            addCriterion("CAL_TICKET_TYPE <>", value, "calTicketType");
            return (Criteria) this;
        }

        public Criteria andCalTicketTypeGreaterThan(String value) {
            addCriterion("CAL_TICKET_TYPE >", value, "calTicketType");
            return (Criteria) this;
        }

        public Criteria andCalTicketTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CAL_TICKET_TYPE >=", value, "calTicketType");
            return (Criteria) this;
        }

        public Criteria andCalTicketTypeLessThan(String value) {
            addCriterion("CAL_TICKET_TYPE <", value, "calTicketType");
            return (Criteria) this;
        }

        public Criteria andCalTicketTypeLessThanOrEqualTo(String value) {
            addCriterion("CAL_TICKET_TYPE <=", value, "calTicketType");
            return (Criteria) this;
        }

        public Criteria andCalTicketTypeLike(String value) {
            addCriterion("CAL_TICKET_TYPE like", value, "calTicketType");
            return (Criteria) this;
        }

        public Criteria andCalTicketTypeNotLike(String value) {
            addCriterion("CAL_TICKET_TYPE not like", value, "calTicketType");
            return (Criteria) this;
        }

        public Criteria andCalTicketTypeIn(List<String> values) {
            addCriterion("CAL_TICKET_TYPE in", values, "calTicketType");
            return (Criteria) this;
        }

        public Criteria andCalTicketTypeNotIn(List<String> values) {
            addCriterion("CAL_TICKET_TYPE not in", values, "calTicketType");
            return (Criteria) this;
        }

        public Criteria andCalTicketTypeBetween(String value1, String value2) {
            addCriterion("CAL_TICKET_TYPE between", value1, value2, "calTicketType");
            return (Criteria) this;
        }

        public Criteria andCalTicketTypeNotBetween(String value1, String value2) {
            addCriterion("CAL_TICKET_TYPE not between", value1, value2, "calTicketType");
            return (Criteria) this;
        }

        public Criteria andWrongStatusIsNull() {
            addCriterion("WRONG_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andWrongStatusIsNotNull() {
            addCriterion("WRONG_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andWrongStatusEqualTo(String value) {
            addCriterion("WRONG_STATUS =", value, "wrongStatus");
            return (Criteria) this;
        }

        public Criteria andWrongStatusNotEqualTo(String value) {
            addCriterion("WRONG_STATUS <>", value, "wrongStatus");
            return (Criteria) this;
        }

        public Criteria andWrongStatusGreaterThan(String value) {
            addCriterion("WRONG_STATUS >", value, "wrongStatus");
            return (Criteria) this;
        }

        public Criteria andWrongStatusGreaterThanOrEqualTo(String value) {
            addCriterion("WRONG_STATUS >=", value, "wrongStatus");
            return (Criteria) this;
        }

        public Criteria andWrongStatusLessThan(String value) {
            addCriterion("WRONG_STATUS <", value, "wrongStatus");
            return (Criteria) this;
        }

        public Criteria andWrongStatusLessThanOrEqualTo(String value) {
            addCriterion("WRONG_STATUS <=", value, "wrongStatus");
            return (Criteria) this;
        }

        public Criteria andWrongStatusLike(String value) {
            addCriterion("WRONG_STATUS like", value, "wrongStatus");
            return (Criteria) this;
        }

        public Criteria andWrongStatusNotLike(String value) {
            addCriterion("WRONG_STATUS not like", value, "wrongStatus");
            return (Criteria) this;
        }

        public Criteria andWrongStatusIn(List<String> values) {
            addCriterion("WRONG_STATUS in", values, "wrongStatus");
            return (Criteria) this;
        }

        public Criteria andWrongStatusNotIn(List<String> values) {
            addCriterion("WRONG_STATUS not in", values, "wrongStatus");
            return (Criteria) this;
        }

        public Criteria andWrongStatusBetween(String value1, String value2) {
            addCriterion("WRONG_STATUS between", value1, value2, "wrongStatus");
            return (Criteria) this;
        }

        public Criteria andWrongStatusNotBetween(String value1, String value2) {
            addCriterion("WRONG_STATUS not between", value1, value2, "wrongStatus");
            return (Criteria) this;
        }

        public Criteria andTotalTimesAIsNull() {
            addCriterion("TOTAL_TIMES_A is null");
            return (Criteria) this;
        }

        public Criteria andTotalTimesAIsNotNull() {
            addCriterion("TOTAL_TIMES_A is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTimesAEqualTo(Integer value) {
            addCriterion("TOTAL_TIMES_A =", value, "totalTimesA");
            return (Criteria) this;
        }

        public Criteria andTotalTimesANotEqualTo(Integer value) {
            addCriterion("TOTAL_TIMES_A <>", value, "totalTimesA");
            return (Criteria) this;
        }

        public Criteria andTotalTimesAGreaterThan(Integer value) {
            addCriterion("TOTAL_TIMES_A >", value, "totalTimesA");
            return (Criteria) this;
        }

        public Criteria andTotalTimesAGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_TIMES_A >=", value, "totalTimesA");
            return (Criteria) this;
        }

        public Criteria andTotalTimesALessThan(Integer value) {
            addCriterion("TOTAL_TIMES_A <", value, "totalTimesA");
            return (Criteria) this;
        }

        public Criteria andTotalTimesALessThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_TIMES_A <=", value, "totalTimesA");
            return (Criteria) this;
        }

        public Criteria andTotalTimesAIn(List<Integer> values) {
            addCriterion("TOTAL_TIMES_A in", values, "totalTimesA");
            return (Criteria) this;
        }

        public Criteria andTotalTimesANotIn(List<Integer> values) {
            addCriterion("TOTAL_TIMES_A not in", values, "totalTimesA");
            return (Criteria) this;
        }

        public Criteria andTotalTimesABetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_TIMES_A between", value1, value2, "totalTimesA");
            return (Criteria) this;
        }

        public Criteria andTotalTimesANotBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_TIMES_A not between", value1, value2, "totalTimesA");
            return (Criteria) this;
        }

        public Criteria andTotalTimesBIsNull() {
            addCriterion("TOTAL_TIMES_B is null");
            return (Criteria) this;
        }

        public Criteria andTotalTimesBIsNotNull() {
            addCriterion("TOTAL_TIMES_B is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTimesBEqualTo(Integer value) {
            addCriterion("TOTAL_TIMES_B =", value, "totalTimesB");
            return (Criteria) this;
        }

        public Criteria andTotalTimesBNotEqualTo(Integer value) {
            addCriterion("TOTAL_TIMES_B <>", value, "totalTimesB");
            return (Criteria) this;
        }

        public Criteria andTotalTimesBGreaterThan(Integer value) {
            addCriterion("TOTAL_TIMES_B >", value, "totalTimesB");
            return (Criteria) this;
        }

        public Criteria andTotalTimesBGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_TIMES_B >=", value, "totalTimesB");
            return (Criteria) this;
        }

        public Criteria andTotalTimesBLessThan(Integer value) {
            addCriterion("TOTAL_TIMES_B <", value, "totalTimesB");
            return (Criteria) this;
        }

        public Criteria andTotalTimesBLessThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_TIMES_B <=", value, "totalTimesB");
            return (Criteria) this;
        }

        public Criteria andTotalTimesBIn(List<Integer> values) {
            addCriterion("TOTAL_TIMES_B in", values, "totalTimesB");
            return (Criteria) this;
        }

        public Criteria andTotalTimesBNotIn(List<Integer> values) {
            addCriterion("TOTAL_TIMES_B not in", values, "totalTimesB");
            return (Criteria) this;
        }

        public Criteria andTotalTimesBBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_TIMES_B between", value1, value2, "totalTimesB");
            return (Criteria) this;
        }

        public Criteria andTotalTimesBNotBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_TIMES_B not between", value1, value2, "totalTimesB");
            return (Criteria) this;
        }

        public Criteria andTotalTimesCIsNull() {
            addCriterion("TOTAL_TIMES_C is null");
            return (Criteria) this;
        }

        public Criteria andTotalTimesCIsNotNull() {
            addCriterion("TOTAL_TIMES_C is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTimesCEqualTo(Integer value) {
            addCriterion("TOTAL_TIMES_C =", value, "totalTimesC");
            return (Criteria) this;
        }

        public Criteria andTotalTimesCNotEqualTo(Integer value) {
            addCriterion("TOTAL_TIMES_C <>", value, "totalTimesC");
            return (Criteria) this;
        }

        public Criteria andTotalTimesCGreaterThan(Integer value) {
            addCriterion("TOTAL_TIMES_C >", value, "totalTimesC");
            return (Criteria) this;
        }

        public Criteria andTotalTimesCGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_TIMES_C >=", value, "totalTimesC");
            return (Criteria) this;
        }

        public Criteria andTotalTimesCLessThan(Integer value) {
            addCriterion("TOTAL_TIMES_C <", value, "totalTimesC");
            return (Criteria) this;
        }

        public Criteria andTotalTimesCLessThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_TIMES_C <=", value, "totalTimesC");
            return (Criteria) this;
        }

        public Criteria andTotalTimesCIn(List<Integer> values) {
            addCriterion("TOTAL_TIMES_C in", values, "totalTimesC");
            return (Criteria) this;
        }

        public Criteria andTotalTimesCNotIn(List<Integer> values) {
            addCriterion("TOTAL_TIMES_C not in", values, "totalTimesC");
            return (Criteria) this;
        }

        public Criteria andTotalTimesCBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_TIMES_C between", value1, value2, "totalTimesC");
            return (Criteria) this;
        }

        public Criteria andTotalTimesCNotBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_TIMES_C not between", value1, value2, "totalTimesC");
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

        public Criteria andSummaryStatusIsNull() {
            addCriterion("SUMMARY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSummaryStatusIsNotNull() {
            addCriterion("SUMMARY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryStatusEqualTo(String value) {
            addCriterion("SUMMARY_STATUS =", value, "summaryStatus");
            return (Criteria) this;
        }

        public Criteria andSummaryStatusNotEqualTo(String value) {
            addCriterion("SUMMARY_STATUS <>", value, "summaryStatus");
            return (Criteria) this;
        }

        public Criteria andSummaryStatusGreaterThan(String value) {
            addCriterion("SUMMARY_STATUS >", value, "summaryStatus");
            return (Criteria) this;
        }

        public Criteria andSummaryStatusGreaterThanOrEqualTo(String value) {
            addCriterion("SUMMARY_STATUS >=", value, "summaryStatus");
            return (Criteria) this;
        }

        public Criteria andSummaryStatusLessThan(String value) {
            addCriterion("SUMMARY_STATUS <", value, "summaryStatus");
            return (Criteria) this;
        }

        public Criteria andSummaryStatusLessThanOrEqualTo(String value) {
            addCriterion("SUMMARY_STATUS <=", value, "summaryStatus");
            return (Criteria) this;
        }

        public Criteria andSummaryStatusLike(String value) {
            addCriterion("SUMMARY_STATUS like", value, "summaryStatus");
            return (Criteria) this;
        }

        public Criteria andSummaryStatusNotLike(String value) {
            addCriterion("SUMMARY_STATUS not like", value, "summaryStatus");
            return (Criteria) this;
        }

        public Criteria andSummaryStatusIn(List<String> values) {
            addCriterion("SUMMARY_STATUS in", values, "summaryStatus");
            return (Criteria) this;
        }

        public Criteria andSummaryStatusNotIn(List<String> values) {
            addCriterion("SUMMARY_STATUS not in", values, "summaryStatus");
            return (Criteria) this;
        }

        public Criteria andSummaryStatusBetween(String value1, String value2) {
            addCriterion("SUMMARY_STATUS between", value1, value2, "summaryStatus");
            return (Criteria) this;
        }

        public Criteria andSummaryStatusNotBetween(String value1, String value2) {
            addCriterion("SUMMARY_STATUS not between", value1, value2, "summaryStatus");
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