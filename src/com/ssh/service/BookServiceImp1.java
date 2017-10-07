package com.ssh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Book;
import com.bean.BookType;
import com.ssh.dao.BookDao;

@Service
public class BookServiceImp1 implements BookService{
	@Autowired
	private BookDao bookDao;
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public List<Book> FindAll() {
		
		return bookDao.FindAll();
	}

	@Override
	public List<Book> FindByType(BookType bookType) {
		// TODO 自动生成的方法存根
		return bookDao.FindByType(bookType);
	}

	@Override
	public List<Book> FindByName(String name) {
		// TODO 自动生成的方法存根
		return bookDao.FindByName(name);
	}

	@Override
	public Book FindById(int id) {
		// TODO 自动生成的方法存根
		return bookDao.FindById(id);
	}

	@Override
	public void update(Book book) {
		// TODO 自动生成的方法存根
		bookDao.update(book);
		
	}

	@Override
	public void save(Book book) {
		// TODO 自动生成的方法存根
		bookDao.save(book);
	}

	@Override
	public void delete(Book book) {
		Book book2=bookDao.FindById(book.getId());
		// TODO 自动生成的方法存根
		bookDao.delete(book2);
	}

}
