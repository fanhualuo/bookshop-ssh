package com.ssh.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bean.Order2;
@Service
public class GouwucheServiceImp1 implements GouwucheService {
	
	@Override
	public List<Order2> save(List<Order2> orders, int bookid) {
		Order2 order = new Order2();
		order.setBookid(bookid);
		order.setNumber(1);
		
		if (orders == null || orders.size() == 0) {
			orders=new ArrayList<Order2>();
			orders.add(order);// 加入新的物品
		} else {
			int i;
			for (i = 0; i < orders.size(); i++) {// 检查购物车是否有与加入的书相同的书
				if (orders.get(i).getBookid() == bookid) {
					orders.get(i).setNumber(orders.get(i).getNumber() + 1);
					break;
				}				
			}
			if (i == orders.size()) {
				orders.add(order);// 加入新的物品
			}
		}
		return orders;
	}

	@Override
	public List<Order2> delete(List<Order2> orders, int bookid) {
		
		Order2 order = new Order2();
		order.setBookid(bookid);
		order.setNumber(1);
		
		if (orders == null || orders.size() == 0) {
			orders.add(order);// 加入新的物品
		} else {
			int i;
			for (i = 0; i < orders.size(); i++) {// 检查购物车是否有与加入的书相同的书
				if (orders.get(i).getBookid() == bookid) {
					orders.remove(i);
					break;
				}				
			}
		}
		return orders;
	}

}
