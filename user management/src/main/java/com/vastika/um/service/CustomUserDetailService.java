package com.vastika.um.service;

import com.vastika.um.model.User;
import com.vastika.um.repository.UserRepository;
import com.vastika.um.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;

@Service
@Transactional
public class CustomUserDetailService implements UserDetailsService {// this class is created to use pure spring security tools
    //@Autowired
    private UserRepository userRepository = new UserRepositoryImpl();
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user= userRepository.getUserByUsername(username);
        if (user==null){
            throw new UsernameNotFoundException("user not found in db");
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),true,true,true,true,getAuthorities(user.getRole().getRoleName()));
    }

    public Collection<SimpleGrantedAuthority> getAuthorities(String roleName){
        Collection<SimpleGrantedAuthority> authorities=new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(roleName));
        return authorities;

    }
}
