package com.ssh.dao;

import java.util.List;

import com.bean.User;

public interface UserDao {

	// 查看所有用户信息
	public List<User> findAll();

	//按照用户名查找用户
	public User FindByUserName(User user);
	
	//按照username和password查询用户
	public User login(User user);

	// 按照用户id查找用户信息
	public User findByID(int id);

	// 插入用户
	public void save(User user);

	// 修改个人信息
	public void updateByid(User user);
	
	//删除用户
	public void delete(User user);


}
