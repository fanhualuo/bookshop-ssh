package com.ssh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.BookType;
import com.ssh.dao.BookTypeDao;
@Service
@Transactional
public class BookTypeServiceImp1 implements BookTypeService{
	@Autowired
	private BookTypeDao bookTypeDao;
	public void setBookTypeDao(BookTypeDao bookTypeDao) {
		this.bookTypeDao = bookTypeDao;
	}

	@Override
	public List<BookType> findall() {
		// TODO 自动生成的方法存根
		return bookTypeDao.findall();
	}

	@Override
	public BookType findById(int id) {
		// TODO 自动生成的方法存根
		return bookTypeDao.findById(id);
	}

	@Override
	public void update(BookType bookType) {
		// TODO 自动生成的方法存根
		bookTypeDao.update(bookType);
	}

	@Override
	public void delete(BookType bookType) {
		// TODO 自动生成的方法存根
		BookType bookType2=bookTypeDao.findById(bookType.getId());
		bookTypeDao.delete(bookType2);
	}

	@Override
	public void save(BookType bookType) {
		// TODO 自动生成的方法存根
		bookTypeDao.save(bookType);
	}

}
