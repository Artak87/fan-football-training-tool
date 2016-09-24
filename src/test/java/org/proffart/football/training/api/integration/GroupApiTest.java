package org.proffart.football.training.api.integration;

import org.junit.Test;
import org.proffart.football.training.AbstractIntegrationTest;
import org.proffart.football.training.api.GroupApi;
import org.proffart.football.training.domain.Group;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Author Artak Mnatsakanyan
 * Date 9/22/16
 * Time 9:49 PM
 */
public class GroupApiTest extends AbstractIntegrationTest {

    @Autowired
    private GroupApi groupApi;

    @Test
    public void testCreateGroup() {
        final String groupName = "Group Name";
        final Group createdgroup = groupApi.createGroup(groupName);
        flushAndClear();
        assertNotNull(createdgroup.getGroupId());
        assertEquals(createdgroup.getName(), groupName);
    }

    @Test
    public void testUpdateGroup() {
        final String groupName = "Group name";
        final Group newgroup = new Group();
        newgroup.setName(groupName);
        final Group savedgroup = groupApi.createGroup(groupName);
        final Integer groupId = savedgroup.getGroupId();
        flushAndClear();
        final Group updategroup = groupApi.updateGroup(groupId, groupName);
    }
}
