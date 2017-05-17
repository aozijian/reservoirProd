package com.nit.reservoir.service.model.common;

import java.io.Serializable;
import java.util.Date;

/**
 * 数据模型基类
 * <p>
 * Created by Charlie on 2016-11-07.
 */
public class BasicModel implements Serializable {
    private static final long serialVersionUID = -2933123861552037582L;
    private String id;//ID
    private int creatorId;//创建者ID
    private Date createTime;//创建时间
    private int modifyId;//修改者ID
    private Date modifyTime;//修改时间

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getModifyId() {
        return modifyId;
    }

    public void setModifyId(int modifyId) {
        this.modifyId = modifyId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

}
