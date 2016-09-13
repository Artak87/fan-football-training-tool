package org.proffart.football.training.api;

/**
 * Author Artak Mnatsakanyan
 * Date 9/13/16
 * Time 3:11 PM
 */
public interface PlayerApi {
    String createPlayer(String name);
    String savePlayer(Integer id);
    String deletePlayer(String name);
    String getPlayer(String name);
    String getPlayers(String name);
}
