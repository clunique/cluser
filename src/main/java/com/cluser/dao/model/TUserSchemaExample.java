package com.cluser.dao.model;

import java.util.ArrayList;
import java.util.List;

public class TUserSchemaExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_user_schema
     *
     * @mbggenerated Fri Dec 09 21:21:27 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_user_schema
     *
     * @mbggenerated Fri Dec 09 21:21:27 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_user_schema
     *
     * @mbggenerated Fri Dec 09 21:21:27 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_schema
     *
     * @mbggenerated Fri Dec 09 21:21:27 CST 2016
     */
    public TUserSchemaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_schema
     *
     * @mbggenerated Fri Dec 09 21:21:27 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_schema
     *
     * @mbggenerated Fri Dec 09 21:21:27 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_schema
     *
     * @mbggenerated Fri Dec 09 21:21:27 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_schema
     *
     * @mbggenerated Fri Dec 09 21:21:27 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_schema
     *
     * @mbggenerated Fri Dec 09 21:21:27 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_schema
     *
     * @mbggenerated Fri Dec 09 21:21:27 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_schema
     *
     * @mbggenerated Fri Dec 09 21:21:27 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_schema
     *
     * @mbggenerated Fri Dec 09 21:21:27 CST 2016
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
     * This method corresponds to the database table t_user_schema
     *
     * @mbggenerated Fri Dec 09 21:21:27 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_schema
     *
     * @mbggenerated Fri Dec 09 21:21:27 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_user_schema
     *
     * @mbggenerated Fri Dec 09 21:21:27 CST 2016
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBasicAttributeIsNull() {
            addCriterion("basic_attribute is null");
            return (Criteria) this;
        }

        public Criteria andBasicAttributeIsNotNull() {
            addCriterion("basic_attribute is not null");
            return (Criteria) this;
        }

        public Criteria andBasicAttributeEqualTo(boolean value) {
            addCriterion("basic_attribute =", value, "basicAttribute");
            return (Criteria) this;
        }

        public Criteria andBasicAttributeNotEqualTo(boolean value) {
            addCriterion("basic_attribute <>", value, "basicAttribute");
            return (Criteria) this;
        }

        public Criteria andBasicAttributeGreaterThan(boolean value) {
            addCriterion("basic_attribute >", value, "basicAttribute");
            return (Criteria) this;
        }

        public Criteria andBasicAttributeGreaterThanOrEqualTo(boolean value) {
            addCriterion("basic_attribute >=", value, "basicAttribute");
            return (Criteria) this;
        }

        public Criteria andBasicAttributeLessThan(boolean value) {
            addCriterion("basic_attribute <", value, "basicAttribute");
            return (Criteria) this;
        }

        public Criteria andBasicAttributeLessThanOrEqualTo(boolean value) {
            addCriterion("basic_attribute <=", value, "basicAttribute");
            return (Criteria) this;
        }

        public Criteria andBasicAttributeIn(List<Boolean> values) {
            addCriterion("basic_attribute in", values, "basicAttribute");
            return (Criteria) this;
        }

        public Criteria andBasicAttributeNotIn(List<Boolean> values) {
            addCriterion("basic_attribute not in", values, "basicAttribute");
            return (Criteria) this;
        }

        public Criteria andBasicAttributeBetween(boolean value1, boolean value2) {
            addCriterion("basic_attribute between", value1, value2, "basicAttribute");
            return (Criteria) this;
        }

        public Criteria andBasicAttributeNotBetween(boolean value1, boolean value2) {
            addCriterion("basic_attribute not between", value1, value2, "basicAttribute");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIsNull() {
            addCriterion("display_name is null");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIsNotNull() {
            addCriterion("display_name is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayNameEqualTo(String value) {
            addCriterion("display_name =", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotEqualTo(String value) {
            addCriterion("display_name <>", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameGreaterThan(String value) {
            addCriterion("display_name >", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameGreaterThanOrEqualTo(String value) {
            addCriterion("display_name >=", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLessThan(String value) {
            addCriterion("display_name <", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLessThanOrEqualTo(String value) {
            addCriterion("display_name <=", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLike(String value) {
            addCriterion("display_name like", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotLike(String value) {
            addCriterion("display_name not like", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIn(List<String> values) {
            addCriterion("display_name in", values, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotIn(List<String> values) {
            addCriterion("display_name not in", values, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameBetween(String value1, String value2) {
            addCriterion("display_name between", value1, value2, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotBetween(String value1, String value2) {
            addCriterion("display_name not between", value1, value2, "displayName");
            return (Criteria) this;
        }

        public Criteria andDomainNameIsNull() {
            addCriterion("domain_name is null");
            return (Criteria) this;
        }

        public Criteria andDomainNameIsNotNull() {
            addCriterion("domain_name is not null");
            return (Criteria) this;
        }

        public Criteria andDomainNameEqualTo(String value) {
            addCriterion("domain_name =", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotEqualTo(String value) {
            addCriterion("domain_name <>", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameGreaterThan(String value) {
            addCriterion("domain_name >", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameGreaterThanOrEqualTo(String value) {
            addCriterion("domain_name >=", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameLessThan(String value) {
            addCriterion("domain_name <", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameLessThanOrEqualTo(String value) {
            addCriterion("domain_name <=", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameLike(String value) {
            addCriterion("domain_name like", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotLike(String value) {
            addCriterion("domain_name not like", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameIn(List<String> values) {
            addCriterion("domain_name in", values, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotIn(List<String> values) {
            addCriterion("domain_name not in", values, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameBetween(String value1, String value2) {
            addCriterion("domain_name between", value1, value2, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotBetween(String value1, String value2) {
            addCriterion("domain_name not between", value1, value2, "domainName");
            return (Criteria) this;
        }

        public Criteria andColumnNameIsNull() {
            addCriterion("column_name is null");
            return (Criteria) this;
        }

        public Criteria andColumnNameIsNotNull() {
            addCriterion("column_name is not null");
            return (Criteria) this;
        }

        public Criteria andColumnNameEqualTo(String value) {
            addCriterion("column_name =", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotEqualTo(String value) {
            addCriterion("column_name <>", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameGreaterThan(String value) {
            addCriterion("column_name >", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameGreaterThanOrEqualTo(String value) {
            addCriterion("column_name >=", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLessThan(String value) {
            addCriterion("column_name <", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLessThanOrEqualTo(String value) {
            addCriterion("column_name <=", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLike(String value) {
            addCriterion("column_name like", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotLike(String value) {
            addCriterion("column_name not like", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameIn(List<String> values) {
            addCriterion("column_name in", values, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotIn(List<String> values) {
            addCriterion("column_name not in", values, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameBetween(String value1, String value2) {
            addCriterion("column_name between", value1, value2, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotBetween(String value1, String value2) {
            addCriterion("column_name not between", value1, value2, "columnName");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNull() {
            addCriterion("data_type is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("data_type is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(String value) {
            addCriterion("data_type =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(String value) {
            addCriterion("data_type <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(String value) {
            addCriterion("data_type >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("data_type >=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(String value) {
            addCriterion("data_type <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(String value) {
            addCriterion("data_type <=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLike(String value) {
            addCriterion("data_type like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotLike(String value) {
            addCriterion("data_type not like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIn(List<String> values) {
            addCriterion("data_type in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<String> values) {
            addCriterion("data_type not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(String value1, String value2) {
            addCriterion("data_type between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(String value1, String value2) {
            addCriterion("data_type not between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andMandatoryIsNull() {
            addCriterion("mandatory is null");
            return (Criteria) this;
        }

        public Criteria andMandatoryIsNotNull() {
            addCriterion("mandatory is not null");
            return (Criteria) this;
        }

        public Criteria andMandatoryEqualTo(boolean value) {
            addCriterion("mandatory =", value, "mandatory");
            return (Criteria) this;
        }

        public Criteria andMandatoryNotEqualTo(boolean value) {
            addCriterion("mandatory <>", value, "mandatory");
            return (Criteria) this;
        }

        public Criteria andMandatoryGreaterThan(boolean value) {
            addCriterion("mandatory >", value, "mandatory");
            return (Criteria) this;
        }

        public Criteria andMandatoryGreaterThanOrEqualTo(boolean value) {
            addCriterion("mandatory >=", value, "mandatory");
            return (Criteria) this;
        }

        public Criteria andMandatoryLessThan(boolean value) {
            addCriterion("mandatory <", value, "mandatory");
            return (Criteria) this;
        }

        public Criteria andMandatoryLessThanOrEqualTo(boolean value) {
            addCriterion("mandatory <=", value, "mandatory");
            return (Criteria) this;
        }

        public Criteria andMandatoryIn(List<Boolean> values) {
            addCriterion("mandatory in", values, "mandatory");
            return (Criteria) this;
        }

        public Criteria andMandatoryNotIn(List<Boolean> values) {
            addCriterion("mandatory not in", values, "mandatory");
            return (Criteria) this;
        }

        public Criteria andMandatoryBetween(boolean value1, boolean value2) {
            addCriterion("mandatory between", value1, value2, "mandatory");
            return (Criteria) this;
        }

        public Criteria andMandatoryNotBetween(boolean value1, boolean value2) {
            addCriterion("mandatory not between", value1, value2, "mandatory");
            return (Criteria) this;
        }

        public Criteria andSearchableIsNull() {
            addCriterion("searchable is null");
            return (Criteria) this;
        }

        public Criteria andSearchableIsNotNull() {
            addCriterion("searchable is not null");
            return (Criteria) this;
        }

        public Criteria andSearchableEqualTo(boolean value) {
            addCriterion("searchable =", value, "searchable");
            return (Criteria) this;
        }

        public Criteria andSearchableNotEqualTo(boolean value) {
            addCriterion("searchable <>", value, "searchable");
            return (Criteria) this;
        }

        public Criteria andSearchableGreaterThan(boolean value) {
            addCriterion("searchable >", value, "searchable");
            return (Criteria) this;
        }

        public Criteria andSearchableGreaterThanOrEqualTo(boolean value) {
            addCriterion("searchable >=", value, "searchable");
            return (Criteria) this;
        }

        public Criteria andSearchableLessThan(boolean value) {
            addCriterion("searchable <", value, "searchable");
            return (Criteria) this;
        }

        public Criteria andSearchableLessThanOrEqualTo(boolean value) {
            addCriterion("searchable <=", value, "searchable");
            return (Criteria) this;
        }

        public Criteria andSearchableIn(List<Boolean> values) {
            addCriterion("searchable in", values, "searchable");
            return (Criteria) this;
        }

        public Criteria andSearchableNotIn(List<Boolean> values) {
            addCriterion("searchable not in", values, "searchable");
            return (Criteria) this;
        }

        public Criteria andSearchableBetween(boolean value1, boolean value2) {
            addCriterion("searchable between", value1, value2, "searchable");
            return (Criteria) this;
        }

        public Criteria andSearchableNotBetween(boolean value1, boolean value2) {
            addCriterion("searchable not between", value1, value2, "searchable");
            return (Criteria) this;
        }

        public Criteria andMaintLevelIsNull() {
            addCriterion("maint_level is null");
            return (Criteria) this;
        }

        public Criteria andMaintLevelIsNotNull() {
            addCriterion("maint_level is not null");
            return (Criteria) this;
        }

        public Criteria andMaintLevelEqualTo(String value) {
            addCriterion("maint_level =", value, "maintLevel");
            return (Criteria) this;
        }

        public Criteria andMaintLevelNotEqualTo(String value) {
            addCriterion("maint_level <>", value, "maintLevel");
            return (Criteria) this;
        }

        public Criteria andMaintLevelGreaterThan(String value) {
            addCriterion("maint_level >", value, "maintLevel");
            return (Criteria) this;
        }

        public Criteria andMaintLevelGreaterThanOrEqualTo(String value) {
            addCriterion("maint_level >=", value, "maintLevel");
            return (Criteria) this;
        }

        public Criteria andMaintLevelLessThan(String value) {
            addCriterion("maint_level <", value, "maintLevel");
            return (Criteria) this;
        }

        public Criteria andMaintLevelLessThanOrEqualTo(String value) {
            addCriterion("maint_level <=", value, "maintLevel");
            return (Criteria) this;
        }

        public Criteria andMaintLevelLike(String value) {
            addCriterion("maint_level like", value, "maintLevel");
            return (Criteria) this;
        }

        public Criteria andMaintLevelNotLike(String value) {
            addCriterion("maint_level not like", value, "maintLevel");
            return (Criteria) this;
        }

        public Criteria andMaintLevelIn(List<String> values) {
            addCriterion("maint_level in", values, "maintLevel");
            return (Criteria) this;
        }

        public Criteria andMaintLevelNotIn(List<String> values) {
            addCriterion("maint_level not in", values, "maintLevel");
            return (Criteria) this;
        }

        public Criteria andMaintLevelBetween(String value1, String value2) {
            addCriterion("maint_level between", value1, value2, "maintLevel");
            return (Criteria) this;
        }

        public Criteria andMaintLevelNotBetween(String value1, String value2) {
            addCriterion("maint_level not between", value1, value2, "maintLevel");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleIsNull() {
            addCriterion("constraint_rule is null");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleIsNotNull() {
            addCriterion("constraint_rule is not null");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleEqualTo(String value) {
            addCriterion("constraint_rule =", value, "constraintRule");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleNotEqualTo(String value) {
            addCriterion("constraint_rule <>", value, "constraintRule");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleGreaterThan(String value) {
            addCriterion("constraint_rule >", value, "constraintRule");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleGreaterThanOrEqualTo(String value) {
            addCriterion("constraint_rule >=", value, "constraintRule");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleLessThan(String value) {
            addCriterion("constraint_rule <", value, "constraintRule");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleLessThanOrEqualTo(String value) {
            addCriterion("constraint_rule <=", value, "constraintRule");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleLike(String value) {
            addCriterion("constraint_rule like", value, "constraintRule");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleNotLike(String value) {
            addCriterion("constraint_rule not like", value, "constraintRule");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleIn(List<String> values) {
            addCriterion("constraint_rule in", values, "constraintRule");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleNotIn(List<String> values) {
            addCriterion("constraint_rule not in", values, "constraintRule");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleBetween(String value1, String value2) {
            addCriterion("constraint_rule between", value1, value2, "constraintRule");
            return (Criteria) this;
        }

        public Criteria andConstraintRuleNotBetween(String value1, String value2) {
            addCriterion("constraint_rule not between", value1, value2, "constraintRule");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_user_schema
     *
     * @mbggenerated do_not_delete_during_merge Fri Dec 09 21:21:27 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_user_schema
     *
     * @mbggenerated Fri Dec 09 21:21:27 CST 2016
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