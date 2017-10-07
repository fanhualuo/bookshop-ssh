package com.ssh.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.bean.BookType;

public class BookTypeDaoImp1 extends HibernateDaoSupport implements BookTypeDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<BookType> findall() {
		String hql="from BookType";
		return (List<BookType>) this.getHibernateTemplate().find(hql);
	}

	@Override
	public BookType findById(int id) {
		
		return this.getHibernateTemplate().get(BookType.class, id);
	}

	@Override
	public void update(BookType bookType) {
		this.getHibernateTemplate().update(bookType);
		
	}

	@Override
	public void delete(BookType bookType) {
		this.getHibernateTemplate().delete(bookType);
		
	}

	@Override
	public void save(BookType bookType) {
		this.getHibernateTemplate().save(bookType);
		
	}

}
