package in.chetan.resources;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

@Path("redbus")
public class RedBusService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/service/{source}/{destination}/{bustype}/buses")
	public StreamingOutput getBus(@PathParam("source") String source, @PathParam("destination") String destination,
			@PathParam("bustype") String busType, @QueryParam("minprice") String minPrice,
			@QueryParam("maxprice") String maxPrice, @HeaderParam("platform") String platform) {
		return os -> {
			StringBuilder builder = new StringBuilder();
			builder.append("source:").append(source).append(", destination:").append(destination).append(", bustype:")
					.append(busType).append(", minprice:").append(minPrice).append(", maxprice:").append(maxPrice)
					.append(", platform:").append(platform);
			os.write(builder.toString().getBytes());
			os.close();
		};

	}
}
