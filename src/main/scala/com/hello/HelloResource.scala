package com.hello

import javax.ws.rs._

@Path("/hello")
class HelloResource {
  @GET
  @Produces(Array("text/html"))
  def doGet = "<html><body><h1>hello jersey/scala world!</h1></body></html>"
}
