package com.nit.reservoir.service.model.system;

import java.io.Serializable;

/**
 * Created by aozijian on 2017/5/18.
 * 角色-菜单关联实体类
 */
public class RoleMenu implements Serializable{

    private String id;  //ID
    private String roleId;  //角色ID
    private String menuId;  //菜单ID

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
}
