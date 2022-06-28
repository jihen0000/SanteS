package com.bri.santeS.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bri.santeS.entities.Gouvernorat;

@Repository
public interface GouvernoratRepository extends JpaRepository<Gouvernorat, Long>{
	@Query("Select g From Gouvernorat g Where g.id = idGouvernorat")
	public Gouvernorat getById(@Param("idGouvernorat") long idGouvernorat);
	
	@Query("select g from Gouvernorat g, Utilisateur u  where u.gouvernorat.id != g.id")
    public List<Gouvernorat> getGouvernoratForUsers();
	
	@Query("select count(*) from Gouvernorat g where g.libelle =:libelle")
	public long checkAvailableGouvernorat(@Param("libelle") String libille);

}
