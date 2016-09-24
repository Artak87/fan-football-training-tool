package org.proffart.football.training.api.impl;

import org.proffart.football.training.api.GroupApi;
import org.proffart.football.training.domain.Group;
import org.proffart.football.training.domain.Player;
import org.proffart.football.training.dto.GroupDto;
import org.proffart.football.training.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;

/**
 * Author Artak Mnatsakanyan
 * Date 9/13/16
 * Time 12:04 PM
 */
@Component
@Path("/group")
public class GroupApiImpl implements GroupApi {

    @Autowired
    private GroupService playerGroupService;

    @POST
    @Override
    public Group createGroup(String name) {
        return playerGroupService.createGroup(name);
    }

    @PUT
    @Path("/{id}")
    @Override
    public Group updateGroup(@PathParam("id") Integer groupId, String name) {
        GroupDto groupDto = new GroupDto();
        groupDto.setGroupId(groupId);
        groupDto.setName(name);

        return playerGroupService.saveGroup(groupDto);
    }

    @PUT
    @Path("/{id}/{playerId}")
    @Override
    public Player joinGroup(@PathParam("id") Integer groupId, @PathParam("playerId") Integer playerId) {
        return playerGroupService.joinGroup(groupId, playerId);
    }

    @GET
    @Path("/{id}")
    @Override
    public Group getGroup(@PathParam("id") Integer groupId) {
        return playerGroupService.getGroup(groupId);
    }
}
