package com.bri.santeS.services;

import java.util.List;

import com.bri.santeS.entities.Gouvernorat;

public interface GouvernoratService {
	public List<Gouvernorat> getAllGouvernorat();
	public List<Gouvernorat> getGouvernoratForUsers();
	public Gouvernorat addGouvernorat(Gouvernorat gouvernorat);
	public boolean checkAvailableGouvernorat(String libille);
	public void deleteGouvernorat(long idGouvernorat);
	public void updateGouvernorat(Gouvernorat gouvernorat);

}
