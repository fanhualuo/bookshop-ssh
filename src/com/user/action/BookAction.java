package com.user.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.bean.Book;
import com.bean.BookType;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.service.BookService;
import com.ssh.service.BookTypeService;
@Controller
@Scope("prototype")
public class BookAction extends ActionSupport implements ModelDriven<Book> {
	private static final long serialVersionUID = 435609333604122516L;
	
	private int booktype1;
	public void setBooktype1(int booktype1) {
		this.booktype1 = booktype1;
	}
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

	
	
	
	
	////////////// 查询所所有图书
	public String findall() {
		ActionContext.getContext().getValueStack().set("booktypes", bookTypeService.findall());
		ActionContext.getContext().getValueStack().set("books", bookService.FindAll());
		return SUCCESS;
	}

	// 按照name查找图书
	public String findname() {
		ActionContext.getContext().getValueStack().set("booktypes", bookTypeService.findall());
		ActionContext.getContext().getValueStack().set("books", bookService.FindByName(book.getBookname()));
		return SUCCESS;
	}

	// 按照类型查找图书
	public String findtype() {
		System.out.println(booktype1);
		BookType bookType=bookTypeService.findById(booktype1);
		System.out.println(bookType);
		ActionContext.getContext().getValueStack().set("booktypes", bookTypeService.findall());
		ActionContext.getContext().getValueStack().set("books", bookService.FindByType(bookType));
		return SUCCESS;
	}

	
	@Override
	public Book getModel() {
		// TODO 自动生成的方法存根
		return book;
	}

}
