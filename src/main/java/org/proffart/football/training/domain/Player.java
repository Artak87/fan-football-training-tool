package org.proffart.football.training.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Author Artak Mnatsakanyan
 * Date 9/11/16
 * Time 11:40 PM
 */
@Entity
@Table(name = "player")
public class Player implements Serializable {
    private static final long serialVersionUID = -1437038751133898273L;

    @Id
    @GeneratedValue
    @Column
    private Integer playerId;

    @OneToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "groupId")
    private Group group;

    @Column(length = 64)
    private String fullName;

    @Column
    private Date birthday;

    @Column
    private Integer height;

    @Column
    private Integer weight;

    @Column
    private Date startedTrainings;

    @Column
    private Integer previousExperience;

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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Date getStartedTrainings() {
        return startedTrainings;
    }

    public void setStartedTrainings(Date startedTrainings) {
        this.startedTrainings = startedTrainings;
    }

    public Integer getPreviousExperience() {
        return previousExperience;
    }

    public void setPreviousExperience(Integer previousExperience) {
        this.previousExperience = previousExperience;
    }



}
