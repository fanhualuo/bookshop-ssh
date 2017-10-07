package com.ssh.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import com.bean.Order;
import com.bean.User;

public class OrderDaoImp1 extends HibernateDaoSupport  implements OrderDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Order> FindAll() {
		String hql="from Order";
		return (List<Order>) this.getHibernateTemplate().find(hql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Order> FindByUserId(User user) {
		String hql="from Order where user=?";
		return (List<Order>) this.getHibernateTemplate().find(hql,user);
	}

	@Override
	public void save(Order order) {
		this.getHibernateTemplate().save(order);
	}

	@Override
	public void updateByID(Order order) {
		this.getHibernateTemplate().update(order);
	}

	@Override
	public void deleteByID(Order order) {
		this.getHibernateTemplate().delete(order);
	}


	@Override
	public Order FindById(int id) {
		// TODO 自动生成的方法存根
		return this.getHibernateTemplate().get(Order.class, id);
	}

}
