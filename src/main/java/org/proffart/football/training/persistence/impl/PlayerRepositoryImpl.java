package org.proffart.football.training.persistence.impl;

import org.proffart.football.training.domain.Player;
import org.proffart.football.training.persistence.PlayerRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Author Artak Mnatsakanyan
 * Date 9/19/16
 * Time 8:50 PM
 */
@Repository
public class PlayerRepositoryImpl implements PlayerRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Player savePlayer(Player player) {
        entityManager.persist(player);
        return player;
    }

    @Override
    public Player getPlayer(Integer PlayerId) {
        return entityManager.find(Player.class, PlayerId);
    }

    @Override
    public Player removePlayer(Integer playerId) {
        Player player = getPlayer(playerId);
        entityManager.remove(player);
        return player;
    }
}
