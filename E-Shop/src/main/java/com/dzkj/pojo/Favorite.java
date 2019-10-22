package com.dzkj.pojo;

public class Favorite {					//收藏表
	private int fid;    					//收藏编号
	private int pid;            			//商品ID
	private String pimg;         			//商品图片路径
	private String pname;       			//商品名
	private int pprice;             		//商品价格
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPimg() {
		return pimg;
	}
	public void setPimg(String pimg) {
		this.pimg = pimg;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	public Favorite(int fid, int pid, String pimg, String pname, int pprice) {
		super();
		this.fid = fid;
		this.pid = pid;
		this.pimg = pimg;
		this.pname = pname;
		this.pprice = pprice;
	}
	public Favorite() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Favorite [fid=" + fid + ", pid=" + pid + ", pimg=" + pimg + ", pname=" + pname + ", pprice=" + pprice
				+ "]";
	}

}
