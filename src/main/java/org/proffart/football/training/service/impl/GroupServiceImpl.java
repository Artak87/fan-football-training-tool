package org.proffart.football.training.service.impl;

import org.proffart.football.training.domain.Group;
import org.proffart.football.training.domain.Player;
import org.proffart.football.training.dto.GroupDto;
import org.proffart.football.training.persistence.GroupRepository;
import org.proffart.football.training.persistence.PlayerRepository;
import org.proffart.football.training.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author Artak Mnatsakanyan
 * Date 9/17/16
 * Time 12:21 PM
 */
@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupRepository groupRepository;

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public Group createGroup(String groupName) {
        if (groupRepository.isExistGroupByName(groupName)) {
            return groupRepository.getGroupByName(groupName);
        }

        Group group = new Group();
        group.setName(groupName);

        return groupRepository.saveGroup(group);
    }

    @Override
    public Group removeGroup(Integer groupId) {
        return groupRepository.removeGroup(groupId);
    }

    @Override
    public Group saveGroup(GroupDto groupDto) {
        Group group = groupRepository.getGroup(groupDto.getGroupId());
        group.setName(groupDto.getName());

        return groupRepository.saveGroup(group);
    }

    @Override
    public Group getGroup(Integer groupId) {
        return groupRepository.getGroup(groupId);
    }

    @Override
    public Player joinGroup(Integer groupId, Integer playerId) {
        Group group = groupRepository.getGroup(groupId);
        Player player = playerRepository.getPlayer(playerId);
        player.setGroup(group);

        return playerRepository.savePlayer(player);
    }
}
