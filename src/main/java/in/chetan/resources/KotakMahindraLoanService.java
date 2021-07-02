package in.chetan.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

@Path("loan")
public class KotakMahindraLoanService {

	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/enquire")
	public StreamingOutput enquire(@FormParam ("applicantName") String applicantName,
			@FormParam("principleAmt") double principleAmt, @FormParam("tenure") int tenure,
			@FormParam("loantype") String loanType, @FormParam("contactno") String contactNo) {
		return os -> {
			StringBuilder builder = new StringBuilder();
			builder.append("applicantName:").append(applicantName).append(", principleAmt:").append(principleAmt)
					.append(", tenure:").append(tenure).append(", loantype:").append(loanType).append(", contactno:")
					.append(contactNo);

			os.write(builder.toString().getBytes());
			os.close();
		};
	}
}
