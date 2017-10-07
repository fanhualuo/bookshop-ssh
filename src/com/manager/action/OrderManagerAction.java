package com.manager.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.bean.Order;
import com.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.service.OrderService;
import com.ssh.service.UserService;

@Controller // 标识层
@Scope("prototype")
public class OrderManagerAction extends ActionSupport implements ModelDriven<Order> {
	private static final long serialVersionUID = -2299458045587677046L;

	private Order order = new Order();

	private OrderService orderService;
	@Autowired
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
    private UserService userService;
    @Autowired
    public void setUserService(UserService userService) {
		this.userService = userService;
	}
	// 查找所有用户订单信息
	public String find() {
		ActionContext.getContext().getValueStack().set("dingdan", orderService.FindAll());
		return "find";
	}

	// 查找某个用户订单信息
	public String find_user() {
		User user=userService.findByID(order.getUser().getId());
		ActionContext.getContext().getValueStack().set("dingdan", orderService.FindByUserId(user));
		return "find_user";
	}

	// 删除
	public String delete() {
		orderService.deleteByID(order);
		return "delete";

	}

	// 修改
	public String update() {
		System.out.println("aaaaaaaaaaaaaaaaa");
		orderService.updateByID(order);
		return "update";
	}

	public String updatejsp() {
		order = orderService.FindById(order.getId());
		return "updatejsp";
	}

	@Override
	public Order getModel() {
		// TODO 自动生成的方法存根
		return order;
	}
}
