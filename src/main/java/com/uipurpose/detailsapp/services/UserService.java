package com.uipurpose.detailsapp.services;

import com.uipurpose.detailsapp.entities.UserDetails;
import com.uipurpose.detailsapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void addUser(UserDetails ud)
    {
        userRepository.save(ud);
    }

    public ArrayList getUsers()
    {
        ArrayList usersList = new ArrayList();
        userRepository.findAll().forEach(usersList::add);
        return usersList;
    }

    public UserDetails getUserById(long id) {
        return userRepository.findById(id).get();
    }

    public void deleteSUserById(long id) {
        userRepository.deleteById(id);
    }


    public void updateUser(UserDetails ud) {
        userRepository.save(ud);
    }


}
