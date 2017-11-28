package r.beans;

public class CreditCard {
	String ccn1;
	String ccn2;
	String address;
	
	public CreditCard(String ccn1,String ccn2, String address) {
		this.ccn1 = ccn1;
		this.ccn2 = ccn2;
		this.address = address;
	}

	public String getCcn1() {
		return ccn1;
	}

	public void setCcn1(String ccn1) {
		this.ccn1 = ccn1;
	}
	
	public String getCcn2() {
		return ccn2;
	}
	public void setCcn2(String ccn2) {
		this.ccn2 = ccn2;
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "ccn1=" + ccn1 + ", ccn2=" + ccn2 + ", address=" + address ;
	}
	
}
