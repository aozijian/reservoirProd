package com.nit.reservoir.service.business.impl.system;

import com.nit.reservoir.core.abs.AbstractDao;
import com.nit.reservoir.core.abs.AbstractServiceImpl;
import com.nit.reservoir.service.business.system.RoleMenuService;
import com.nit.reservoir.service.dao.system.RoleMenuDao;
import com.nit.reservoir.service.model.system.Menu;
import com.nit.reservoir.service.model.system.RoleMenu;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by aozijian on 2017/5/18.
 */
@Service("roleMenuService")
public class RoleMenuServiceImpl extends AbstractServiceImpl<RoleMenu> implements RoleMenuService{

    private List<Menu> menuList;
    private Menu menu;

    @Resource
    private RoleMenuDao roleMenuDao;

    @Override
    protected AbstractDao<RoleMenu> getAbstractDao() {
        return roleMenuDao;
    }

    @Override
    public List<Menu> selectFirstByRoleId(int roleId) {
        return mapList2MenuList(roleMenuDao.selectFirstByRoleId(roleId));
    }

    @Override
    public List<Menu> selectChildByParentIdAndRoleId(String parentId, int roleId) {
        return mapList2MenuList(roleMenuDao.selectChildByParentIdAndRoleId(parentId, roleId));
    }

    public List<Menu> mapList2MenuList(List<Map<String, Object>> mapList) {
        menuList = new ArrayList<Menu>();
        for (Map<String, Object> map : mapList) {
            menu = new Menu();
            menu.setId(map.get("id") == null ? "" : (String) map.get("id"));
            menu.setParentId(map.get("parent_id") == null ? "" :(String) map.get("parent_id"));
            menu.setName(map.get("name") == null ? "" :(String) map.get("name"));
            menu.setSortId(map.get("sort_id") == null ? 0 :(Integer) map.get("sort_id"));
            menu.setUrl(map.get("url") == null ? "" :(String) map.get("url"));
            menu.setDescription(map.get("description") == null ? "" :(String) map.get("description"));
            menuList.add(menu);
        }
        return menuList;
    }
}
