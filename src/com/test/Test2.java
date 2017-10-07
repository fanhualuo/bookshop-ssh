package com.test;



import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.User;
import com.ssh.service.UserService;


public class Test2 {
	private  ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

	private UserService UserService=ctx.getBean(UserService.class);
	@Test // 打开数据库
	public void opendata() {
		System.out.println(ctx.getBean("dataSource"));
		
	}

	@Test // 查询所有图书
	public void findallbook() {
		List<User> list=UserService.findAll();
		System.out.println(list);


	}


	@Test // 注册账号
	public void createuser() {
		User user=new User(1, "11111", "111", "密码是？", "忘了", 1);
		UserService.save(user);
	}
	
	
	@Test // 按照username查找
	public void finduser() {
		User user=new User(1, "4", "111", "密码是？", "忘了", 1);
		
		System.out.println(UserService.FindByUserName(user));
	}
	@Test // 登录验证
	public void login() {
		User user=new User(1, "111", "111", "密码是？", "忘了", 1);
		System.out.println(UserService.login(user));
		

	
	}

	@Test // 修改个人信息
	public void updateuser() {
		User user=new User(1, "111", "111", "密码是？", "忘了", 1);
		UserService.updateByid(user);
	}
	
	@Test // delete
	public void delete() {
		User user=new User(8, "111", "111", "密码是？", "忘了", 1);
		System.out.println(user);
		System.out.println(UserService.findByID(user.getId()));
		UserService.delete(user);

	}

	@Test // 找回密码
	public void zaohuimima() {

	}

	// 下单
	@Test
	public void placeorder() {
		

	}

	@Test // 查看文章分类
	public void FindBookType() {
		
	}

	@Test // 按照id查看文章
	public void FindIdBook() {
	
	}

	@Test // 按照用户名查看用户
	public void findByIDuser() {
		
	}

	@Test // 查看所有用户信息
	public void findAlluser() {

	}

	@Test// 按照id查看个人所有订单
	public void FiindByIDOrder(){
	
		
	}

	@Test// 查看所有订单
	public void FiindAllIDOrder(){
		
		
	}

	@Test// 按照订单id修改订单状态
	public void updateByIDOrder(){
	}

	@Test// // 按照id删除图书
	public void DeleteByIdBook(){
		
	}
	
	@Test// // 插入图书
	public void insertbook(){
		
	}
	
	@Test// // 修改图书
	public void updatetbook(){
		
	}
	
}
