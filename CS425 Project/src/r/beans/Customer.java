package r.beans;

public class Customer implements Comparable<Customer>{
	String name;
	String email;
	//String pwd;
	CreditCard creditCard;
	AccountId  accountid;
	
	public Customer(String name,String email, CreditCard creditCard,AccountId accountid) {
		this.name = name;
		this.email = email;
		//this.pwd = pwd;
		this.creditCard = creditCard;
		this.accountid = accountid;
		
	}

//	public String getPwd() {
//		return pwd;
//	}

//	public void setPwd(String pwd) {
//		this.pwd = pwd;
//	}

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

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public AccountId getAccountid() {
		return accountid;
	}

	public void setAccountid(AccountId accountid) {
		this.accountid = accountid;
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "name=" + name + ", email=" + email +  ", " + creditCard
				+ ", " + accountid;
	}

}
