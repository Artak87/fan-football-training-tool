package org.proffart.football.training.service;

import org.proffart.football.training.domain.Group;
import org.proffart.football.training.domain.Player;
import org.proffart.football.training.dto.GroupDto;

/**
 * Author Artak Mnatsakanyan
 * Date 9/17/16
 * Time 12:21 PM
 */
public interface GroupService {

    Group createGroup(String groupName);

    Group removeGroup(Integer groupId);

    Group saveGroup(GroupDto groupDto);

    Group getGroup(Integer groupId);

    Player joinGroup(Integer groupId, Integer playerId);
}
