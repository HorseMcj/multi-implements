package com.study.multiimplements.test.web;

import com.study.multiimplements.test.factory.TrafficModeFactory;
import com.study.multiimplements.test.service.TrafficService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ChenJunMa
 * @date 2020年5月26日
 * @description
 */
@RequestMapping(value = "/traffic")
@RestController
public class TrafficController {

    @RequestMapping(value = "/demo/{tools}", method = RequestMethod.GET)
    @ResponseBody
    public Object traffic(HttpServletRequest request, @PathVariable String tools) {
        try {
            TrafficService trafficService = null;
            if (tools.equals("CAR")) {
                trafficService = TrafficModeFactory.getTrafficService("CAR");
            }
            if (tools.equals("TRAIN")) {
                trafficService = TrafficModeFactory.getTrafficService("TRAIN");
            }
            if (tools.equals("PLANE")) {
                trafficService = TrafficModeFactory.getTrafficService("PLANE");
            }
            return trafficService.trafficTools();
        } catch (Exception e) {
            return e;
        }
    }

    @RequestMapping(value = "/demo1/{tools}", method = RequestMethod.GET)
    @ResponseBody
    public Object traffic1(HttpServletRequest request, @PathVariable String tools) {
        try {
            return TrafficModeFactory.getTrafficTools(tools);
        } catch (Exception e) {
            return e;
        }
    }
}
