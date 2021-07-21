package com.example.UserManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UserManagement.MailUser;
import com.example.UserManagement.repository.UserManagementRepository;

@Service
public class UserManagementService {
	
	@Autowired
	UserManagementRepository repository;
	
	public MailUser getMailUserDetails(String serverID) {
			return repository.findBymailServerId(serverID);			
		}
}
