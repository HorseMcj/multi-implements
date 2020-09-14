package com.study.multiimplements.test.service;

import org.springframework.stereotype.Service;

/**
 * @author ChenJunMa
 * @date 2020年5月26日
 * @description 汽车出行
 */
@Service(value = "car")
public class CarTrafficServiceImpl implements TrafficService {

    @Override
    public String getTraffic() {
        return "CAR";
    }

    @Override
    public String trafficTools() {
        System.out.println("汽车出行");
        return "汽车出行";
    }

}
