package io.quarkuscoffeeshop.customermocker.infrastructure;

import io.quarkuscoffeeshop.customermocker.domain.CustomerMocker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/api")
public class ApiResource {

    final Logger logger = LoggerFactory.getLogger(ApiResource.class);

    @Inject
    CustomerMocker customerMocker;

    @POST
    @Path("/start")
    public Response startMocking() {
        logger.info("starting");
        customerMocker.start();
        return Response.ok().build();
    }

    @POST
    @Path("/stop")
    public Response stopMocking() {
        logger.info("stopping");
        customerMocker.stop();
        return Response.ok().build();
    }

    @GET
    @Path("/running")
    public Response isRunning() {
        logger.info("returning status {}", customerMocker.isRunning());
        return Response.ok(customerMocker.isRunning()).build();
    }

    @POST
    @Path("/dev")
    public Response setVolumeToDev() {
        logger.info("setting volume to Dev");
        customerMocker.setToDev();
        return Response.ok().build();
    }

    @POST
    @Path("/slow")
    public Response setVolumeToSlow() {
        logger.info("setting volume to Slow");
        customerMocker.setToSlow();
        return Response.ok().build();
    }

    @POST
    @Path("/moderate")
    public Response setVolumeToModerate() {
        logger.info("setting volume to Moderate");
        customerMocker.setToModerate();
        return Response.ok().build();
    }

    @POST
    @Path("/busy")
    public Response setVolumeToBusy() {
        logger.info("setting volume to Busy");
        customerMocker.setToBusy();
        return Response.ok().build();
    }

    @POST
    @Path("/weeds")
    public Response setVolumeToWeeds() {
        logger.info("setting volume to Weeds");
        customerMocker.setToWeeds();
        return Response.ok().build();
    }
}
