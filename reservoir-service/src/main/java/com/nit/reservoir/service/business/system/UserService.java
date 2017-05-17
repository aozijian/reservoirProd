package com.nit.reservoir.service.business.system;

import com.nit.reservoir.core.abs.AbstractService;
import com.nit.reservoir.service.model.system.User;

/**
 * Created by aozijian on 2017/4/21.
 */
public interface UserService extends AbstractService<User>{

    /**
     * 根据用户名和密码查询，校验用户
     * @param userName
     * @param password
     * @return
     */
    User checkUser(String userName, String password);
}
