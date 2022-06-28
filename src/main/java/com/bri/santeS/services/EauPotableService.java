package com.bri.santeS.services;

import com.bri.santeS.entities.EauPotable;

public interface EauPotableService {
	
	public long addEauPotable(EauPotable eauPotable, long idDocument);
	public void updateEauPotable(EauPotable eauPotable);
	public EauPotable getEauPotable(long idDocument);

}
