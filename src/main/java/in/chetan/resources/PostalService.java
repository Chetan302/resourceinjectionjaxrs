package in.chetan.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("postal")
public class PostalService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/trackParcel/{referenceNo}")
	public String track(@PathParam("referenceNo") String refNo) {
		return refNo.toString();
	}
}
