package com.dianping.plumber;

import com.dianping.plumber.config.PlumberConfigOverrider;
import com.dianping.plumber.config.PlumberConfigOverriderFactory;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-12-30
 * Time: PM5:36
 * To change this template use File | Settings | File Templates.
 */
public class DemoConfigOverriderFactory implements PlumberConfigOverriderFactory {

    @Override
    public PlumberConfigOverrider getConfigOverrider() {
        return new DemoConfigOverrider();
    }

}
