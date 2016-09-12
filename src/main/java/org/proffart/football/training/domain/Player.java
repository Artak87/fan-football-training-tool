package org.proffart.football.training.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Author Artak Mnatsakanyan
 * Date 9/11/16
 * Time 11:40 PM
 */
@Entity(name = "player")
public class Player implements Serializable {
    private static final long serialVersionUID = -1437038751133898273L;

    @Id
    @GeneratedValue
    @Column
    private Integer playerId;

    @OneToOne
    @JoinColumn(name = "userId")
    private User user;

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
