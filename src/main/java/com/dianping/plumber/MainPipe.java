package com.dianping.plumber;

import com.dianping.plumber.core.PlumberPagelet;
import com.dianping.plumber.core.ResultType;
import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-11-13
 * Time: PM1:51
 * To change this template use File | Settings | File Templates.
 */
public class MainPipe extends PlumberPagelet {

    private Logger logger = Logger.getLogger(MainPipe.class);

    @Override
    public ResultType execute(Map<String, Object> paramsFromRequest, Map<String, Object> paramsFromController, Map<String, Object> modelForView) {

        try {
            Thread.sleep(4000);
            SimpleDateFormat time=new SimpleDateFormat("HH:mm:ss");
            modelForView.put("msg", "Get MainPipe Content! " + time.format(new Date()));
        } catch (InterruptedException e) {
            logger.error(e);
        }

//        String a = null;
//        a.split("test");

        return ResultType.SUCCESS;
    }
}
