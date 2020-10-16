package com.program.jerseyDemo;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("cities")
public class CityResource {

	CityDao dao = new CityDao();

	@GET
	@Path("getCity")
	@Produces(MediaType.APPLICATION_JSON)
	public List<City> getCity() throws SQLException {

		return dao.getAllCity();
	}

	@GET
	@Path("getCity/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public City getCityById(@PathParam("id")int cityId) {

		return dao.getCityById(cityId);
	}
	
	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public City createCity(City city) {

		// create logic
		return city;
	}
	
	@PUT
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public City UpdateCity(City city){
		//update logic
		city.setCityName(city.getCityName()+"updated");
		return city;
	}

	@DELETE
	@Path("/delete/{id}")
	
	public Response DeleteCity(@PathParam("id") int cityId){
		return Response.status(200).entity("employee with"+cityId+"deleted").build();
		
	}
	
	
}
