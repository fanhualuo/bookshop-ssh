package com.bean;

import java.util.HashSet;
import java.util.Set;


public class BookType {
	
	private int id;//自增id
	private String booktype;//分类名
	private Set<Book> books=new HashSet<Book>();
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	public Set<Book> getBooks() {
		return books;
	}
	public int getId() {
		return id;
	}
	public String getBooktype() {
		return booktype;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setBooktype(String booktype) {
		this.booktype = booktype;
	}
	public BookType(int id, String booktype) {
		super();
		this.id = id;
		this.booktype = booktype;
	}
	
	public BookType() {}
	@Override
	public String toString() {
		return "BookType [id=" + id + ", booktype=" + booktype + "]";
	}
	

}
