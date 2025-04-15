package com.example.model;

import java.util.Date;
import java.util.Objects;

public class SceneModel {

    private String sceneCode;
    private String sceneTemplateNum;
    private String usergroupId;
    private String channelTouchCodeSet;
    private Date createTime;
    private Date updateTime;


    public String getSceneCode() {
        return sceneCode;
    }

    public void setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
    }

    public String getSceneTemplateNum() {
        return sceneTemplateNum;
    }

    public void setSceneTemplateNum(String sceneTemplateNum) {
        this.sceneTemplateNum = sceneTemplateNum;
    }

    public String getUsergroupId() {
        return usergroupId;
    }

    public void setUsergroupId(String usergroupId) {
        this.usergroupId = usergroupId;
    }

    public String getChannelTouchCodeSet() {
        return channelTouchCodeSet;
    }

    public void setChannelTouchCodeSet(String channelTouchCodeSet) {
        this.channelTouchCodeSet = channelTouchCodeSet;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "SceneModel{" +
                "sceneCode='" + sceneCode + '\'' +
                ", sceneTemplateNum='" + sceneTemplateNum + '\'' +
                ", usergroupId='" + usergroupId + '\'' +
                ", channelTouchCodeSet='" + channelTouchCodeSet + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SceneModel that = (SceneModel) o;
        return Objects.equals(sceneCode, that.sceneCode) && Objects.equals(sceneTemplateNum, that.sceneTemplateNum) && Objects.equals(usergroupId, that.usergroupId) && Objects.equals(channelTouchCodeSet, that.channelTouchCodeSet) && Objects.equals(createTime, that.createTime) && Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sceneCode, sceneTemplateNum, usergroupId, channelTouchCodeSet, createTime, updateTime);
    }
}
