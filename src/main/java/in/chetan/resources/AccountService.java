package in.chetan.resources;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("account")
public class AccountService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{accountNo}/balance")
	public String getBalance(@PathParam("accountNo") String accNo, @CookieParam("appId") String appId) {
		return "Account No:"+ accNo + " appId:"+ appId + "";
		
		
	}
}
