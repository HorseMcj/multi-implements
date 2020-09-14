package com.study.multiimplements.test.factory;

import com.study.multiimplements.test.service.TrafficService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ChenJunMa
 * @date 2020年5月27日
 * @description
 */
@Component
public class TrafficModeFactory implements ApplicationContextAware {

    private static Map<String, TrafficService> trafficBeanMap;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, TrafficService> map = applicationContext.getBeansOfType(TrafficService.class);
        trafficBeanMap = new HashMap<>();
        map.forEach((key, value) -> trafficBeanMap.put(value.getTraffic(), value));
    }

    public static <T extends TrafficService> T getTrafficService(String traffic) {
        return (T) trafficBeanMap.get(traffic);
    }

    public static String getTrafficTools(String traffic) {
        TrafficService trafficService = trafficBeanMap.get(traffic);
        return trafficService.trafficTools();
    }

}
