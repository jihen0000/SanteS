package com.bri.santeS.services;

import com.bri.santeS.entities.Medecin;

public interface MedecinService {
	public long addMedecin(Medecin  medecin, long idDocument);
	public Medecin getMedecin(long idDocument);
	public void updateMedecin(Medecin medecin);

}
