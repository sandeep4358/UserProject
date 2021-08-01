package com.example.UserManagement.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponeObject {
	private MailUser mailuser;
	private APIDetailsBean detailBean;

}
