package com.slokam.healthcare.Contoler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.healthcare.Service.AppointmentService;
import com.slokam.healthcare.entity.Appointment;

@RestController
public class AppointmentContoler {
	@Autowired
	private AppointmentService ser;
	@RequestMapping("giveappointment")
	public void giveappointment(@RequestBody Appointment a){
		ser.save(a);
	}


}
