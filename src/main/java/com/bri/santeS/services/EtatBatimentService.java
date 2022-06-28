package com.bri.santeS.services;

import com.bri.santeS.entities.EtatBatiment;

public interface EtatBatimentService {
	public long addEtatBatiment(EtatBatiment etatBatiment, long idDocument);
	public void updateEtatBatiment(EtatBatiment etatBatiment);
	public EtatBatiment getEtatBatiment(long idEtatBatiment);

}
