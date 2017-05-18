package com.nit.reservoir.controller.system;

import com.alibaba.fastjson.JSON;
import com.nit.reservoir.service.business.system.RoleMenuService;
import com.nit.reservoir.service.model.system.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by aozijian on 2017/5/18.
 */
@Controller
@RequestMapping("/admin/system/rightsMgt/roleMenuMgt")
public class RoleMenuController {

    @Resource
    private RoleMenuService roleMenuService;

    @ResponseBody
    @RequestMapping(value = "/getFirstMenuByRoleId", produces = "text/html;charset=UTF-8", method = RequestMethod.GET)
    public String getFirstMenuByRoleId(int roleId) {
        //获取一级角色菜单
        List<Menu> roleMenuList = roleMenuService.selectFirstByRoleId(roleId);
        return JSON.toJSONString(roleMenuList);
    }

    @ResponseBody
    @RequestMapping(value = "/getMenuByParentIdAndRoleId", produces = "text/html;charset=UTF-8", method = RequestMethod.GET)
    public String getMenuByParentIdAndRoleId(String parentId, int roleId) {
        //获取二级菜单
        List<Menu> roleMenuList = roleMenuService.selectChildByParentIdAndRoleId(parentId, roleId);
        return JSON.toJSONString(roleMenuList);
    }
}
