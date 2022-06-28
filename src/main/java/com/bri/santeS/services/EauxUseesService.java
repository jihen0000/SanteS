package com.bri.santeS.services;

import com.bri.santeS.entities.EauxUsees;

public interface EauxUseesService {
	public long addEauxUsees(EauxUsees eauxUsees, long idDocument);
	public void updateEauxUsees(EauxUsees eauxUsees);
	public EauxUsees getEauxUsees(long idDocument);

}
