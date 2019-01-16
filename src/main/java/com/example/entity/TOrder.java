package com.example.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class TOrder {
    /**
     * <pre>
     * 
     * 表字段 : t_order.id
     * </pre>
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * <pre>
     * 
     * 表字段 : t_order.info
     * </pre>
     */
    private String info;

    /**
     * <pre>
     * 
     * 表字段 : t_order.user_id
     * </pre>
     */
    private Long userId;

    /**
     * <pre>
     * 
     * 表字段 : t_order.create_time
     * </pre>
     */
    private Date createTime;

    /**
     * <pre>
     * 获取：
     * 表字段：t_order.id
     * </pre>
     *
     * @return t_order.id：
     */
    public Long getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_order.id
     * </pre>
     *
     * @param id
     *            t_order.id：
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_order.info
     * </pre>
     *
     * @return t_order.info：
     */
    public String getInfo() {
        return info;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_order.info
     * </pre>
     *
     * @param info
     *            t_order.info：
     */
    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_order.user_id
     * </pre>
     *
     * @return t_order.user_id：
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_order.user_id
     * </pre>
     *
     * @param userId
     *            t_order.user_id：
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_order.create_time
     * </pre>
     *
     * @return t_order.create_time：
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_order.create_time
     * </pre>
     *
     * @param createTime
     *            t_order.create_time：
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}