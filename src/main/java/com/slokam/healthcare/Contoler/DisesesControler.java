package com.slokam.healthcare.Contoler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.healthcare.Service.DisesService;
import com.slokam.healthcare.entity.Diseses;

@RestController
public class DisesesControler {
	@Autowired
	private DisesService ser;
	@RequestMapping("savedisesedata")
	public void  savedisesedata(@RequestBody Diseses d){
		ser.savedata(d);
		
	}

}
