package com.bri.santeS.services;

import java.util.List;

import com.bri.santeS.entities.Role;
import com.bri.santeS.entities.Utilisateur;

public interface UserService {
	public long addUser(Utilisateur utilisateur,long idGouvernorat);
	public Utilisateur getUser(long idUtilisateur);
	public void updateUser(Utilisateur utilisateur);
	public void deleteUser(long idUtilisateur);
	public List<Utilisateur> listUtilisateur();
	public List<Role> listRoleParUtilisateur(long idUtilisateur);
	public void attribuerRole(Role role, long idUtilisateur);
	public void revoquerRole(String roleName,long idUtilisateur);
	public long addRole(Role role);
	public Utilisateur loadUserByUserName(String userName);
	
	public List<Role> rolesParUser(long idUtilisateur);

}
