package com.dzkj.pojo;

public class Evealuate {					//评价表
	private int eid;   							//评价编号
	private String ename;       				//评价昵称
	private String etime;        				//评价时间
	private String etext;     					//评价内容
	private int product_pid;       				//评价商品ID
	private int estatus;            			//评价状态
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEtime() {
		return etime;
	}
	public void setEtime(String etime) {
		this.etime = etime;
	}
	public String getEtext() {
		return etext;
	}
	public void setEtext(String etext) {
		this.etext = etext;
	}
	public int getProduct_pid() {
		return product_pid;
	}
	public void setProduct_pid(int product_pid) {
		this.product_pid = product_pid;
	}
	public int getEstatus() {
		return estatus;
	}
	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}
	public Evealuate(int eid, String ename, String etime, String etext, int product_pid, int estatus) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.etime = etime;
		this.etext = etext;
		this.product_pid = product_pid;
		this.estatus = estatus;
	}
	public Evealuate() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Evealuate [eid=" + eid + ", ename=" + ename + ", etime=" + etime + ", etext=" + etext + ", product_pid="
				+ product_pid + ", estatus=" + estatus + "]";
	}

}
