package com.nit.reservoir.service.mapper.system;

import com.nit.reservoir.core.abs.AbstractMapper;
import com.nit.reservoir.service.model.system.RoleMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by aozijian on 2017/5/18.
 */
public interface RoleMenuMapper extends AbstractMapper<RoleMenu>{

    /**
     * 根据角色ID获取一级菜单
     * @param roleId
     * @return
     */
    List<Map<String, Object>> selectFirstByRoleId(@Param("roleId") int roleId);

    /**
     * 根据父级ID和角色ID查询子菜单
     * @param parentId
     * @return
     */
    List<Map<String, Object>> selectChildByParentIdAndRoleId(@Param("parentId") String parentId, @Param("roleId") int roleId);
}
