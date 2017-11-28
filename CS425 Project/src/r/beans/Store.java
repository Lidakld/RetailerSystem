package r.beans;

public class Store {
	int storeid;
	int hours;
	String location;
	Stock stock;
	public Store(int storeid, int hours, String location, Stock stock) {
		super();
		this.storeid = storeid;
		this.hours = hours;
		this.location = location;
		this.stock = stock;
	}
	public int getStoreid() {
		return storeid;
	}
	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	
	
}
