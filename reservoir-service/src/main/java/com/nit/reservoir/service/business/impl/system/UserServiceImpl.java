package com.nit.reservoir.service.business.impl.system;

import com.nit.reservoir.core.abs.AbstractDao;
import com.nit.reservoir.core.abs.AbstractServiceImpl;
import com.nit.reservoir.service.business.system.UserService;
import com.nit.reservoir.service.dao.system.UserDao;
import com.nit.reservoir.service.model.system.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by aozijian on 2017/5/16.
 */
@Service("userService")
public class UserServiceImpl extends AbstractServiceImpl<User> implements UserService{

    @Resource
    private UserDao userDao;

    @Override
    protected AbstractDao<User> getAbstractDao() {
        return userDao;
    }

    @Override
    public User checkUser(String userName, String password) {
        return userDao.checkUser(userName, password);
    }
}
