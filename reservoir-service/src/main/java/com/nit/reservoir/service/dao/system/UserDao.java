package com.nit.reservoir.service.dao.system;

import com.nit.reservoir.core.abs.AbstractDao;
import com.nit.reservoir.service.model.system.User;

/**
 * Created by aozijian on 2017/5/16.
 */
public interface UserDao extends AbstractDao<User>{

    /**
     * 根据用户名和密码查询，校验用户
     * @param userName
     * @param password
     * @return
     */
    User checkUser(String userName, String password);
}
