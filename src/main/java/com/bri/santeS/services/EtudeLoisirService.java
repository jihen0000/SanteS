package com.bri.santeS.services;

import com.bri.santeS.entities.EtudeLoisir;

public interface EtudeLoisirService {
	public long addEtudeLoisir(EtudeLoisir etudeLoisir, long idDcoument);
	public void updateEtudeLoisir(EtudeLoisir etudeLoisir);
	public EtudeLoisir getEtudeLoisir(long idEtudeLoisir);

}
