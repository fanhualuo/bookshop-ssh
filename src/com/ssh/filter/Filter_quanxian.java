package com.ssh.filter;

import java.util.ArrayList;
import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class Filter_quanxian extends AbstractInterceptor {
	/**
	 * 权限校验，判断session的信息
	 */
	private static final long serialVersionUID = -4328710521436138477L;

	

	public String intercept(ActionInvocation arg0) throws Exception {
		ActionContext context=ActionContext.getContext();
		Map<String, Object> session=context.getSession();
		ArrayList<String> list=new ArrayList<String>();
		list.add("user_login"); //需要过滤的指定方法
		list.add("user_zhuce");
		list.add("user_findpassword1");
		list.add("user_findpassword2");
		list.add("user_findpassword3");
		list.add("userManager_login");
		//Struts2 中配置的Action
		String action=arg0.getProxy().getActionName();

		if (session.get("user") == null&&(!list.contains(action))){
			//不是指定方法并且没有session，非法用户
			
			return "login";//需要登陆
		}
//		System.out.println("Action："+arg0.getAction().getClass().getName());  //类名
//		System.out.println("Struts2 中配置的Action："+arg0.getProxy().getActionName());  
//		System.out.println("调用的方法："+arg0.getProxy().getMethod()); 
		
//		System.out.println("过滤器方法比较   "+list.contains(action));
//		
//		System.out.println("过滤器   "+session.get("user"));
		return arg0.invoke();
	}

}
