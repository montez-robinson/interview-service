package com.mr185234.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

@Path("")
@Produces(MediaType.APPLICATION_JSON)
@Service
public interface DemoService {

    @GET
    @Path("/{contract: .+}")
    String getContract(@PathParam("contract") String contract);

}
