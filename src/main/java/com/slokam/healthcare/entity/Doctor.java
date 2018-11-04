package com.slokam.healthcare.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctors")
public class Doctor {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String spelization;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpelization() {
		return spelization;
	}
	public void setSpelization(String spelization) {
		this.spelization = spelization;
	}
	
	
 
}
