package com.prueba.porvenir.facade;

import java.util.List;

import javax.ejb.Local;

import com.prueba.totems.dto.EmpleadoDTO;

@Local
public interface EmpleadoFacade {
	
	public List<EmpleadoDTO> getAllEmpleados();
}
