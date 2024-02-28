package com.hzde.lottery.domain.rule.service.logic.impl;

import com.hzde.lottery.domain.rule.model.req.DecisionMatterReq;
import com.hzde.lottery.domain.rule.service.logic.BaseLogic;
import org.springframework.stereotype.Component;


@Component
public class UserGenderFilter extends BaseLogic {

    @Override
    public String matterValue(DecisionMatterReq decisionMatter) {
        return decisionMatter.getValMap().get("gender").toString();
    }
    
}
