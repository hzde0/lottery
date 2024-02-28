package com.hzde.lottery.domain.award.service.goods.impl;

import com.hzde.lottery.common.Constants;
import com.hzde.lottery.domain.award.model.req.GoodsReq;
import com.hzde.lottery.domain.award.model.res.DistributionRes;
import com.hzde.lottery.domain.award.service.goods.DistributionBase;
import com.hzde.lottery.domain.award.service.goods.IDistributionGoods;
import org.springframework.stereotype.Component;


@Component
public class DescGoods extends DistributionBase implements IDistributionGoods {

    @Override
    public DistributionRes doDistribution(GoodsReq req) {

        super.updateUserAwardState(req.getuId(), req.getOrderId(), req.getAwardId(), Constants.GrantState.COMPLETE.getCode());

        return new DistributionRes(req.getuId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());
    }

}
