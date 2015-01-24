package com.dianping.plumber;

import com.dianping.plumber.core.PlumberPagelet;
import com.dianping.plumber.core.ResultType;
import org.apache.log4j.Logger;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-11-13
 * Time: PM1:58
 * To change this template use File | Settings | File Templates.
 */
public class RightBarrier extends PlumberPagelet {

    private Logger logger = Logger.getLogger(RightBarrier.class);

    @Override
    public ResultType execute(Map<String, Object> paramsFromRequest, Map<String, Object> paramsFromController, Map<String, Object> modelForView) {

        modelForView.put("msg", "Get RightBarrier Content!");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            logger.error(e);
        }

//        String a = null;
//        a.split("test");

        return ResultType.SUCCESS;
        //return ResultType.ERROR;
    }

}
