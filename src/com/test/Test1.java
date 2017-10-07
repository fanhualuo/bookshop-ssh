package com.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Book;
import com.bean.BookType;
import com.ssh.service.BookService;

public class Test1 {

	private ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

	private BookService bookService = ctx.getBean(BookService.class);

	@Test // 按照id查看文章
	public void FindIdBook() {
		System.out.println(bookService.FindById(1));
		;

	}

	@Test // 查看所有用户信息
	public void findAll() {
		System.out.println(bookService.FindAll());
		// System.out.println("----------------------------------------------");
		
	}

	@Test // 按照类型查询
	public void findByType() {
		BookType bookType = new BookType();
		bookType.setId(1);
		System.out.println(bookService.FindByType(bookType));
	}

	@Test // 按照id修改书信息
	public void update(){
		BookType bookType = new BookType();
		bookType.setId(1);
		Book book=new Book(10, "完美世界后传1",100, 100,bookType , null);		
		bookService.update(book);
	}
	@Test 
	public void save(){
		BookType bookType = new BookType();
		bookType.setId(2);
		Book book=new Book(10, "完美世界后传2",100, 100,bookType , null);
		bookService.save(book);
	}

	@Test 
	public void delete(){
		Book book = bookService.FindById(12);
		bookService.delete(book);
	}
}
