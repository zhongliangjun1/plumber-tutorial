package com.dianping.plumber.pc;

import com.dianping.plumber.core.PlumberController;
import com.dianping.plumber.core.ResultType;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-11-13
 * Time: PM2:14
 * To change this template use File | Settings | File Templates.
 */
public class DemoController extends PlumberController {

    @Override
    public ResultType execute(Map<String, Object> paramsFromRequest, Map<String, Object> paramsForPagelets, Map<String, Object> modelForView) {

        paramsForPagelets.put("param", "test paramFromController");

        paramsForPagelets.put("testNullValue", null);

        modelForView.put("title", "plumber-tutorial of " + paramsFromRequest.get("demoDesc"));

//        String a = null;
//        a.split("test");

        return ResultType.SUCCESS;
    }

}
