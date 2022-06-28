package com.bri.santeS.services;

import java.util.List;

import com.bri.santeS.entities.Delegation;

public interface DelegationService {
	
	
	public List<Delegation> getAllDelegationsByName(String  nomGouvernorat);
	public List<Delegation> getAllDelegations(long idGouvernorat);
	public boolean checkAvailableDelegation(String libille);
	public long addDelegation(Delegation delegation, long idGouvernorat);
	public void deleteDelegation(long idDelegation);
	public void updateDelegation(Delegation delegation);

}
