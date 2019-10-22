package com.dzkj.pojo;

public class Address {				//地址表
	private int aid;					//地址表ID
	private int userid;					//对应用户ID
	private String consignee;			//收货人
	private String tel;					//电话号码
	private String sheng;				//省份
	private String city;				//城市
	private String county;				//城区
	private String delivery;			//详细地址
	private int state;					//默认状态
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getSheng() {
		return sheng;
	}
	public void setSheng(String sheng) {
		this.sheng = sheng;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getDelivery() {
		return delivery;
	}
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Address(int aid, int userid, String consignee, String tel, String sheng, String city, String county,
			String delivery, int state) {
		super();
		this.aid = aid;
		this.userid = userid;
		this.consignee = consignee;
		this.tel = tel;
		this.sheng = sheng;
		this.city = city;
		this.county = county;
		this.delivery = delivery;
		this.state = state;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", userid=" + userid + ", consignee=" + consignee + ", tel=" + tel + ", sheng="
				+ sheng + ", city=" + city + ", county=" + county + ", delivery=" + delivery + ", state=" + state + "]";
	}

}
