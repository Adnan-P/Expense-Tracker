package com.project.expense_tracker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.expense_tracker.domain.User;
import com.project.expense_tracker.exceptions.EtAuthException;
import com.project.expense_tracker.repositories.UserRepository;

import java.util.regex.Pattern;


@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User validateUser(String email, String password) throws EtAuthException {

        return null;
    }

    @Override
    public User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException {
        
        Pattern pattern = Pattern.compile("^(.+)@(.+)$"); 
        if(email != null) email = email.toLowerCase();
        if(!pattern.matcher(email).matches())
        throw new EtAuthException("Invalid email format");

        Integer count = userRepository.getCountByEmail(email);
        if(count > 0)
        throw new EtAuthException("Email is already in use");

        Integer userId = userRepository.create(firstName, lastName, email, password);
        return userRepository.findById(userId);
        
    }
 
}
