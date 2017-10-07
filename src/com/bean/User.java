package com.bean;

import java.util.HashSet;
import java.util.Set;

//user表
public class User {
	private int	id;	//自增id
	private String username	;	//登录账号
	private String password;  //密码
	private String question;  //密保问题
	private String answer;//答案
	private int quanxian;//权限
	private Set<Order> orders=new HashSet<Order>();
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	public Set<Order> getOrders() {
		return orders;
	}
	public int getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getQuestion() {
		return question;
	}
	public String getAnswer() {
		return answer;
	}
	public int getQuanxian() {
		return quanxian;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public void setQuanxian(int quanxian) {
		this.quanxian = quanxian;
	}
	public User(){}
	public User(int id, String username, String password, String question, String answer, int quanxian) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.question = question;
		this.answer = answer;
		this.quanxian = quanxian;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", question=" + question
				+ ", answer=" + answer + ", quanxian=" + quanxian + "]";
	}
	
	


}
