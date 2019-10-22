package com.dzkj.pojo;

public class Users {			//用户表
private int userid;  			//用户ID
private String uname;			//用户名
private String uzname;			//用户昵称
private String usex;			//性别
private String birthday;		//生日
private String tellphone;		//电话
private String email;			//邮箱
private String pwd;				//密码
private String time;			//注册时间
private String paypwd;			//支付密码
private String imgurl;			//头像路径
private int recharge;
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUzname() {
	return uzname;
}
public void setUzname(String uzname) {
	this.uzname = uzname;
}
public String getUsex() {
	return usex;
}
public void setUsex(String usex) {
	this.usex = usex;
}
public String getBirthday() {
	return birthday;
}
public void setBirthday(String birthday) {
	this.birthday = birthday;
}
public String getTellphone() {
	return tellphone;
}
public void setTellphone(String tellphone) {
	this.tellphone = tellphone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public String getPaypwd() {
	return paypwd;
}
public void setPaypwd(String paypwd) {
	this.paypwd = paypwd;
}
public String getImgurl() {
	return imgurl;
}
public void setImgurl(String imgurl) {
	this.imgurl = imgurl;
}
public int getRecharge() {
	return recharge;
}
public void setRecharge(int recharge) {
	this.recharge = recharge;
}
public Users(int userid, String uname, String uzname, String usex, String birthday, String tellphone, String email,
		String pwd, String time, String paypwd, String imgurl, int recharge) {
	super();
	this.userid = userid;
	this.uname = uname;
	this.uzname = uzname;
	this.usex = usex;
	this.birthday = birthday;
	this.tellphone = tellphone;
	this.email = email;
	this.pwd = pwd;
	this.time = time;
	this.paypwd = paypwd;
	this.imgurl = imgurl;
	this.recharge = recharge;
}
public Users() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Users [userid=" + userid + ", uname=" + uname + ", uzname=" + uzname + ", usex=" + usex + ", birthday="
			+ birthday + ", tellphone=" + tellphone + ", email=" + email + ", pwd=" + pwd + ", time=" + time
			+ ", paypwd=" + paypwd + ", imgurl=" + imgurl + ", recharge=" + recharge + "]";
}

}
