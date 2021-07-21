package com.example.UserManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.UserManagement.MailUser;

@Repository
public interface UserManagementRepository extends JpaRepository<MailUser, Integer> {

	MailUser findBymailServerId(String serverID);

}
