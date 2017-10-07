package com.ssh.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import com.bean.User;
//user管理持久层
public class UserImp extends HibernateDaoSupport implements UserDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		String hql=" from User";
		return (List<User>) this.getHibernateTemplate().find(hql);
	}

	@SuppressWarnings("unchecked")
	@Override  //按照用户名和密码查找用户
	public User login(User user) {
		String hql = "from User where username =? and password =?";

		List<User> list=new ArrayList<User>();
		 list = (List<User>) this.getHibernateTemplate().find(hql,user.getUsername(),user.getPassword());
		if (list.size() > 0) {
			return list.get(0);// 查询到返回集合第一个
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override  //按照用户名和密码查找用户
	public User FindByUserName(User user) {
		String hql = "from User where username =? ";

		List<User> list=new ArrayList<User>();
		 list = (List<User>) this.getHibernateTemplate().find(hql,user.getUsername());
		if (list.size() > 0) {
			return list.get(0);// 查询到返回集合第一个
		}
		return null;
	}
	
	@Override//按照id查询用户
	public User findByID(int id) {
		return this.getHibernateTemplate().get(User.class, id);
	}

	@Override //插入
	public void save(User user) {
		this.getHibernateTemplate().save(user);
		
	}

	@Override//修改
	public void updateByid(User user) {
		this.getHibernateTemplate().update(user);
		
	}

	@Override
	public void delete(User user) {
		this.getHibernateTemplate().delete(user);
		
	}




}
