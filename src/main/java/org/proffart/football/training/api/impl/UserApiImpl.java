package org.proffart.football.training.api.impl;

import org.proffart.football.training.api.UserApi;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Author Artak Mnatsakanyan
 * Date 7/29/16
 * Time 9:48 PM
 */
@Component
@Path("/user")
public class UserApiImpl implements UserApi {

//    @Autowired
//    private UserService userService;



    @GET
    public Response savePayment() {
        return Response.status(200).entity("ok").build();
    }

//    @Override
//    public User register(final String login, final String password) {
//        return userService.create(login, password);
//    }
//
//    @Override
//    public User getUserById(final Integer id) {
//        return null;
//    }
}
