package com.slokam.healthcare.Contoler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.healthcare.Service.MedicineService;
import com.slokam.healthcare.entity.Medicine;

@RestController
public class MedicineControler {
	@Autowired
	private MedicineService ser;
	@RequestMapping("savemedicinedata")
	public void savemedicinedata(@RequestBody Medicine m){
		ser.savedata(m);
		
	}

}
