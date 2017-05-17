package com.nit.reservoir.service.business.impl.system;

import com.nit.reservoir.core.abs.AbstractDao;
import com.nit.reservoir.core.abs.AbstractServiceImpl;
import com.nit.reservoir.service.business.system.MenuService;
import com.nit.reservoir.service.dao.system.MenuDao;
import com.nit.reservoir.service.model.system.Menu;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by aozijian on 2017/5/18.
 */
@Service("menuService")
public class MenuServiceImpl extends AbstractServiceImpl<Menu> implements MenuService{

    @Resource
    private MenuDao menuDao;

    @Override
    protected AbstractDao<Menu> getAbstractDao() {
        return menuDao;
    }
}
