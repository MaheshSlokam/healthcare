package com.slokam.healthcare.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="visting")
public class Visiting {
	@Id
	@GeneratedValue
	private Integer id;
	private Date startingtime;
	private Date endingtime;
	
	@OneToOne
	@JoinColumn(name="aid")
	private Appointment appointment;
	@ManyToOne
	@JoinColumn(name="did")
	private Doctor doctor;
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getStartingtime() {
		return startingtime;
	}
	public void setStartingtime(Date startingtime) {
		this.startingtime = startingtime;
	}
	public Date getEndingtime() {
		return endingtime;
	}
	public void setEndingtime(Date endingtime) {
		this.endingtime = endingtime;
	}
	public Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	

}
