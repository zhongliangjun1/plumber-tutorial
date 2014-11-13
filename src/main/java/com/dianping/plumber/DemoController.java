package com.dianping.plumber;

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
        modelForView.put("title", "plumber-tutorial");
        return ResultType.SUCCESS;
    }

}
