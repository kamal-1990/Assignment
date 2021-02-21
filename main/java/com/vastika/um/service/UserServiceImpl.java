package com.vastika.um.service;

import com.vastika.um.model.Role;
import com.vastika.um.model.User;
import com.vastika.um.repository.UserRepository;
import com.vastika.um.service.UserService;
import com.vastika.um.util.PasswordEncoderUtil;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUser(User user) {
        String encodedPass= PasswordEncoderUtil.encodePassword(user.getPassword());
        user.setPassword(encodedPass);
        Role role=new Role();
        role.setId(2);
        role.setRoleName("ROLE_USER");
        user.setRole(role);
        userRepository.saveUser(user);

    }

    @Override
    public void updateUser(User user) {
        String encodedPass= PasswordEncoderUtil.encodePassword(user.getPassword());
        user.setPassword(encodedPass);
        userRepository.updateUser(user);

    }

    @Override
    public void deleteUser(int id) {

        userRepository.deleteUser(id);
    }

    @Override
    public User getUserById(int id) {

        return userRepository.getUserById(id);
    }

    @Override
    public List<User> getAllUser()
    {
        return userRepository.getAllUser();
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.getUserByUsername(username);
    }
}
