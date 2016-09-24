package org.proffart.football.training.persistence.integration;

import org.junit.Test;
import org.proffart.football.training.AbstractIntegrationTest;
import org.proffart.football.training.domain.Group;
import org.proffart.football.training.persistence.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Author Artak Mnatsakanyan
 * Date 9/18/16
 * Time 11:18 AM
 */
public class GroupRepositoryTest extends AbstractIntegrationTest {

    @Autowired
    private GroupRepository groupRepository;

    @Test
    public void testSaveGroup() {
        // test data
        final String groupName = "Test Group Name";
        final Group group = new Group();
        group.setName(groupName);

        // run test
        final Group savedGroup = groupRepository.saveGroup(group);

        // expectation
        assertNotNull("Saved Group shouldn't be null", savedGroup);
        assertNotNull("Saved group id should be any number", savedGroup.getGroupId());
        assertThat("Saved group id should be Integer", savedGroup.getGroupId(), instanceOf(Integer.class));
        assertEquals("Saved group name should be given name", savedGroup.getName(), groupName);
    }

    @Test
    public void testGetGroup() {
        // test data
        final String groupName = "Test Group Name";
        final Group newGroup = new Group();
        newGroup.setName(groupName);
        final Group savedGroup = groupRepository.saveGroup(newGroup);
        final Integer groupId = savedGroup.getGroupId();
        flushAndClear();

        // run test
        final Group group = groupRepository.getGroup(groupId);

        // expectation
        assertNotNull("Saved Group shouldn't be null", group);
        assertEquals(group.getGroupId(), savedGroup.getGroupId());
        assertEquals(group.getName(), savedGroup.getName());
    }

    @Test
    public void testGetGroupByNameWithNotExistGroup() {
        // run test
        final Group group = groupRepository.getGroupByName("~~~~~~");

        // expectation
        assertNull("Group should be null", group);
    }

    @Test
    public void testGetGroupByName() {
        // test data
        final String groupName = "Test Group Name";
        final Group newGroup = new Group();
        newGroup.setName(groupName);
        final Group savedGroup = groupRepository.saveGroup(newGroup);
        flushAndClear();

        // run test
        final Group group = groupRepository.getGroupByName(groupName);

        // expectation
        assertNotNull("Group shouldn't be null", group);
        assertEquals(group.getGroupId(), savedGroup.getGroupId());
        assertEquals(group.getName(), savedGroup.getName());
    }


    @Test
    public void testIsExistGroupByNameWithNotExist() {
        final Boolean isExist = groupRepository.isExistGroupByName("~~~~~~~~~");
        assertFalse(isExist);
    }

    @Test
    public void testIsExistGroupByName() {
        // test data
        final String groupName = "Test Group Name";
        final Group newGroup = new Group();
        newGroup.setName(groupName);
        groupRepository.saveGroup(newGroup);
        flushAndClear();

        // run test
        final Boolean isExist = groupRepository.isExistGroupByName(groupName);

        // expectation
        assertTrue(isExist);
    }

    @Test
    public void testRemoveGroupWithId() {
        // test data
        final String groupName = "Test Group Name";
        final Group newGroup = new Group();
        newGroup.setName(groupName);
        final Group savedGroup = groupRepository.saveGroup(newGroup);
        final Integer groupId = savedGroup.getGroupId();
        flushAndClear();

        // run test
        groupRepository.removeGroup(groupId);
        flushAndClear();

        final Group group = groupRepository.getGroup(groupId);
        assertNull(group);
    }

    @Test
    public void testRemoveGroupWithObject() {
        // test data
        final String groupName = "Test Group Name";
        final Group newGroup = new Group();
        newGroup.setName(groupName);
        final Group savedGroup = groupRepository.saveGroup(newGroup);
        flushAndClear();
        final Integer groupId = savedGroup.getGroupId();

        final Group savedGroup1 = groupRepository.getGroup(groupId);

        // run test
        groupRepository.removeGroup(savedGroup1);
        flushAndClear();

        final Group group = groupRepository.getGroup(groupId);
        assertNull(group);
    }
}
