package org.proffart.football.training.api;

/**
 * Author Artak Mnatsakanyan
 * Date 9/13/16
 * Time 3:11 PM
 */
public interface PlayerApi {
    String createPlayer(String name, String birthday, String height, String weight, String startedTrainings, String previousExperience);
    String savePlayer(Integer id);
    String deletePlayer(Integer id);
    String getPlayer(Integer id);
    String getPlayers(Integer start, Integer limit);
}
