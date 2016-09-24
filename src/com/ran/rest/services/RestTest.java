package com.ran.rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/helloworld")
public class RestTest {
	
	private static final String NAME = "Ranjith";
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle(){
		return "<p>Java web service success</p>";
	}
	
	@GET
	@Path("/greeting")
	@Produces(MediaType.TEXT_HTML)
	public String returnJSONString(){
		return "Hello "+NAME;
	}
}