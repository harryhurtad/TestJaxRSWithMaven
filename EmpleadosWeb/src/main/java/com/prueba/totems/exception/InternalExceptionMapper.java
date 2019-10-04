package com.prueba.totems.exception;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.lang.model.element.Element;
import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class InternalExceptionMapper implements ExceptionMapper<ConstraintViolationException> {

	 @Context private HttpServletRequest request;
	
	public Response toResponse(ConstraintViolationException exception) {
		// TODO Auto-generated method stub
		RespException resp=new RespException();
		resp.setCode(101);
		List<String> listMessagesResp=new ArrayList<String>();
		exception.getConstraintViolations().forEach(element->{
			StringBuilder messageCompleted=new StringBuilder();
			
			messageCompleted.append(element.getPropertyPath())
			.append("->").append(element.getMessage());
			listMessagesResp.add(messageCompleted.toString());
			
			
		});
		/* List<String> messages = exception.getConstraintViolations().stream()
		            .map(ConstraintViolation::getMessage)
		            .collect(Collectors.toList());*/
		resp.setStatus(listMessagesResp.toString());
		return Response.status(Status.INTERNAL_SERVER_ERROR).
	    		entity(resp)
	    		.type(MediaType.APPLICATION_JSON)
	    	//	.header(ConstantsServices.X_RQUID, rquidHead)
	    	//	.header(ConstantsServices.X_APPROVALID, ConstantsServices.UNO)
	    		.build();
	}

}
