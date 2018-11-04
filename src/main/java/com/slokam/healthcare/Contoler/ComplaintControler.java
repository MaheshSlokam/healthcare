package com.slokam.healthcare.Contoler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.healthcare.Service.ComplaintService;
import com.slokam.healthcare.entity.Complaints;

@RestController
@RequestMapping("complaints")
public class ComplaintControler {
	@Autowired
	private ComplaintService ser;
	@PostMapping
	public void savecomplaints(@RequestBody Complaints c){
		ser.savecomplaints(c);
		 
	}

}
