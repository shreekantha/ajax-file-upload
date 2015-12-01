package com.spaneos.fileupload.entity;

import org.springframework.web.multipart.MultipartFile;

public class User {

	private String name;
	private String email;
	private String mobile;
	
	private MultipartFile file;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	@Override
	public String toString() {
		return String.format("User [name=%s, email=%s, mobile=%s, file=%s]",
				name, email, mobile, file);
	}
	
	
	
}
