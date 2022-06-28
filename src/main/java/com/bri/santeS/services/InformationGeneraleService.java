package com.bri.santeS.services;

import com.bri.santeS.entities.InformationGenerale;

public interface InformationGeneraleService {
	public long addInfoGenerale(InformationGenerale informationGenerale, long idDocument);
	public void updateInfoGenerale(InformationGenerale informationGenerale);
	public InformationGenerale getInfoGenerale(long idDocument);

}
