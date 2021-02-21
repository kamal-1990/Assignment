package com.vastika.um.service;

import com.vastika.um.model.User;

import java.util.List;

public interface UserService {
    public void saveUser(User user);

    public void updateUser(User user);

    public void deleteUser(int id);

    public User getUserById(int id);

    List<User> getAllUser();
    public User getUserByUsername(String username);

}
