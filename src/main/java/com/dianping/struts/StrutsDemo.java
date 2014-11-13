package com.dianping.struts;

import com.dianping.plumber.core.Plumber;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-11-12
 * Time: PM10:12
 * To change this template use File | Settings | File Templates.
 */
public class StrutsDemo extends ActionSupport {
    private static final long serialVersionUID = 1150116003710481553L;

    private Plumber plumber;

    @Override
    public String execute() throws Exception {

        HttpServletResponse response = ServletActionContext.getResponse();
        String plumberControllerName = "demo";
        plumber.execute(plumberControllerName, null, null, response);

        return null;
    }

    public void setPlumber(Plumber plumber) {
        this.plumber = plumber;
    }
}
