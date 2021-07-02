package in.chetan.resources;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.StreamingOutput;
import javax.ws.rs.core.UriInfo;

import in.chetan.dto.CarDto;

@Path("cardheko")
public class CarDekhoService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("{city}/{cartype}")
	public StreamingOutput getCar(@Context UriInfo uriInfo, @Context HttpHeaders header) {
		return os -> {
			StringBuilder builder = null;
			builder = new StringBuilder();
			List<PathSegment> pathSegments = null;
			pathSegments = uriInfo.getPathSegments();
			for (PathSegment pathSegment : pathSegments) {
				builder.append("Pathsegment->").append(pathSegment.getPath()).append("Matrix param= ")
						.append(getMultiValueMapAsString(pathSegment.getMatrixParameters()));
			}
			builder.append("Query param:").append(getMultiValueMapAsString(uriInfo.getQueryParameters()));
			builder.append("header param:").append(getMultiValueMapAsString(header.getRequestHeaders()));

			os.write(builder.toString().getBytes());
			os.close();

		};

	}

	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Path("/sell/{city}/service")
	public String sellCar(@BeanParam CarDto carDto) {
		return carDto.toString();
	}

	public String getMultiValueMapAsString(MultivaluedMap<String, String> matrixParameter) {
		StringBuilder builder = null;
		builder = new StringBuilder();
		for (String keyName : matrixParameter.keySet()) {
			builder.append(keyName).append("=");
			for (String paramValue : matrixParameter.get(keyName)) {
				builder.append(paramValue).append(",");
			}
		}
		return builder.toString();
	}
}
