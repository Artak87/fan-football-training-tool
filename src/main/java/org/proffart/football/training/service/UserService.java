package org.proffart.football.training.service;

import org.proffart.football.training.domain.User;

/**
 * Author Artak Mnatsakanyan
 * Date 7/29/16
 * Time 10:45 PM
 */
public interface UserService {
    User create(final String login, final String password);
}
