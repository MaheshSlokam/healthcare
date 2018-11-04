package com.slokam.healthcare.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.slokam.healthcare.Dao.DiseseDao;
import com.slokam.healthcare.entity.Diseses;

@Service
public class DisesService {
	@Autowired
	private DiseseDao dao;

	public void savedata(@RequestBody Diseses d) {
          dao.save(d);		
	}

}
