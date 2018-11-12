package com.robinsm.interview;

import java.time.ZonedDateTime;
import java.util.Collection;

import io.swagger.annotations.ApiModel;

/**
 * The type Create interview request.
 *
 * @author montez.robinson robinsm@live.com
 */
@ApiModel
public class CreateInterviewRequest extends InterviewData {

    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new Create interview request.
     */
    public CreateInterviewRequest() {
        super();
    }

    /**
     * Instantiates a new Create interview request with data.
     *
     * @param interviewId the interview id
     * @param zonedDateTime the zoned date time
     * @param location the location
     * @param role the role
     * @param interviewers the interviewers
     * @param interviewees the interviewees
     */
    public CreateInterviewRequest(
            String interviewId,
            ZonedDateTime zonedDateTime,
            String location,
            String role,
            Collection<Person> interviewers,
            Collection<Person> interviewees) {
        super(interviewId, zonedDateTime, location, role, interviewers, interviewees);
    }
}
