package org.proffart.football.training.service.impl;

import org.proffart.football.training.domain.Filter;
import org.proffart.football.training.domain.Player;
import org.proffart.football.training.dto.PlayerDto;
import org.proffart.football.training.service.PleyerService;
import org.springframework.stereotype.Service;

/**
 * Author Artak Mnatsakanyan
 * Date 9/15/16
 * Time 3:55 PM
 */
@Service
public class PlayerServiceImpl implements PleyerService {

    @Override
    public Player createPlayer(PlayerDto playerDto) {
        return null;
    }

    @Override
    public Player removePlayer(Integer playerId) {
        return null;
    }

    @Override
    public Player getPlayer(Integer playerId) {
        return null;
    }

    @Override
    public Player getPlayers(Filter filter) {
        return null;
    }
}
