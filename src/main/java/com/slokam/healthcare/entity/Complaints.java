package com.slokam.healthcare.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="complaints")
public class Complaints {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	@OneToMany(mappedBy="complaints",cascade=CascadeType.ALL)
	private List<Medications> mlist;
	public List<Medications> getMlist() {
		return mlist;
	}
	public void setMlist(List<Medications> mlist) {
		this.mlist = mlist;
	}
	public List<Diseses> getDlist() {
		return dlist;
	}
	public void setDlist(List<Diseses> dlist) { 
		this.dlist = dlist;
	}
	@ManyToMany
	@JoinTable(name = "complaint_diseses", joinColumns = { @JoinColumn(name = "cid") }, inverseJoinColumns = { @JoinColumn(name = "disid") })
	private List<Diseses> dlist;
	
	@ManyToOne
	@JoinColumn(name="vid")
	private Visiting visiting;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name ) {
		this.name = name;
	}
	public Visiting getVisiting() {
		return visiting;
	}
	public void setVisiting(Visiting visiting) {
		this.visiting = visiting;
	}
	

}
