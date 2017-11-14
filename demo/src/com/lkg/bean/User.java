package com.lkg.bean;

import java.util.List;

public class User {
	private String name;
	private int age;
	private String sex;
	private List<String> message;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public List<String> getMessage() {
		return message;
	}
	public void setMessage(List<String> message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "User [name="+name+",age="+age+",sex="+sex+",message="+message+"]";
	}
	
}
