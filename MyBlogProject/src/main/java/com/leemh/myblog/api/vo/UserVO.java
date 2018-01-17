package com.leemh.myblog.api.vo;

public class UserVO {

	private String id;
	
	private String password;
	
	private String name;
	
	private String sex;
	
	private String email;
	
	private String phone_number;
	
	private String birth;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "userVO [id=" + id + ", password=" + password + ", name=" + name + ", sex=" + sex + ", email=" + email
				+ ", phone_number=" + phone_number + ", birth=" + birth + "]";
	}	
	
}
