package com.slokam.healthcare.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.slokam.healthcare.Dao.DoctorDao;
import com.slokam.healthcare.entity.Doctor;

@Service
public class DocterService {
	@Autowired
	private DoctorDao dao;

	public void savedata(@RequestBody Doctor doctor) {
          dao.save(doctor)	;	
	}

}
