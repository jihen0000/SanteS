package com.bri.santeS.services;

import com.bri.santeS.entities.InformationSup;

public interface InformationSupService {
	public long addInformationSup(InformationSup informationSup, long idDocument);
	public void updateInformationSup(InformationSup informationSup);
	public InformationSup getInformationSup(long idDocument);

}
