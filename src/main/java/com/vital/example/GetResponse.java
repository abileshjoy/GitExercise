package com.vital.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class GetResponse {
	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) { 
		String output = "Hello: " + msg; 
		return Response.status(200).entity(output).build();
 
	}
	
	 @GET
     @Path("printHtml")
     @Produces(MediaType.TEXT_HTML)
     public String printOnly()
     {
        System.out.println("running successfully");
        return "<p>A sample webservice</p>";
     }
	 
	 
	 

}
