package com.nit.reservoir.service.mapper.system;

import com.nit.reservoir.core.abs.AbstractMapper;
import com.nit.reservoir.service.model.system.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by aozijian on 2017/5/16.
 */
public interface UserMapper extends AbstractMapper<User>{

    /**
     * 根据用户名和密码查询，校验用户
     * @param userName
     * @param password
     * @return
     */
    User checkUser(@Param("userName") String userName, @Param("password") String password);
}
