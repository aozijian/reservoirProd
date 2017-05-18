package com.nit.reservoir.service.dao.impl.system;

import com.nit.reservoir.core.abs.AbstractDaoImpl;
import com.nit.reservoir.core.abs.AbstractMapper;
import com.nit.reservoir.service.dao.system.RoleMenuDao;
import com.nit.reservoir.service.mapper.system.RoleMenuMapper;
import com.nit.reservoir.service.model.system.RoleMenu;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by aozijian on 2017/5/18.
 */
@Repository
public class RoleMenuDaoImpl extends AbstractDaoImpl<RoleMenu> implements RoleMenuDao{

    @Resource
    private RoleMenuMapper roleMenuMapper;

    @Override
    protected AbstractMapper<RoleMenu> getAbstractMapper() {
        return roleMenuMapper;
    }

    @Override
    public List<Map<String, Object>> selectFirstByRoleId(int roleId) {
        return roleMenuMapper.selectFirstByRoleId(roleId);
    }

    @Override
    public List<Map<String, Object>> selectChildByParentIdAndRoleId(String parentId, int roleId) {
        return roleMenuMapper.selectChildByParentIdAndRoleId(parentId, roleId);
    }
}
