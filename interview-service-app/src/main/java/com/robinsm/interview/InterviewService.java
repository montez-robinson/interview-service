package com.robinsm.interview;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.robinsm.interview.exception.InterviewNotFoundException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Service;

/**
 * The interface Interview service.
 *
 * @author montez.robinson robinsm@live.com
 */
@Api("interviews")
@Path("interviews")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Service
public interface InterviewService {

    /**
     * Gets all.
     *
     * @return the all
     */
    @ApiOperation(
            value = "Finds all interviews"
    )
    @GET
    GetAllInterviewBasicData getAll();

    /**
     * Create interview data.
     *
     * @param createInterviewRequest the interview data
     *
     * @return the interview data
     */
    @ApiOperation(
            value = "Creates an interview"
    )
    @POST
    @Path("/{interviewId}")
    InterviewData create(@ApiParam CreateInterviewRequest createInterviewRequest);

    /**
     * Gets one.
     *
     * @param interviewIdData the interview id data
     *
     * @return the one
     *
     * @throws InterviewNotFoundException the interview not found exception
     */
    @ApiOperation(
            value = "Retrieves the specified interview"
    )
    @GET
    @Path("/{interviewId}")
    InterviewBasicData getOne(@BeanParam InterviewIdData interviewIdData) throws InterviewNotFoundException;

    /**
     * Delete.
     *
     * @param interviewIdData the interview id data
     *
     * @throws InterviewNotFoundException the interview not found exception
     */
    @ApiOperation(
            value = "Deletes the specified interview"
    )
    @DELETE
    @Path("/{interviewId}")
    void delete(@BeanParam InterviewIdData interviewIdData) throws InterviewNotFoundException;

    /**
     * Update interview data.
     *
     * @param interviewData the interview data
     *
     * @return the interview data
     *
     * @throws InterviewNotFoundException the interview not found exception
     */
    @ApiOperation(
            value = "Updates an exiting interivew"
    )
    @PUT
    @Path("/{interviewId}")
    InterviewData update(@ApiParam InterviewData interviewData) throws InterviewNotFoundException;
}
