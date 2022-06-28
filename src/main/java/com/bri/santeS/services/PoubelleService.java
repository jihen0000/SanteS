package com.bri.santeS.services;

import com.bri.santeS.entities.Poubelle;

public interface PoubelleService {
	public long addPoubelle(Poubelle poubelle,long idDocument);
	public void updatePoubelle(Poubelle poubelle);
	public Poubelle getPoubelle(long idDocument);

}
