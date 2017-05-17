package com.nit.reservoir.service.dao.impl.system;

import com.nit.reservoir.core.abs.AbstractDaoImpl;
import com.nit.reservoir.core.abs.AbstractMapper;
import com.nit.reservoir.service.dao.system.MenuDao;
import com.nit.reservoir.service.mapper.system.MenuMapper;
import com.nit.reservoir.service.model.system.Menu;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by aozijian on 2017/5/18.
 */
@Repository
public class MenuDaoImpl extends AbstractDaoImpl<Menu> implements MenuDao{

    @Resource
    private MenuMapper menuMapper;

    @Override
    protected AbstractMapper<Menu> getAbstractMapper() {
        return menuMapper;
    }
}
