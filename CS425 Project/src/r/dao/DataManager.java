package r.dao;
import r.beans.Msg;

import java.util.Iterator;

import r.beans.AccountId;
import r.beans.Customer;
import r.beans.Stock;
import r.gui.RequestEvent;
import r.util.LLNode;
import r.util.LinkedList;

public class DataManager {
	protected LinkedList<Stock> stock;
	protected LinkedList<Customer> customer;
	protected LinkedList<AccountId> account;
	
	public DataManager() {
		stock = new LinkedList<>();
		customer = new LinkedList<>();
		account = new LinkedList<>();
	}
	
	public Msg<Customer> listAllCustomer() {
		Msg<Customer> msg = new Msg<>();
		msg.setMessage("Success");
		msg.setError(1);
		msg.setData(customer);
		return msg;
	}
	public Msg<Stock> listAllStock(){
		Msg<Stock> msg = new Msg<>();
		msg.setMessage("Success");
		msg.setError(1);
		msg.setData(stock);
		return msg;
	}
	
	public Msg<Customer> addAccount(Customer e){
		customer.add(e);
		account.add(e.getAccountid());
		Msg<Customer> msg = new Msg<>();
		msg.setMessage("Success");
		msg.setError(1);
		msg.setData(customer);
		return msg;
	}
	
	public Msg<AccountId> searchAccount(AccountId e){
		Msg<AccountId> msg = new Msg<>();
		LinkedList<AccountId> data = new LinkedList<AccountId>();
		Iterator<AccountId> itr = account.iterator();
		while(itr.hasNext()) {
			AccountId a = itr.next();
			
			if(a.getAccount()==e.getAccount() && (a.getPwd()).equals(e.getPwd())) {
				data.add(e);
				msg.setError(1);
				msg.setMessage("Sign in Successfully!");
				msg.setData(data);
				break;
			}else {
				msg.setError(-1);
				msg.setMessage("No such account exists!");
			}
		}
		return msg;
	}
	public Msg<Stock> addStock(Stock s){
		stock.add(s);
		Msg<Stock> msg = new Msg<>();
		msg.setMessage("Success");
		msg.setError(1);
		msg.setData(stock);
		return msg;
	}
	public LinkedList<Stock> listByStore(RequestEvent re){
		LinkedList<Stock> pl = new LinkedList<>();
		//System.out.println("DM: "+ re.getType());
		if(stock.size>1) {
			Iterator<Stock> itr = stock.iterator();
			while(itr.hasNext()) {
				Stock c = itr.next();
			
				if(c.getStockid()==re.getType()) {
					LLNode<Stock> newnode = new LLNode<>(c,pl.head.next);
					pl.head.next = newnode;
				}
			}
		}
		Msg<Stock> msg = new Msg<>();
		msg.setMessage("Store"+re.getType()+" is Selected!");
		msg.setError(1);
		msg.setData(pl);
		Iterator<Stock> itr = pl.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println(msg.getMessage());
		return pl;
	}
	public LinkedList<Customer> getCustomerList(){
		return this.customer;
	}
	public LinkedList<Stock> getStockList(){
		return this.stock;
	}
	
}
