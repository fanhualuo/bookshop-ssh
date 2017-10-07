package com.ssh.dao;

import java.util.List;
import com.bean.Book;
import com.bean.BookType;

public interface BookDao {
	
	//查看所有图书
	public List<Book> FindAll();
	
	//按照图书类别查询图书
	public List<Book> FindByType(BookType bookType);
		
	//按照图书名称查找图书
	public List<Book> FindByName(String name);
	
	//按照id查询文章
	public Book FindById(int id);
	
	
	// 按照id修改书信息
	public void update(Book book);
	
	// 插入图书
	public void save(Book book);
	
	// 按照id删除图书
	public void delete(Book book);

}
