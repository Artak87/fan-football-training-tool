package org.proffart.football.training.persistence.impl;

import org.proffart.football.training.domain.User;
import org.proffart.football.training.persistence.UserRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

/**
 * Author Artak Mnatsakanyan
 * Date 7/29/16
 * Time 10:57 PM
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User save(final User user) {
        entityManager.persist(user);
        return user;
    }
}
