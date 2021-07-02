package in.chetan.resources;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

@Path("myntra")
public class MyntraCatalogueService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/catalogue/{category}/products")
	public StreamingOutput getProductsDetails(@PathParam("category") String category, @QueryParam("brand") @DefaultValue("any") String brand,
			@QueryParam("minprice") @DefaultValue("500")  String minPrice, @QueryParam("maxprice") @DefaultValue("3000") String maxPrice) {
		return os -> {
			StringBuilder builder = new StringBuilder();
			builder.append("category:").append(category).append(", brand:").append(brand).append(", minprice:")
					.append(minPrice).append(", maxprice:").append(maxPrice);
			os.write(builder.toString().getBytes());
			os.close();

		};
	}
}