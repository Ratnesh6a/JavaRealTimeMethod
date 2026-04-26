package com.example.medifizer.service;

import com.example.medifizer.controller.request.UsersRequestType;
import com.example.medifizer.entity.userDataDetails.Users;
import com.example.medifizer.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsersService {
    @Autowired
    private final UsersRepository usersRepository;
    public void createUser (UsersRequestType usersRequestType){
        Users users = new Users();
        users.setEmailId(usersRequestType.getEmailId());
        users.setFirstName(usersRequestType.getFirstName());
        users.setLastName(usersRequestType.getLastName());
        users.setRoles(usersRequestType.getRoles());
        users.setPassword(usersRequestType.getPassword());
        usersRepository.save(users);
    }

    public Users getUserByEmailId(String emailId){
        return usersRepository.findByEmailId(emailId);
    }
    public List<Users> findAllUsers(){
        return usersRepository.findAll();
    }


}
