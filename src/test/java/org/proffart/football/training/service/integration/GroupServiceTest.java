package org.proffart.football.training.service.integration;

import org.junit.Test;
import org.proffart.football.training.AbstractIntegrationTest;
import org.proffart.football.training.domain.Group;
import org.proffart.football.training.dto.GroupDto;
import org.proffart.football.training.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Author Artak Mnatsakanyan
 * Date 9/22/16
 * Time 3:10 PM
 */
public class GroupServiceTest extends AbstractIntegrationTest {

    @Autowired
    private GroupService groupService;

    @Test
    public void testCreateAndGetGroup() {
        final String groupName = "Group Name";

        final Group createdGroup = groupService.createGroup(groupName);
        flushAndClear();
        assertNotNull(createdGroup.getGroupId());
        assertThat(createdGroup.getGroupId(), instanceOf(Integer.class));

        // case exist group
        final Group created2Group = groupService.createGroup(groupName);
        flushAndClear();
        assertEquals(created2Group.getGroupId(), createdGroup.getGroupId());

        final Group group = groupService.getGroup(createdGroup.getGroupId());
        assertNotNull(group);
        assertEquals(group.getName(), groupName);
    }

    @Test
    public void testRemoveGroup() {
        final String groupName = "Group name";
        final Group creatGroup = groupService.createGroup(groupName);
        flushAndClear();

        final Integer groupId = creatGroup.getGroupId();

        final Group removeGroup = groupService.removeGroup(groupId);
        flushAndClear();

        final Group group = groupService.getGroup(groupId);

        assertNull(group);
    }

    @Test
    public void testSaveGroup() {
        final String groupName = "Group name";
        final String newGroupName = "New Group name";

        final Group createdGroup = groupService.createGroup(groupName);
        flushAndClear();

        final GroupDto groupDto = new GroupDto();
        groupDto.setGroupId(createdGroup.getGroupId());
        groupDto.setName(newGroupName);

        final Group savedGroup = groupService.saveGroup(groupDto);
        flushAndClear();

        final Group group = groupService.getGroup(groupDto.getGroupId());
        assertNotNull(group);
        assertEquals(group.getName(), newGroupName);
    }
}
