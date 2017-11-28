package r.gui;

import java.util.EventObject;


public class ResultEvent extends EventObject {
	private String str;
	private int info;
	public ResultEvent(Object source, String str,int info) {
		super(source);
		this.str = str;
		this.info = info;
	}
	
	public int getInfo() {
		return info;
	}
	public void setInfo(int info) {
		this.info = info;
	}
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "ResultEvent [str=" + str + ", info=" + info + "]";
	}

	
}
