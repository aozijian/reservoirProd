package com.nit.reservoir.controller.system;

import com.nit.reservoir.core.contants.Constants;
import com.nit.reservoir.service.model.system.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by aozijian on 2017/5/16.
 */
@Controller
@RequestMapping("/admin")
public class SystemController {

    /**
     * 跳转到首页
     * @param request
     * @return
     */
    @RequestMapping(value = "/index")
    public ModelAndView index(HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute(Constants.GLOBAL_USER);
        if (user != null) {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("index");
            modelAndView.addObject(user);
            return modelAndView;
        } else {
            return null;
        }

    }
}
