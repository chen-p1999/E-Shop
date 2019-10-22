package com.dzkj.pojo;

public class Orderss {				//订单表
	private int  oid;    				//订单序列
	private String nums;          		//订单编号
	private String  time;     			//订单时间
	private int  id;             		//订单相对应的商品编号
	private int  statu;             	//订单状态
	private int  pid;            		//商品ID
	private int  shuliang;        		//数量
	private int  money;             	//金额
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getNums() {
		return nums;
	}
	public void setNums(String nums) {
		this.nums = nums;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStatu() {
		return statu;
	}
	public void setStatu(int statu) {
		this.statu = statu;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getShuliang() {
		return shuliang;
	}
	public void setShuliang(int shuliang) {
		this.shuliang = shuliang;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Orderss(int oid, String nums, String time, int id, int statu, int pid, int shuliang, int money) {
		super();
		this.oid = oid;
		this.nums = nums;
		this.time = time;
		this.id = id;
		this.statu = statu;
		this.pid = pid;
		this.shuliang = shuliang;
		this.money = money;
	}
	public Orderss() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Orderss [oid=" + oid + ", nums=" + nums + ", time=" + time + ", id=" + id + ", statu=" + statu
				+ ", pid=" + pid + ", shuliang=" + shuliang + ", money=" + money + "]";
	}

}
