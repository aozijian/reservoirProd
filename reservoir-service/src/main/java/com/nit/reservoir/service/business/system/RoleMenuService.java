package com.nit.reservoir.service.business.system;

import com.nit.reservoir.core.abs.AbstractService;
import com.nit.reservoir.service.model.system.Menu;
import com.nit.reservoir.service.model.system.RoleMenu;

import java.util.List;

/**
 * Created by aozijian on 2017/5/18.
 */
public interface RoleMenuService extends AbstractService<RoleMenu>{

    /**
     * 根据角色ID获取一级菜单
     * @param roleId
     * @return
     */
    List<Menu> selectFirstByRoleId(int roleId);

    /**
     * 根据父级ID和角色ID查询子菜单
     * @param parentId
     * @param roleId
     * @return
     */
    List<Menu> selectChildByParentIdAndRoleId(String parentId, int roleId);
}
