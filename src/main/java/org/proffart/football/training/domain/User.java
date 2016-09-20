package org.proffart.football.training.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Author Artak Mnatsakanyan
 * Date 7/29/16
 * Time 9:47 PM
 */
@Entity
@Table(name = "user")
public class User implements Serializable {
    private static final long serialVersionUID = 8537416271048984112L;

    @Id
    @GeneratedValue
    @Column
    private Integer userId;

    @Column
    private String login;

    @Column
    private String password;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
