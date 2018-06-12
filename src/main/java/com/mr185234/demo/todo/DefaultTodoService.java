/*
 *-----------------------------------------------------------------------------
 * Copyright 2016 NCR Corporation
 *-----------------------------------------------------------------------------
 */

package com.mr185234.demo.todo;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//import com.ncr.nep.common.annotation.PublicServiceImplementation;
//import com.ncr.nep.common.exception.ResourceAlreadyExistsException;
//import com.ncr.nep.common.exception.ResourceDoesNotExistException;
//import com.ncr.nep.sdk.service.exception.ResourceExceptionBuilder;

//@PublicServiceImplementation
public class DefaultTodoService implements TodoService {

    private Map<String, TodoData> todos = new ConcurrentHashMap<>();

    @Override
    public FindTodosListResponse findAll() {
        FindTodosListResponse response = new FindTodosListResponse();
        response.setContent(new ArrayList<>(todos.values()));

        return response;
    }

    @Override
    public TodoData get(TodoIdData todoIdData) throws Exception {
        TodoData todo = todos.get(todoIdData.getName());
        if (todo != null) {
            return todo;
        }

        throw new Exception();
    }

    @Override
    public void create(CreateTodoRequest todoBasicData) throws Exception {
        if (todos.containsKey(todoBasicData.getName())) {
            throw new Exception();
        }

        TodoData todoData = new TodoData(todoBasicData);
        todos.put(todoBasicData.getName(), todoData);
    }

    @Override
    public void complete(TodoIdData todoIdData) throws Exception {
        if (!todos.containsKey(todoIdData.getName())) {
            throw new Exception();
        }

        todos.get(todoIdData.getName()).setCompleted(true);
    }

    @Override
    public void delete(TodoIdData todoIdData) throws Exception {
        if (!todos.containsKey(todoIdData.getName())) {
            throw new Exception();
        }

        todos.remove(todoIdData.getName());
    }
}
