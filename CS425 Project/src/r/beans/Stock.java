package r.beans;

import java.util.Date;

public class Stock implements Comparable<Stock> {
	int stockid;
	Product product;
	float price;
	int capacity;
	int remain;
	Date reordertime;
	int requantity;
	
	
	public Stock(int stockid, Product product, float price, int capacity, int remain, Date reordertime,int requantity) {
		super();
		this.stockid = stockid;
		this.product = product;
		this.price = price;
		this.capacity = capacity;
		this.remain = remain;
		this.reordertime = reordertime;
		this.requantity = requantity;
		
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getRemain() {
		return remain;
	}

	public void setRemain(int remain) {
		this.remain = remain;
	}

	public Date getReordertime() {
		return reordertime;
	}

	public void setReordertime(Date reordertime) {
		this.reordertime = reordertime;
	}

	public int getRequantity() {
		return requantity;
	}

	public void setRequantity(int requantity) {
		this.requantity = requantity;
	}

	public int getStockid() {
		return stockid;
	}

	public void setStockid(int stockid) {
		this.stockid = stockid;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	
	@Override
	public String toString() {
		return "stockid=" + stockid + ", product=" + product.toString() + ", price=" + price + ", capacity=" + capacity
				+ ", remain=" + remain + ", reordertime=" + reordertime + ", requantity=" + requantity + "]";
	}

	@Override
	public int compareTo(Stock o) {
		if(this.getStockid()==o.getStockid() 
				&& (this.getProduct().getUpc()).equals(o.getProduct().getUpc())
				&& (this.getProduct().getProductName()).equals(o.getProduct().getType())
				&& (this.getProduct().getType()).equals(o.getProduct().getType())
				&& (this.getProduct().getBrand().getBrandid()).equals(o.getProduct().getBrand().getBrandid())
				&& (this.getProduct().getBrand().getBrandName()).equals(o.getProduct().getBrand().getBrandName())
				&& this.getPrice() == o.getPrice()
				&& this.getCapacity() == o.getCapacity()
				&& this.getRemain() == o.getRemain()
				&& (this.getReordertime()).equals(o.getReordertime())
				&& this.getRequantity() == o.getRequantity())
			return 0;
		else
			return -1;
	}
	
	
}
