package com.slokam.healthcare.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.healthcare.entity.Medicine;
@Repository
public interface MedicineDao extends JpaRepository<Medicine, Integer> {

}
