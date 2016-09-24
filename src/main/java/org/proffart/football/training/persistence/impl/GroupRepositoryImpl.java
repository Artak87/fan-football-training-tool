package org.proffart.football.training.persistence.impl;

import org.proffart.football.training.domain.Group;
import org.proffart.football.training.persistence.GroupRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Author Artak Mnatsakanyan
 * Date 9/17/16
 * Time 8:41 PM
 */
@Repository
public class GroupRepositoryImpl implements GroupRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Group saveGroup(Group group) {
        entityManager.persist(group);
        return group;
    }

    @Override
    public Group getGroup(Integer groupId) {
        return entityManager.find(Group.class, groupId);
    }

    @Override
    public Group getGroupByName(String name) {
        Query query = entityManager.createQuery("SELECT g FROM Group g WHERE g.name = :name");
        query.setParameter("name", name);

        try {
            return (Group) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public boolean isExistGroupByName(String name) {
        return getGroupByName(name) != null;
    }

    @Override
    public Group removeGroup(Integer groupId) {
        Group group = getGroup(groupId);
        removeGroup(group);
        return group;
    }

    @Override
    public Group removeGroup(Group group) {
        if (group == null) {
            return null;
        }
        entityManager.remove(group);
        return group;
    }
}
