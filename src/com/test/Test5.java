package com.test;



import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Order;
import com.bean.User;
import com.ssh.service.OrderService;


public class Test5 {
	private  ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

	private OrderService orderService=ctx.getBean(OrderService.class);

	
	
	@Test// 按照id查看个人所有订单
	public void FiindByIDOrder(){
		
		List<Order> orders=new ArrayList<Order>();
		User user=new User();
		user.setId(1);
		orders=orderService.FindByUserId(user);
		System.out.println(orders);
	}
	
	@Test// 按照id订单
	public void FiindByID(){
		System.out.println(orderService.FindById(2));
		
	}

	@Test// 查看所有订单
	public void FiindAllIDOrder(){
		
		List<Order> orders=new ArrayList<Order>();
		orders=orderService.FindAll();
		System.out.println(orders);
	}

	@Test// 按照订单id修改订单状态
	public void updateByIDOrder(){
		Order order=orderService.FindById(2);
		order.setZhuangtai("修改订单");
		orderService.updateByID(order);
		
	}

	@Test// 插入订单
	public void save(){
		Order order=new Order(1, null, null, "333", "333", "已经发货", 100);
		orderService.save(order);
	}
	// 按照订单id删除订单
	@Test// 插入订单
	public void delete(){
		Order order=orderService.FindById(4);
		orderService.deleteByID(order);
	}
	
}
