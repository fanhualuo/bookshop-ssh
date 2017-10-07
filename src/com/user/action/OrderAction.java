package com.user.action;

import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.bean.Book;
import com.bean.Order;
import com.bean.Order2;
import com.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.service.OrderService;
@Controller
@Scope("prototype")
public class OrderAction extends ActionSupport implements SessionAware, ModelDriven<Order> {
	private static final long serialVersionUID = -2299458045587677046L;

	private Order order = new Order();
	private Map<String, Object> session;

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

	private OrderService orderService;
	@Autowired
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	// 加入订单,结算
	public String submit() {
		@SuppressWarnings("unchecked")
		List<Order2> orders = (List<Order2>) session.get("orders");


		for (int i = 0; i < orders.size(); i++) {
			Order order2 = new Order();
			order2.setNumber(orders.get(i).getNumber());//数量
			order2.setUser((User)session.get("user"));//哪个用户的
			Book book=new Book();
			book.setId(orders.get(i).getBookid());
			order2.setBook(book);//哪本书
			order2.setPhone(order.getPhone());//电话
			order2.setAddress(order.getAddress());//地址
			
			orderService.save(order2);//提交订单

		}
		//删除购物车
		session.put("orders",null);
		return "submit";

	}

	//显示订单
	public String show(){
		ActionContext.getContext().getValueStack().set("dingdan", orderService.FindByUserId((User)session.get("user")));
		return "show";	
	}
	
	@Override
	public Order getModel() {
		// TODO 自动生成的方法存根
		return order;
	}
}
