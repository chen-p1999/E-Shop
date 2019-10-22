package com.dzkj.pojo;

public class News {			//新闻表
	private int  nid;     			//新闻ID
	private String ntype;        	//行为类别
	private String  ntext;     		//新闻内容
	private String  nimgurl;        //新闻图片路径
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public String getNtype() {
		return ntype;
	}
	public void setNtype(String ntype) {
		this.ntype = ntype;
	}
	public String getNtext() {
		return ntext;
	}
	public void setNtext(String ntext) {
		this.ntext = ntext;
	}
	public String getNimgurl() {
		return nimgurl;
	}
	public void setNimgurl(String nimgurl) {
		this.nimgurl = nimgurl;
	}
	public News(int nid, String ntype, String ntext, String nimgurl) {
		super();
		this.nid = nid;
		this.ntype = ntype;
		this.ntext = ntext;
		this.nimgurl = nimgurl;
	}
	public News() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "News [nid=" + nid + ", ntype=" + ntype + ", ntext=" + ntext + ", nimgurl=" + nimgurl + "]";
	}

}
