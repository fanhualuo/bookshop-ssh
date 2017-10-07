package com.manager.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.bean.BookType;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.service.BookTypeService;

@Controller
@Scope("prototype")
public class BookTypeManagerAction implements ModelDriven<BookType> {

	private BookType bookType = new BookType();
	private BookTypeService bookTypeService;
	@Autowired
	public void setBookTypeService(BookTypeService bookTypeService) {
		this.bookTypeService = bookTypeService;
	}

	// 显示所有图书分类
	public String find() {
		ActionContext.getContext().getValueStack().set("booktypes", bookTypeService.findall());
		return "find";
	}

	// 按照图书id删除
	public String delete() {
		bookTypeService.delete(bookType);
		return "delete";

	}

	// 修改
	public String update() {
		bookTypeService.update(bookType);
		return "update";
	}

	// 插入
	public String save() {
		bookTypeService.save(bookType);
		return "save";
	}

	public String updatejsp() {
		bookType=bookTypeService.findById(bookType.getId());		
		return "updatejsp";
	}

	public String savejsp() {
		return "savejsp";
	}

	@Override
	public BookType getModel() {
		// TODO 自动生成的方法存根
		return bookType;
	}

}
