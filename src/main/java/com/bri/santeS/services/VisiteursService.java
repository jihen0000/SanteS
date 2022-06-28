package com.bri.santeS.services;

import java.util.List;

import com.bri.santeS.entities.Visiteur;

public interface VisiteursService {
	public long addVisiteur(Visiteur  visiteur,long idDocument);
	public void addVisiteurs(List<Visiteur> visiteurs,long idDocument);
	public List<Visiteur> getVisiteurs(long idDocument);

}
