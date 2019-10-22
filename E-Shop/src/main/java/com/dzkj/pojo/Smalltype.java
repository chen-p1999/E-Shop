package com.dzkj.pojo;

public class Smalltype {			//商品类别表
	private int  id;     				//类别id
	private String type;      			//类别名
	private int  tag;                   //附加
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getTag() {
		return tag;
	}
	public void setTag(int tag) {
		this.tag = tag;
	}
	public Smalltype(int id, String type, int tag) {
		super();
		this.id = id;
		this.type = type;
		this.tag = tag;
	}
	public Smalltype() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Smalltype [id=" + id + ", type=" + type + ", tag=" + tag + "]";
	}

}
