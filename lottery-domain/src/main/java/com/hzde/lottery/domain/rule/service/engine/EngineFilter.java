package com.hzde.lottery.domain.rule.service.engine;

import com.hzde.lottery.domain.rule.model.res.EngineResult;
import com.hzde.lottery.domain.rule.model.req.DecisionMatterReq;


public interface EngineFilter {

    /**
     * 规则过滤器接口
     *
     * @param matter      规则决策物料
     * @return            规则决策结果
     */
    EngineResult process(final DecisionMatterReq matter);

}
