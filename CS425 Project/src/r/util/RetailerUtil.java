package r.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import r.beans.Stock;
import r.beans.AccountId;
import r.beans.Product;
import r.dao.Constant;

public class RetailerUtil {
	private String readpath = "";
	private String wirtepath = "";

	public RetailerUtil(String readpath, String wirtepath) {
		super();
		this.readpath = readpath;
		this.wirtepath = wirtepath;
	}

	public LinkedList<Stock> readStock(String filename) {
		filename = readpath + filename;
		FileInputStream inputStream = null;
		Scanner sc = null;
		LinkedList<Stock> stocks = new LinkedList<>();

		try {
			inputStream = new FileInputStream(filename);
			sc = new Scanner(inputStream, "UTF-8");
			SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy");

			String rev = "";
			sc.nextLine();
			while (sc.hasNextLine()) {
				rev = sc.nextLine();
				String[] tokens = rev.split("\t");
				Stock stock;

				stock = new Stock(Integer.valueOf((tokens[5])),new Product(tokens[10], tokens[10],Constant.PType.valueOf(token[10]),new Brand(token[10],token[10],
						new Vender(token[10],token[10])))), 
						Float.valueOf(tokens[3]), Integer.valueOf(tokens[1]),
						Integer.valueOf(token[1]), DATE_FORMAT.parse(token[10]);

				stocks.add(stock);
			}

		} catch (Exception e) {
			sc.close();
			return null;
		}

		return stocks;
	}

	public String getReadpath() {
		return readpath;
	}

	public void setReadpath(String readpath) {
		this.readpath = readpath;
	}

	public String getWirtepath() {
		return wirtepath;
	}

	public void setWirtepath(String wirtepath) {
		this.wirtepath = wirtepath;
	}

}
