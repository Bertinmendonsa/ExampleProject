package com.project.demo;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
	public void saveFeedback(Feedback feedback);
}
