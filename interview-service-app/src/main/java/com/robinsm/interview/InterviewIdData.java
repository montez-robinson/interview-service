package com.robinsm.interview;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.PathParam;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * The name of the interview.
 *
 * @author montez.robinson robinsm@live.com
 */
@ApiModel(description = "The name of the interview")
public class InterviewIdData implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * The Interview id.
     */
    @ApiParam(value = "The name of the todo item")
    @ApiModelProperty(value = "The name of the interview")
    @PathParam("interviewId")
    @NotNull @Size(min = 3, max = 255) String interviewId;

    /**
     * Instantiates a new Interview id data.
     */
    public InterviewIdData() {
        this.interviewId = RandomStringUtils.randomAlphabetic(255);
    }

    /**
     * Instantiates a new Interview id data.
     *
     * @param interviewId the interview id
     */
    public InterviewIdData(String interviewId) {
        this.interviewId = interviewId;
    }

    /**
     * Gets interview id.
     *
     * @return the interview id
     */
    public String getInterviewId() {
        return interviewId;
    }

    /**
     * Sets interview id.
     *
     * @param interviewId the interview id
     */
    public void setInterviewId(String interviewId) {
        this.interviewId = interviewId;
    }
}
