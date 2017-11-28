package r.beans;

import java.util.Random;

public class AccountId implements Comparable<AccountId>{
	Random rand = new Random();
	int accountid;
	String pwd;
	
	public AccountId(String pwd) {
		accountid = rand.nextInt(10000)+1;
	   this.pwd = pwd;
	}

	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public AccountId() {
		
	}
	
	public int getAccount() {
		return accountid;
	}

	public void setAccount(int accountid) {
		this.accountid = accountid;
	}
	
	@Override
	public String toString() {
		return " accountid=" + accountid +" ,password="+ pwd;
	}

	@Override
	public int compareTo(AccountId o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
