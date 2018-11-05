package com.example.entity;

import javax.persistence.Table;
import java.util.Date;

public class RoleInfo {
    /**
     * <pre>
     * 角色编号
     * 表字段 : cms_role_info.ID
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 角色编码
     * 表字段 : cms_role_info.ROLE_CODE
     * </pre>
     */
    private String roleCode;

    /**
     * <pre>
     * 角色名称
     * 表字段 : cms_role_info.ROLE_NAME
     * </pre>
     */
    private String roleName;

    /**
     * <pre>
     * 创建人
     * 表字段 : cms_role_info.CREATE_BY
     * </pre>
     */
    private String createBy;

    /**
     * <pre>
     * 创建时间
     * 表字段 : cms_role_info.CREATE_DATE
     * </pre>
     */
    private Date createDate;

    /**
     * <pre>
     * 修改人
     * 表字段 : cms_role_info.MODIFIED_BY
     * </pre>
     */
    private String modifiedBy;

    /**
     * <pre>
     * 修改时间
     * 表字段 : cms_role_info.MODIFIED_DATE
     * </pre>
     */
    private Date modifiedDate;

    /**
     * <pre>
     * 排序
     * 表字段 : cms_role_info.SORTNO
     * </pre>
     */
    private Integer sortno;

    /**
     * <pre>
     * 数据状态
     * 表字段 : cms_role_info.STATE
     * </pre>
     */
    private Integer state;

    /**
     * <pre>
     * 获取：角色编号
     * 表字段：cms_role_info.ID
     * </pre>
     *
     * @return cms_role_info.ID：角色编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：角色编号
     * 表字段：cms_role_info.ID
     * </pre>
     *
     * @param id
     *            cms_role_info.ID：角色编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：角色编码
     * 表字段：cms_role_info.ROLE_CODE
     * </pre>
     *
     * @return cms_role_info.ROLE_CODE：角色编码
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * <pre>
     * 设置：角色编码
     * 表字段：cms_role_info.ROLE_CODE
     * </pre>
     *
     * @param roleCode
     *            cms_role_info.ROLE_CODE：角色编码
     */
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    /**
     * <pre>
     * 获取：角色名称
     * 表字段：cms_role_info.ROLE_NAME
     * </pre>
     *
     * @return cms_role_info.ROLE_NAME：角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * <pre>
     * 设置：角色名称
     * 表字段：cms_role_info.ROLE_NAME
     * </pre>
     *
     * @param roleName
     *            cms_role_info.ROLE_NAME：角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * <pre>
     * 获取：创建人
     * 表字段：cms_role_info.CREATE_BY
     * </pre>
     *
     * @return cms_role_info.CREATE_BY：创建人
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * <pre>
     * 设置：创建人
     * 表字段：cms_role_info.CREATE_BY
     * </pre>
     *
     * @param createBy
     *            cms_role_info.CREATE_BY：创建人
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * <pre>
     * 获取：创建时间
     * 表字段：cms_role_info.CREATE_DATE
     * </pre>
     *
     * @return cms_role_info.CREATE_DATE：创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * <pre>
     * 设置：创建时间
     * 表字段：cms_role_info.CREATE_DATE
     * </pre>
     *
     * @param createDate
     *            cms_role_info.CREATE_DATE：创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <pre>
     * 获取：修改人
     * 表字段：cms_role_info.MODIFIED_BY
     * </pre>
     *
     * @return cms_role_info.MODIFIED_BY：修改人
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * <pre>
     * 设置：修改人
     * 表字段：cms_role_info.MODIFIED_BY
     * </pre>
     *
     * @param modifiedBy
     *            cms_role_info.MODIFIED_BY：修改人
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy == null ? null : modifiedBy.trim();
    }

    /**
     * <pre>
     * 获取：修改时间
     * 表字段：cms_role_info.MODIFIED_DATE
     * </pre>
     *
     * @return cms_role_info.MODIFIED_DATE：修改时间
     */
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * <pre>
     * 设置：修改时间
     * 表字段：cms_role_info.MODIFIED_DATE
     * </pre>
     *
     * @param modifiedDate
     *            cms_role_info.MODIFIED_DATE：修改时间
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * <pre>
     * 获取：排序
     * 表字段：cms_role_info.SORTNO
     * </pre>
     *
     * @return cms_role_info.SORTNO：排序
     */
    public Integer getSortno() {
        return sortno;
    }

    /**
     * <pre>
     * 设置：排序
     * 表字段：cms_role_info.SORTNO
     * </pre>
     *
     * @param sortno
     *            cms_role_info.SORTNO：排序
     */
    public void setSortno(Integer sortno) {
        this.sortno = sortno;
    }

    /**
     * <pre>
     * 获取：数据状态
     * 表字段：cms_role_info.STATE
     * </pre>
     *
     * @return cms_role_info.STATE：数据状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * <pre>
     * 设置：数据状态
     * 表字段：cms_role_info.STATE
     * </pre>
     *
     * @param state
     *            cms_role_info.STATE：数据状态
     */
    public void setState(Integer state) {
        this.state = state;
    }
}