package com.example.Studentdetail.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentDetail {
	@Id
	private int regno;
	private String name;
	private int age;
	private String email;
	public int Regno() {
	return regno;
}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}

