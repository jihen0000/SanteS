package com.bri.santeS.services;

import com.bri.santeS.entities.EmployeeBuvette;

public interface EmployeeBuvetteService {
	public long addEmployeeBuvette(EmployeeBuvette employeeBuvette, long idBuvette);
	public void updateEmployeeBuvette(EmployeeBuvette employeeBuvette);
	public EmployeeBuvette getEmployeeBuvette(long idEmployeeBuvette);

}
