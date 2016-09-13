package org.proffart.football.training.api.impl;

import org.proffart.football.training.api.GroupApi;
import org.springframework.stereotype.Component;

import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

/**
 * Author Artak Mnatsakanyan
 * Date 9/13/16
 * Time 12:04 PM
 */
@Component
@Path("/group")
public class GroupApiImpl implements GroupApi {


    @POST
    @Override
    public String createGroup(String name) {
        return null;
    }

    @PUT
    @Override
    public String joinGroup(Integer playerId) {
        return null;
    }
}
