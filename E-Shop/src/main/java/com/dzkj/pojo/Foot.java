package com.dzkj.pojo;

public class Foot {					//足迹表
	private int  id;      				//序列
	private int userid;        			//用户id
	private int  pid;            		//商品id
	private String  foottime;   		//足迹时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getFoottime() {
		return foottime;
	}
	public void setFoottime(String foottime) {
		this.foottime = foottime;
	}
	public Foot(int id, int userid, int pid, String foottime) {
		super();
		this.id = id;
		this.userid = userid;
		this.pid = pid;
		this.foottime = foottime;
	}
	public Foot() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Foot [id=" + id + ", userid=" + userid + ", pid=" + pid + ", foottime=" + foottime + "]";
	}

}
