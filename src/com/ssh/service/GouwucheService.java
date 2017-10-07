package com.ssh.service;
//购物车操作

import java.util.List;

import com.bean.Order2;

public interface GouwucheService {
	public List<Order2> save(List<Order2> orders,int bookid);
	
	public List<Order2> delete(List<Order2> orders,int bookid);

}
