package com.dianping.Utils;

import org.apache.log4j.Logger;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 15/1/25
 * Time: PM3:53
 * To change this template use File | Settings | File Templates.
 */
public abstract class MockExecute {

    private static Logger logger = Logger.getLogger(MockExecute.class);

    public static void run(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            logger.error(e);
        }
    }

}
