package org.proffart.football.training.domain;

/**
 * Author Artak Mnatsakanyan
 * Date 9/15/16
 * Time 2:55 PM
 */
public class Filter {
    private Integer start;
    private Integer limit;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
