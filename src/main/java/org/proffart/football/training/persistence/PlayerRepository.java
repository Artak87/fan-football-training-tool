package org.proffart.football.training.persistence;

import org.proffart.football.training.domain.Player;

/**
 * Author Artak Mnatsakanyan
 * Date 9/19/16
 * Time 8:51 PM
 */
public interface PlayerRepository {
    Player savePlayer(Player player);
    Player getPlayer(Integer PlayerId);
    Player removePlayer(Integer playerId);
}
