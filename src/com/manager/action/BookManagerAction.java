package com.manager.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.bean.Book;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.service.BookService;
import com.ssh.service.BookTypeService;

@Controller // 标识层
@Scope("prototype")
public class BookManagerAction extends ActionSupport implements ModelDriven<Book> {
	private static final long serialVersionUID = 435609333604122516L;

	private Book book = new Book();

	private BookTypeService bookTypeService;

	@Autowired
	public void setBookTypeService(BookTypeService bookTypeService) {
		this.bookTypeService = bookTypeService;
	}

	private BookService bookService;

	@Autowired
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	// 查找所有图书
	public String find() {
		ActionContext.getContext().getValueStack().set("booktypes", bookTypeService.findall());
		ActionContext.getContext().getValueStack().set("books", bookService.FindAll());
		return "find";

	}

	// 按照图书id删除
	public String delete() {
		bookService.delete(book);
		return "delete";

	}

	// 修改
	public String update() {
		
		bookService.update(book);

		return "update";
	}

	// 插入
	public String save() {
		bookService.save(book);
		return "save";
	}

	public String updatejsp() {
		
		ActionContext.getContext().getValueStack().set("booktypes", bookTypeService.findall());
		book=bookService.FindById(book.getId());
		return "updatejsp";
	}

	public String savejsp() {
		ActionContext.getContext().getValueStack().set("booktypes", bookTypeService.findall());
		return "savejsp";
	}

	@Override
	public Book getModel() {
		// TODO 自动生成的方法存根
		return book;
	}

}
