package home

import javax.ejb.Stateless
import javax.inject.Named
import javax.ws.rs.core.MediaType
import javax.ws.rs.{Produces, GET, Path}


@Path("/rest")
@Named
class App {
  @GET
  @Path("/hello")
  @Produces(Array(MediaType.APPLICATION_JSON))
  def test() : String = {
     "Hello, world!"
  }
}

