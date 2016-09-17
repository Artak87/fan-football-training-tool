package org.proffart.football.training.dto;

import org.proffart.football.training.domain.User;

/**
 * Author Artak Mnatsakanyan
 * Date 9/17/16
 * Time 12:17 PM
 */
public class GroupDto {
    private Integer groupId;
    private User user;

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

    private String name;
}
