package com.slokam.healthcare.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.healthcare.entity.Diseses;
@Repository
public interface DiseseDao extends JpaRepository<Diseses, Integer> {

}
