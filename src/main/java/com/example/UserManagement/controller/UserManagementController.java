package com.example.UserManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserManagement.MailUser;
import com.example.UserManagement.service.UserManagementService;

@RestController
//@RequestMapping(name = "/user/auth/")
public class UserManagementController {
	
	@Autowired
	UserManagementService service;
	
	@PostMapping
	@RequestMapping("/add/")
	public MailUser addUser(@RequestBody MailUser user) {
		
		
		return null;
	}
	
	@GetMapping("/getUser/{id}")
	public MailUser getDeatilsOfUser(@PathVariable(name = "id") String serverID) {
		System.out.println(serverID);
//		return service.getMailUserDetails(serverID);
		return null;
	}
}
