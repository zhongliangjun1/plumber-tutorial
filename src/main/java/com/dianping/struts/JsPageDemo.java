package com.dianping.struts;

import com.dianping.plumber.core.Plumber;
import com.dianping.plumber.core.ResultType;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 15/1/25
 * Time: PM2:09
 * To change this template use File | Settings | File Templates.
 */
public class JsPageDemo extends ActionSupport {

    private static final long serialVersionUID = 4011506020271412469L;

    private Plumber plumber;

    @Override
    public String execute() throws Exception {


        String plumberControllerName = "jsController";

        Map<String, Object> paramsForController = new HashMap<String, Object>();
        paramsForController.put("demoDesc", "plumber.js page demo");

        HttpServletResponse response = ServletActionContext.getResponse();
        HttpServletRequest request = ServletActionContext.getRequest();

        ResultType resultType = plumber.execute(plumberControllerName, paramsForController, request, response);
        if ( resultType==ResultType.SUCCESS ) {
            return null;
        } else {
            return "error";
        }

    }

    public void setPlumber(Plumber plumber) {
        this.plumber = plumber;
    }

}
