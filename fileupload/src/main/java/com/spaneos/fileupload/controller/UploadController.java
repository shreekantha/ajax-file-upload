package com.spaneos.fileupload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spaneos.fileupload.entity.User;

@Controller
public class UploadController {

	@RequestMapping(value="register",method=RequestMethod.POST)
	@ResponseBody
	public String upload(User user) {
		System.out.println("User details +++"+user);
		System.out.println("Filename :"+user.getFile().getName());
		return "Upload success";
	}

}
