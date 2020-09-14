package com.study.multiimplements.test.service;

import org.springframework.stereotype.Service;

/**
 * @author ChenJunMa
 * @date 2020年5月26日
 * @description 飞机出行
 */
@Service(value = "plane")
public class PlaneTrafficServiceImpl implements TrafficService {

    @Override
    public String getTraffic() {
        return "PLANE";
    }

    @Override
    public String trafficTools() {
        System.out.println("飞机出行");
        return "飞机出行";
    }

}
