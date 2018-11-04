package com.slokam.healthcare.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.slokam.healthcare.Dao.PatientDao;
import com.slokam.healthcare.entity.Patient;

@Service
public class PatientService {
	@Autowired
	private PatientDao dao;
	public void savepatientdata(@RequestBody Patient p) {
           dao.save(p);	
	}
	public List<Object[]> getpatientbymedicine(String name){
		        return  dao.getpatientbymedicine(name);
	}
	public List<Object[]> getpatientsbydiseases(String name){
		       return    dao.getpatientsbydiseases(name);
	}
	public List<Object[]> getpatientbydoctorname(String name){
		      return dao.getpatientbydoctorname(name);
	}
	public List<Object[]> getdoctorbypatient(String name){
		 return dao.getdoctorbypatient(name);
	}
	public List<Object[]> getbyapointment(Date start,Date end){
		 return dao.getbyapointment(start, end);
	}
}
