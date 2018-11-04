package com.slokam.healthcare.Contoler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.healthcare.Service.DocterService;
import com.slokam.healthcare.entity.Doctor;

@RestController
public class DocterContoler {
	@Autowired
	private DocterService ser;
	@RequestMapping("savedocterdata")
	public void savedocterdata(@RequestBody Doctor doctor){
		ser.savedata(doctor);
		
	}

}
