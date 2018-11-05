package com.example.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
    /**
     * <pre>
     * 用户ID
     * 表字段 : cms_user_info.ID
     * </pre>
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * <pre>
     * 用户编码
     * 表字段 : cms_user_info.USER_CODE
     * </pre>
     */
    private String userCode;

    /**
     * <pre>
     * 用户名称
     * 表字段 : cms_user_info.USER_NAME
     * </pre>
     */
    private String userName;

    /**
     * <pre>
     * 用户密码
     * 表字段 : cms_user_info.USER_PWD
     * </pre>
     */
    private String userPwd;

    /**
     * <pre>
     * 备注
     * 表字段 : cms_user_info.REMARK
     * </pre>
     */
    private String remark;

    /**
     * <pre>
     * 创建人
     * 表字段 : cms_user_info.CREATE_BY
     * </pre>
     */
    private String createBy;

    /**
     * <pre>
     * 创建时间
     * 表字段 : cms_user_info.CREATE_DATE
     * </pre>
     */
    private Date createDate;

    /**
     * <pre>
     * 修改人
     * 表字段 : cms_user_info.MODIFIED_BY
     * </pre>
     */
    private String modifiedBy;

    /**
     * <pre>
     * 修改时间
     * 表字段 : cms_user_info.MODIFIED_DATE
     * </pre>
     */
    private Date modifiedDate;

    /**
     * <pre>
     * 排序
     * 表字段 : cms_user_info.SORTNO
     * </pre>
     */
    private Integer sortno;

    /**
     * <pre>
     * 数据状态
     * 表字段 : cms_user_info.STATE
     * </pre>
     */
    private Integer state;

    /**
     * <pre>
     * 获取：用户ID
     * 表字段：cms_user_info.ID
     * </pre>
     *
     * @return cms_user_info.ID：用户ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：用户ID
     * 表字段：cms_user_info.ID
     * </pre>
     *
     * @param id
     *            cms_user_info.ID：用户ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：用户编码
     * 表字段：cms_user_info.USER_CODE
     * </pre>
     *
     * @return cms_user_info.USER_CODE：用户编码
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * <pre>
     * 设置：用户编码
     * 表字段：cms_user_info.USER_CODE
     * </pre>
     *
     * @param userCode
     *            cms_user_info.USER_CODE：用户编码
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    /**
     * <pre>
     * 获取：用户名称
     * 表字段：cms_user_info.USER_NAME
     * </pre>
     *
     * @return cms_user_info.USER_NAME：用户名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <pre>
     * 设置：用户名称
     * 表字段：cms_user_info.USER_NAME
     * </pre>
     *
     * @param userName
     *            cms_user_info.USER_NAME：用户名称
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * <pre>
     * 获取：用户密码
     * 表字段：cms_user_info.USER_PWD
     * </pre>
     *
     * @return cms_user_info.USER_PWD：用户密码
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * <pre>
     * 设置：用户密码
     * 表字段：cms_user_info.USER_PWD
     * </pre>
     *
     * @param userPwd
     *            cms_user_info.USER_PWD：用户密码
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    /**
     * <pre>
     * 获取：备注
     * 表字段：cms_user_info.REMARK
     * </pre>
     *
     * @return cms_user_info.REMARK：备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * <pre>
     * 设置：备注
     * 表字段：cms_user_info.REMARK
     * </pre>
     *
     * @param remark
     *            cms_user_info.REMARK：备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * <pre>
     * 获取：创建人
     * 表字段：cms_user_info.CREATE_BY
     * </pre>
     *
     * @return cms_user_info.CREATE_BY：创建人
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * <pre>
     * 设置：创建人
     * 表字段：cms_user_info.CREATE_BY
     * </pre>
     *
     * @param createBy
     *            cms_user_info.CREATE_BY：创建人
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * <pre>
     * 获取：创建时间
     * 表字段：cms_user_info.CREATE_DATE
     * </pre>
     *
     * @return cms_user_info.CREATE_DATE：创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * <pre>
     * 设置：创建时间
     * 表字段：cms_user_info.CREATE_DATE
     * </pre>
     *
     * @param createDate
     *            cms_user_info.CREATE_DATE：创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <pre>
     * 获取：修改人
     * 表字段：cms_user_info.MODIFIED_BY
     * </pre>
     *
     * @return cms_user_info.MODIFIED_BY：修改人
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * <pre>
     * 设置：修改人
     * 表字段：cms_user_info.MODIFIED_BY
     * </pre>
     *
     * @param modifiedBy
     *            cms_user_info.MODIFIED_BY：修改人
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy == null ? null : modifiedBy.trim();
    }

    /**
     * <pre>
     * 获取：修改时间
     * 表字段：cms_user_info.MODIFIED_DATE
     * </pre>
     *
     * @return cms_user_info.MODIFIED_DATE：修改时间
     */
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * <pre>
     * 设置：修改时间
     * 表字段：cms_user_info.MODIFIED_DATE
     * </pre>
     *
     * @param modifiedDate
     *            cms_user_info.MODIFIED_DATE：修改时间
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * <pre>
     * 获取：排序
     * 表字段：cms_user_info.SORTNO
     * </pre>
     *
     * @return cms_user_info.SORTNO：排序
     */
    public Integer getSortno() {
        return sortno;
    }

    /**
     * <pre>
     * 设置：排序
     * 表字段：cms_user_info.SORTNO
     * </pre>
     *
     * @param sortno
     *            cms_user_info.SORTNO：排序
     */
    public void setSortno(Integer sortno) {
        this.sortno = sortno;
    }

    /**
     * <pre>
     * 获取：数据状态
     * 表字段：cms_user_info.STATE
     * </pre>
     *
     * @return cms_user_info.STATE：数据状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * <pre>
     * 设置：数据状态
     * 表字段：cms_user_info.STATE
     * </pre>
     *
     * @param state
     *            cms_user_info.STATE：数据状态
     */
    public void setState(Integer state) {
        this.state = state;
    }
}