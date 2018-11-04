package com.slokam.healthcare.Dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.healthcare.entity.Patient;
@Repository
public interface PatientDao extends JpaRepository<Patient, Integer> {
	@Query("select p.firstname,p.lastname,d.name,dis.name from Medications m join m.complaints c join c.visiting v join v.appointment a join a.patient p join m.medicine me join v.doctor d join c.dlist dis where me.name=?1")
	public List<Object[]> getpatientbymedicine(String name);
	
	@Query("select p.firstname,p.lastname from Complaints c join c.dlist dis join c.visiting v join v.appointment a join a.patient p where dis.name=?1")
	public List<Object[]> getpatientsbydiseases(String name);
   
	@Query("select p.firstname,p.lastname from Visiting v join v.doctor do join v.appointment a join a.patient p where do.name=?1")
	public List<Object[]> getpatientbydoctorname(String name);
	
	@Query("select do.name,do.spelization from Visiting v join v.doctor do join v.appointment a join a.patient p where  p.firstname=?1")
	public List<Object[]> getdoctorbypatient(String name);
	
	@Query("select  p.firstname,p.lastname from Visiting v join v.appointment a join a.patient p where a.date between ?1 and ?2")
	public List<Object[]> getbyapointment(Date start,Date end);
	
}
