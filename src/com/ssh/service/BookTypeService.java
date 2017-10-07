package com.ssh.service;

import java.util.List;

import com.bean.BookType;

public interface BookTypeService {
	
	//查看所有分类
	public List<BookType> findall();
	
	//按照id查看分类
	public BookType findById(int id);
		
	//修改分类
	public void update(BookType bookType);
	
	//删除分类	
	public void delete(BookType bookType);
	
	//插入分类
	public void save(BookType bookType);

}
