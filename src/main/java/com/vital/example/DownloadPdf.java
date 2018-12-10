package com.vital.example;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/getBook")
public class DownloadPdf {
	private static final String FILE_PATH = "D:\\serverStartup.pdf";
	
	@GET
	@Path("/get")
	@Produces("application/pdf")
	public Response getFile() {

		File file = new File(FILE_PATH);

		ResponseBuilder response = Response.ok((Object) file);
		response.header("Content-Disposition",
				"attachment; filename=serverStartup.pdf.pdf");
		return response.build();

	}
}
