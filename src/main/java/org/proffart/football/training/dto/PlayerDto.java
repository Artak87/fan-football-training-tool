package org.proffart.football.training.dto;

import java.util.Date;

/**
 * Author Artak Mnatsakanyan
 * Date 9/15/16
 * Time 2:47 PM
 */
public class PlayerDto {
    private Integer pleyerId;
    private String fullname;
    private Date birthday;
    private Integer height;
    private Integer weight;
    private Date startedTrainings;
    private Integer previousExperience;

    public Integer getPleyerId() {
        return pleyerId;
    }

    public void setPleyerId(Integer pleyerId) {
        this.pleyerId = pleyerId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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
