package org.proffart.football.training.api.impl;

import org.proffart.football.training.api.PlayerApi;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;

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
    public String createPlayer(String name) {
        return null;
    }

    @PUT
    @Path("{id}")
    public String savePlayer(@PathParam("id") Integer id) {
        return null;
    }

    @DELETE
    @Override
    public String deletePlayer(String name) {
        return null;
    }

    @GET
    @Override
    public String getPlayer(String name) {
        return null;
    }

    @GET
    @Override
    public String getPlayers(String name) {
        return null;
    }
}

