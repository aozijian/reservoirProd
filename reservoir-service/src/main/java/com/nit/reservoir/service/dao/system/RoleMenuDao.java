package com.nit.reservoir.service.dao.system;

import com.nit.reservoir.core.abs.AbstractDao;
import com.nit.reservoir.service.model.system.RoleMenu;

import java.util.List;
import java.util.Map;

/**
 * Created by aozijian on 2017/5/18.
 */
public interface RoleMenuDao extends AbstractDao<RoleMenu>{

    /**
     * 根据角色ID获取一级菜单
     * @param roleId
     * @return
     */
    List<Map<String, Object>> selectFirstByRoleId(String roleId);
}
