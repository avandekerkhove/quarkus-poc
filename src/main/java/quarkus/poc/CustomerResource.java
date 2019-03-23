package quarkus.poc;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import quarkus.poc.customer.Customer;
import quarkus.poc.customer.CustomerService;

@Path("/customers")
public class CustomerResource {

    @Inject
    CustomerService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/hello")
    public String hello() {
        return "hello";
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> getAll() {
        return service.getAll();
    }
}