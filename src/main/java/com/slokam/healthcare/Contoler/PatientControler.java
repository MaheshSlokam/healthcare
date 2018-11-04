package com.slokam.healthcare.Contoler;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.healthcare.Service.PatientService;
import com.slokam.healthcare.entity.Patient;

@RestController
@RequestMapping("patient")
public class PatientControler {
	@Autowired
	private PatientService Ser;
	@RequestMapping("savepatientdata")
	public void savepatientdata(@RequestBody Patient p){
		Ser.savepatientdata(p);
	}
	@GetMapping("/bymedicine/{name}")
	public List<Object[]> getpatientbymedicine(@PathVariable("name") String name){
	return	Ser.getpatientbymedicine(name);
	}
	@GetMapping("/bydisease/{name}")
	public List<Object[]> getpatientsbydiseases(@PathVariable("name") String name){
		 return Ser.getpatientsbydiseases(name);
	}
	@GetMapping("/bydoctor/{name}")
	public List<Object[]> getpatientbydoctorname(@PathVariable("name") String name){
		 return Ser.getpatientbydoctorname(name);
	}
	@GetMapping("/bypatient/{name}")
	public List<Object[]> getdoctorbypatient(@PathVariable("name") String name){
		return Ser.getdoctorbypatient(name);
	}
	@GetMapping("/byappointment/{sdate}/{enddate}")
	public List<Object[]> getbyapointment(@PathVariable("sdate") @DateTimeFormat(pattern="yyyy-MM-dd")Date start,@PathVariable("enddate")  @DateTimeFormat(pattern="yyyy-MM-dd")Date end){
		return Ser.getbyapointment(start, end);
	}
}
