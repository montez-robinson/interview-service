/*
 *-----------------------------------------------------------------------------
 * Copyright 2016 NCR Corporation
 *-----------------------------------------------------------------------------
 */

package com.mr185234.demo.todo;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import io.swagger.v3.oas.annotations.Operation;


/**
 * Sample service that manages TOO items.
 *
 * @author rb185213
 */
@Path("todos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface TodoService {

    @Operation(
            summary="Finds all todo itmes",
            description = "Finds all todo items stored in the system."
    )
    @GET
    FindTodosListResponse findAll() throws Exception;

    //------------------------------------------------------------------------------------------------------------------
    @Operation(
            summary="Gets a todo item",
            description = "Gets a todo item by its name, specified in the URL."
    )
    @GET
    @RolesAllowed(TodoRoles.VIEWER_ROLE)
    @Path("/{name}")
    TodoData get(@BeanParam TodoIdData todoIdData)
            throws Exception;

    //------------------------------------------------------------------------------------------------------------------

    @Operation(
            summary="Creates a new todo item.",
            description = "Creates a new todo itme with specified information."
    )
    @POST
    @RolesAllowed(TodoRoles.ADMINISTRATOR_ROLE)
    void create(
            CreateTodoRequest todoBasicData)
            throws Exception;

    //------------------------------------------------------------------------------------------------------------------

    @Operation(
            summary="Marks a todo item as complete",
            description = "Marks a todo item as completed, and records the time when it was completed."
    )
    @PUT
    @Path("/{name}/complete")
    @RolesAllowed(TodoRoles.ADMINISTRATOR_ROLE)
    void complete(@BeanParam TodoIdData todoIdData)
            throws Exception;

    //------------------------------------------------------------------------------------------------------------------
    @Operation(
            summary="Deletes a todo item",
            description = "Deletes the todo item with the name specified in the URL."
    )
    @DELETE
    @Path("/{name}")
    @RolesAllowed(TodoRoles.ADMINISTRATOR_ROLE)
    void delete(@BeanParam TodoIdData todoIdData)
            throws Exception;
}
