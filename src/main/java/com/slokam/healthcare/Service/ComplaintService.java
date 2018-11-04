package com.slokam.healthcare.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.healthcare.Dao.ComplaintDao;
import com.slokam.healthcare.entity.Complaints;
import com.slokam.healthcare.entity.Medications;

@Service
public class ComplaintService {
	@Autowired
	private ComplaintDao dao;
	public void savecomplaints(Complaints c){
		List<Medications> mlist = c.getMlist();
		for (Medications medications : mlist) {
			medications.setComplaints(c);
		}
		dao.save(c);
		
	}

}
