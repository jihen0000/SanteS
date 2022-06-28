package com.bri.santeS.services;

import com.bri.santeS.entities.Buvette;

public interface BuvetteService {
	public long addBuvette(Buvette buvette, long idDocument);
	public void updateBuvette(Buvette buvette);
	public Buvette getBuvette(long idDocument);

}
