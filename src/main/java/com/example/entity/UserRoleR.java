package com.example.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class UserRoleR {
    /**
     * <pre>
     * 
     * 表字段 : cms_user_role_r.ID
     * </pre>
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * <pre>
     * 
     * 表字段 : cms_user_role_r.USER_CODE
     * </pre>
     */
    private String userCode;

    /**
     * <pre>
     * 
     * 表字段 : cms_user_role_r.ROLE_CODE
     * </pre>
     */
    private String roleCode;

    /**
     * <pre>
     * 创建人
     * 表字段 : cms_user_role_r.CREATE_BY
     * </pre>
     */
    private String createBy;

    /**
     * <pre>
     * 创建时间
     * 表字段 : cms_user_role_r.CREATE_DATE
     * </pre>
     */
    private Date createDate;

    /**
     * <pre>
     * 修改人
     * 表字段 : cms_user_role_r.MODIFIED_BY
     * </pre>
     */
    private String modifiedBy;

    /**
     * <pre>
     * 修改时间
     * 表字段 : cms_user_role_r.MODIFIED_DATE
     * </pre>
     */
    private Date modifiedDate;

    /**
     * <pre>
     * 排序
     * 表字段 : cms_user_role_r.SORTNO
     * </pre>
     */
    private Integer sortno;

    /**
     * <pre>
     * 数据状态
     * 表字段 : cms_user_role_r.STATE
     * </pre>
     */
    private Integer state;

    /**
     * <pre>
     * 获取：
     * 表字段：cms_user_role_r.ID
     * </pre>
     *
     * @return cms_user_role_r.ID：
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：cms_user_role_r.ID
     * </pre>
     *
     * @param id
     *            cms_user_role_r.ID：
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：cms_user_role_r.USER_CODE
     * </pre>
     *
     * @return cms_user_role_r.USER_CODE：
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：cms_user_role_r.USER_CODE
     * </pre>
     *
     * @param userCode
     *            cms_user_role_r.USER_CODE：
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    /**
     * <pre>
     * 获取：
     * 表字段：cms_user_role_r.ROLE_CODE
     * </pre>
     *
     * @return cms_user_role_r.ROLE_CODE：
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：cms_user_role_r.ROLE_CODE
     * </pre>
     *
     * @param roleCode
     *            cms_user_role_r.ROLE_CODE：
     */
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    /**
     * <pre>
     * 获取：创建人
     * 表字段：cms_user_role_r.CREATE_BY
     * </pre>
     *
     * @return cms_user_role_r.CREATE_BY：创建人
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * <pre>
     * 设置：创建人
     * 表字段：cms_user_role_r.CREATE_BY
     * </pre>
     *
     * @param createBy
     *            cms_user_role_r.CREATE_BY：创建人
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * <pre>
     * 获取：创建时间
     * 表字段：cms_user_role_r.CREATE_DATE
     * </pre>
     *
     * @return cms_user_role_r.CREATE_DATE：创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * <pre>
     * 设置：创建时间
     * 表字段：cms_user_role_r.CREATE_DATE
     * </pre>
     *
     * @param createDate
     *            cms_user_role_r.CREATE_DATE：创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <pre>
     * 获取：修改人
     * 表字段：cms_user_role_r.MODIFIED_BY
     * </pre>
     *
     * @return cms_user_role_r.MODIFIED_BY：修改人
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * <pre>
     * 设置：修改人
     * 表字段：cms_user_role_r.MODIFIED_BY
     * </pre>
     *
     * @param modifiedBy
     *            cms_user_role_r.MODIFIED_BY：修改人
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy == null ? null : modifiedBy.trim();
    }

    /**
     * <pre>
     * 获取：修改时间
     * 表字段：cms_user_role_r.MODIFIED_DATE
     * </pre>
     *
     * @return cms_user_role_r.MODIFIED_DATE：修改时间
     */
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * <pre>
     * 设置：修改时间
     * 表字段：cms_user_role_r.MODIFIED_DATE
     * </pre>
     *
     * @param modifiedDate
     *            cms_user_role_r.MODIFIED_DATE：修改时间
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * <pre>
     * 获取：排序
     * 表字段：cms_user_role_r.SORTNO
     * </pre>
     *
     * @return cms_user_role_r.SORTNO：排序
     */
    public Integer getSortno() {
        return sortno;
    }

    /**
     * <pre>
     * 设置：排序
     * 表字段：cms_user_role_r.SORTNO
     * </pre>
     *
     * @param sortno
     *            cms_user_role_r.SORTNO：排序
     */
    public void setSortno(Integer sortno) {
        this.sortno = sortno;
    }

    /**
     * <pre>
     * 获取：数据状态
     * 表字段：cms_user_role_r.STATE
     * </pre>
     *
     * @return cms_user_role_r.STATE：数据状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * <pre>
     * 设置：数据状态
     * 表字段：cms_user_role_r.STATE
     * </pre>
     *
     * @param state
     *            cms_user_role_r.STATE：数据状态
     */
    public void setState(Integer state) {
        this.state = state;
    }
}