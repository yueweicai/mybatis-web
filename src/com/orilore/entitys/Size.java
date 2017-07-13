package com.orilore.entitys;
public class Size{
	private Integer id;
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return this.id;
	}
	private Integer pid;
	public void setPid(Integer pid){
		this.pid=pid;
	}
	public Integer getPid(){
		return this.pid;
	}
	private String sname;
	public void setSname(String sname){
		this.sname=sname;
	}
	public String getSname(){
		return this.sname;
	}
}