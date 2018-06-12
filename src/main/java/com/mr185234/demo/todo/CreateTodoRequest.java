/*
 *-----------------------------------------------------------------------------
 * Copyright 2016 NCR Corporation
 *-----------------------------------------------------------------------------
 */

package com.mr185234.demo.todo;

import java.time.ZonedDateTime;

//import io.swagger.annotations.ApiModel;

//@ApiModel(description = "Defines information needed to create a new todo item")
public class CreateTodoRequest extends TodoBasicData {

    private static final long serialVersionUID = 1L;

    public CreateTodoRequest() { }

    public CreateTodoRequest(String name, String description, ZonedDateTime creationDate) {
        super(name, description, creationDate);
    }
}
