package com.demo.entity;

import javax.persistence.*;

@Entity//entity class.(1 crete entity class)
public class Student {//class name and Jdbc table name are same.authorewise error.
	@Id //auto generate id.
	@GeneratedValue(strategy=GenerationType.IDENTITY)//auto generated id..if you not auto increment then do not write this.
   private int id;
   private String name;
   private String course;
   private int fee;
   
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
   
}
