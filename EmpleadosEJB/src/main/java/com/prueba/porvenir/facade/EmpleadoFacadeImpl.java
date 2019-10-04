package com.prueba.porvenir.facade;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.prueba.totems.dto.EmpleadoDTO;

/**
 * Session Bean implementation class EmpleadoFacade
 */
@Stateless(name = "EmpleadoFacade",mappedName = "ejb/EmpleadoFacade")
public class EmpleadoFacadeImpl implements EmpleadoFacade {

    /**
     * Default constructor. 
     */
    public EmpleadoFacadeImpl() {
        // TODO Auto-generated constructor stub
    	
    }
    
    @Override
    public List<EmpleadoDTO> getAllEmpleados(){
	 EmpleadoDTO emp1=new EmpleadoDTO(1,"Harry","Hurtado");
	 EmpleadoDTO emp2=new EmpleadoDTO(2,"Pedro","Perez");
	 EmpleadoDTO emp3=new EmpleadoDTO(3,"Nicolas","Chavez");
	 List<EmpleadoDTO> lisEmp=new ArrayList<EmpleadoDTO>();
	 lisEmp.add(emp1);
	 lisEmp.add(emp2);
	 lisEmp.add(emp3);
	 return lisEmp;
	}
    

}
