package com.javadevjournal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.javadevjournal.jpa.Customer;
import com.javadevjournal.service.CustomerService;

@RestController
//@RequestMapping("/api/users")
public class UserProfileController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/api/users/userDetails",produces = "application/json")
    public Customer getUserDetail(){
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		System.out.println("username " + auth.getPrincipal());
		return customerService.findByUserName(((User)auth.getPrincipal()).getUsername());
    }
}
