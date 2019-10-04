package com.prueba.totems.dto;

import java.util.Date;

public class EmpleadoDTO {

	  public EmpleadoDTO(Integer empleadoid, String nombre, String apellido) {
		super();
		this.empleadoid = empleadoid;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	    
	    public EmpleadoDTO() {}

		private Integer empleadoid;
	   
	    private String nombre;
	  
	    private String apellido;
	  
	    private Date fechaNac;
	  
	    private Integer extension;

	    public Integer getEmpleadoid() {
	        return empleadoid;
	    }

	    public void setEmpleadoid(Integer empleadoid) {
	        this.empleadoid = empleadoid;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getApellido() {
	        return apellido;
	    }

	    public void setApellido(String apellido) {
	        this.apellido = apellido;
	    }

	    public Date getFechaNac() {
	        return fechaNac;
	    }

	    public void setFechaNac(Date fechaNac) {
	        this.fechaNac = fechaNac;
	    }

	    public Integer getExtension() {
	        return extension;
	    }

	    public void setExtension(Integer extension) {
	        this.extension = extension;
	    }

	    @Override
	    public String toString() {
	        return "EmpleadoDTO{" + "empleadoid=" + empleadoid + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac + ", extension=" + extension + '}';
	    }
	    
}
