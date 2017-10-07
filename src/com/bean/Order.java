package com.bean;

public class Order {
	
	private int id;  //自增id
	private User user;//买书的用户
	private Book book;//买的书
	private String phone; //电话号码
	private String address;//收获地址
	private String zhuangtai;//订单状态
	private int number;//订单数量
	
	public int getId() {
		return id;
	}
	public User getUser() {
		return user;
	}
	public Book getBook() {
		return book;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	public String getZhuangtai() {
		return zhuangtai;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", user=" + user + ", book=" + book + ", phone=" + phone + ", address=" + address
				+ ", zhuangtai=" + zhuangtai + ", number=" + number + "]";
	}
	public Order(){}
	public Order(int id, User user, Book book, String phone, String address, String zhuangtai, int number) {
		super();
		this.id = id;
		this.user = user;
		this.book = book;
		this.phone = phone;
		this.address = address;
		this.zhuangtai = zhuangtai;
		this.number = number;
	}
	
	
	
}
