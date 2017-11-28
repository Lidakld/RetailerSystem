package r.gui;

import java.util.EventObject;

public class SigninEvent extends EventObject {
	String account;
	String pwd;
	
	public SigninEvent(Object source,String account, String pwd) {
		super(source);
		this.account = account;
		this.pwd = pwd;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
