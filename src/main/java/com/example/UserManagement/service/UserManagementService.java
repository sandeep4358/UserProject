package com.example.UserManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.UserManagement.bean.APIDetailsBean;
import com.example.UserManagement.bean.MailUser;
import com.example.UserManagement.bean.ResponeObject;
import com.example.UserManagement.repository.UserManagementRepository;

@Service
public class UserManagementService {
	
	@Autowired
	RestTemplate restTempate;
	
	@Autowired
	UserManagementRepository repository;
	
	public ResponeObject getMailUserDetails(String userName) {
		MailUser findBymailUsere = repository.findBymailServerUsername(userName);
		
		System.out.println("user name :: "+findBymailUsere);

		
		String mailServerId = findBymailUsere.getMailServerId();
		
		System.out.println("mail server id :: "+mailServerId);
		
		APIDetailsBean obj = new APIDetailsBean();
		obj.setMailServerId(mailServerId);

		APIDetailsBean postForObject = restTempate.postForObject("http://localhost:9192/rest/auth/getServerDeatils", obj ,APIDetailsBean.class);
		
		ResponeObject response = new ResponeObject();
		response.setDetailBean(postForObject);
		response.setMailuser(findBymailUsere);
		
		 return response;			
		}
	
	public MailUser saveMailUser(MailUser mail) {
		return repository.save(mail);
	}
}
