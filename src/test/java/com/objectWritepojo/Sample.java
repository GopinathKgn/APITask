package com.objectWritepojo;

import java.util.ArrayList;

public class Sample {

	private int page;
	private int per_page;
	private int total;
	private int total_page;
	private ArrayList<Datum> data;
	private Support support;

	public Sample(int page, int per_page, int total, int total_page, ArrayList<Datum> data, Support support) {
		super();
		this.page = page;
		this.per_page = per_page;
		this.total = total;
		this.total_page = total_page;
		this.data = data;
		this.support = support;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPer_page() {
		return per_page;
	}

	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getTotal_page() {
		return total_page;
	}

	public void setTotal_page(int total_page) {
		this.total_page = total_page;
	}

	public ArrayList<Datum> getData() {
		return data;
	}

	public void setData(ArrayList<Datum> data) {
		this.data = data;
	}

	public Support getSupport() {
		return support;
	}

	public void setSupport(Support support) {
		this.support = support;
	}

}
