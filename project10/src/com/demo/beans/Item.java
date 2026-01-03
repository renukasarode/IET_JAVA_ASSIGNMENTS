package com.demo.beans;

public class Item {
	
	private int iid;
	private String iname;
	private int qty;
	private double price;
	public Item() {
		super();
	}
	public Item(int iid, String iname, int qty, double price) {
		super();
		this.iid = iid;
		this.iname = iname;
		this.qty = qty;
		this.price = price;
	}
	
	public Item(int id) {
		this.iid=id;
	}
	@Override
	public int hashCode() {
		return iid;
	}
	@Override
	public boolean equals(Object obj) {
		
		return iid==((Item)obj).iid;
	}
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [iid=" + iid + ", iname=" + iname + ", qty=" + qty + ", price=" + price + "]";
	}
	

}
