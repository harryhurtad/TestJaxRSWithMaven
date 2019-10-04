package com.prueba.totems.conf;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.prueba.totems.controller.EmpleadoController;



@ApplicationPath("rest")
public class ApplicationConf extends Application {

	
	
	public Set<java.lang.Class<?>> getClasses() {
        Set<java.lang.Class<?>> resources = new HashSet<Class<?>>();
        resources.add(io.swagger.jaxrs.listing.ApiListingResource.class);
        resources.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);
      //  resources.add(InternalExceptionMapper.class);
        resources.add(EmpleadoController.class);
        return resources;
    }
	
	
}
