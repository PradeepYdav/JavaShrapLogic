package com.pradeep;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.pradeep.model.Person;
import com.pradeep.model.Response;

@Path("/person")
public class RestApplication implements PersonService {
	
		public static Map<Integer, Person> persons= new HashMap<>();

		@GET
		@Path("/get")
	
		@Produces(MediaType.APPLICATION_JSON)
		public Response hello() {
			Response response= new Response();
			response.setMessage("check");
			response.setStatus(true);
			return response;
		}

		@Override
		@POST
		@Path("/addperson")
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON	)
		public Response addPerson(Person p) {
			Response response= new Response();
			if(persons.get(p.getId())!=null) {
				response.setStatus(false);
				response.setMessage("Person Alreday Exist");
				return response;
			}
			persons.put(p.getId(), p);
			response.setStatus(true);
			response.setMessage("Person Added");
			return response;
		}

		@Override
		@GET
		@Path("/{id}/delete")
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public Response deletePerson(@PathParam("id")int id) {
			Response response= new Response();
			if(persons.get(id)==null) {
				response.setStatus(false);
				response.setMessage("Person Didnt Available");
			}
			persons.remove(id);
			response.setStatus(true);
			response.setMessage("Person Deleted");
			return response;
		}

		@Override
		@GET
		@Path("/{id}/getperson")
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public Person getPerson(@PathParam("id")int id) {
			return persons.get(id);
		}

		@Override
		@GET
		@Path("getallperson")
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public Person[] getAllPerson() {
			Set<Integer> ids=persons.keySet();
			Person[] p= new Person[ids.size()];
			int i=0;
			for(Integer id:ids) {
				p[i]=persons.get(id);
				i++;
			}
			
			return p;
		}
}
