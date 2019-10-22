package com.dzkj.pojo;

public class Shopcart {				//购物车表
	private int  sid;     //序列号
	private int  userid;           //用户id
	private int  nums;            //数量
	private int  pid;               //商品id
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getNums() {
		return nums;
	}
	public void setNums(int nums) {
		this.nums = nums;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public Shopcart(int sid, int userid, int nums, int pid) {
		super();
		this.sid = sid;
		this.userid = userid;
		this.nums = nums;
		this.pid = pid;
	}
	public Shopcart() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Shopcart [sid=" + sid + ", userid=" + userid + ", nums=" + nums + ", pid=" + pid + "]";
	}

}
