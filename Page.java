package com.bjsxt.pojo;

import java.util.List;

public class Page {
	private long totalNum;
	private long currPage;
	public long getCurrPage() {
		return currPage;
	}
	public void setCurrPage(long currPage) {
		this.currPage = currPage;
	}
	private long totalPage;
	private List<?> result;
	public long getTotalNum() {
		return totalNum;
	}
	public void setTotalNum(long totalNum) {
		this.totalNum = totalNum;
	}
	public long getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(long totalPage) {
		this.totalPage = totalPage;
	}
	public List<?> getResult() {
		return result;
	}
	public void setResult(List<?> result) {
		this.result = result;
	}
	
	

}
