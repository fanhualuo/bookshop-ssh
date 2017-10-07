package com.ssh.service;

import java.util.List;

import com.bean.Order;
import com.bean.User;

public interface OrderService {
	// 查看所有订单
	public List<Order> FindAll();

	// 按照userid查看个人所有订单
	public List<Order> FindByUserId(User user);

	// 按照id订单
	public Order FindById(int id);

	// 插入商品
	public void save(Order order);

	// 按照订单id修改订单状态
	public void updateByID(Order order);

	// 按照订单id删除订单
	public void deleteByID(Order order);

}
