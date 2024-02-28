package com.hzde.lottery.domain.activity.service.partake;

import com.hzde.lottery.domain.activity.model.req.PartakeReq;
import com.hzde.lottery.domain.activity.model.vo.ActivityBillVO;
import com.hzde.lottery.domain.activity.repository.IActivityRepository;

import javax.annotation.Resource;


public class ActivityPartakeSupport {

    @Resource
    protected IActivityRepository activityRepository;

    protected ActivityBillVO queryActivityBill(PartakeReq req){
        return activityRepository.queryActivityBill(req);
    }

}
