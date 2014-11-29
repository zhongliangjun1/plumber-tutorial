package com.dianping.struts;

import com.dianping.plumber.core.Plumber;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

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


        String plumberControllerName = "demoController";

        Map<String, Object> paramsForController = new HashMap<String, Object>();
        paramsForController.put("demoDesc", "StrutsDemo");

        HttpServletResponse response = ServletActionContext.getResponse();
        plumber.execute(plumberControllerName, paramsForController, null, response);

        return null;
    }

    public void setPlumber(Plumber plumber) {
        this.plumber = plumber;
    }
}
