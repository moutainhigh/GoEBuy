package com.goebuy.entity.user;

import com.goebuy.entity.BaseEntity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

/**
 * 群组表
 *
 *  Created by luodejin on 2018/8/14.
 */
@Entity
@Table(name = "group", schema = "springdemo", indexes={@Index(name="group_number_Index", columnList="group_name")}, catalog = "")
public class Group extends BaseEntity<Integer> {

    private static final long serialVersionUID = -8029735894274024826L;

    private String groupId;               //群组id
    private String groupName;             //群组名称
    private int type;                     //群组类别：1 事件群组，2 标签群组，3 用户自定义群组

    /**
     * 若为事件群组，存事件id
     * 若为标签群组，存标签id_事件id，存最后一次事件(活动)
     * 若为用户自定义群组，存群组id
     */
    private String sourceId;

    private String creatorId;             //创建人id
    private String createTime;            //创建时间
    private String updateTime;            //最近更新时间
    private int state;                    //群组状态: 1 正常，2 解散

    @Basic
    @Column(name = "group_id", nullable = false)
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "group_name", nullable = false)
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Basic
    @Column(name = "group_type", nullable = false)
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(name = "source_id", nullable = false)
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    @Basic
    @Column(name = "creator_id", nullable = false)
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    @Basic
    @Column(name = "create_time", nullable = false)
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time", nullable = false)
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "state", nullable = false)
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
