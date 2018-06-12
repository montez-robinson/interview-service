/*
 *-----------------------------------------------------------------------------
 * Copyright 2016 NCR Corporation
 *-----------------------------------------------------------------------------
 */

package com.mr185234.demo.todo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.PathParam;

//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import io.swagger.annotations.ApiParam;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

//import com.ncr.nep.common.ResourceData;
//import com.ncr.nep.common.annotation.ResourceIdentityProperties;

//@ApiModel(description = "Identifies a todo item")
//@ResourceIdentityProperties
public class TodoIdData /*implements ResourceData*/ {

    private static final long serialVersionUID = 1L;

    @PathParam("name")
    @NotNull
    @Size(min = 3, max = 255)
//    @ApiModelProperty(value="The name of the todo item", example = "dentist-001")
//    @ApiParam(value="The name of the todo item", example = "dentist-001")
    private String name;

    public TodoIdData() { }

    public TodoIdData(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TodoIdData that = (TodoIdData) o;

        return new EqualsBuilder()
                .append(name, that.name)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(name)
                .toHashCode();
    }
}
