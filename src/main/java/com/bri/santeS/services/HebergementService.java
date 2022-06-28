package com.bri.santeS.services;

import com.bri.santeS.entities.Hebergement;

public interface HebergementService {
	public long addHebergement(Hebergement hebergement,long idDocument);
	public void updateHebergement(Hebergement hebergement);
	public Hebergement getHebergement(long idHebergement);

}
