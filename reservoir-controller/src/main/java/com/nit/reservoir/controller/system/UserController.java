package com.nit.reservoir.controller.system;

import com.alibaba.fastjson.JSON;
import com.nit.reservoir.core.bean.JsonResult;
import com.nit.reservoir.core.contants.Constants;
import com.nit.reservoir.core.log.DailyLog;
import com.nit.reservoir.service.business.system.UserService;
import com.nit.reservoir.service.interceptor.Access;
import com.nit.reservoir.service.model.system.User;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by aozijian on 2017/4/20.
 */
@Controller
@RequestMapping("/admin/system/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 用户登录
     * @param userName  用户名
     * @param password  密码
     * @return
     */
    @Access(login = false)
    @ResponseBody
    @RequestMapping(value = "/login", produces = "text/html;charset=UTF-8", method = RequestMethod.POST)
    public String login(String userName, String password, HttpServletRequest request) {
        if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(password))
            return JSON.toJSONString(JsonResult.createFailed(Constants.ResponseCode.ERROR_PARAM, "参数错误"));
        try {
            User user = userService.checkUser(userName, password);
            int result = 0;
            if (user != null) {
                result = 1;
                request.getSession().setAttribute(Constants.GLOBAL_USER, user);
            }
            return JSON.toJSONString(JsonResult.createSuccess(result));
        } catch (Exception e) {
            DailyLog.getLog().error("[水库信息化系统]用户登录异常，未知异常", e);
            return JSON.toJSONString(JsonResult.createFailed(Constants.ResponseCode.ERROR_UNKNOWN, "未知异常"));
        }
    }
}
