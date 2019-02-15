package com.uipurpose.detailsapp.controllers;

import com.uipurpose.detailsapp.entities.UserDetails;
import com.uipurpose.detailsapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/Details")
@ComponentScan("com.uipurpose.detailsapp.entities")
@Configuration
public class UserController {

    @Autowired
    UserService userService;

    @CrossOrigin
    @RequestMapping(value = "/Users", method = RequestMethod.POST)
    @ResponseBody
    public void addUser(@RequestBody UserDetails u)
    {
        userService.addUser(u);
    }

    @CrossOrigin

    @RequestMapping(value = "/Users", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList getUsers() {
        return userService.getUsers();
    }

    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/Users/{id}", method = RequestMethod.GET)
    public UserDetails getUserById(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }


    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/Users/{id}", method = RequestMethod.DELETE)
    public void DeleteUserById(@PathVariable("id") Long id) {
        userService.deleteSUserById(id);
    }

    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/Users/{id}", method = RequestMethod.PUT)
    public void updateUser(@RequestBody UserDetails u,@PathVariable("id") Long id ) {
       // System.out.println(u.getEmail()+"--"+u.getFirstName()+"--"+u.getLastName()+"--"+u.getId());
        userService.updateUser(u);
    }

}
