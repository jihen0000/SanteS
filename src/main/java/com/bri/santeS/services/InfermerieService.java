package com.bri.santeS.services;

import com.bri.santeS.entities.Infermerie;

public interface InfermerieService {
	public long addInfermerie(Infermerie infermerie,long idDocument);
	public void updateInfermerie(Infermerie infermerie);
	public Infermerie getInfermerie(long idInfermerie);

}
