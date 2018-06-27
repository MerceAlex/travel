package com.example.travel.pojo;


import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	private int id; 
	private String name; 
	private int  sex; 
	private String  headUrl; 
	private String profession; 
	private String intorduce;
	@JsonFormat(pattern = "yyyy-MM-dd  HH:mm")
	/*@JSONField(format ="yyyy-MM-dd  HH:mm" )*/
	@DateTimeFormat(pattern = "yyyy-MM-dd  HH:mm")
	private Date createdTime;
	
	public User(){}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getHeadUrl() {
		return headUrl;
	}
	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getIntorduce() {
		return intorduce;
	}
	public void setIntorduce(String intorduce) {
		this.intorduce = intorduce;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
}
