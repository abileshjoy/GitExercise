package com.vital.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/json/")
public class GetJsonResponse {

	@GET
	@Path("/getCeoDetails")
	@Produces("application/json")
	public Employee getTrackInJSON() {

		Employee employee = new Employee();
		employee.setId("1");
		employee.setName("Ceo");
		return employee;

	}
	
}
