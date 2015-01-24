package com.dianping.plumber;

import com.dianping.plumber.annotation.ParamFromController;
import com.dianping.plumber.annotation.ParamFromRequest;
import com.dianping.plumber.core.PlumberPagelet;
import com.dianping.plumber.core.ResultType;
import org.apache.log4j.Logger;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-11-14
 * Time: PM12:32
 * To change this template use File | Settings | File Templates.
 */
public class HeadBarrier extends PlumberPagelet {

    private Logger logger = Logger.getLogger(RightBarrier.class);

    @ParamFromController
    private String param;

    @ParamFromRequest
    private String demoDesc;

    @Override
    public ResultType execute(Map<String, Object> paramsFromRequest, Map<String, Object> paramsFromController, Map<String, Object> modelForView) {

        modelForView.put("msg", "Get HeadBarrier Content! "+ param + " " + demoDesc);
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            logger.error(e);
        }

        return ResultType.SUCCESS;
    }

}
