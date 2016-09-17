package org.proffart.football.training.service;

import org.proffart.football.training.domain.Player;
import org.proffart.football.training.dto.GroupDto;

/**
 * Author Artak Mnatsakanyan
 * Date 9/17/16
 * Time 12:21 PM
 */
public interface PlayerGroupService {

    Player createGroup(String groupName);

    Player removeGroup(Integer groupId);

    Player saveGroup(GroupDto groupDto);
}
