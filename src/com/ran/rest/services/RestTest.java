package com.ran.rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/helloworld") //route to Java class
public class RestTest {
	
	//version of Jersey API
	private static final String VERSION = "1.19.1";
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle(){
		return "<p>Java web service success</p>";
	}
	
	@GET
	@Path("/version")     //route to specific method
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion(){
		return "Version : "+VERSION;
	}
}
