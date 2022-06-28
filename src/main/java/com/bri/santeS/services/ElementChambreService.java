package com.bri.santeS.services;

import com.bri.santeS.entities.Bureau;
import com.bri.santeS.entities.Chaises;
import com.bri.santeS.entities.Draps;
import com.bri.santeS.entities.ElementChambre;
import com.bri.santeS.entities.Matelas;
import com.bri.santeS.entities.Rangements;

public interface ElementChambreService {
	
	public long addElementChambre(ElementChambre elementChambre, long idDocument);

	public void updateElementChambre(ElementChambre elementChambre);

	public Matelas getMatelas(long idDocument);

	public Draps getDraps(long idDocument);

	public Rangements getRangements(long idDocument);

	public Bureau getBureau(long idDocument);

	public Chaises getChaise(long idChaise);

}
