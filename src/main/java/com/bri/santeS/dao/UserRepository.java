package com.bri.santeS.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bri.santeS.entities.Utilisateur;

@Repository
public interface UserRepository extends JpaRepository<Utilisateur, Long>{
	@Query("SELECT u FROM Utilisateur u WHERE u.id = idUtilisateur")
	public Utilisateur getById(@Param("idUtilisateur") long idUtilisateur);
	
	@Query("select count(*) from Utilisateur u where u.login =:userName")
    public long getCountUser(@Param("userName") String userName);

    @Query("select u from Utilisateur u where u.login= :userName")
    public Utilisateur getUserByUserName(@Param("userName")String userName);

}
