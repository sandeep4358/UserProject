package com.example.UserManagement.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class APIDetailsBean {
	

	
	int apiID;

	String apiDescription;

	String containsAttachmentFalg;

	String mailServerId;

}
