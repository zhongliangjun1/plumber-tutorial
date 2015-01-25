package com.dianping.plumber.mobile;

import com.dianping.plumber.core.PlumberController;
import com.dianping.plumber.core.ResultType;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 15/1/25
 * Time: PM2:38
 * To change this template use File | Settings | File Templates.
 */
public class MobileController extends PlumberController {

    @Override
    public ResultType execute(Map<String, Object> paramsFromRequest, Map<String, Object> paramsForPagelets, Map<String, Object> modelForView) {

        paramsForPagelets.put("param", "test paramFromController");
        modelForView.put("title", paramsFromRequest.get("demoDesc"));
        return ResultType.SUCCESS;

    }

}
