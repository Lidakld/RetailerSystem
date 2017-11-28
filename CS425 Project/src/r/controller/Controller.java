package r.controller;

import r.util.LinkedList;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import r.beans.AccountId;
import r.beans.Brand;
import r.beans.CreditCard;
import r.beans.Customer;
import r.beans.Product;
import r.beans.Stock;
import r.beans.Vender;
import r.dao.Constant;
import r.dao.DataManager;
import r.gui.RegisterEvent;
import r.gui.RequestEvent;
import r.gui.ResultEvent;
import r.gui.ResultListener;
import r.gui.SigninEvent;

public class Controller {
	private ResultListener resultListener;
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	Date dat = Calendar.getInstance().getTime();
	DataManager dm = new DataManager();
	public Controller() {
		Customer c1 = new Customer("Amy","amy1234@gmail.com",
				new CreditCard("3124543212345678435","0986567845673456687","2345 N STR"),
				new AccountId("12345"));
		Customer c2 = new Customer("Ben","ben678@outlook.com",
				new CreditCard("1234432156788765908","0987789067899876543","6780 S STR"),
				new AccountId("67890"));
		Customer c3 = new Customer("Tom","tom4@qq.com",
				new CreditCard("4356234576541233890","","890 E STR"),
				new AccountId("tommas455"));
		dm.addAccount(c1);
		dm.addAccount(c2);
		dm.addAccount(c3);
		
		Stock s1 = new Stock(
				1,
				new Product("123","diet-coke",Constant.PType.beverage,
						new Brand("Pepsi","p01",
								new Vender("Pepsico","01"))),
				(float)12.34,
				200,
				156,
				dat,
				50);
		Stock s4 = new Stock(
				1,
				new Product("122","coke",Constant.PType.beverage,
						new Brand("Pepsi","p01",
								new Vender("Pepsico","01"))),
				(float)1.34,
				300,
				146,
				dat,
				50);
		Stock s2 = new Stock(
				2,
				new Product("123","diet-coke",Constant.PType.beverage,
						new Brand("Pepsi","p01",
								new Vender("Pepsico","01"))),
				(float)14.34,
				100,
				16,
				dat,
				80);
		Stock s3 = new Stock(
				3,
				new Product("123","diet-coke",Constant.PType.beverage,
						new Brand("Pepsi","p01",
								new Vender("Pepsico","01"))),
				(float)1.74,
				500,
				240,
				dat,
				300);
		dm.addStock(s1);
		dm.addStock(s2);
		dm.addStock(s3);
		dm.addStock(s4);
	}
	
	public void addCustomer(RegisterEvent re) {
		String name = re.getName();
		String email = re.getEmail();
		String pwd = re.getPwd();
		CreditCard cc = new CreditCard(re.getCreditc1(),re.getCreditc2(),re.getAddress());
		AccountId aid = new AccountId(pwd);
		
		Customer customer = new Customer(name,email,cc,aid);
		dm.addAccount(customer);	
	}
	
	
	public void searchCustomer(SigninEvent se) {
		int a = Integer.parseInt(se.getAccount());
		AccountId id = new AccountId();
		id.setAccount(a);
		String pwd = se.getPwd();
		id.setPwd(pwd);
		
		String msg = dm.searchAccount(id).getMessage();
		int i = dm.searchAccount(id).getError();
		ResultEvent rse = new ResultEvent(this,msg,i);
		if(resultListener!=null) {
			resultListener.ResultEventsOccured(rse);
		}
		
	}
	public LinkedList<Stock> selectStore(RequestEvent re){
		System.out.println("Controller:"+re.getType());
		return dm.listByStore(re);
	}
	public void setResultListener(ResultListener listener) {
		this.resultListener = listener;
	}
	public LinkedList<Customer> listAllCustomer(){
		return dm.getCustomerList();
	}
	public LinkedList<Stock> listAllStock(){
		return dm.getStockList();
	}
}
