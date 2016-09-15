package org.proffart.football.training.api.impl;

import org.proffart.football.training.api.PlayerApi;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import java.util.Date;

/**
 * Author Artak Mnatsakanyan
 * Date 9/13/16
 * Time 3:11 PM
 */
@Component
@Path("/player")
public class PlayerApiImpl implements PlayerApi {

    @POST
    @Override
    public String createPlayer(
            String fullName,
            Date birthday,
            Integer height,
            Integer weight,
            Date startedTrainings,
            Integer previousExperience
    ) {
        return null;
    }

    @PUT
    @Path("{id}")
    @Override
    public String savePlayer(@PathParam("id") Integer id) {
        return null;
    }

    @DELETE
    @Path("/{id}")
    @Override
    public String deletePlayer(@PathParam("id") Integer id) {
        return null;
    }

    @GET
    @Path("/{id}")
    @Override
    public String getPlayer(@PathParam("id") Integer id) {
        return null;
    }

    @GET
    @Path("/list")
    @Override
    public String getPlayers(@QueryParam("start") Integer start, @QueryParam("limit") Integer limit) {
        return null;
    }
}
