package com.dianping.plumber.js;

import com.dianping.plumber.core.PlumberController;
import com.dianping.plumber.core.ResultType;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 15/3/2
 * Time: PM9:20
 * To change this template use File | Settings | File Templates.
 */
public class PlumberJsController extends PlumberController {

    @Override
    public ResultType execute(Map<String, Object> paramsFromRequest, Map<String, Object> paramsForPagelets, Map<String, Object> modelForView) {

        modelForView.put("title", "demo for plumber.js");

        return ResultType.SUCCESS;
    }

}
