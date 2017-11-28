package r.beans;

public class Order {
	String orderid;
	String stockid;
	String accountid;
	
	public Order(String orderid, String stockid, String accountid) {
		super();
		this.orderid = orderid;
		this.stockid = stockid;
		this.accountid = accountid;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getStockid() {
		return stockid;
	}

	public void setStockid(String stockid) {
		this.stockid = stockid;
	}

	public String getAccountid() {
		return accountid;
	}

	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}
	
	
}
