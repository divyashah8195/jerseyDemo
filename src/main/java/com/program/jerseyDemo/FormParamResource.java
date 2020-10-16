package com.program.jerseyDemo;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/form-data")
@Produces(MediaType.TEXT_HTML)

public class FormParamResource {

	@POST
	@Path("/form-param")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Response getFormParam(@FormParam("name") String name, @FormParam("phone") String phone) {

		return Response.ok(getHtmlResponse(name, phone)).build();

	}

	public String getHtmlResponse(String name, String phone) {

		StringBuilder responseStr = new StringBuilder("<html><head><title>Form Data</title></head><body>");
		responseStr.append("<h2>Submitted form data</h2><div><span>Name : "+name+"</span><br/><span>Phone : "+phone+"</span></div></body>");
		return responseStr.toString();
	}


}
