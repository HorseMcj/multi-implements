package com.study.multiimplements.test.service;

import org.springframework.stereotype.Service;

/**
 * @author ChenJunMa
 * @date 2020年5月26日
 * @description 火车出行
 */
@Service(value = "train")
public class TrainTrafficServiceImpl implements TrafficService {

    @Override
    public String getTraffic() {
        return "TRAIN";
    }

    @Override
    public String trafficTools() {
        System.out.println("火车出行");
        return "火车出行";
    }

}
