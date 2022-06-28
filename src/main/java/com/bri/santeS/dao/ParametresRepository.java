package com.bri.santeS.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bri.santeS.entities.Parametres;

@Repository
public interface ParametresRepository extends JpaRepository<Parametres, Long>{

}
