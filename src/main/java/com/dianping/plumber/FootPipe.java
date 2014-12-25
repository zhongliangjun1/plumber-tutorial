package com.dianping.plumber;

import com.dianping.plumber.annotation.ParamFromController;
import com.dianping.plumber.core.PlumberPipe;
import com.dianping.plumber.core.ResultType;
import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-11-14
 * Time: PM12:36
 * To change this template use File | Settings | File Templates.
 */
public class FootPipe extends PlumberPipe {

    private Logger logger = Logger.getLogger(MainPipe.class);

    @ParamFromController
    private String param;

    @Override
    public ResultType execute(Map<String, Object> paramsFromRequest, Map<String, Object> paramsFromController, Map<String, Object> modelForView) {

        try {
            Thread.sleep(1000);
            SimpleDateFormat time=new SimpleDateFormat("HH:mm:ss");
            modelForView.put("msg", "Get FootPipe Content! " + param + " " + time.format(new Date()));
        } catch (InterruptedException e) {
            logger.error(e);
        }

        return ResultType.SUCCESS;
        //return ResultType.ERROR;
    }

}
