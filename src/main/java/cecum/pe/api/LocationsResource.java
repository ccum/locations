package cecum.pe.api;

import cecum.pe.api.beans.Location;
import java.lang.Number;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/locations")
public interface LocationsResource {
  @GET
  @Produces("application/json")
  List<Location> generatedMethod1();

  @Path("/{id}")
  @GET
  @Produces("application/json")
  Response generatedMethod2(@PathParam("id") Number id);

  @Path("/phone/{id}/")
  @GET
  @Produces("application/json")
  Response generatedMethod3(@PathParam("id") Number id);
}
