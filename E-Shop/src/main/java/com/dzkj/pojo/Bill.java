package com.dzkj.pojo;

public class Bill {							//账单表
	private int	bid;							//账单编号
	private int bstatus;						//账单状态
	private String bcz;							//支付详情
	private String btime;						//账单时间
	private int bprice;        				 	//账单金额
	private int user_uid;      					//用户ID
	private int bmoney;					        //用户余额
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getBstatus() {
		return bstatus;
	}
	public void setBstatus(int bstatus) {
		this.bstatus = bstatus;
	}
	public String getBcz() {
		return bcz;
	}
	public void setBcz(String bcz) {
		this.bcz = bcz;
	}
	public String getBtime() {
		return btime;
	}
	public void setBtime(String btime) {
		this.btime = btime;
	}
	public int getBprice() {
		return bprice;
	}
	public void setBprice(int bprice) {
		this.bprice = bprice;
	}
	public int getUser_uid() {
		return user_uid;
	}
	public void setUser_uid(int user_uid) {
		this.user_uid = user_uid;
	}
	public int getBmoney() {
		return bmoney;
	}
	public void setBmoney(int bmoney) {
		this.bmoney = bmoney;
	}
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bill(int bid, int bstatus, String bcz, String btime, int bprice, int user_uid, int bmoney) {
		super();
		this.bid = bid;
		this.bstatus = bstatus;
		this.bcz = bcz;
		this.btime = btime;
		this.bprice = bprice;
		this.user_uid = user_uid;
		this.bmoney = bmoney;
	}
	@Override
	public String toString() {
		return "Bill [bid=" + bid + ", bstatus=" + bstatus + ", bcz=" + bcz + ", btime=" + btime + ", bprice=" + bprice
				+ ", user_uid=" + user_uid + ", bmoney=" + bmoney + "]";
	}

}
