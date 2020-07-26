package com.syntax.class28_1;

public class RegistrationClass {
	private String email, userName, password;

	public String getEmail() {
		return email;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public void setEmail(String email) {
		if (email.contains("yahoo")) {
			this.email = email;
		}
	}

	public void setUserName(String userName) {
		if (userName.length() > 0 && userName.length() > 6) {
			this.userName = userName;

		}
	}

	public void setPassword(String password) {
		if (password.length() > 0 && password.length() > 6 && !password.contains(userName)) {
			this.password = password;
		}
	}
}
