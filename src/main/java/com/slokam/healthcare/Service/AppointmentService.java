package com.slokam.healthcare.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.healthcare.Dao.AppointmentDao;
import com.slokam.healthcare.entity.Appointment;

@Service
public class AppointmentService {
	@Autowired
	private AppointmentDao dao;
	
	public void save(Appointment a) {
           dao.save(a);		
	}

}
