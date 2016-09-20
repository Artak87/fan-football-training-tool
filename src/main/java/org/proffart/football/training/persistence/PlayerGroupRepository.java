package org.proffart.football.training.persistence;

import org.proffart.football.training.domain.Group;

/**
 * Author Artak Mnatsakanyan
 * Date 9/17/16
 * Time 8:40 PM
 */
public interface PlayerGroupRepository {
    Group saveGroup(Group group);
    Group getGroup(Integer groupId);
    Group getGroupByName(String name);
    boolean isExistGroupByName(String name);
    Group removeGroup(Integer groupId);
    Group removeGroup(Group group);
}
