package com.bri.santeS.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bri.santeS.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
	@Query("select r from  Role r where r.utilisateur.idUtilisateur= :idUtilisateur")
    public List<Role> getRoleByUtilisateur(@Param("idUtilisateur") long idUtilisateur);

    @Query("select r from Role r where (r.roleName= :roleName) and (r.utilisateur.idUtilisateur = :idUtilisateur)")
    public Role getRoleByRoleNameAndUtilisateur(@Param("roleName") String roleName,@Param("idUtilisateur") long idUtilisateur);


}
