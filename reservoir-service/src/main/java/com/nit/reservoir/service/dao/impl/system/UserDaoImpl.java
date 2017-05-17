package com.nit.reservoir.service.dao.impl.system;

import com.nit.reservoir.core.abs.AbstractDaoImpl;
import com.nit.reservoir.core.abs.AbstractMapper;
import com.nit.reservoir.service.dao.system.UserDao;
import com.nit.reservoir.service.mapper.system.UserMapper;
import com.nit.reservoir.service.model.system.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by aozijian on 2017/5/16.
 */
@Repository
public class UserDaoImpl extends AbstractDaoImpl<User> implements UserDao{

    @Resource
    private UserMapper userMapper;

    @Override
    protected AbstractMapper<User> getAbstractMapper() {
        return userMapper;
    }

    @Override
    public User checkUser(String userName, String password) {
        return userMapper.checkUser(userName, password);
    }
}
