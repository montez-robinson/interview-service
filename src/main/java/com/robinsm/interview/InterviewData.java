package com.robinsm.interview;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * Entire interview data.
 *
 * @author montez.robinson robinsm@live.com
 */
@ApiModel("Entire interview data.")
public class InterviewData extends InterviewBasicData {

    private static final long serialVersionUID = 1L;

    /**
     * The Interviewers.
     */
    @ApiModelProperty("Collection of interviewers.")
    private final transient Collection<Person> interviewers;

    /**
     * The Interviewees.
     */
    @ApiModelProperty("Collection of interviewees.")
    private final transient Collection<Person> interviewees;

    /**
     * Instantiates a new Interview data.
     */
    public InterviewData() {
        super(RandomStringUtils.randomAlphabetic(255), ZonedDateTime.now(), "", "");
        interviewers = new ArrayList<>();
        interviewees = new ArrayList<>();
    }

    /**
     * Instantiates a new Interview data.
     *
     * @param id the id
     * @param zonedDateTime the zoned date time
     * @param location the location
     * @param roleName the role name
     * @param interviewers the interviewers
     * @param interviewees the interviewees
     */
    public InterviewData(
            String id,
            ZonedDateTime zonedDateTime,
            String location,
            String roleName,
            Collection<Person> interviewers,
            Collection<Person> interviewees) {
        super(id, zonedDateTime, location, roleName);
        this.interviewers = interviewers;
        this.interviewees = interviewees;
    }

    /**
     * Gets interviewers.
     *
     * @return the interviewers
     */
    public Collection<Person> getInterviewers() {
        return interviewers;
    }

    /**
     * Gets interviewees.
     *
     * @return the interviewees
     */
    public Collection<Person> getInterviewees() {
        return interviewees;
    }
}
