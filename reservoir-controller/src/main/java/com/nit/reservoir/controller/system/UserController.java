package com.nit.reservoir.controller.system;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
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
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by aozijian on 2017/4/20.
 */
@Controller
@RequestMapping("/admin/system/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 跳转到用户列表
     * @return
     */
    @RequestMapping(value = "/jumpToList", method = RequestMethod.GET)
    public ModelAndView jumpToList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("system/userList");
        return modelAndView;
    }

    /**
     * 跳转到用户编辑用户页
     * @param id
     * @return
     */
    @RequestMapping(value = "/jumpToEdit", method = RequestMethod.GET)
    public ModelAndView jumpToEdit(Integer id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("system/userEdit");
        modelAndView.addObject("id", id);
        return modelAndView;
    }

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

    /**
     * 获取用户列表
     * @param id
     * @param userName
     * @param roleId
     * @param gender
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getUserList", produces = "text/html;charset=UTF-8", method = RequestMethod.GET)
    public String getUserList(String id, String userName, Integer roleId, Integer gender, Integer pageIndex, Integer pageSize) {
        if (null == pageIndex || pageIndex < 1)
            pageIndex = 1;
        if (null == pageSize || pageSize < 1)
            pageSize = 10;
        if (pageSize > 20)
            pageSize = 20;
        try {
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("id", id);
            params.put("userName", userName);
            params.put("roleId", roleId);
            params.put("gender", gender);
            params.put("pageIndex", pageSize * (pageIndex - 1));
            params.put("pageSize", pageSize);
            List<User> userList = userService.selectByParams(params);
            int total = userService.count(params);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("total", total);
            jsonObject.put("rows", userList);
            return JSON.toJSONString(jsonObject, SerializerFeature.DisableCircularReferenceDetect);
        } catch (Exception e) {
            DailyLog.getLog().error("[水库信息化系统]获取用户列表异常", e);
            return JSON.toJSONString(JsonResult.createFailed(Constants.ResponseCode.ERROR_UNKNOWN, "未知异常"));
        }
    }
}
