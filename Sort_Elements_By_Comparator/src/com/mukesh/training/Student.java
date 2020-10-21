package com.mukesh.training;

public class Student{
	private String sid;
	private String name;
	private Integer age;
	
	public Student() {
		super();
	}

	public Student(String sid, String name, Integer age) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
	}	
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", age=" + age + "]";
	}
}

