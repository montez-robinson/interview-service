/*
 *-----------------------------------------------------------------------------
 * Copyright 2016 NCR Corporation
 *-----------------------------------------------------------------------------
 */

package com.mr185234.demo.todo;

//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

//@ApiModel(description = "Contains full details for a todo item")
public class TodoData extends TodoBasicData {

    private static final long serialVersionUID = 1L;

//    @ApiModelProperty("Indicates if the TODO was completed or not")
    private Boolean completed;

    public TodoData() { }

    public TodoData(TodoBasicData todoBasicData) {
        setName(todoBasicData.getName());
        setDescription(todoBasicData.getDescription());
        setCreationDate(todoBasicData.getCreationDate());
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    @Override
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
