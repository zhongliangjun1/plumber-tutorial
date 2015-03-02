package com.dianping.plumber.js;

import com.dianping.Utils.MockExecute;
import com.dianping.plumber.core.PlumberPagelet;
import com.dianping.plumber.core.ResultType;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 15/3/2
 * Time: PM9:24
 * To change this template use File | Settings | File Templates.
 */
public class JsFourthPagelet extends PlumberPagelet {

    @Override
    public ResultType execute(Map<String, Object> paramsFromRequest, Map<String, Object> paramsFromController, Map<String, Object> modelForView) {

        MockExecute.run(3500);

        modelForView.put("title", "fourth pagelet");

        return ResultType.SUCCESS;
    }

}
