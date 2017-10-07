package com.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bean.BookType;
import com.ssh.service.BookTypeService;

public class Test3 {

	private ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

	private BookTypeService bookTypeService=ctx.getBean(BookTypeService.class);

	

	@Test // 查看所有
	public void findAll() {
		System.out.println(bookTypeService.findall());
	}

	@Test // 按照类型查询
	public void findById() {
		System.out.println(bookTypeService.findById(1));
	}

	@Test 
	public void update(){
		BookType bookType=new BookType();
		bookType.setBooktype("励志文学");
		bookType.setId(3);
		bookTypeService.update(bookType);
	}
	@Test 
	public void save(){
		BookType bookType=new BookType();
		bookType.setBooktype("励志文学");
		bookType.setId(3);
		bookTypeService.save(bookType);
	}

	@Test 
	public void delete(){
		BookType bookType=new BookType();
		//bookType.setBooktype("励志文学");
		bookType.setId(3);
		bookTypeService.delete(bookType);
	}
	
	@Test 
	public void delete_jilian(){
		//BookType bookType=bookTypeService.findById(id)
	}
}
