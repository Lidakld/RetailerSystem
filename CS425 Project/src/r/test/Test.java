package r.test;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;

import r.beans.AccountId;
import r.beans.Brand;
import r.beans.CreditCard;
import r.beans.Customer;
import r.beans.Product;
import r.beans.Stock;
import r.beans.Vender;
import r.dao.Constant;
import r.dao.DataManager;
import r.util.LinkedList;


public class Test {
	
	public static void main(String[] arg) {
		DataManager dm = new DataManager();
		Date dat = Calendar.getInstance().getTime();
		
		CreditCard ccn = new CreditCard("2222222","3333333","3098 S Wells");
		//AccountId aid = new AccountId("12345");
		AccountId aid = new AccountId();
		aid.setAccount(6390);
		aid.setPwd("12345");
		Customer c1 = new Customer("Lida","1234@gmail.com",ccn,aid);
		
		AccountId aid2 = new AccountId();
		aid2.setAccount(4456);
		aid2.setPwd("54321");
		Customer c2 = new Customer("Matthew","4321@gmail.com",ccn,aid2);
		
		dm.addAccount(c1);
		dm.addAccount(c2);
		
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
		
		LinkedList<Stock> sl = dm.getStockList();
		Iterator<Stock> itr = sl.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("");
		//LinkedList<Stock> sl1 = dm.listByStore(1).getData();
		//Iterator<Stock> itr1 = sl1.iterator();
		//while(itr1.hasNext())
			//System.out.println(itr1.next());
		
	}

}
