package org.proffart.football.training.api;

import java.util.Date;

/**
 * Author Artak Mnatsakanyan
 * Date 9/13/16
 * Time 3:11 PM
 */
public interface PlayerApi {
    String createPlayer(
            String fullName,
            Date birthday,
            Integer height,
            Integer weight,
            Date startedTrainings,
            Integer previousExperience
    );
    String savePlayer(Integer id);
    String deletePlayer(Integer id);
    String getPlayer(Integer id);
    String getPlayers(Integer start, Integer limit);
}
