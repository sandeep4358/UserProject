package com.example.UserManagement.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "mail_server_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailUser {
	@Id
	@GeneratedValue
	int id;
	@Column(name = "server_id")
	String mailServerId;
	@Column(name = "server_user_name")
	String mailServerUsername;
	@Column(name = "server_user_password")
	String mailServerPassword;
	@Column(name = "server_ip_address")
	String mailServerIPAddress;
}
