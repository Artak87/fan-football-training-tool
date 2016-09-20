package org.proffart.football.training.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Author Artak Mnatsakanyan
 * Date 9/12/16
 * Time 8:55 PM
 */
@Entity
@Table(name = "player_group")
public class Group implements Serializable {
    private static final long serialVersionUID = -785107408431887821L;

    @Id
    @GeneratedValue
    @Column
    private Integer groupId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @Column(length = 32)
    private String name;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
