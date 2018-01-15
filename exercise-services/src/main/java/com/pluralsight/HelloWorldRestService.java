package com.pluralsight;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("helloworldrestservice")
public class HelloWorldRestService {

	//http://localhost:8080/exercise-services/webapi/helloworldrestservice
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMyGreetings(){
		return "Hello to JERSEY - REST Service";
	}
}