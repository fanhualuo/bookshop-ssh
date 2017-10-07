package com.user.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.service.UserService;

@Controller
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven<User> {
	private static final long serialVersionUID = 7269976027947109265L;
	private User user = new User();

	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	// 登录验证
	public String login() {
		User userdate = userService.login(user);
		if (userdate == null) {
			this.addActionError("登录失败");
			return INPUT;
		} else {
			ActionContext.getContext().getSession().put("user", userdate);
			// 登录成功,存入session
			return SUCCESS;
		}
	}

	// 注册账号
	public String zhuce() {

		if (userService.FindByUserName(user) == null) {// 检测账号是否注册
			userService.save(user);// 注册账号
			ServletActionContext.getRequest().setAttribute("date", "注册成功");
		} else {
			ServletActionContext.getRequest().setAttribute("date", "注册失败或者此账号已经注册");
		}
		return "zhuce";
	}

	// 修改账户信息
	public String update() {
		User user2 = (User) ActionContext.getContext().getSession().get("user");
		if (user2 != null) {
			user.setId(user2.getId());
			user.setQuanxian(user2.getQuanxian());
			ActionContext.getContext().getSession().put("user", user);
			userService.updateByid(user);
		}
		return "update";

	}

	// 注销页面
	public String logon() {
		//
		ActionContext.getContext().getSession().put("user", null);
		ActionContext.getContext().getSession().put("orders", null);
		return "logon";

	}

	public String findpassword1() {
		User userdate2 = (User) userService.FindByUserName(user);
		if (userdate2 != null) {
			ActionContext.getContext().getSession().put("finduser", userdate2);
		} else {
			this.addActionError("此账号未注册");
			return "findlogin1";
		}
		return "findquestion1";

	}

	public String findpassword2() {
		User userdate2 = (User) ActionContext.getContext().getSession().get("finduser");
		if (user.getAnswer().equals(userdate2.getAnswer())&&userdate2!=null) {// 密保验证成功
			return "findquestion2";
		}
		
		this.addActionError("密保验证错误");
		return "findlogin2"; //验证失败
	}

	public String findpassword3() {
		User userdate1 = (User) ActionContext.getContext().getSession().get("finduser");
		
		if (userdate1!=null) {
			userdate1.setPassword(user.getPassword());
			userService.updateByid(userdate1);//设置新的密码
			ServletActionContext.getRequest().setAttribute("date", "修改密码成功");
			ActionContext.getContext().getSession().put("finduser", null);//session设置null
			return "findquestion3";
		}
		
		this.addActionError("非法操作");
		return "findlogin3";

	}

	/*
	 * // 找回密码1，按照用户名查找密保问题 public String findpassword1() { User userdate2 =
	 * (User) userService.FindByUserName(user); if (userdate2 != null) {
	 * ActionContext.getContext().getValueStack().set("user", userdate2); } else
	 * { this.addActionError("此账号未注册"); return ""; } return "findquestion1";
	 * 
	 * }
	 * 
	 * // 找回密码2，验证问题 public String findpassword2() { User userdate1 = (User)
	 * ActionContext.getContext().getSession().get("user"); if
	 * (user.getAnswer().equals(userdate1.getAnswer())) {
	 * userService.updateByid(user); } return "findpassword2";
	 * 
	 * }
	 * 
	 * // 找回密码3，修改密码 public String findpassword3() { User userdate1 = (User)
	 * ActionContext.getContext().getSession().get("user"); if
	 * (user.getAnswer().equals(userdate1.getAnswer())) {
	 * userService.updateByid(user); } return "findpassword3";
	 * 
	 * }
	 */
	@Override
	public User getModel() {
		// TODO 自动生成的方法存根
		return user;
	}

}
