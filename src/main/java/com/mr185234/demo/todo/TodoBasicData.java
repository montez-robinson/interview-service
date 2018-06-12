/*
 *-----------------------------------------------------------------------------
 * Copyright 2016 NCR Corporation
 *-----------------------------------------------------------------------------
 */

package com.mr185234.demo.todo;

import java.time.ZoneId;
import java.time.ZonedDateTime;

//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

//import com.ncr.nep.common.annotation.ValidDescription;

//@ApiModel(description = "Basic information on a todo item")
public class TodoBasicData extends TodoIdData {

    private static final long serialVersionUID = 1L;

//    @ValidDescription
//    @ApiModelProperty(value = "Description of the TODO item", example = "Dentist appointment")
    private String description;

//    @ApiModelProperty(value = "The time the TODO item was created", example = "2017-03-31T10:00:00.000Z")
    private ZonedDateTime creationDate = ZonedDateTime.now(ZoneId.of("UTC"));

    public TodoBasicData() {
        // No implementation required
    }

    public TodoBasicData(String name, String description, ZonedDateTime creationDate) {
        super(name);
        this.description = description;
        this.creationDate = creationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ZonedDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(ZonedDateTime creationDate) {
        this.creationDate = creationDate;
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
