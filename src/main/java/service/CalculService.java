package service;


import bean.Calcul;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/calcul")
public class CalculService {
	
	@GET
	@Path("/result")
	@Produces(MediaType.APPLICATION_XML)
	public Response getResultXML(@QueryParam("operande1") int operande1 , @QueryParam("operande2") int operande2 , @QueryParam("signe") String signe) {
		
		Calcul c = new Calcul(operande1, signe, operande2);
		int result = c.result();
		
		return Response.ok().entity("<resultat>" + result + "</resultat>").build();

	}
	

}