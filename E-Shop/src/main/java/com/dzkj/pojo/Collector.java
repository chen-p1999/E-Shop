package com.dzkj.pojo;

public class Collector {					//收藏夹表
	private int cid;				//编号序列
	private int userid;             //用户ID
	private int pid;                //商品ID
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public Collector(int cid, int userid, int pid) {
		super();
		this.cid = cid;
		this.userid = userid;
		this.pid = pid;
	}
	public Collector() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Collector [cid=" + cid + ", userid=" + userid + ", pid=" + pid + "]";
	}

}
