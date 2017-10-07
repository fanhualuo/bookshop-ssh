package com.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import com.bean.Order2;
import com.ssh.service.GouwucheServiceImp1;

public class Test4 {

	//private BookService bookService = ctx.getBean(BookService.class);
	private GouwucheServiceImp1 a1=new GouwucheServiceImp1();

	@Test // save
	public void FindIdBook() {
		List<Order2> orders=new ArrayList<Order2>();
		//orders.add(order);
		System.out.println(orders);
		
		a1.save(orders, 2);
		System.out.println(orders);
	}
	
	@Test // delete
	public void delete() {
		List<Order2> orders=new ArrayList<Order2>();
		Order2 order=new Order2(1, 1, 1, "111", "111", "111", 1);
		orders.add(order);
		System.out.println(orders);
		
		a1.save(orders, 2);
		System.out.println(orders);
		
		a1.delete(orders, 1);
		System.out.println(orders);
		
		a1.delete(orders, 2);
		System.out.println(orders);
		
		
	}

	
}
