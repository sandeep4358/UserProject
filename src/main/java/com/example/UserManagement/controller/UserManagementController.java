package com.example.UserManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserManagement.bean.MailUser;
import com.example.UserManagement.bean.ResponeObject;
import com.example.UserManagement.service.UserManagementService;

@RestController
//@RequestMapping(name = "/user/auth/")
public class UserManagementController {
	
	@Autowired
	UserManagementService service;
	
	@PostMapping(path = "/add")
	public MailUser addUser(@RequestBody MailUser user) {		
		return 	service.saveMailUser(user);
	}
	/**
	 * 
	 * @param serverID
	 * @return Return the user information and the mail service information 
	 */
	@GetMapping("/getUser/{id}")
	public ResponeObject getDeatilsOfUser(@PathVariable(name = "id") String username) {
		System.out.println(username);
		ResponeObject mailUserDetails = service.getMailUserDetails(username);
		return mailUserDetails;
		//return null;
	}
}
