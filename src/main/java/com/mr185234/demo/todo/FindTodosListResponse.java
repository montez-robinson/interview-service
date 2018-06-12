/*
 *-----------------------------------------------------------------------------
 * Copyright 2016 NCR Corporation
 *-----------------------------------------------------------------------------
 */

package com.mr185234.demo.todo;

import java.util.List;

//@ApiModel(description = "Contains search results for todo items found the system")
public class FindTodosListResponse {

    private static final long serialVersionUID = 1L;

    private List<TodoData> content;

    public List<TodoData> getContent() {
        return content;
    }

    public void setContent(List<TodoData> list) {
        content = list;
    }
}
