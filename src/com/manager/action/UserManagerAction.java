package com.manager.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.service.UserService;

@Controller // 标识层
@Scope("prototype")
public class UserManagerAction extends ActionSupport implements ModelDriven<User> {
	private static final long serialVersionUID = 7269976027947109265L;

	private User user = new User();
	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	// 登录验证,判断用户权限是否为1
	public String login() {
		User userdate = userService.login(user);

		if (userdate == null || userdate.getQuanxian() == 0) {
			this.addActionError("登录失败");
			return INPUT;
		} else {
			ActionContext.getContext().getSession().put("user", userdate);
			// 登录成功,存入session
			return SUCCESS;
		}
	}

	// 查询个人所有信息
	public String find() {
		ActionContext.getContext().getValueStack().set("users", userService.findAll());
		return "find";

	}

	// 修改
	public String update() {
		userService.updateByid(user);
		return "update";
	}

	// 修改
	public String updatejsp() {
		user = userService.findByID(user.getId());
		return "updatejsp";
	}

	// 删除
	public String delete() {
		userService.delete(user);
		return "delete";
	}

	@Override
	public User getModel() {
		return user;
	}

}
