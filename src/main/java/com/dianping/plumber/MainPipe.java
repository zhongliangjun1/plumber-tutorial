package com.dianping.plumber;

import com.dianping.plumber.core.PlumberPipe;
import com.dianping.plumber.core.ResultType;
import org.apache.log4j.Logger;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-11-13
 * Time: PM1:51
 * To change this template use File | Settings | File Templates.
 */
public class MainPipe extends PlumberPipe {

    private Logger logger = Logger.getLogger(MainPipe.class);

    @Override
    public ResultType execute(Map<String, Object> paramsFromController, Map<String, Object> modelForView) {

        modelForView.put("msg", "get MainPipe!");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            logger.error(e);
        }

        return ResultType.SUCCESS;
    }
}