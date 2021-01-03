package com.vastika.uis.dao;

import java.util.List;

import com.vastika.uis.model.User;

public interface UserDao {
	public int saveUserInfo(User user);

	public int updateUserInfo(User user);

	public int deleteUserinfo(int id);

	List<User> getAllUserInfo();
	
	User getUserById(int id);
}
