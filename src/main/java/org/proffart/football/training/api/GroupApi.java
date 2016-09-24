package org.proffart.football.training.api;

import org.proffart.football.training.domain.Group;
import org.proffart.football.training.domain.Player;

/**
 * Author Artak Mnatsakanyan
 * Date 9/13/16
 * Time 12:04 PM
 */
public interface GroupApi {
    Group createGroup(String name);

    Group updateGroup(Integer groupId, String name);

    Player joinGroup(Integer groupId, Integer playerId);

    Group getGroup(Integer groupId);
}
