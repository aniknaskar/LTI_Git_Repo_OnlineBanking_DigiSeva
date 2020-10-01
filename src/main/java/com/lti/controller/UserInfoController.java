package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.model.UserInfo;
import com.lti.service.UserInfoService;

@RestController
@RequestMapping(path = "user")
@CrossOrigin
public class UserInfoController {

	@Autowired
	private UserInfoService userInfoService;
	
	//http://localhost:9091/Digiseva/user/createuser
	@PostMapping(path = "/createuser")
	public void createNewUser(@RequestBody UserInfo userInfo)
	{
		userInfoService.addUser(userInfo);
	}
}
