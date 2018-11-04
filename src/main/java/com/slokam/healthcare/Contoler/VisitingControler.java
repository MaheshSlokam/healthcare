package com.slokam.healthcare.Contoler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.healthcare.Service.VisitingService;
import com.slokam.healthcare.entity.Visiting;

@RestController
public class VisitingControler {
	@Autowired
	private VisitingService ser;
	@RequestMapping("savevisiting")
	public void savevisiting(@RequestBody Visiting v){
		
		ser.save(v);
	}
}
