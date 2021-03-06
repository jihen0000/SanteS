package com.bri.santeS.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bri.santeS.entities.CuisineResidant;

@Repository
public interface CuisineResidantRepository extends JpaRepository<CuisineResidant,Long>{
	@Query("SELECT c FROM CuisineResidant c where c.document.id = :idDocument")
    public CuisineResidant getCuisineResidantByIdDocument(@Param("idDocument") long idDocument);

}
