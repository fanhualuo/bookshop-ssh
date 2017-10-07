package com.ssh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Order;
import com.bean.User;
import com.ssh.dao.OrderDao;
@Service
@Transactional
public class OrderServiceImp1 implements OrderService{
	@Autowired
	private OrderDao orderDao;
	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	@Override
	public List<Order> FindAll() {
		// TODO 自动生成的方法存根
		return orderDao.FindAll();
	}
	@Override
	public List<Order> FindByUserId(User user) {
		// TODO 自动生成的方法存根
		return orderDao.FindByUserId(user);
	}
	@Override
	public Order FindById(int id) {
		// TODO 自动生成的方法存根
		return orderDao.FindById(id);
	}
	@Override
	public void save(Order order) {
		// TODO 自动生成的方法存根
		orderDao.save(order);
	}
	@Override
	public void updateByID(Order order) {
		// TODO 自动生成的方法存根
		orderDao.updateByID(order);
	}
	@Override
	public void deleteByID(Order order) {
		// TODO 自动生成的方法存根
		orderDao.deleteByID(order);
	}

	

}
