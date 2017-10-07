package com.bean;

public class Order2 {
	
	private int id;  //自增id
	private int userid;//买书的用户
	private int bookid;//买的书
	private String phone; //电话号码
	private String address;//收获地址
	private String zhuangtai;//订单状态
	private int number;//订单数量
	

	@Override
	public String toString() {
		return "Order2 [id=" + id + ", userid=" + userid + ", bookid=" + bookid + ", phone=" + phone + ", address="
				+ address + ", zhuangtai=" + zhuangtai + ", number=" + number + "]";
	}


	public int getId() {
		return id;
	}


	public int getUserid() {
		return userid;
	}


	public int getBookid() {
		return bookid;
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


	public int getNumber() {
		return number;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	public void setBookid(int bookid) {
		this.bookid = bookid;
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


	public void setNumber(int number) {
		this.number = number;
	}


	public Order2(){}


	public Order2(int id, int userid, int bookid, String phone, String address, String zhuangtai, int number) {
		super();
		this.id = id;
		this.userid = userid;
		this.bookid = bookid;
		this.phone = phone;
		this.address = address;
		this.zhuangtai = zhuangtai;
		this.number = number;
	}
	
	
	
}
