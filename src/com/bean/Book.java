package com.bean;

public class Book {
	
	private int id;//自增id
	private String bookname	;//图书名
	private int price;//价格
	private int stock;	//库存
	private BookType	booktype;// 图书分类
	private String img;//图书图片
	public int getId() {
		return id;
	}
	public String getBookname() {
		return bookname;
	}
	public int getPrice() {
		return price;
	}
	public int getStock() {
		return stock;
	}
	public BookType getBooktype() {
		return booktype;
	}
	public String getImg() {
		return img;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void setBooktype(BookType booktype) {
		this.booktype = booktype;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	public Book(int id, String bookname, int price, int stock, BookType booktype, String img) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.price = price;
		this.stock = stock;
		this.booktype = booktype;
		this.img = img;
	}
	public Book(){}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookname=" + bookname + ", price=" + price + ", stock=" + stock + ", booktype="
				+ booktype + ", img=" + img + "]";
	}
	


}
