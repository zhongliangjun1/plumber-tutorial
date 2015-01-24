package com.dianping.struts;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 15/1/22
 * Time: PM11:08
 * To change this template use File | Settings | File Templates.
 */
public class PerformanceTest extends ActionSupport {


    @Override
    public String execute() throws Exception {

        Thread.sleep(100);

        return "success";
    }

}
