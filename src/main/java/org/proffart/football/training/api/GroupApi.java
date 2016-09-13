package org.proffart.football.training.api;

/**
 * Author Artak Mnatsakanyan
 * Date 9/13/16
 * Time 12:04 PM
 */
public interface GroupApi {
    String createGroup(String name);
    String joinGroup(Integer playerId);

}
