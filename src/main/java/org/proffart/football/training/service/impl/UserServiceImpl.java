package org.proffart.football.training.service.impl;

import org.proffart.football.training.domain.User;
import org.proffart.football.training.persistence.UserRepository;
import org.proffart.football.training.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author Artak Mnatsakanyan
 * Date 7/29/16
 * Time 10:45 PM
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(final String login, final String password) {
        User user = new User();
        user.setLogin(login);
        user.setPassword(password);

        return userRepository.save(user);
    }
}
