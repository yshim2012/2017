package com.xybus.po;

import java.util.ArrayList;
import java.util.List;

public class TbRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TbRoleExample() {
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

        public Criteria andNmDisplayIsNull() {
            addCriterion("NM_DISPLAY is null");
            return (Criteria) this;
        }

        public Criteria andNmDisplayIsNotNull() {
            addCriterion("NM_DISPLAY is not null");
            return (Criteria) this;
        }

        public Criteria andNmDisplayEqualTo(String value) {
            addCriterion("NM_DISPLAY =", value, "nmDisplay");
            return (Criteria) this;
        }

        public Criteria andNmDisplayNotEqualTo(String value) {
            addCriterion("NM_DISPLAY <>", value, "nmDisplay");
            return (Criteria) this;
        }

        public Criteria andNmDisplayGreaterThan(String value) {
            addCriterion("NM_DISPLAY >", value, "nmDisplay");
            return (Criteria) this;
        }

        public Criteria andNmDisplayGreaterThanOrEqualTo(String value) {
            addCriterion("NM_DISPLAY >=", value, "nmDisplay");
            return (Criteria) this;
        }

        public Criteria andNmDisplayLessThan(String value) {
            addCriterion("NM_DISPLAY <", value, "nmDisplay");
            return (Criteria) this;
        }

        public Criteria andNmDisplayLessThanOrEqualTo(String value) {
            addCriterion("NM_DISPLAY <=", value, "nmDisplay");
            return (Criteria) this;
        }

        public Criteria andNmDisplayLike(String value) {
            addCriterion("NM_DISPLAY like", value, "nmDisplay");
            return (Criteria) this;
        }

        public Criteria andNmDisplayNotLike(String value) {
            addCriterion("NM_DISPLAY not like", value, "nmDisplay");
            return (Criteria) this;
        }

        public Criteria andNmDisplayIn(List<String> values) {
            addCriterion("NM_DISPLAY in", values, "nmDisplay");
            return (Criteria) this;
        }

        public Criteria andNmDisplayNotIn(List<String> values) {
            addCriterion("NM_DISPLAY not in", values, "nmDisplay");
            return (Criteria) this;
        }

        public Criteria andNmDisplayBetween(String value1, String value2) {
            addCriterion("NM_DISPLAY between", value1, value2, "nmDisplay");
            return (Criteria) this;
        }

        public Criteria andNmDisplayNotBetween(String value1, String value2) {
            addCriterion("NM_DISPLAY not between", value1, value2, "nmDisplay");
            return (Criteria) this;
        }

        public Criteria andFlgSystemIsNull() {
            addCriterion("FLG_SYSTEM is null");
            return (Criteria) this;
        }

        public Criteria andFlgSystemIsNotNull() {
            addCriterion("FLG_SYSTEM is not null");
            return (Criteria) this;
        }

        public Criteria andFlgSystemEqualTo(String value) {
            addCriterion("FLG_SYSTEM =", value, "flgSystem");
            return (Criteria) this;
        }

        public Criteria andFlgSystemNotEqualTo(String value) {
            addCriterion("FLG_SYSTEM <>", value, "flgSystem");
            return (Criteria) this;
        }

        public Criteria andFlgSystemGreaterThan(String value) {
            addCriterion("FLG_SYSTEM >", value, "flgSystem");
            return (Criteria) this;
        }

        public Criteria andFlgSystemGreaterThanOrEqualTo(String value) {
            addCriterion("FLG_SYSTEM >=", value, "flgSystem");
            return (Criteria) this;
        }

        public Criteria andFlgSystemLessThan(String value) {
            addCriterion("FLG_SYSTEM <", value, "flgSystem");
            return (Criteria) this;
        }

        public Criteria andFlgSystemLessThanOrEqualTo(String value) {
            addCriterion("FLG_SYSTEM <=", value, "flgSystem");
            return (Criteria) this;
        }

        public Criteria andFlgSystemLike(String value) {
            addCriterion("FLG_SYSTEM like", value, "flgSystem");
            return (Criteria) this;
        }

        public Criteria andFlgSystemNotLike(String value) {
            addCriterion("FLG_SYSTEM not like", value, "flgSystem");
            return (Criteria) this;
        }

        public Criteria andFlgSystemIn(List<String> values) {
            addCriterion("FLG_SYSTEM in", values, "flgSystem");
            return (Criteria) this;
        }

        public Criteria andFlgSystemNotIn(List<String> values) {
            addCriterion("FLG_SYSTEM not in", values, "flgSystem");
            return (Criteria) this;
        }

        public Criteria andFlgSystemBetween(String value1, String value2) {
            addCriterion("FLG_SYSTEM between", value1, value2, "flgSystem");
            return (Criteria) this;
        }

        public Criteria andFlgSystemNotBetween(String value1, String value2) {
            addCriterion("FLG_SYSTEM not between", value1, value2, "flgSystem");
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