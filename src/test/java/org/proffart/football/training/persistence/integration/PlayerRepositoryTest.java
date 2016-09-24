package org.proffart.football.training.persistence.integration;

import org.junit.Test;
import org.proffart.football.training.AbstractIntegrationTest;
import org.proffart.football.training.domain.Player;
import org.proffart.football.training.persistence.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

/**
 * Author Artak Mnatsakanyan
 * Date 9/19/16
 * Time 9:37 PM
 */
public class PlayerRepositoryTest extends AbstractIntegrationTest {

    @Autowired
    private PlayerRepository playerRepository;

    @Test
    public void testSavePlayer() {
        // test data
        final String playerFullName = "Test Player Name";
        final Date playerBirthday = new Date();
        final Integer playerHeight = 1;
        final Integer playerWeight = 1;
        final Date startedTrainings = new Date();
        final Integer previousExperience = 1;
        final Player player = new Player();

        player.setFullName(playerFullName);
        player.setBirthday(playerBirthday);
        player.setHeight(playerHeight);
        player.setWeight(playerWeight);
        player.setStartedTrainings(startedTrainings);
        player.setPreviousExperience(previousExperience);

        // run test
        final Player savedPlayer = playerRepository.savePlayer(player);

        // expectation
        assertNotNull("Saved Player shouldn't be null", savedPlayer);
        assertNotNull("Saved player id should be any number", savedPlayer.getPlayerId());
        assertThat("Saved player id should be Integer", savedPlayer.getPlayerId(), instanceOf(Integer.class));
        assertEquals(savedPlayer.getFullName(), playerFullName);
        assertEquals(savedPlayer.getBirthday(), playerBirthday);
        assertEquals(savedPlayer.getHeight(), playerHeight);
        assertEquals(savedPlayer.getWeight(), playerWeight);
        assertEquals(savedPlayer.getStartedTrainings(), startedTrainings);
        assertEquals(savedPlayer.getPreviousExperience(), previousExperience);
    }

    @Test
    public void testGetPlayer() {
        // test data
        final String playerFullName = "Test Player Name";
        final Player newPlayer = new Player();
        final Date playerBirthday = new Date();
        final Integer playerHeight = 1;
        final Integer playerWeight = 1;
        final Date startedTrainings = new Date();
        final Integer previousExperience = 1;

        newPlayer.setFullName(playerFullName);
        newPlayer.setBirthday(playerBirthday);
        newPlayer.setHeight(playerHeight);
        newPlayer.setWeight(playerWeight);
        newPlayer.setStartedTrainings(startedTrainings);
        newPlayer.setPreviousExperience(previousExperience);

        final Player savedPlayer = playerRepository.savePlayer(newPlayer);
        final Integer playerId = savedPlayer.getPlayerId();
        flushAndClear();

        // run test
        final Player player = playerRepository.getPlayer(playerId);

        // expectation
        assertNotNull("Saved Player shouldn't be null", player);
        assertEquals(player.getPlayerId(), savedPlayer.getPlayerId());
        assertEquals(player.getFullName(), savedPlayer.getFullName());
        assertEquals(savedPlayer.getFullName(), playerFullName);
        assertEquals(savedPlayer.getBirthday(), playerBirthday);
        assertEquals(savedPlayer.getHeight(), playerHeight);
        assertEquals(savedPlayer.getWeight(), playerWeight);
        assertEquals(savedPlayer.getStartedTrainings(), startedTrainings);
        assertEquals(savedPlayer.getPreviousExperience(), previousExperience);
    }

    @Test
    public void testRemovePlayer() {
        // test data
        final String playerFullName = "Test Player Name";
        final Player newPlayer = new Player();
        final Date playerBirthday = new Date();
        final Integer playerHeight = 1;
        final Integer playerWeight = 1;
        final Date startedTrainings = new Date();
        final Integer previousExperience = 1;

        newPlayer.setFullName(playerFullName);
        newPlayer.setBirthday(playerBirthday);
        newPlayer.setHeight(playerHeight);
        newPlayer.setWeight(playerWeight);
        newPlayer.setStartedTrainings(startedTrainings);
        newPlayer.setPreviousExperience(previousExperience);

        final Player savedPlayer = playerRepository.savePlayer(newPlayer);
        final Integer playerId = savedPlayer.getPlayerId();

        // run test
        playerRepository.removePlayer(playerId);
        flushAndClear();

        final Player player = playerRepository.getPlayer(playerId);
        assertNull(player);
    }

}
