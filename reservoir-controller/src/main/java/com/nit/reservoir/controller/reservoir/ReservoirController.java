package com.nit.reservoir.controller.reservoir;

import com.alibaba.fastjson.JSON;
import com.nit.reservoir.core.bean.JsonResult;
import com.nit.reservoir.core.contants.Constants;
import com.nit.reservoir.core.log.DailyLog;
import com.nit.reservoir.service.business.reservoir.ReservoirService;
import com.nit.reservoir.service.model.reservoir.Reservoir;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by aozijian on 2017/4/20.
 */
@Controller
public class ReservoirController {

    @Resource
    private ReservoirService reservoirService;

    /**
     * 条件获得水库列表
     * @param id  水库ID
     * @param location  水库所在地
     * @param river  水库所在流域
     * @param pageIndex  开始页数
     * @param pageSize  每页条数
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getReservoir", produces = "text/html;charset=UTF-8", method = RequestMethod.GET)
    public String getReservoir(String id, String location, String river, Integer pageIndex, Integer pageSize) {
        if (null == pageIndex || pageIndex < 1)
            pageIndex = 1;
        if (null == pageSize || pageSize < 1)
            pageSize = 10;
        if (pageSize > 20)
            pageSize = 20;
        try {
            Map map = new HashMap();
            map.put("id", id);
            map.put("location", location);
            map.put("river", river);
            List<Reservoir> reservoirList = reservoirService.selectByParams(map);
            return JSON.toJSONString(JsonResult.createSuccess("查询成功", reservoirList));
        } catch (Exception e) {
            DailyLog.getLog().error("条件获取水库信息异常", e);
            return JSON.toJSONString(JsonResult.createFailed(Constants.ResponseCode.ERROR_UNKNOWN, "未知异常"));
        }
    }
}
