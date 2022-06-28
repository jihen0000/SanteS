package com.bri.santeS.services;

import com.bri.santeS.entities.CuisineResidant;

public interface CuisineResidantService {
	
	public long addCuisineResidant(CuisineResidant cuisineResidant, long idDocument);
	public void updateCuisineResidant(CuisineResidant cuisineResidant);
	public CuisineResidant getCuisineResidant(long idDocument);

}
