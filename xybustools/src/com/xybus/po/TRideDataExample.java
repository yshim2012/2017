package com.xybus.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TRideDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TRideDataExample() {
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

        public Criteria andPosNoIsNull() {
            addCriterion("POS_NO is null");
            return (Criteria) this;
        }

        public Criteria andPosNoIsNotNull() {
            addCriterion("POS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPosNoEqualTo(String value) {
            addCriterion("POS_NO =", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoNotEqualTo(String value) {
            addCriterion("POS_NO <>", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoGreaterThan(String value) {
            addCriterion("POS_NO >", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoGreaterThanOrEqualTo(String value) {
            addCriterion("POS_NO >=", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoLessThan(String value) {
            addCriterion("POS_NO <", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoLessThanOrEqualTo(String value) {
            addCriterion("POS_NO <=", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoLike(String value) {
            addCriterion("POS_NO like", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoNotLike(String value) {
            addCriterion("POS_NO not like", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoIn(List<String> values) {
            addCriterion("POS_NO in", values, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoNotIn(List<String> values) {
            addCriterion("POS_NO not in", values, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoBetween(String value1, String value2) {
            addCriterion("POS_NO between", value1, value2, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoNotBetween(String value1, String value2) {
            addCriterion("POS_NO not between", value1, value2, "posNo");
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

        public Criteria andBoardingLongitudeIsNull() {
            addCriterion("BOARDING_LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andBoardingLongitudeIsNotNull() {
            addCriterion("BOARDING_LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andBoardingLongitudeEqualTo(BigDecimal value) {
            addCriterion("BOARDING_LONGITUDE =", value, "boardingLongitude");
            return (Criteria) this;
        }

        public Criteria andBoardingLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("BOARDING_LONGITUDE <>", value, "boardingLongitude");
            return (Criteria) this;
        }

        public Criteria andBoardingLongitudeGreaterThan(BigDecimal value) {
            addCriterion("BOARDING_LONGITUDE >", value, "boardingLongitude");
            return (Criteria) this;
        }

        public Criteria andBoardingLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BOARDING_LONGITUDE >=", value, "boardingLongitude");
            return (Criteria) this;
        }

        public Criteria andBoardingLongitudeLessThan(BigDecimal value) {
            addCriterion("BOARDING_LONGITUDE <", value, "boardingLongitude");
            return (Criteria) this;
        }

        public Criteria andBoardingLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BOARDING_LONGITUDE <=", value, "boardingLongitude");
            return (Criteria) this;
        }

        public Criteria andBoardingLongitudeIn(List<BigDecimal> values) {
            addCriterion("BOARDING_LONGITUDE in", values, "boardingLongitude");
            return (Criteria) this;
        }

        public Criteria andBoardingLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("BOARDING_LONGITUDE not in", values, "boardingLongitude");
            return (Criteria) this;
        }

        public Criteria andBoardingLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BOARDING_LONGITUDE between", value1, value2, "boardingLongitude");
            return (Criteria) this;
        }

        public Criteria andBoardingLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BOARDING_LONGITUDE not between", value1, value2, "boardingLongitude");
            return (Criteria) this;
        }

        public Criteria andBoardingLatitudeIsNull() {
            addCriterion("BOARDING_LATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andBoardingLatitudeIsNotNull() {
            addCriterion("BOARDING_LATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andBoardingLatitudeEqualTo(BigDecimal value) {
            addCriterion("BOARDING_LATITUDE =", value, "boardingLatitude");
            return (Criteria) this;
        }

        public Criteria andBoardingLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("BOARDING_LATITUDE <>", value, "boardingLatitude");
            return (Criteria) this;
        }

        public Criteria andBoardingLatitudeGreaterThan(BigDecimal value) {
            addCriterion("BOARDING_LATITUDE >", value, "boardingLatitude");
            return (Criteria) this;
        }

        public Criteria andBoardingLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BOARDING_LATITUDE >=", value, "boardingLatitude");
            return (Criteria) this;
        }

        public Criteria andBoardingLatitudeLessThan(BigDecimal value) {
            addCriterion("BOARDING_LATITUDE <", value, "boardingLatitude");
            return (Criteria) this;
        }

        public Criteria andBoardingLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BOARDING_LATITUDE <=", value, "boardingLatitude");
            return (Criteria) this;
        }

        public Criteria andBoardingLatitudeIn(List<BigDecimal> values) {
            addCriterion("BOARDING_LATITUDE in", values, "boardingLatitude");
            return (Criteria) this;
        }

        public Criteria andBoardingLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("BOARDING_LATITUDE not in", values, "boardingLatitude");
            return (Criteria) this;
        }

        public Criteria andBoardingLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BOARDING_LATITUDE between", value1, value2, "boardingLatitude");
            return (Criteria) this;
        }

        public Criteria andBoardingLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BOARDING_LATITUDE not between", value1, value2, "boardingLatitude");
            return (Criteria) this;
        }

        public Criteria andAlightingLongitudeIsNull() {
            addCriterion("ALIGHTING_LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andAlightingLongitudeIsNotNull() {
            addCriterion("ALIGHTING_LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andAlightingLongitudeEqualTo(BigDecimal value) {
            addCriterion("ALIGHTING_LONGITUDE =", value, "alightingLongitude");
            return (Criteria) this;
        }

        public Criteria andAlightingLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("ALIGHTING_LONGITUDE <>", value, "alightingLongitude");
            return (Criteria) this;
        }

        public Criteria andAlightingLongitudeGreaterThan(BigDecimal value) {
            addCriterion("ALIGHTING_LONGITUDE >", value, "alightingLongitude");
            return (Criteria) this;
        }

        public Criteria andAlightingLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ALIGHTING_LONGITUDE >=", value, "alightingLongitude");
            return (Criteria) this;
        }

        public Criteria andAlightingLongitudeLessThan(BigDecimal value) {
            addCriterion("ALIGHTING_LONGITUDE <", value, "alightingLongitude");
            return (Criteria) this;
        }

        public Criteria andAlightingLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ALIGHTING_LONGITUDE <=", value, "alightingLongitude");
            return (Criteria) this;
        }

        public Criteria andAlightingLongitudeIn(List<BigDecimal> values) {
            addCriterion("ALIGHTING_LONGITUDE in", values, "alightingLongitude");
            return (Criteria) this;
        }

        public Criteria andAlightingLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("ALIGHTING_LONGITUDE not in", values, "alightingLongitude");
            return (Criteria) this;
        }

        public Criteria andAlightingLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ALIGHTING_LONGITUDE between", value1, value2, "alightingLongitude");
            return (Criteria) this;
        }

        public Criteria andAlightingLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ALIGHTING_LONGITUDE not between", value1, value2, "alightingLongitude");
            return (Criteria) this;
        }

        public Criteria andAlightingLatitudeIsNull() {
            addCriterion("ALIGHTING_LATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andAlightingLatitudeIsNotNull() {
            addCriterion("ALIGHTING_LATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andAlightingLatitudeEqualTo(BigDecimal value) {
            addCriterion("ALIGHTING_LATITUDE =", value, "alightingLatitude");
            return (Criteria) this;
        }

        public Criteria andAlightingLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("ALIGHTING_LATITUDE <>", value, "alightingLatitude");
            return (Criteria) this;
        }

        public Criteria andAlightingLatitudeGreaterThan(BigDecimal value) {
            addCriterion("ALIGHTING_LATITUDE >", value, "alightingLatitude");
            return (Criteria) this;
        }

        public Criteria andAlightingLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ALIGHTING_LATITUDE >=", value, "alightingLatitude");
            return (Criteria) this;
        }

        public Criteria andAlightingLatitudeLessThan(BigDecimal value) {
            addCriterion("ALIGHTING_LATITUDE <", value, "alightingLatitude");
            return (Criteria) this;
        }

        public Criteria andAlightingLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ALIGHTING_LATITUDE <=", value, "alightingLatitude");
            return (Criteria) this;
        }

        public Criteria andAlightingLatitudeIn(List<BigDecimal> values) {
            addCriterion("ALIGHTING_LATITUDE in", values, "alightingLatitude");
            return (Criteria) this;
        }

        public Criteria andAlightingLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("ALIGHTING_LATITUDE not in", values, "alightingLatitude");
            return (Criteria) this;
        }

        public Criteria andAlightingLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ALIGHTING_LATITUDE between", value1, value2, "alightingLatitude");
            return (Criteria) this;
        }

        public Criteria andAlightingLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ALIGHTING_LATITUDE not between", value1, value2, "alightingLatitude");
            return (Criteria) this;
        }

        public Criteria andBoardingTimeIsNull() {
            addCriterion("BOARDING_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBoardingTimeIsNotNull() {
            addCriterion("BOARDING_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBoardingTimeEqualTo(Date value) {
            addCriterion("BOARDING_TIME =", value, "boardingTime");
            return (Criteria) this;
        }

        public Criteria andBoardingTimeNotEqualTo(Date value) {
            addCriterion("BOARDING_TIME <>", value, "boardingTime");
            return (Criteria) this;
        }

        public Criteria andBoardingTimeGreaterThan(Date value) {
            addCriterion("BOARDING_TIME >", value, "boardingTime");
            return (Criteria) this;
        }

        public Criteria andBoardingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BOARDING_TIME >=", value, "boardingTime");
            return (Criteria) this;
        }

        public Criteria andBoardingTimeLessThan(Date value) {
            addCriterion("BOARDING_TIME <", value, "boardingTime");
            return (Criteria) this;
        }

        public Criteria andBoardingTimeLessThanOrEqualTo(Date value) {
            addCriterion("BOARDING_TIME <=", value, "boardingTime");
            return (Criteria) this;
        }

        public Criteria andBoardingTimeIn(List<Date> values) {
            addCriterion("BOARDING_TIME in", values, "boardingTime");
            return (Criteria) this;
        }

        public Criteria andBoardingTimeNotIn(List<Date> values) {
            addCriterion("BOARDING_TIME not in", values, "boardingTime");
            return (Criteria) this;
        }

        public Criteria andBoardingTimeBetween(Date value1, Date value2) {
            addCriterion("BOARDING_TIME between", value1, value2, "boardingTime");
            return (Criteria) this;
        }

        public Criteria andBoardingTimeNotBetween(Date value1, Date value2) {
            addCriterion("BOARDING_TIME not between", value1, value2, "boardingTime");
            return (Criteria) this;
        }

        public Criteria andAlightingTimeIsNull() {
            addCriterion("ALIGHTING_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAlightingTimeIsNotNull() {
            addCriterion("ALIGHTING_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAlightingTimeEqualTo(Date value) {
            addCriterion("ALIGHTING_TIME =", value, "alightingTime");
            return (Criteria) this;
        }

        public Criteria andAlightingTimeNotEqualTo(Date value) {
            addCriterion("ALIGHTING_TIME <>", value, "alightingTime");
            return (Criteria) this;
        }

        public Criteria andAlightingTimeGreaterThan(Date value) {
            addCriterion("ALIGHTING_TIME >", value, "alightingTime");
            return (Criteria) this;
        }

        public Criteria andAlightingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ALIGHTING_TIME >=", value, "alightingTime");
            return (Criteria) this;
        }

        public Criteria andAlightingTimeLessThan(Date value) {
            addCriterion("ALIGHTING_TIME <", value, "alightingTime");
            return (Criteria) this;
        }

        public Criteria andAlightingTimeLessThanOrEqualTo(Date value) {
            addCriterion("ALIGHTING_TIME <=", value, "alightingTime");
            return (Criteria) this;
        }

        public Criteria andAlightingTimeIn(List<Date> values) {
            addCriterion("ALIGHTING_TIME in", values, "alightingTime");
            return (Criteria) this;
        }

        public Criteria andAlightingTimeNotIn(List<Date> values) {
            addCriterion("ALIGHTING_TIME not in", values, "alightingTime");
            return (Criteria) this;
        }

        public Criteria andAlightingTimeBetween(Date value1, Date value2) {
            addCriterion("ALIGHTING_TIME between", value1, value2, "alightingTime");
            return (Criteria) this;
        }

        public Criteria andAlightingTimeNotBetween(Date value1, Date value2) {
            addCriterion("ALIGHTING_TIME not between", value1, value2, "alightingTime");
            return (Criteria) this;
        }

        public Criteria andAlightingLocIdIsNull() {
            addCriterion("ALIGHTING_LOC_ID is null");
            return (Criteria) this;
        }

        public Criteria andAlightingLocIdIsNotNull() {
            addCriterion("ALIGHTING_LOC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAlightingLocIdEqualTo(Integer value) {
            addCriterion("ALIGHTING_LOC_ID =", value, "alightingLocId");
            return (Criteria) this;
        }

        public Criteria andAlightingLocIdNotEqualTo(Integer value) {
            addCriterion("ALIGHTING_LOC_ID <>", value, "alightingLocId");
            return (Criteria) this;
        }

        public Criteria andAlightingLocIdGreaterThan(Integer value) {
            addCriterion("ALIGHTING_LOC_ID >", value, "alightingLocId");
            return (Criteria) this;
        }

        public Criteria andAlightingLocIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ALIGHTING_LOC_ID >=", value, "alightingLocId");
            return (Criteria) this;
        }

        public Criteria andAlightingLocIdLessThan(Integer value) {
            addCriterion("ALIGHTING_LOC_ID <", value, "alightingLocId");
            return (Criteria) this;
        }

        public Criteria andAlightingLocIdLessThanOrEqualTo(Integer value) {
            addCriterion("ALIGHTING_LOC_ID <=", value, "alightingLocId");
            return (Criteria) this;
        }

        public Criteria andAlightingLocIdIn(List<Integer> values) {
            addCriterion("ALIGHTING_LOC_ID in", values, "alightingLocId");
            return (Criteria) this;
        }

        public Criteria andAlightingLocIdNotIn(List<Integer> values) {
            addCriterion("ALIGHTING_LOC_ID not in", values, "alightingLocId");
            return (Criteria) this;
        }

        public Criteria andAlightingLocIdBetween(Integer value1, Integer value2) {
            addCriterion("ALIGHTING_LOC_ID between", value1, value2, "alightingLocId");
            return (Criteria) this;
        }

        public Criteria andAlightingLocIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ALIGHTING_LOC_ID not between", value1, value2, "alightingLocId");
            return (Criteria) this;
        }

        public Criteria andBoardingLocIdIsNull() {
            addCriterion("BOARDING_LOC_ID is null");
            return (Criteria) this;
        }

        public Criteria andBoardingLocIdIsNotNull() {
            addCriterion("BOARDING_LOC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBoardingLocIdEqualTo(Integer value) {
            addCriterion("BOARDING_LOC_ID =", value, "boardingLocId");
            return (Criteria) this;
        }

        public Criteria andBoardingLocIdNotEqualTo(Integer value) {
            addCriterion("BOARDING_LOC_ID <>", value, "boardingLocId");
            return (Criteria) this;
        }

        public Criteria andBoardingLocIdGreaterThan(Integer value) {
            addCriterion("BOARDING_LOC_ID >", value, "boardingLocId");
            return (Criteria) this;
        }

        public Criteria andBoardingLocIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BOARDING_LOC_ID >=", value, "boardingLocId");
            return (Criteria) this;
        }

        public Criteria andBoardingLocIdLessThan(Integer value) {
            addCriterion("BOARDING_LOC_ID <", value, "boardingLocId");
            return (Criteria) this;
        }

        public Criteria andBoardingLocIdLessThanOrEqualTo(Integer value) {
            addCriterion("BOARDING_LOC_ID <=", value, "boardingLocId");
            return (Criteria) this;
        }

        public Criteria andBoardingLocIdIn(List<Integer> values) {
            addCriterion("BOARDING_LOC_ID in", values, "boardingLocId");
            return (Criteria) this;
        }

        public Criteria andBoardingLocIdNotIn(List<Integer> values) {
            addCriterion("BOARDING_LOC_ID not in", values, "boardingLocId");
            return (Criteria) this;
        }

        public Criteria andBoardingLocIdBetween(Integer value1, Integer value2) {
            addCriterion("BOARDING_LOC_ID between", value1, value2, "boardingLocId");
            return (Criteria) this;
        }

        public Criteria andBoardingLocIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BOARDING_LOC_ID not between", value1, value2, "boardingLocId");
            return (Criteria) this;
        }

        public Criteria andRouteIdIsNull() {
            addCriterion("ROUTE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRouteIdIsNotNull() {
            addCriterion("ROUTE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRouteIdEqualTo(Short value) {
            addCriterion("ROUTE_ID =", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotEqualTo(Short value) {
            addCriterion("ROUTE_ID <>", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThan(Short value) {
            addCriterion("ROUTE_ID >", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThanOrEqualTo(Short value) {
            addCriterion("ROUTE_ID >=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThan(Short value) {
            addCriterion("ROUTE_ID <", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThanOrEqualTo(Short value) {
            addCriterion("ROUTE_ID <=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdIn(List<Short> values) {
            addCriterion("ROUTE_ID in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotIn(List<Short> values) {
            addCriterion("ROUTE_ID not in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdBetween(Short value1, Short value2) {
            addCriterion("ROUTE_ID between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotBetween(Short value1, Short value2) {
            addCriterion("ROUTE_ID not between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIsNull() {
            addCriterion("TICKET_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIsNotNull() {
            addCriterion("TICKET_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTicketTypeEqualTo(String value) {
            addCriterion("TICKET_TYPE =", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotEqualTo(String value) {
            addCriterion("TICKET_TYPE <>", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeGreaterThan(String value) {
            addCriterion("TICKET_TYPE >", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TICKET_TYPE >=", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLessThan(String value) {
            addCriterion("TICKET_TYPE <", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLessThanOrEqualTo(String value) {
            addCriterion("TICKET_TYPE <=", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeLike(String value) {
            addCriterion("TICKET_TYPE like", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotLike(String value) {
            addCriterion("TICKET_TYPE not like", value, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeIn(List<String> values) {
            addCriterion("TICKET_TYPE in", values, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotIn(List<String> values) {
            addCriterion("TICKET_TYPE not in", values, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeBetween(String value1, String value2) {
            addCriterion("TICKET_TYPE between", value1, value2, "ticketType");
            return (Criteria) this;
        }

        public Criteria andTicketTypeNotBetween(String value1, String value2) {
            addCriterion("TICKET_TYPE not between", value1, value2, "ticketType");
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

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andJobNumberIsNull() {
            addCriterion("JOB_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andJobNumberIsNotNull() {
            addCriterion("JOB_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andJobNumberEqualTo(String value) {
            addCriterion("JOB_NUMBER =", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotEqualTo(String value) {
            addCriterion("JOB_NUMBER <>", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberGreaterThan(String value) {
            addCriterion("JOB_NUMBER >", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_NUMBER >=", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberLessThan(String value) {
            addCriterion("JOB_NUMBER <", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberLessThanOrEqualTo(String value) {
            addCriterion("JOB_NUMBER <=", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberLike(String value) {
            addCriterion("JOB_NUMBER like", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotLike(String value) {
            addCriterion("JOB_NUMBER not like", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberIn(List<String> values) {
            addCriterion("JOB_NUMBER in", values, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotIn(List<String> values) {
            addCriterion("JOB_NUMBER not in", values, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberBetween(String value1, String value2) {
            addCriterion("JOB_NUMBER between", value1, value2, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotBetween(String value1, String value2) {
            addCriterion("JOB_NUMBER not between", value1, value2, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDeptIsNull() {
            addCriterion("DEPT is null");
            return (Criteria) this;
        }

        public Criteria andDeptIsNotNull() {
            addCriterion("DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andDeptEqualTo(String value) {
            addCriterion("DEPT =", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotEqualTo(String value) {
            addCriterion("DEPT <>", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThan(String value) {
            addCriterion("DEPT >", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT >=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThan(String value) {
            addCriterion("DEPT <", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThanOrEqualTo(String value) {
            addCriterion("DEPT <=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLike(String value) {
            addCriterion("DEPT like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotLike(String value) {
            addCriterion("DEPT not like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptIn(List<String> values) {
            addCriterion("DEPT in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotIn(List<String> values) {
            addCriterion("DEPT not in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptBetween(String value1, String value2) {
            addCriterion("DEPT between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotBetween(String value1, String value2) {
            addCriterion("DEPT not between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andCoIsNull() {
            addCriterion("CO is null");
            return (Criteria) this;
        }

        public Criteria andCoIsNotNull() {
            addCriterion("CO is not null");
            return (Criteria) this;
        }

        public Criteria andCoEqualTo(String value) {
            addCriterion("CO =", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotEqualTo(String value) {
            addCriterion("CO <>", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoGreaterThan(String value) {
            addCriterion("CO >", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoGreaterThanOrEqualTo(String value) {
            addCriterion("CO >=", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoLessThan(String value) {
            addCriterion("CO <", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoLessThanOrEqualTo(String value) {
            addCriterion("CO <=", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoLike(String value) {
            addCriterion("CO like", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotLike(String value) {
            addCriterion("CO not like", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoIn(List<String> values) {
            addCriterion("CO in", values, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotIn(List<String> values) {
            addCriterion("CO not in", values, "co");
            return (Criteria) this;
        }

        public Criteria andCoBetween(String value1, String value2) {
            addCriterion("CO between", value1, value2, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotBetween(String value1, String value2) {
            addCriterion("CO not between", value1, value2, "co");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("CARD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("CARD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(String value) {
            addCriterion("CARD_TYPE =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(String value) {
            addCriterion("CARD_TYPE <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(String value) {
            addCriterion("CARD_TYPE >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_TYPE >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(String value) {
            addCriterion("CARD_TYPE <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(String value) {
            addCriterion("CARD_TYPE <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLike(String value) {
            addCriterion("CARD_TYPE like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotLike(String value) {
            addCriterion("CARD_TYPE not like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<String> values) {
            addCriterion("CARD_TYPE in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<String> values) {
            addCriterion("CARD_TYPE not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(String value1, String value2) {
            addCriterion("CARD_TYPE between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(String value1, String value2) {
            addCriterion("CARD_TYPE not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCommuteTypeIsNull() {
            addCriterion("COMMUTE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCommuteTypeIsNotNull() {
            addCriterion("COMMUTE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCommuteTypeEqualTo(String value) {
            addCriterion("COMMUTE_TYPE =", value, "commuteType");
            return (Criteria) this;
        }

        public Criteria andCommuteTypeNotEqualTo(String value) {
            addCriterion("COMMUTE_TYPE <>", value, "commuteType");
            return (Criteria) this;
        }

        public Criteria andCommuteTypeGreaterThan(String value) {
            addCriterion("COMMUTE_TYPE >", value, "commuteType");
            return (Criteria) this;
        }

        public Criteria andCommuteTypeGreaterThanOrEqualTo(String value) {
            addCriterion("COMMUTE_TYPE >=", value, "commuteType");
            return (Criteria) this;
        }

        public Criteria andCommuteTypeLessThan(String value) {
            addCriterion("COMMUTE_TYPE <", value, "commuteType");
            return (Criteria) this;
        }

        public Criteria andCommuteTypeLessThanOrEqualTo(String value) {
            addCriterion("COMMUTE_TYPE <=", value, "commuteType");
            return (Criteria) this;
        }

        public Criteria andCommuteTypeLike(String value) {
            addCriterion("COMMUTE_TYPE like", value, "commuteType");
            return (Criteria) this;
        }

        public Criteria andCommuteTypeNotLike(String value) {
            addCriterion("COMMUTE_TYPE not like", value, "commuteType");
            return (Criteria) this;
        }

        public Criteria andCommuteTypeIn(List<String> values) {
            addCriterion("COMMUTE_TYPE in", values, "commuteType");
            return (Criteria) this;
        }

        public Criteria andCommuteTypeNotIn(List<String> values) {
            addCriterion("COMMUTE_TYPE not in", values, "commuteType");
            return (Criteria) this;
        }

        public Criteria andCommuteTypeBetween(String value1, String value2) {
            addCriterion("COMMUTE_TYPE between", value1, value2, "commuteType");
            return (Criteria) this;
        }

        public Criteria andCommuteTypeNotBetween(String value1, String value2) {
            addCriterion("COMMUTE_TYPE not between", value1, value2, "commuteType");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIsNull() {
            addCriterion("CARRIER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIsNotNull() {
            addCriterion("CARRIER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierIdEqualTo(Short value) {
            addCriterion("CARRIER_ID =", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotEqualTo(Short value) {
            addCriterion("CARRIER_ID <>", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdGreaterThan(Short value) {
            addCriterion("CARRIER_ID >", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdGreaterThanOrEqualTo(Short value) {
            addCriterion("CARRIER_ID >=", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLessThan(Short value) {
            addCriterion("CARRIER_ID <", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLessThanOrEqualTo(Short value) {
            addCriterion("CARRIER_ID <=", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIn(List<Short> values) {
            addCriterion("CARRIER_ID in", values, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotIn(List<Short> values) {
            addCriterion("CARRIER_ID not in", values, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdBetween(Short value1, Short value2) {
            addCriterion("CARRIER_ID between", value1, value2, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotBetween(Short value1, Short value2) {
            addCriterion("CARRIER_ID not between", value1, value2, "carrierId");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNull() {
            addCriterion("SOURCE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNotNull() {
            addCriterion("SOURCE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeEqualTo(String value) {
            addCriterion("SOURCE_TYPE =", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotEqualTo(String value) {
            addCriterion("SOURCE_TYPE <>", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThan(String value) {
            addCriterion("SOURCE_TYPE >", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_TYPE >=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThan(String value) {
            addCriterion("SOURCE_TYPE <", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_TYPE <=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLike(String value) {
            addCriterion("SOURCE_TYPE like", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotLike(String value) {
            addCriterion("SOURCE_TYPE not like", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIn(List<String> values) {
            addCriterion("SOURCE_TYPE in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotIn(List<String> values) {
            addCriterion("SOURCE_TYPE not in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeBetween(String value1, String value2) {
            addCriterion("SOURCE_TYPE between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotBetween(String value1, String value2) {
            addCriterion("SOURCE_TYPE not between", value1, value2, "sourceType");
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

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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