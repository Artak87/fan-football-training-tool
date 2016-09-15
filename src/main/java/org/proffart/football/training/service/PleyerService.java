package org.proffart.football.training.service;

import org.proffart.football.training.domain.Filter;
import org.proffart.football.training.domain.Player;
import org.proffart.football.training.dto.PlayerDto;

/**
 * Author Artak Mnatsakanyan
 * Date 9/15/16
 * Time 5:04 PM
 */
public interface PleyerService {
    Player createPlayer(PlayerDto playerDto);

    Player removePlayer(Integer playerId);

    Player getPlayer(Integer playerId);

    Player getPlayers(Filter filter);
}
