package com.robinsm.interview.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import io.swagger.util.Json;

/**
 * The Interview not found exception mapper.
 *
 * @author montez.robinson robinsm@live.com
 */
@Provider
public class InterviewNotFoundExceptionMapper implements ExceptionMapper<InterviewNotFoundException> {
    @Override
    public Response toResponse(InterviewNotFoundException exception) {
        return Response
                .status(Response.Status.NOT_FOUND)
                .entity(Json.pretty(exception.getMessage()))
                .build();
    }
}
