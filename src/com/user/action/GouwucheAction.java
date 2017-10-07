package com.user.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.bean.Order;
import com.bean.Order2;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ssh.service.BookService;
import com.ssh.service.GouwucheService;
@Controller
@Scope("prototype")
public class GouwucheAction extends ActionSupport implements SessionAware {
	private static final long serialVersionUID = 8780021633087535311L;

	private int bookid;

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	
	private BookService bookService;
	@Autowired
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	
	@Autowired
	private GouwucheService gouwucheService;
	public void setGouwucheService(GouwucheService gouwucheService) {
		this.gouwucheService = gouwucheService;
	}

	private Map<String, Object> session;

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

	@SuppressWarnings("unchecked") // 物品加入购物车
	public String save() {
		
		List<Order2> orders=(List<Order2>) session.get("orders");
		
		session.put("orders", gouwucheService.save(orders, bookid));
		return "save";
	}

	// 删除购物车
	@SuppressWarnings("unchecked")
	public String delete() {
		List<Order2> orders=(List<Order2>) session.get("orders");
		session.put("orders",gouwucheService.delete(orders, bookid) );
		return "delete";

	}

	// 显示购物车
	public String show() {
		
		if(session.get("orders")==null){
			return "show";
		}
		@SuppressWarnings("unchecked")
		List<Order2> orders=(List<Order2>) session.get("orders");
		
		List<Order> orders2=new ArrayList<Order>();
		
		
		for(int i=0;i<orders.size();i++){
			Order order=new Order();
			order.setNumber(orders.get(i).getNumber());
			order.setBook(bookService.FindById(orders.get(i).getBookid()));
			orders2.add(order);
			
		}
		ActionContext.getContext().getValueStack().set("gouwuche", orders2);
		return "show";
	}

}
