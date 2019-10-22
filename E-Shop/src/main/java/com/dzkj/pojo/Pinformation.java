package com.dzkj.pojo;

public class Pinformation {			//个人信息表
	private int  piid;        			//信息编号
	private String  piname;      		//名称
	private String  nikname;        	//昵称
	private String  sex;            	//性别
	private String  birthday;       	//生日
	private String  tel;            	//电话
	private String  email;        		//邮箱
	private int  user_uid;              //用户ID
	private String  piimgurl;       	//图片路径
	public int getPiid() {
		return piid;
	}
	public void setPiid(int piid) {
		this.piid = piid;
	}
	public String getPiname() {
		return piname;
	}
	public void setPiname(String piname) {
		this.piname = piname;
	}
	public String getNikname() {
		return nikname;
	}
	public void setNikname(String nikname) {
		this.nikname = nikname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getUser_uid() {
		return user_uid;
	}
	public void setUser_uid(int user_uid) {
		this.user_uid = user_uid;
	}
	public String getPiimgurl() {
		return piimgurl;
	}
	public void setPiimgurl(String piimgurl) {
		this.piimgurl = piimgurl;
	}
	public Pinformation(int piid, String piname, String nikname, String sex, String birthday, String tel, String email,
			int user_uid, String piimgurl) {
		super();
		this.piid = piid;
		this.piname = piname;
		this.nikname = nikname;
		this.sex = sex;
		this.birthday = birthday;
		this.tel = tel;
		this.email = email;
		this.user_uid = user_uid;
		this.piimgurl = piimgurl;
	}
	public Pinformation() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Pinformation [piid=" + piid + ", piname=" + piname + ", nikname=" + nikname + ", sex=" + sex
				+ ", birthday=" + birthday + ", tel=" + tel + ", email=" + email + ", user_uid=" + user_uid
				+ ", piimgurl=" + piimgurl + "]";
	}

}
