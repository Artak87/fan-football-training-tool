package org.proffart.football.training.persistence;

import org.proffart.football.training.domain.User;

/**
 * Author Artak Mnatsakanyan
 * Date 7/29/16
 * Time 10:57 PM
 */
public interface UserRepository {
    User save(final User user);
}
