package com.dianping.plumber;

import com.dianping.plumber.config.PlumberConfig;
import com.dianping.plumber.config.PlumberConfigOverrider;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-12-30
 * Time: PM5:34
 * To change this template use File | Settings | File Templates.
 */
public class DemoConfigOverrider extends PlumberConfigOverrider {

    @Override
    public void override() {
        overrideConfigurations.put(PlumberConfig.ConcurrentCorePoolSize, 10);
    }

}
