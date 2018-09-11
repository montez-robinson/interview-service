package com.robinsm.interview;

import java.time.ZonedDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The basic data for an interview.
 *
 * @author montez.robinson robinsm@live.com
 */
@ApiModel(description = "The basic interview data.")
public class InterviewBasicData extends InterviewIdData {

    private static final long serialVersionUID = 1L;

    /**
     * The Zoned date time.
     */
    @ApiModelProperty("Scheduled interview zoned date time.") final transient ZonedDateTime zonedDateTime;

    /**
     * The Location.
     */
    @ApiModelProperty("Location of interview.") final String location;

    /**
     * The Role name.
     */
    @ApiModelProperty("Open role interviewing for.") final String roleName;

    /**
     * Instantiates a new Interview basic data.
     *
     * @param id the id
     * @param zonedDateTime the zoned date time
     * @param location the location
     * @param roleName the role name
     */
    public InterviewBasicData(String id, ZonedDateTime zonedDateTime, String location, String roleName) {
        super(id);
        this.zonedDateTime = zonedDateTime;
        this.location = location;
        this.roleName = roleName;
    }

    /**
     * Gets zoned date time.
     *
     * @return the zoned date time
     */
    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }

    /**
     * Gets location.
     *
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Gets role name.
     *
     * @return the role name
     */
    public String getRoleName() {
        return roleName;
    }
}
