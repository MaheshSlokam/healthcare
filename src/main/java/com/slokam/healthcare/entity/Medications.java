package com.slokam.healthcare.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="medications")
public class Medications {
	@Id
	@GeneratedValue
	private Integer id;
	private Date timings;
	@ManyToOne
	@JoinColumn(name="mid")
	private Medicine medicine;
	private Integer quantity;
	public Medicine getMedicine() {
		return medicine;
	}
	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	@ManyToOne
	@JoinColumn(name="cid")
	private Complaints complaints;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getTimings() {
		return timings;
	}
	public void setTimings(Date timings) {
		this.timings = timings;
	}
	public Complaints getComplaints() {
		return complaints;
	}
	public void setComplaints(Complaints complaints) {
		this.complaints = complaints;
	}
	
}
