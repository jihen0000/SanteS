package com.bri.santeS.services;

import com.bri.santeS.entities.Infermier;

public interface InfermierService {
	public long addInfermier(Infermier  infermier, long idDocument);
	public Infermier getInfermier(long idDocument);
	public void updateInfermier(Infermier infermier);

}
