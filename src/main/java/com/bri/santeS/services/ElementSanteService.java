package com.bri.santeS.services;

import com.bri.santeS.entities.ElementSante;
import com.bri.santeS.entities.Lavabos;
import com.bri.santeS.entities.Robinets;
import com.bri.santeS.entities.Toilettes;
import com.bri.santeS.entities.Urinoirs;

public interface ElementSanteService {
	
	public long addElementSante(ElementSante elementSante, long idDocument);

	public void updateElementSante(ElementSante elementSante);

	public Robinets getRoubinets(long idDocument);

	public Urinoirs getUrinoirs(long idDocument);

	public Toilettes getToilettes(long idDocument);

	public Lavabos getLavabos(long idDocument);

}
