package com.spaceN.needsapp.controller;

import com.spaceN.needsapp.model.request.CreateGroupRequest;
import com.spaceN.needsapp.model.response.CreateGroupResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.MediaType;

@RestController
@RequestMapping("/spacen/needsapp/core/groups")
public class GroupsController {

    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    public CreateGroupResponse create(@RequestBody CreateGroupRequest createGroupRequest) {

        System.out.println(" Success");

        return new CreateGroupResponse("Success", "Group created successfully");
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public CreateGroupResponse create() {

        System.out.println(" Success");

        return new CreateGroupResponse("Success", "Group created successfully");
    }


}
