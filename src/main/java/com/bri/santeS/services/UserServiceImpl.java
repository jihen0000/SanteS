package com.bri.santeS.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bri.santeS.dao.GouvernoratRepository;
import com.bri.santeS.dao.RoleRepository;
import com.bri.santeS.dao.UserRepository;
import com.bri.santeS.entities.Gouvernorat;
import com.bri.santeS.entities.Role;
import com.bri.santeS.entities.Utilisateur;

@CrossOrigin(origins = "*")
@RestController
public class UserServiceImpl implements UserService{
	@Autowired
    private UserRepository userRepository;
	@Autowired
    private GouvernoratRepository gouvernoratRepository;
	@Autowired
    private RoleRepository roleRepository;


	@Override
    @PostMapping("addUser/{idGouvernorat}")
    public long addUser(Utilisateur utilisateur, @PathVariable("idGouvernorat") long idGouvernorat){
        Gouvernorat gouvernorat = gouvernoratRepository.getById(idGouvernorat);
        utilisateur.setGouvernorat(gouvernorat);
        userRepository.save(utilisateur);
        return utilisateur.getIdUtilisateur();
    }

	@Override
    @GetMapping("/getUser/{idUtilisateur}")
    @ResponseBody
    public Utilisateur getUser(@PathVariable("idUtilisateur") long idUtilisateur){
        return userRepository.getById(idUtilisateur);
    }

	@Override
    @PutMapping("/updateUser")
    public void updateUser(Utilisateur utilisateur){
        userRepository.save(utilisateur);
    }

	@Override
    @DeleteMapping("/deleteUser/{idUtilisateur}")
    public void deleteUser(@PathVariable("idUtilisateur") long idUtilisateur){
        userRepository.deleteById(idUtilisateur);
    }

	@Override
    @GetMapping("/listUsers")
    @ResponseBody
    public List<Utilisateur> listUtilisateur(){
        return userRepository.findAll();
    }

	@Override
    @GetMapping("/listRoleParUser/{idUtilisateur}")
    @ResponseBody
    public List<Role> listRoleParUtilisateur(@PathVariable("idUtilisateur") long idUtilisateur){
        return roleRepository.getRoleByUtilisateur(idUtilisateur);
    }

	@Override
    @PostMapping("/addRole/{idUtilisateur}")
    public void attribuerRole(Role role, @PathVariable("idUtilisateur") long idUtilisateur){
        Utilisateur utilisateur = userRepository.getById(idUtilisateur);
        role.setUtilisateur(utilisateur);
        roleRepository.save(role);
    }

	@Override
    @DeleteMapping("/deleteRole/{idUtilisateur}")
    public void revoquerRole(String roleName, @PathVariable("idUtilisateur") long idUtilisateur){
        Role role = roleRepository.getRoleByRoleNameAndUtilisateur(roleName,idUtilisateur);
        roleRepository.delete(role);
    }

	@Override
    @PostMapping("/addRole")
    public long addRole(Role role){
        roleRepository.save(role);
        return role.getId();
    }

    @GetMapping("/checkAvailable")
    public boolean checkAvailable(String userName){
        Assert.notNull(userName);
        long count = userRepository.getCountUser(userName);
        return count<1;
    }


    @Override
    @GetMapping("/getUserByUserName/{userName}")
    @ResponseBody
    public Utilisateur loadUserByUserName(@PathVariable("UserName") String userName){
        return userRepository.getUserByUserName(userName);
    }
    
    @Override
    @GetMapping("/getRoleByIdUser/{idUtilisateur}")
    @ResponseBody
    public List<Role> rolesParUser(@PathVariable("idUtilisateur") long idUtilisateur){
    	return roleRepository.getRoleByUtilisateur(idUtilisateur);
    }
	

}
