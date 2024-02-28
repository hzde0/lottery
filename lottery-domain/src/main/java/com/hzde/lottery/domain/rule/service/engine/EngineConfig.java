package com.hzde.lottery.domain.rule.service.engine;

import com.hzde.lottery.domain.rule.service.logic.LogicFilter;
import com.hzde.lottery.domain.rule.service.logic.impl.UserAgeFilter;
import com.hzde.lottery.domain.rule.service.logic.impl.UserGenderFilter;
import jdk.nashorn.internal.ir.annotations.Reference;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class EngineConfig {

    protected static Map<String, LogicFilter> logicFilterMap = new ConcurrentHashMap<>();

    @Resource
    private UserAgeFilter userAgeFilter;
    @Resource
    private UserGenderFilter userGenderFilter;

    @PostConstruct
    public void init() {
        logicFilterMap.put("userAge", userAgeFilter);
        logicFilterMap.put("userGender", userGenderFilter);
    }

}
