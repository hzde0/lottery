package com.hzde.lottery.domain.award.service.goods.impl;

import com.hzde.lottery.common.Constants;
import com.hzde.lottery.domain.award.model.req.GoodsReq;
import com.hzde.lottery.domain.award.model.res.DistributionRes;
import com.hzde.lottery.domain.award.service.goods.DistributionBase;
import com.hzde.lottery.domain.award.service.goods.IDistributionGoods;
import org.springframework.stereotype.Component;


@Component
public class RedeemCodeGoods extends DistributionBase implements IDistributionGoods {

    @Override
    public DistributionRes doDistribution(GoodsReq req) {

        // 模拟调用兑换码
        logger.info("模拟调用兑换码 uId：{} awardContent：{}", req.getuId(), req.getAwardContent());

        // 更新用户领奖结果
        super.updateUserAwardState(req.getuId(), req.getOrderId(), req.getAwardId(), Constants.GrantState.COMPLETE.getCode());

        return new DistributionRes(req.getuId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());
    }

}
