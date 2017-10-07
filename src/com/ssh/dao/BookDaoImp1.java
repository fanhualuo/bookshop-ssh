package com.ssh.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Book;
import com.bean.BookType;
@Transactional   //添加事务处理
public class BookDaoImp1 extends HibernateDaoSupport implements BookDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> FindAll() {
		String hql="from Book";
		return (List<Book>) this.getHibernateTemplate().find(hql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> FindByType(BookType bookType) {
		String hql="from Book where booktype=? ";
		return (List<Book>) this.getHibernateTemplate().find(hql,bookType);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> FindByName(String name) {
		String hql="from Book where bookname like '%"+name+"%' ";
		return (List<Book>) this.getHibernateTemplate().find(hql);
	}

	@Override
	public Book FindById(int id) {
		return this.getHibernateTemplate().get(Book.class, id);
	}


	@Override
	public void update(Book book) {
		this.getHibernateTemplate().update(book);
		
	}

	@Override
	public void save(Book book) {
		this.getHibernateTemplate().save(book);
		
	}

	@Override
	public void delete(Book book) {
		this.getHibernateTemplate().delete(book);
		
	}

	
}
