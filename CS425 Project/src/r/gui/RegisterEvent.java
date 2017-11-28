package r.gui;

import java.util.EventObject;

public class RegisterEvent extends EventObject {
	String name;
	String email;
	String pwd;
	String creditc1;
	String creditc2;
	String address;
	
	public RegisterEvent(Object source, String name, String email,String pwd, String creditc1, String creditc2, String address) {
		super(source);
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.creditc1 = creditc1;
		this.creditc2 = creditc2;
		this.address = address;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCreditc1() {
		return creditc1;
	}

	public void setCreditc1(String creditc1) {
		this.creditc1 = creditc1;
	}

	public String getCreditc2() {
		return creditc2;
	}

	public void setCreditc2(String creditc2) {
		this.creditc2 = creditc2;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "RegisterEvent [name=" + name + ", email=" + email + ", pwd=" + pwd + ", creditc1=" + creditc1
				+ ", creditc2=" + creditc2 + ", address=" + address + "]";
	}
}
