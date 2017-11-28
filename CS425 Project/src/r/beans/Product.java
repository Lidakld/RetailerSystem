package r.beans;

import java.util.Date;

import r.dao.Constant;

public class Product {
	String upc;
	String productName;
	private Constant.PType type;
	private Brand brand;
//	float price;
//	int capacity;
//	int remain;
//	Date reordertime;
	int quantity;
	
	public Product(String upc, String productName, Constant.PType type, Brand brand) {
		super();
		this.upc = upc;
		this.productName = productName;
		this.type = type;
		this.brand = brand;
//		this.price = price;
//		this.capacity = capacity;
//		this.remain = remain;
//		this.reordertime = reordertime;
//		this.quantity = quantity;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Constant.PType getType() {
		return type;
	}

	public void setType(Constant.PType type) {
		this.type = type;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "upc=" + upc + ", productName=" + productName + ", type=" + type + ", brand=" + brand
				+ ", quantity=" + quantity ;
	}

//	public float getPrice() {
//		return price;
//	}
//
//	public void setPrice(float price) {
//		this.price = price;
//	}
//
//	public int getCapacity() {
//		return capacity;
//	}
//
//	public void setCapacity(int capacity) {
//		this.capacity = capacity;
//	}
//
//	public int getRemain() {
//		return remain;
//	}
//
//	public void setRemain(int remain) {
//		this.remain = remain;
//	}
//
//	public Date getReordertime() {
//		return reordertime;
//	}
//
//	public void setReordertime(Date reordertime) {
//		this.reordertime = reordertime;
//	}
//
//	public int getQuantity() {
//		return quantity;
//	}
//
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//	
	
	
}
