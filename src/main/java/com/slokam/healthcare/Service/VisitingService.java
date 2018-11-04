package com.slokam.healthcare.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.healthcare.Dao.VisitingDao;
import com.slokam.healthcare.entity.Visiting;

@Service
public class VisitingService {
	@Autowired
	private VisitingDao dao;

	public void save(Visiting v) {
        dao.save(v);		
	}

}
