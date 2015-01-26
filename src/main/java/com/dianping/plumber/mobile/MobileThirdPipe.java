package com.dianping.plumber.mobile;

import com.dianping.Utils.MockExecute;
import com.dianping.plumber.core.PlumberPagelet;
import com.dianping.plumber.core.ResultType;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 15/1/26
 * Time: AM2:05
 * To change this template use File | Settings | File Templates.
 */
public class MobileThirdPipe extends PlumberPagelet {

    @Override
    public ResultType execute(Map<String, Object> paramsFromRequest, Map<String, Object> paramsFromController, Map<String, Object> modelForView) {

        MockExecute.run(1100);
        modelForView.put("title", "thirdPipe");
        return ResultType.SUCCESS;

    }

}
