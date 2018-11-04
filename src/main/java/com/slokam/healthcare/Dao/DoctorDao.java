package com.slokam.healthcare.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.healthcare.entity.Doctor;
@Repository
public interface DoctorDao extends JpaRepository<Doctor, Integer> {

}
