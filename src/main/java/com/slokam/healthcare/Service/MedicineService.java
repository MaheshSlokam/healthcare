package com.slokam.healthcare.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.slokam.healthcare.Dao.MedicineDao;
import com.slokam.healthcare.entity.Medicine;

@Service
public class MedicineService {
	@Autowired
	private MedicineDao dao;

	public void savedata(@RequestBody Medicine m) {
       dao.save(m);	
	}

}
