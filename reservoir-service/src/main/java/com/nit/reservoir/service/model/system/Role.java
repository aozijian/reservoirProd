package com.nit.reservoir.service.model.system;


import com.nit.reservoir.service.model.common.BasicModel;

import java.io.Serializable;

/**
 * 角色实体类
 * Created by Charlie on 2016-11-21.
 */
public class Role extends BasicModel implements Serializable {
    private static final long serialVersionUID = -7219166488895967146L;

    private String name;  //角色名称
    private String description;  //描述
    private int type;  //类型，1=终端用户角色，2=后台用户角色

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

}
