package com.dzkj.pojo;

public class Pramater {				//商品详情表
	private int  id;          			//编号序列
	private String country;       		//商品出产地
	private String  imgurl;       		//商品图片路径
	private int  did;              		//
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public Pramater(int id, String country, String imgurl, int did) {
		super();
		this.id = id;
		this.country = country;
		this.imgurl = imgurl;
		this.did = did;
	}
	public Pramater() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Pramater [id=" + id + ", country=" + country + ", imgurl=" + imgurl + ", did=" + did + "]";
	}

}
