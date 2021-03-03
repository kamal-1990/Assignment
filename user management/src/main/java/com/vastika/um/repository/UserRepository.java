package com.vastika.um.repository;

import com.vastika.um.model.User;

import java.util.List;

public interface UserRepository {
    public void saveUser(User user);

    public void updateUser(User user);

    public void deleteUser(int id);

    public User getUserById(int id);

    List<User> getAllUser();
    public User getUserByUsername(String username);

}
