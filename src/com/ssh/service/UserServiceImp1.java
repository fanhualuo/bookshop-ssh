package com.ssh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.User;
import com.ssh.dao.UserDao;
@Service
@Transactional
//用户管理service层
public class UserServiceImp1 implements UserService{
	@Autowired
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public List<User> findAll() {
		
		return userDao.findAll();
	}
	@Override
	public User login(User user) {
		// TODO 自动生成的方法存根
		return userDao.login(user);
	}
	@Override
	public User findByID(int id) {
		// TODO 自动生成的方法存根
		return userDao.findByID(id);
	}
	@Override
	public void save(User user) {
		// TODO 自动生成的方法存根
		userDao.save(user);
		
	}
	@Override
	public void updateByid(User user) {
		// TODO 自动生成的方法存根
		userDao.updateByid(user);		
	}
	@Override
	public void delete(User user) {		
		//级联删除
		userDao.delete(userDao.findByID(user.getId()));
		
	}
	@Override
	public User FindByUserName(User user) {
		return userDao.FindByUserName(user);
	}
	

}
