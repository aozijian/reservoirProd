package com.nit.reservoir.service.model.system;

import com.nit.reservoir.service.model.common.BasicModel;

import java.io.Serializable;

/**
 * 角色菜单关联实体类
 * Created by Charlie on 2016-11-21.
 */
public class RoleMenu extends BasicModel implements Serializable {
    private static final long serialVersionUID = -6018652411110501953L;

    private String roleId;  //角色ID
    private String menuId;  //菜单ID

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
